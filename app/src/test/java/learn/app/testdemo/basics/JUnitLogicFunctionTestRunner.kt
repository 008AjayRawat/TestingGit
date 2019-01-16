package learn.app.testdemo.basics

import org.hamcrest.Matchers
import org.junit.After
import org.junit.Assert
import org.junit.Before
import org.junit.Test
import java.util.*

/**
 *  Example local unit test, which will execute on the development machine (host).
 */
class JUnitLogicFunctionTestRunner {
    private val TAG = JUnitLogicFunctionTestRunner::class.java.canonicalName


    @Before
    fun beforeTestCaseStart() {
//        java.lang.RuntimeException: Method d in android.util.Log not mocked.
//        Log.d(TAG, "beforeTestCaseStart")
    }

    @Test
    fun email_isValid() {

//        org.hamcrest.MatcherAssert.assertThat (3rd Generation)
        Assert.assertThat(LogicFunction.isEmailValid("email"), Matchers.equalTo(false))

//        val l = ArrayList<String>()
//        l.add("aaa")
//        l.add("bbb")
//        l.add("ccc")
//        Assert.assertThat(l, Matchers.hasItems("ccc","aaa"))


    }

    @Test
    fun date_isValid() {
        val date = Date()
        Assert.assertThat(LogicFunction.isValidDate(date), Matchers.equalTo(Date().toString()))
    }

    @Test
    fun text_isEmpty() {
        Assert.assertThat(LogicFunction.isTextEmpty("bnbnm"), Matchers.equalTo(false))
    }

    @Test
    fun value_isInRange() {
        Assert.assertEquals(10, LogicFunction.isInRange(10))
    }

    @Test
    fun test_voidReturnFunction() {
        Assert.assertEquals(Unit, LogicFunction.voidReturnFunction())
    }


    @After
    fun afterTestCaseStart() {
//        java.lang.RuntimeException: Method d in android.util.Log not mocked.
//        Log.d(TAG, "afterTestCaseStart")
    }

}