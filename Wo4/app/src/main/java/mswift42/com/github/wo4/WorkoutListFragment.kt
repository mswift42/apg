package mswift42.com.github.wo4


import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.app.ListFragment
import android.support.v4.widget.ListViewAutoScrollHelper
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView

/**
 * A simple [Fragment] subclass.
 */
class WorkoutListFragment : ListFragment() {

    internal interface WorkoutListListener {
        fun itemClicked(id: Long)
    }

    private var listener: WorkoutListListener? = null


    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val names = arrayOfNulls<String>(Workout.workouts.size)
        for (i in names.indices) {
            names[i] = Workout.workouts[i].name
        }
        val adapter = ArrayAdapter<String>(
                inflater!!.context, android.R.layout.simple_list_item_1, names)
        listAdapter = adapter
        return super.onCreateView(inflater, container, savedInstanceState)
    }

    override fun onAttach(context: Context?) {
        super.onAttach(context)
        this.listener = context as WorkoutListListener?
    }

    override fun onListItemClick(l: ListView?, v: View?, position: Int, id: Long) {
        if (listener != null) {
            listener!!.itemClicked(id)
        }
    }

}// Required empty public constructor
