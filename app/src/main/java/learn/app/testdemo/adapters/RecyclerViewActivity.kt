package learn.app.testdemo.adapters

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.MotionEvent
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_recycler_view.*
import learn.app.testdemo.R

class RecyclerViewActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view)

        val list: MutableList<String> = mutableListOf()
        for (i in 1..20)
            list.add(i.toString())
        rv_activity.layoutManager = LinearLayoutManager(this)
        rv_activity.adapter = TestAdapter(list)
        rv_activity.addOnItemTouchListener(object : RecyclerView.OnItemTouchListener {
            override fun onTouchEvent(rv: RecyclerView?, e: MotionEvent?) {
                Toast.makeText(this@RecyclerViewActivity, "Touch", Toast.LENGTH_SHORT).show()
            }

            override fun onInterceptTouchEvent(rv: RecyclerView?, e: MotionEvent?): Boolean {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

            override fun onRequestDisallowInterceptTouchEvent(disallowIntercept: Boolean) {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

        })

    }


    class TestAdapter(val list: List<String>) : RecyclerView.Adapter<TestAdapter.TestHolder>() {

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TestHolder {
            return TestHolder(LayoutInflater.from(parent.context).inflate(R.layout.row_tv, parent, false))
        }

        override fun getItemCount(): Int {
            return list.size
        }

        override fun onBindViewHolder(holder: TestHolder, position: Int) {
            holder.tv.text = list[position]
        }

        class TestHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
            var tv: TextView = itemView.findViewById(R.id.tv_row)
        }

    }

}
