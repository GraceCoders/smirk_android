package com.smirk.adapter

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentActivity
import androidx.recyclerview.widget.RecyclerView
import com.smirk.R


class NotificationAdapter(
    private val activity: FragmentActivity?,

) :
    RecyclerView.Adapter<NotificationAdapter.MyViewHolder>() {
    init {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view: View?
        view = LayoutInflater.from(parent.context)
            .inflate(R.layout.notification_item, parent, false)

        return NormalViewHolder(view!!)

    }

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {



    }

    override fun getItemCount(): Int {
        return 3
    }

    class NormalViewHolder(itemView: View) : MyViewHolder(itemView) {

    }

    open class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
}