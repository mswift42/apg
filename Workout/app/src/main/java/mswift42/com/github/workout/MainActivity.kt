package mswift42.com.github.workout

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val frag = supportFragmentManager.findFragmentById(R.id.detail_frag) as WorkoutDetailFragment
        frag.setWorkout(1)
    }
}
