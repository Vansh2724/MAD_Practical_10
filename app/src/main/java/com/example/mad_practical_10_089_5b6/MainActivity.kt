package com.example.mad_practical_10_089_5b6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    val imageid= arrayOf<Int>(
        R.drawable.baseline_person_24,R.drawable.baseline_location_on_24,
        R.drawable.baseline_person_24,R.drawable.baseline_location_on_24,
        R.drawable.baseline_person_24,R.drawable.baseline_location_on_24,
        R.drawable.baseline_person_24,R.drawable.baseline_location_on_24,
        R.drawable.baseline_person_24,R.drawable.baseline_location_on_24,

    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val myListAdapter = MyListAdapter()
    }
}