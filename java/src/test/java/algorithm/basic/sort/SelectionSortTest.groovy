package algorithm.basic.sort

import algorithm.utils.InspectionUtil
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class SelectionSortTest extends SortTest {
    @Autowired
    SelectionSortTest(SelectionSort sort, InspectionUtil.Inspection inspection) {
        this.sort = sort
        this.sort.inspection = inspection
    }
}
