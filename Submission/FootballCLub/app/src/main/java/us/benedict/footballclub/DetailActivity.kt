/*
*
* Submission 1 : Aplikasi Football Club
* Author : Benedict E. Pranata (benedict.erwin@gmail.com)
* Date: 5 September 2018
*
* */

package us.benedict.footballclub

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ImageView
import android.widget.TextView
import org.jetbrains.anko.setContentView
import us.benedict.footballclub.layout.DetailLayout

class DetailActivity  : AppCompatActivity(){


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        /* Set Layout to DetailLayout*/
        DetailLayout().setContentView(this)

        /* Init Variable */
        var name: String = ""
        var img: Int = 0
        var desc: String = ""
        var nameVw = findViewById<TextView>(R.id.nama_club)
        var imgVw = findViewById<ImageView>(R.id.logo_club)
        var descVw = findViewById<TextView>(R.id.desc_club)
        val intent = intent

        /* Set Variable from passed data */
        name = intent.getStringExtra("name")
        img = intent.getIntExtra("image", 0)
        desc = intent.getStringExtra("desc")
        nameVw.text = name
        imgVw.setImageResource(img)
        descVw.text = desc
    }

}
