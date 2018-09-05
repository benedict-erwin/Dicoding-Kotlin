/*
*
* Submission 1 : Aplikasi Football Club
* Author : Benedict E. Pranata (benedict.erwin@gmail.com)
* Date: 5 September 2018
*
* */

package us.benedict.footballclub.layout

import android.view.Gravity
import android.view.View
import android.view.ViewGroup
import android.view.ViewGroup.LayoutParams.MATCH_PARENT
import android.view.ViewGroup.LayoutParams.WRAP_CONTENT
import android.widget.LinearLayout
import org.jetbrains.anko.*
import us.benedict.footballclub.R

class ItemListLayout:AnkoComponent<ViewGroup>{

    override fun createView(ui: AnkoContext<ViewGroup>): View = with(ui){
        linearLayout {
            layoutParams = LinearLayout.LayoutParams(MATCH_PARENT, WRAP_CONTENT)
            orientation = LinearLayout.HORIZONTAL

            imageView{
                id = R.id.img_club
                setImageResource(R.drawable.img_barca)
            }.lparams(width = dip(50), height = dip(50)){
                margin = dip(10)
            }

            textView {
                id = R.id.tx_club
                text = "Barcelona FC"
            }.lparams(width = wrapContent, height = wrapContent){
                margin = dip(10)
                gravity = Gravity.CENTER_VERTICAL
            }
        }
    }
}