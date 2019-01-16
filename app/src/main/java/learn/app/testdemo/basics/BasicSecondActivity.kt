package learn.app.testdemo.basics

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_basic_second.*
import learn.app.testdemo.R

class BasicSecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_basic_second)

        val name = intent.getStringExtra("Name")
        val email = intent.getStringExtra("Email")

        edtTxt_name.setText(name)
        edtTxt_email.setText(email)

        btn_done.setOnClickListener {
            finish()
        }

    }
}
