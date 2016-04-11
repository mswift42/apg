package mswift42.com.github.workout

import android.app.FragmentTransaction
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), WorkoutListFragment.WorkoutListListener  {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    override fun itemClicked(id: Long) {
        val details = WorkoutDetailFragment()
        var ft = supportFragmentManager.beginTransaction()
        details.setWorkout(id)
        ft.replace(R.id.fragment_container, details)
        ft.addToBackStack(null)
        ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
        ft.commit()
    }
}
