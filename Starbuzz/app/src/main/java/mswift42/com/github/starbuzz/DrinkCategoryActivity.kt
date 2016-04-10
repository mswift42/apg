package mswift42.com.github.starbuzz

import android.app.ListActivity
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.ListView

class DrinkCategoryActivity : ListActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val listDrinks = listView

        val listAdapter = ArrayAdapter<Drink>(this, android.R.layout.simple_list_item_1, Drink.drinks)

        listDrinks.setAdapter(listAdapter)
    }
    public override fun onListItemClick(listView: ListView, itemView: View, position: Int, id: Long) {
        val intent = Intent(this@DrinkCategoryActivity, DrinkActivity::class.java )
        intent.putExtra(DrinkActivity.EXTRA_DRINKNO, id.toInt())
        startActivity(intent)
    }
}
