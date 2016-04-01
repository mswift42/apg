package commswift42.github.beeradvisor

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_find_beer.*
import kotlinx.android.synthetic.main.activity_find_beer.view.*

class FindBeerActivity : AppCompatActivity() {
    var expert = BeerExpert()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_find_beer)
    }
    fun onClickFindBeer(view: View):Unit {
        val brandslist = expert.getBrands(color.selectedItem.toString())
        val brandsformatted = StringBuilder()
        for (brand: String in brandslist) {
            brandsformatted.append(brand + "\n")
        }
        brands.text = brandsformatted;
    }
}
