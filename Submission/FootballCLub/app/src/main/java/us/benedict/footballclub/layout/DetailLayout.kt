/*
*
* Submission 1 : Aplikasi Football Club
* Author : Benedict E. Pranata (benedict.erwin@gmail.com)
* Date: 5 September 2018
*
* */

package us.benedict.footballclub.layout

import android.graphics.Typeface
import android.view.Gravity
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import org.jetbrains.anko.*
import us.benedict.footballclub.DetailActivity
import us.benedict.footballclub.R

class DetailLayout:AnkoComponent<DetailActivity> {
    lateinit var logo_club: ImageView
    lateinit var nama_club: TextView
    lateinit var desc_club: TextView

    override fun createView(ui: AnkoContext<DetailActivity>): View = with(ui){
        linearLayout {
            layoutParams = LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT)
            orientation = LinearLayout.VERTICAL

            logo_club = imageView {
                setImageResource(R.drawable.img_barca)
            }.lparams(width = dip(100), height = dip(100)){
                topMargin = dip(10)
                gravity = Gravity.CENTER_HORIZONTAL
            }

            nama_club = textView {
                text = "Barcelona FC"
                setTypeface(null, Typeface.BOLD)
            }.lparams(width = wrapContent, height = wrapContent){
                topMargin = dip(10)
                gravity = Gravity.CENTER_HORIZONTAL
            }

            desc_club = textView {
                text = "Barcelona FC is bla bla bla"
            }.lparams(width = wrapContent, height = wrapContent){
                topMargin = dip(20)
                leftMargin = dip(10)
            }
        }
    }
}