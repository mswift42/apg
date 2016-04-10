package mswift42.com.github.starbuzz

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_drink.*

class DrinkActivity : AppCompatActivity() {

    companion object {
        val EXTRA_DRINKNO = "drinkNo"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_drink)

         val drinkNo: Int = getIntent().getExtras().get(EXTRA_DRINKNO) as Int
        val drink = Drink.drinks[drinkNo]

        photo.setImageResource(drink.imageResourceId)
        photo.contentDescription = drink.name

        name.text = drink.name
        description.text = drink.description

    }

}
