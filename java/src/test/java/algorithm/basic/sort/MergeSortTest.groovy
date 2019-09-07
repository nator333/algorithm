package algorithm.basic.sort

import algorithm.utils.InspectionUtil
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class MergeSortTest extends SortTest {
    @Autowired
    MergeSortTest(MergeSort sort, InspectionUtil.Inspection inspection) {
        this.sort = sort
        this.sort.inspection = inspection
    }
}
