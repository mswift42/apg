package mswift42.com.github.starbuzz

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ListView
import kotlinx.android.synthetic.main.activity_top_level.*
import java.text.FieldPosition

class TopLevelActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_top_level)

        val itemClickListener = AdapterView.OnItemClickListener{
            listView, v: View, position: Int, id: Long ->
            if (position == 0) {
                val intent = Intent(this@TopLevelActivity, DrinkCategoryActivity::class.java)
                startActivity(intent)
            }
        }
        list_options.setOnItemClickListener(itemClickListener)
    }
}
