package mswift42.com.github.starbuzz

import android.app.ListActivity
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter

class DrinkCategoryActivity : ListActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val listDrinks = listView

        val listAdapter = ArrayAdapter<Drink>(this, android.R.layout.simple_list_item_1, Drink.drinks)

        listDrinks.setAdapter(listAdapter)
    }
}
