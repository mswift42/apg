package mswift42.com.github.wo4


import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentTransaction
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView


/**
 * A simple [Fragment] subclass.
 */
class WorkoutDetailFragment : Fragment() {
    private var workoutId: Long = 0


    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        if (savedInstanceState != null) {
            workoutId = savedInstanceState.getLong("workoutId")
        } else {
            val ft = childFragmentManager.beginTransaction()
            val stopwatchfragment = StopWatchFragment()
            ft.replace(R.id.stopwatch_container, stopwatchfragment)
            ft.addToBackStack(null)
            ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
            ft.commit()
        }
        // Inflate the layout for this fragment
        return inflater!!.inflate(R.layout.fragment_workout_detail, container, false)
    }

    fun setWorkoutId(id: Long) {
        this.workoutId = id
    }

    override fun onStart() {
        super.onStart()
        val view = view
        if (view != null) {
            val title = view.findViewById(R.id.textTitle) as TextView
            val workout = Workout.workouts[workoutId.toInt()]
            title.text = workout.name
            val desc = view.findViewById(R.id.textDescription) as TextView
            desc.text = workout.description
        }
    }

    override fun onSaveInstanceState(saveInstanceState: Bundle?) {
        saveInstanceState!!.putLong("workoutId", workoutId)
    }
}// Required empty public constructor

