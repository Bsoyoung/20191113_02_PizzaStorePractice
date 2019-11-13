package com.example.a20191113_02_pizzastorepractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.example.a20191113_02_pizzastorepractice.datas.PizzaStoreData
import kotlinx.android.synthetic.main.activity_pizza_detail.*
import kotlinx.android.synthetic.main.pizza_list_item.*

class pizzaDetailActivity : BaseActivity() {

    var storeData:PizzaStoreData? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pizza_detail)

        setValues()
        setupEvents()

    }
    override fun setupEvents() {

        pizzaDetailBtn.setOnClickListener {

            


        }


    }

    override fun setValues() {
        storeData = intent.getSerializableExtra("store") as PizzaStoreData

        Glide.with(mContext).load(storeData?.logoUrl).into(pizzaDetailProfileImg)
        pizzaDetailStoreName.text = storeData?.name
        pizzaPhoneNum.text = storeData?.phoneNUm

    }

}
