package mswift42.com.github.workout

import android.app.FragmentTransaction
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), WorkoutListFragment.WorkoutListListener  {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    override fun itemClicked(id: Long) {
        val fragmentcontainer = findViewById(R.id.fragment_container)
        if (fragmentcontainer != null) {

            val details = WorkoutDetailFragment()
            val ft = supportFragmentManager.beginTransaction()
            details.setWorkout(id)
            ft.replace(R.id.fragment_container, details)
            ft.addToBackStack(null)
            ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
            ft.commit()
        } else {
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra(DetailActivity.EXTRA_WORKOUT_ID, id.toInt())
            startActivity(intent)
        }
    }
}
