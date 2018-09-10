/*
*
* Submission 1  : Aplikasi Football Club
* Author        : Benedict E. Pranata (benedict.erwin@gmail.com)
* cDate         : 5 September 2018
* Rev           : 5 - 10 September 2018
*
* */

package us.benedict.footballclub

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.bumptech.glide.Glide
import org.jetbrains.anko.setContentView
import us.benedict.footballclub.layout.DetailLayout

class DetailActivity()  : AppCompatActivity(){
    lateinit var detailLayout: DetailLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        /* Set Layout to DetailLayout*/
        detailLayout = DetailLayout()
        detailLayout.setContentView(this)

        /* Init intent to get extra */
        val intent = intent

        /* Set Variable from passed data */
        val name : String = intent.getStringExtra("name")
        val img : Int = intent.getIntExtra("image", 0)
        val desc : String = intent.getStringExtra("desc")

        /* Set Layout content */
        detailLayout.namaClub.text = name
        Glide.with(this).load(img).into(detailLayout.logoClub)
        detailLayout.descClub.text = desc
    }

}
