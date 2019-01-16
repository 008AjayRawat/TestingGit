package learn.app.testdemo

import android.content.Context
import android.support.test.InstrumentationRegistry
import android.support.test.espresso.Espresso
import android.support.test.espresso.action.ViewActions
import android.support.test.espresso.assertion.ViewAssertions
import android.support.test.espresso.matcher.ViewMatchers
import android.support.test.rule.ActivityTestRule
import android.support.test.runner.AndroidJUnit4
import learn.app.testdemo.basics.BasicTestingActivity
import org.junit.After
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class BasicTestingActivityEspressoTest {
    @get:Rule
    val mActivityRule = ActivityTestRule(BasicTestingActivity::class.java)

    private var context: Context? = null


    @Before
    fun beforeTest() {
        context = InstrumentationRegistry.getTargetContext()
    }


    @Test
    fun fillDataToBasicActivity() {

        Espresso.onView(ViewMatchers.withId(R.id.btn_hidden)).check(ViewAssertions.matches(ViewMatchers.isClickable()))
        Espresso.onView(ViewMatchers.withId(R.id.edtTxt)).perform(ViewActions.typeText("Hello Espresso"), ViewActions.closeSoftKeyboard())
    }


    @Test
    fun startAndFillDataThenLogin() {
        Espresso.onView(ViewMatchers.withId(R.id.btn)).perform(ViewActions.click())

       // Espresso.onView(ViewMatchers.withId(R.id.edtTxt_email)).perform(ViewActions.typeText("ajayrawat@gmail.com"))
//        Espresso.onView(ViewMatchers.withId(R.id.edtTxt_name)).perform(ViewActions.typeText("Ajay Rawat"))
        Espresso.onView(ViewMatchers.withId(R.id.edtTxt_address)).perform(ViewActions.typeText("H-15, Nanak Pura, New Delhi,110021"))
        Espresso.onView(ViewMatchers.withId(R.id.edtTxt_age)).perform(ViewActions.typeText("28"))

        //NowLogin
        Espresso.onView(ViewMatchers.withId(R.id.btn_done)).perform(ViewActions.click())
    }


    @After
    fun afterTest() {
        Thread.sleep(2000)
    }


}