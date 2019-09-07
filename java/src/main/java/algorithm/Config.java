package algorithm;

import algorithm.utils.InspectionUtil.Inspection;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class Config {
  @Bean
  @Scope("prototype")
  public Inspection inspection() {
    return new Inspection();
  }
}
