package commswift42.github.beeradvisor

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_find_beer.*
import kotlinx.android.synthetic.main.activity_find_beer.view.*

class FindBeerActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_find_beer)
    }
    fun onClickFindBeer(view: View):Unit {
        brands.text = color.selectedItem.toString()
    }
}
