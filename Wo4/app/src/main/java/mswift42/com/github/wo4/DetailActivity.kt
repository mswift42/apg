package mswift42.com.github.wo4

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        val workoutDetailFragment = supportFragmentManager.findFragmentById(R.id.detail_frag) as WorkoutDetailFragment
        val workoutId = intent.extras.get(EXTRA_WORKOUT_ID) as Int
        workoutDetailFragment.setWorkoutId(workoutId.toLong())
    }

    companion object {
        val EXTRA_WORKOUT_ID = "id"
    }
}
