package learn.app.testdemo.basics

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_basic_testing.*
import learn.app.testdemo.R

class BasicTestingActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_basic_testing)

        btn.setOnClickListener {
            //            Toast.makeText(this@BasicTestingActivity, "Hello Espresso", Toast.LENGTH_LONG).show()
            val intent = Intent(this@BasicTestingActivity, BasicSecondActivity::class.java)
            intent.putExtra("Name","Ajay Rawat")
            intent.putExtra("Email","Ajay@Rawat.com")
            startActivity(intent)
        }

    }
}
