package com.example.mad_practical_10_089_5b6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.mad_practical_10_089_5b6.databinding.ActivityMainBinding

class MainActivity: AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    var arr_records = ArrayList<LocationlistCardModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        arr_records.add(LocationlistCardModel("Patel Vansh","+91 84011 38433","vanshkpatel21@gnu.ac.in","125 heritage visnagar"))
        arr_records.add(LocationlistCardModel("Patel Vansh","+91 84011 38433","vanshkpatel21@gnu.ac.in","125 heritage visnagar"))
        arr_records.add(LocationlistCardModel("Patel Vansh","+91 84011 38433","vanshkpatel21@gnu.ac.in","125 heritage visnagar"))
        arr_records.add(LocationlistCardModel("Patel Vansh","+91 84011 38433","vanshkpatel21@gnu.ac.in","125 heritage visnagar"))
        arr_records.add(LocationlistCardModel("Patel Vansh","+91 84011 38433","vanshkpatel21@gnu.ac.in","125 heritage visnagar"))
        arr_records.add(LocationlistCardModel("Patel Vansh","+91 84011 38433","vanshkpatel21@gnu.ac.in","125 heritage visnagar"))
        arr_records.add(LocationlistCardModel("Patel Vansh","+91 84011 38433","vanshkpatel21@gnu.ac.in","125 heritage visnagar"))
        arr_records.add(LocationlistCardModel("Patel Vansh","+91 84011 38433","vanshkpatel21@gnu.ac.in","125 heritage visnagar"))
        arr_records.add(LocationlistCardModel("Patel Vansh","+91 84011 38433","vanshkpatel21@gnu.ac.in","125 heritage visnagar"))

        val adapter =RecyclerPersonlistAdapter(this,arr_records)
        binding.myrecycler.layoutManager= LinearLayoutManager(this)
        binding.myrecycler.adapter = adapter
    }
}