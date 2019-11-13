package com.example.a20191113_02_pizzastorepractice.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.bumptech.glide.Glide
import com.example.a20191113_02_pizzastorepractice.R
import com.example.a20191113_02_pizzastorepractice.datas.PizzaStoreData
import de.hdodenhof.circleimageview.CircleImageView

class PizzaStoreAdapter(context:Context,res:Int,list:ArrayList<PizzaStoreData>):ArrayAdapter<PizzaStoreData>(context,res,list) {

    var myContext = context
    var mList = list
    var inf = LayoutInflater.from(myContext)

    constructor(context: Context,list: ArrayList<PizzaStoreData>) : this(context,R.layout.pizza_list_item,list)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        var tempRow = convertView

        if(tempRow == null){
            tempRow = inf.inflate(R.layout.pizza_list_item,null)
        }
        var row = tempRow!!

        var data = mList.get(position)
        var circleImageView = row.findViewById<CircleImageView>(R.id.profileImg)
        var storeName = row.findViewById<TextView>(R.id.pizzaStoreName)
        storeName.text = data.name
        Glide.with(myContext).load(data.logoUrl).into(circleImageView)



        return row
    }


}