package mswift42.com.github.workout

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class DetailActivity : AppCompatActivity() {
    companion object {
        val EXTRA_WORKOUT_ID = "id"
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        var workoutDetailFragment = supportFragmentManager.findFragmentById(R.id.detail_frag) as WorkoutDetailFragment
        val workoutId = intent.extras.get(EXTRA_WORKOUT_ID) as Long
        workoutDetailFragment.setWorkout(workoutId)
    }
}
