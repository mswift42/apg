package mswift42.com.github.wo4


import android.os.Bundle
import android.os.Handler
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView


/**
 * A simple [Fragment] subclass.
 */
class StopWatchFragment : Fragment() {
    private var seconds = 0;
    private var running = false;
    private var wasRunning = false;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (savedInstanceState != null) {
            seconds = savedInstanceState.getInt("seconds")
            running = savedInstanceState.getBoolean("running")
            wasRunning = savedInstanceState.getBoolean("wasRunning")
            if (wasRunning) {
                running = true
            }
        }
    }


    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val layout = inflater!!.inflate(R.layout.fragment_stop_watch, container,false)
        runTimer(layout)
        return layout
    }
    override public fun onPause() {
        super.onPause()
        wasRunning = running
        running = false
    }
    override public fun onResume() {
        super.onResume();
        if (wasRunning) {
            running = true
        }
    }
    override public fun onSaveInstanceState(savedInstanceState: Bundle?) {
        savedInstanceState!!.putInt("seconds", seconds)
        savedInstanceState!!.putBoolean("running", running)
        savedInstanceState!!.putBoolean("wasRunning", wasRunning)
    }
    fun onClickStart(view: View) {
        running = true
    }
    fun onClickStop(view: View) {
        running = false
    }
    fun onClickReset(view: View) {
        running = false
        seconds = 0
    }
    private fun runTimer(view: View): Unit {
       val timeView = view.findViewById(R.id.time_view) as TextView
        val handler = Handler()
        val settimer = object : Runnable {
            override fun run() {
               val hours = seconds / 3600
                val minutes = (seconds % 3600) / 60
                val sec = seconds % 60
                val time = String.format("%d:%02d:%02d", hours, minutes, sec)

                timeView.text = time
                if (running) {
                    seconds++
                }
               handler.postDelayed(this, 1000)
            }
        }
        handler.post(settimer)
    }

}// Required empty public constructor
