package learn.app.testdemo.adapter

import android.support.test.espresso.Espresso
import android.support.test.espresso.action.ViewActions
import android.support.test.rule.ActivityTestRule
import android.support.test.runner.AndroidJUnit4
import learn.app.testdemo.adapters.RecyclerViewActivity
import org.hamcrest.CoreMatchers
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class RecyclerViewActivityTestRunner {

    @get:Rule
    val mActivityTestRule = ActivityTestRule(RecyclerViewActivity::class.java)


    @Test
    fun check_adapterPosition() {
        Espresso.onData(CoreMatchers.allOf(CoreMatchers.`is`(CoreMatchers.instanceOf(String::class.java)))).atPosition(0).perform(ViewActions.click())
    }

}