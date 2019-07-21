package jobHunting

import kotlin.math.abs

fun main(args: Array<String>) {
  val thermometer = Thermometer(1.5F)
  val caller1 = Caller1()
  val caller2 = Caller2()
  
  thermometer.subscribe(caller1)
  thermometer.subscribe(caller2)
  
  thermometer.read(-0.5F)
  thermometer.read(-0.5F)
  thermometer.read(-0.5F)
  
  thermometer.read(-0.5F)
  thermometer.read(-0.5F)
  thermometer.read(-0.5F)
  
  thermometer.read(0.5F)
  thermometer.read(0.5F)
  thermometer.read(0.5F)
  thermometer.read(0.5F)
}


class Caller1: ThermometerSubscriber(5F, 0F, 1F) {
  override fun notified(message: String) {
    println("=======================")
    super.notified("Caller1 $message")
    println("=======================")
  }
}

class Caller2: ThermometerSubscriber(5F, 0F, 10F) {
  init {
    super.notifyWhenDroppingToFreezingPoint(false)
    super.notifyWhenRisingToBoilingPoint(false)
  }
  
  override fun notified(message: String) {
    println("=======================")
    super.notified("Caller2 $message")
    println("=======================")
  }
}

open class ThermometerSubscriber(val boilingPoint: Float = 0F, val freezingPoint: Float = 0F, val fluctuation: Float = 0F) {
  private var notifyWhenRisingToBoilingPoint: Boolean = true
  private var notifyWhenRisingToFreezingPoint: Boolean = true
  private var notifyWhenDroppingToBoilingPoint: Boolean = true
  private var notifyWhenDroppingToFreezingPoint: Boolean = true
  
  private var reachedToBoiling: Boolean = false
  private var reachedToFreezing: Boolean = false
  
  fun notifyWhenRisingToBoilingPoint(yes: Boolean) {
    this.notifyWhenRisingToBoilingPoint = yes
  }
  
  fun notifyWhenRisingToFreezingPoint(yes: Boolean) {
    this.notifyWhenRisingToFreezingPoint = yes
  }
  
  fun notifyWhenDroppingToBoilingPoint(yes: Boolean) {
    this.notifyWhenDroppingToBoilingPoint = yes
  }
  
  fun notifyWhenDroppingToFreezingPoint(yes: Boolean) {
    this.notifyWhenDroppingToFreezingPoint = yes
  }
  
  open fun notified(message: String) {
    println(message)
  }
  
  fun pointUpdated(diff: Float, afterUpdated: Float) {
    val before = afterUpdated - diff
    this.checkBoilingPoint(before, afterUpdated)
    this.checkFreezingPoint(before, afterUpdated)
  }
  
  private fun checkBoilingPoint(before: Float, afterUpdated: Float) {
    if (this.reachedToBoiling) {
      val absoluteDiff = abs(afterUpdated) - abs(this.boilingPoint)
      if (this.fluctuation < absoluteDiff) {
        this.reachedToBoiling = false
      }
    }
    if (this.notifyWhenRisingToBoilingPoint && !this.reachedToBoiling) {
      if (this.boilingPoint > before && this.boilingPoint <= afterUpdated) {
        this.notified("notifyWhenRisingToBoilingPoint: $boilingPoint, beforeUpdated: $before")
        this.reachedToBoiling = true
      }
    }
  
    if (this.notifyWhenDroppingToBoilingPoint && !this.reachedToBoiling) {
      if (this.boilingPoint < before && this.boilingPoint >= afterUpdated) {
        this.notified("notifyWhenDroppingToBoilingPoint: $boilingPoint, beforeUpdated: $before")
        this.reachedToBoiling = true
      }
    }
  }
  
  private fun checkFreezingPoint(before: Float, afterUpdated: Float) {
    if (this.reachedToFreezing) {
      val absoluteDiff = abs(afterUpdated) - abs(this.freezingPoint)
      if (this.fluctuation < absoluteDiff){
        println("reachedToFreezing = false")
        this.reachedToFreezing = false
      }
    }
  
    if (this.notifyWhenRisingToFreezingPoint && !this.reachedToFreezing) {
      if (this.freezingPoint > before && this.freezingPoint <= afterUpdated) {
        this.notified("notifyWhenRisingToFreezingPoint: $freezingPoint, beforeUpdated: $before")
        this.reachedToFreezing = true
      }
    }
    if (this.notifyWhenDroppingToFreezingPoint && !this.reachedToFreezing) {
      if (this.freezingPoint < before && this.freezingPoint >= afterUpdated) {
        this.notified("notifyWhenDroppingToFreezingPoint: $freezingPoint, beforeUpdated: $before")
        this.reachedToFreezing = true
      }
    }
  }
}

class Thermometer(private var currentCelsiusPoint: Float = 0F) {
  private var subscribers: MutableList<ThermometerSubscriber> = mutableListOf()
  
  fun subscribe(subscriber: ThermometerSubscriber) {
    println("subscribed, subscriber.boilingPoint: ${subscriber.boilingPoint}, subscriber.freezingPoint: ${subscriber.freezingPoint}, subscriber.fluctuation: ${subscriber.fluctuation}")
    this.subscribers.add(subscriber)
  }
  
  fun read(celsiusPoint: Float) {
    val afterCelsiusPoint = currentCelsiusPoint + celsiusPoint
    println("currentCelsiusPoint: $currentCelsiusPoint, celsiusPoint: $celsiusPoint, afterPoint: $afterCelsiusPoint")
    
    this.subscribers.forEach {
      it.pointUpdated(celsiusPoint, afterCelsiusPoint)
    }
    
    this.currentCelsiusPoint = afterCelsiusPoint
  }

}