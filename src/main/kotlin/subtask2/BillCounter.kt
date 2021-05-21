package subtask2

class BillCounter {


    // The output could be "Bon Appetit" or the string with number(e.g "10")
    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String {
        var b_actual:Int=0
        var b_charged:Int=0
        for((index,costOfitem) in bill.withIndex()){
            if(index!=k)b_actual+=costOfitem
            b_charged+=costOfitem
        }
        if(b<= b_actual/2)return("Bon Appetit")
        return "${b-(b_actual/2)}"
    }

}
