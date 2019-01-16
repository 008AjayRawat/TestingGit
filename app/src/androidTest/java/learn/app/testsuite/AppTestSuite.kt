package learn.app.testsuite

import learn.app.testdemo.AndroidJUnitLogicFunctionTestRunner
import learn.app.testdemo.BasicTestingActivityEspressoTest
import org.junit.runner.RunWith
import org.junit.runners.Suite

@RunWith(Suite::class)
@Suite.SuiteClasses(
        AndroidJUnitLogicFunctionTestRunner::class,
        BasicTestingActivityEspressoTest::class
)
class AppTestSuite