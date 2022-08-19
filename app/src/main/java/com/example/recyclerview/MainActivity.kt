package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.LayoutManager

class MainActivity : AppCompatActivity() {
    private lateinit var arrayName:Array<String>
    private lateinit var arrayAge:Array<Int>
    private lateinit var arrayList: ArrayList<DataModel>
    private  var adapter: MyAdapter?=null
    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView=findViewById(R.id.rcv_item)

//        arrayName= arrayOf(
//            "Banana",
//            "Apple",
//            "Grape",
//            "Orange",
//        )
//        arrayAge= arrayOf(
//            12,
//            20,
//            55,
//            66
//        )

        arrayList= ArrayList()
        arrayList.add(DataModel("Moon",20))
        arrayList.add(DataModel("Moon",20))
        arrayList.add(DataModel("Moon",20))
        arrayList.add(DataModel("Moon",20))
        arrayList.add(DataModel("Moon",20))

//        for(item in arrayName.indices){
//            val dataModel=DataModel(
//                arrayName[item],
//                arrayAge[item]
//            )
//            arrayList.add(dataModel)
//        }

        recyclerView.layoutManager= LinearLayoutManager(this)
        recyclerView.adapter=MyAdapter(arrayList)
        recyclerView.setHasFixedSize(true)

    }
}