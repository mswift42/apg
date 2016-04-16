package mswift42.com.github.wo4

import android.content.Intent
import android.support.v4.app.FragmentTransaction
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity(), WorkoutListFragment.WorkoutListListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun itemClicked(id: Long) {
        val fragmentContainer = findViewById(R.id.fragment_container)
        if (fragmentContainer != null) {
            val details = WorkoutDetailFragment()
            val ft = supportFragmentManager.beginTransaction()
            details.setWorkoutId(id)
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
