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

    public fun setWorkout(id: Long) {
        workoutId = id
    }


    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater!!.inflate(R.layout.fragment_workout_detail, container, false)
    }
    override fun onStart() {
        super.onStart()
        if (view != null) {
            val title = textTitle
            val workout = Workout.workouts[workoutId.toInt()]
            title.text = workout.name
            textDescription.text = workout.description
        }
    }

}// Required empty public constructor
