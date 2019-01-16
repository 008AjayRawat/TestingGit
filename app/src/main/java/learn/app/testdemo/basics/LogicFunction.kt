package learn.app.testdemo.basics

import android.content.Context
import android.support.v4.math.MathUtils
import android.text.TextUtils
import java.util.*

class LogicFunction {
    companion object {
        fun isEmailValid(str: String): Boolean {

//            java.lang.RuntimeException: Method isEmpty in android.text.TextUtils not mocked.
//            if (TextUtils.isEmpty(str))
//                return false

            return true
        }

        fun isValidDate(date: Date?): String {
            val c = Calendar.getInstance()
            Thread.sleep(1000)
            return date.toString()
        }

        fun isTextEmpty(text: String): Boolean {
            return TextUtils.isEmpty(text)
        }

        fun isInRange(value: Int) = MathUtils.clamp(value, 1, 10)

        fun dp2px(context: Context, dpValue: Float): Int {
            val scale = context.resources.displayMetrics.density
            return (dpValue * scale).toInt()
        }

        fun voidReturnFunction(){
            //Nothing...
            throw Exception("Just Testing...")
        }

    }


}