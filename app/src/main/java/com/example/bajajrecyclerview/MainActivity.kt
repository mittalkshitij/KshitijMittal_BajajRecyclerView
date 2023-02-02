package com.example.bajajrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    lateinit var usersList : ArrayList<Users>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var myRecyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        myRecyclerView.layoutManager = LinearLayoutManager(this,RecyclerView.VERTICAL,false)

        usersList = ArrayList<Users>()
        myRecyclerView.adapter=  MyAdapter(usersList)

        gettingData()

    }

    private fun gettingData() {

        var user1 = Users("Kshitij","123")
        usersList.add(user1)
        var user2 = Users("Harshit","982")
        usersList.add(user2)
        var user3 = Users("Sidd","1123")
        usersList.add(user3)
        var user4 = Users("Tanya","247")
        usersList.add(user4)
        var user5 = Users("Twesha","574")
        usersList.add(user5)
    }
}