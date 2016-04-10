package mswift42.com.github.starbuzz

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class DrinkActivity : AppCompatActivity() {

    companion object {
        val EXTRA_DRINKNO = "drinkNo"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_drink)

    }

}
