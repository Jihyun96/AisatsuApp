package jp.techacademy.jihyun.park.aisatsuapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import android.app.TimePickerDialog

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener{
            showTimePickerDialog()
        }
    }

    private fun showTimePickerDialog() {
        val timePickerDialog = TimePickerDialog(
            this,
            TimePickerDialog.OnTimeSetListener { view, hour, minute ->
                if (2 <= hour && hour < 10) {
                    textView.text = "おはよう"
                } else if (10 <= hour && hour < 18) {
                    textView.text = "こんにちは"
                } else {
                    textView.text = "こんばんは"
                }
            },
            13,0,true)
        timePickerDialog.show()
    }
}
