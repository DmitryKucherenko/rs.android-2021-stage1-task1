package subtask1

class HappyArray {

    // TODO: Complete the following function
    fun convertToHappy(sadArray: IntArray): IntArray {
        var sadList = sadArray.toMutableList()
        var index = 0
        while ( index <= sadList.size-1) {
            if (index == 0 || index == sadList.size - 1) {
                index++
                continue
            } else {
                if (sadList[index - 1] + sadList[index + 1] < sadList[index]){
                    sadList.removeAt(index)
                    index--
                }else   index++

            }
        }

        return sadList.toIntArray()
    }

}
