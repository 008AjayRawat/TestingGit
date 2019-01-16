package learn.app.testdemo

import android.content.Context
import android.support.test.InstrumentationRegistry
import android.support.test.runner.AndroidJUnit4
import learn.app.testdemo.basics.LogicFunction
import org.hamcrest.Matchers
import org.junit.After
import org.junit.Assert
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class AndroidJUnitLogicFunctionTestRunner {

    private lateinit var appContext: Context

    @Before
    fun beforeTest() {
        // Context of the app under test.
        appContext = InstrumentationRegistry.getTargetContext()
    }

    @Test
    fun email_isValid() {
        Assert.assertThat(LogicFunction.isEmailValid("email"), Matchers.equalTo(true))
    }

    @Test
    fun text_isEmpty() {
        Assert.assertThat(LogicFunction.isTextEmpty(""), Matchers.equalTo(true))
    }

    @Test
    fun convert_dp2px() {
        Assert.assertThat(LogicFunction.dp2px(appContext, 20F), Matchers.equalTo(52))
    }


    @After
    fun afterTest() {
    }

}