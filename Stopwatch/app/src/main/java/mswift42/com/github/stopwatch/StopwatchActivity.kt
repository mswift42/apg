package mswift42.com.github.stopwatch

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import kotlinx.android.synthetic.main.activity_stopwatch.*

class StopwatchActivity : AppCompatActivity() {
    private var seconds: Int = 0
    private var running: Boolean = false
    private var wasRunning: Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_stopwatch)
        if (savedInstanceState != null) {
            seconds = savedInstanceState.getInt("seconds")
            running = savedInstanceState.getBoolean("running")
            wasRunning = savedInstanceState.getBoolean("wasRunning")
        }
        runTimer()
    }
    override fun onSaveInstanceState(savedInstanceState: Bundle?) {
        savedInstanceState?.putInt("seconds", seconds)
        savedInstanceState?.putBoolean("running", running)
        savedInstanceState?.putBoolean("wasRunning", wasRunning)
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

    private fun runTimer(): Unit {
        val handler = Handler()
        val settimer = object : Runnable {
            override fun run() {
                val hours = seconds / 3600
                val minutes = (seconds % 3600) / 60
                val sec = seconds % 60
                val time = String.format("%d:%02d:%02d", hours, minutes, seconds)
                watchtimer.text = time
                if (running) {
                    seconds++
                }
                handler.postDelayed(this, 1000)
            }
        }
        handler.post(settimer)
    }
    override fun onStop() {
        super.onStop()
        wasRunning = running
        running = false
    }

}