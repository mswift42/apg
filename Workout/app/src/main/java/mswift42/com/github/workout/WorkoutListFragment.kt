package mswift42.com.github.workout


import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.app.ListFragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView

/**
 * A simple [Fragment] subclass.
 */
class WorkoutListFragment : ListFragment () {

    internal interface WorkoutListListener {
        fun itemClicked(id: Long) : Unit
    }
    private val listener: WorkoutListListener? = null


    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val names = Workout.workouts.map { it.name }
        val adapter = ArrayAdapter<String>(inflater!!.context, android.R.layout.simple_list_item_1,names)
        setListAdapter(adapter)
        return super.onCreateView(inflater, container, savedInstanceState)
    }

}// Required empty public constructor
