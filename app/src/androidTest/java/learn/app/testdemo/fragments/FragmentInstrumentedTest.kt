package learn.app.testdemo.fragments

import android.content.Context
import android.support.test.InstrumentationRegistry
import android.support.test.espresso.Espresso
import android.support.test.espresso.action.ViewActions
import android.support.test.espresso.assertion.ViewAssertions
import android.support.test.espresso.matcher.RootMatchers
import android.support.test.espresso.matcher.ViewMatchers
import android.support.test.filters.LargeTest
import android.support.test.rule.ActivityTestRule
import android.support.test.runner.AndroidJUnit4
import learn.app.testdemo.R
import org.hamcrest.Matchers
import org.junit.After
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
@LargeTest
class FragmentInstrumentedTest {

    @get:Rule
    val mActivityRule = ActivityTestRule(FragmentTestActivity::class.java)
    var context: Context? = null

    @Before
    fun beforeTest() {
        context = InstrumentationRegistry.getTargetContext()
        mActivityRule.activity.fragmentManager.beginTransaction()
    }


    @Test
    fun setEditText() {
//        Espresso.onView(ViewMatchers.withId(R.id.edtTxt_fragment)).perform(ViewActions.clearText(), ViewActions.typeText("Hello Espresso Fragment"), ViewActions.closeSoftKeyboard())
//      TODO WithText() is giving (No views in hierarchy found matching: with text: is)  Not Working, find solution....
        Espresso.onView(ViewMatchers.withText("fragmentLabel_test")).perform(ViewActions.clearText(), ViewActions.typeText("Hello Espresso Fragment"), ViewActions.closeSoftKeyboard())

        Espresso.onView(ViewMatchers.withId(R.id.edtTxt_1)).perform(ViewActions.clearText(), ViewActions.typeText("Hello Espresso 1"), ViewActions.closeSoftKeyboard())
        Espresso.onView(ViewMatchers.withId(R.id.edtTxt_2)).perform(ViewActions.clearText(), ViewActions.typeText("Hello Espresso 2"), ViewActions.closeSoftKeyboard())
        Espresso.onView(ViewMatchers.withId(R.id.edtTxt_3)).perform(ViewActions.clearText(), ViewActions.typeText("Hello Espresso 3"), ViewActions.closeSoftKeyboard())
    }

    @Test
    fun isToastDisplayed() {
        Espresso.onView(ViewMatchers.withId(R.id.btn_showToast)).perform(ViewActions.click())
        Espresso.onView(ViewMatchers.withText(context?.getString(R.string.toast))).inRoot(RootMatchers.withDecorView(Matchers.not(Matchers.`is`(mActivityRule.activity.window.decorView)))).check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
    }


    @After
    fun afterTest() {
        Thread.sleep(1000)
    }

}