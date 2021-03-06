package mswift42.com.github.workout


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.TextureView
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import kotlinx.android.synthetic.main.fragment_workout_detail.*


/**
 * A simple [Fragment] subclass.
 */
class WorkoutDetailFragment : Fragment() {
        private var workoutId: Long = 0
   fun setWorkout(id: Long): Unit {
        this.workoutId = id
    }


    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        if (savedInstanceState != null) {
            workoutId = savedInstanceState.getLong("workoutId")
        }
        return inflater!!.inflate(R.layout.fragment_workout_detail, container, false)
    }
    override fun onStart() {
        super.onStart()
        val view = view
        if (view != null) {
            val title = textTitle
            val workout = Workout.workouts[workoutId.toInt()]
            title.text = workout.name
            textDescription.text = workout.description
        }
    }
    override  fun onSaveInstanceState(savedInstanceState: Bundle?) {
        savedInstanceState!!.putLong("workoutId", workoutId)
    }

}// Required empty public constructor
