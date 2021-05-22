package subtask3

import java.util.*
import java.util.regex.Pattern
import kotlin.collections.ArrayList

class StringParser {



    fun getResult(inputString: String): Array<String> {
       val brackets = listOf('(','<','[',')','>',']')
        var result = ArrayList<String>()
       var s = StringBuilder(inputString)
       for(i in s.length-1 downTo 0){
           if(s[i]in brackets.subList(0,3)){
              var last = 0
               for(letter in i until s.length) {
                   if (s[letter] == brackets[brackets.indexOf(inputString[i]) + 3]) {
                       last = letter
                       s[i] = ' '
                       s[last] = ' '
                       break
                   }
               }
               result.add(0,inputString.substring(i+1,last))


           }
       }
        return result.toTypedArray()

    }
}









