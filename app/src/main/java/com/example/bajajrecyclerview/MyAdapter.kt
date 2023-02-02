package com.example.bajajrecyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(var myList : ArrayList<Users>) : RecyclerView.Adapter<MyAdapter.MyViewHolder>() {

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

        fun myBindingView(users: Users) {
            var usernameTextView = itemView.findViewById<TextView>(R.id.usernameTextView)
            var passwordTextView = itemView.findViewById<TextView>(R.id.passwordTextView)

            usernameTextView.setText(users.username)
            passwordTextView.setText(users.password)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {

        var view = LayoutInflater.from(parent.context).inflate(R.layout.item_layout,parent,false)

        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        holder.myBindingView(myList[position])

    }

    override fun getItemCount(): Int {

        return myList.size
    }
}