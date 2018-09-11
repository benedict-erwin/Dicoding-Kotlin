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
import us.benedict.footballclub.model.Item

class DetailActivity()  : AppCompatActivity(){
    lateinit var detailLayout: DetailLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        /* Set Layout to DetailLayout*/
        detailLayout = DetailLayout()
        detailLayout.setContentView(this)

        /* Init intent to get data */
        val intent = intent

        /* Get data as parcelable */
        val item = intent.getParcelableExtra<Item>("item") as Item

        /* Set Layout content */
        detailLayout.namaClub.text = item.name
        Glide.with(this).load(item.image).into(detailLayout.logoClub)
        detailLayout.descClub.text = item.desc
    }

}
