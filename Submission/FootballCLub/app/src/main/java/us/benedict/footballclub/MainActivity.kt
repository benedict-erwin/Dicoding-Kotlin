/*
*
* Submission 1 : Aplikasi Football Club
* Author : Benedict E. Pranata (benedict.erwin@gmail.com)
* Date: 5 September 2018
*
* */

package us.benedict.footballclub

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import org.jetbrains.anko.setContentView
import us.benedict.footballclub.adapter.RecyclerViewAdapter
import us.benedict.footballclub.layout.MainLayout
import us.benedict.footballclub.model.Item

class MainActivity : AppCompatActivity() {
    /* ArrayList from model/Item */
    private var items: ArrayList<Item> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        /* Set ContentView from MainLayout*/
        MainLayout().setContentView(this)

        /* Set list as RecycleView and set view by id from MainLayout */
        val list: RecyclerView = findViewById(R.id.recycle_main)

        /* Call initData Function */
        initData()

        /* Set RecycleView layoutManager */
        list.layoutManager = LinearLayoutManager(this)

        /* Set RecycleView Adapter from items */
        list.adapter = RecyclerViewAdapter(applicationContext, items){

            /* Set Intent with data*/
            val intent = Intent(this,DetailActivity::class.java);
            intent.putExtra("name", it.name)
            intent.putExtra("image", it.image)
            intent.putExtra("desc", it.desc)

            /* Start DetailActivity */
            startActivity(intent);
        }

    }

    /* Function initData - populate items data */
    private fun initData(){
        val name = resources.getStringArray(R.array.club_name)
        val image = resources.obtainTypedArray(R.array.club_img)
        val desc = resources.getStringArray(R.array.club_desc)

        items.clear()
        for (i in name.indices) {
            items.add(
                    Item(name[i],
                    image.getResourceId(i, 0),
                    desc[i])
            )
        }

        //Recycle the typed array
        image.recycle()
    }
}