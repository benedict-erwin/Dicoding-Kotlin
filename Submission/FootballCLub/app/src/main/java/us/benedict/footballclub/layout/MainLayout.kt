/*
*
* Submission 1 : Aplikasi Football Club
* Author : Benedict E. Pranata (benedict.erwin@gmail.com)
* Date: 5 September 2018
*
* */

package us.benedict.footballclub.layout

import android.support.v7.widget.RecyclerView
import android.view.View
import org.jetbrains.anko.*
import org.jetbrains.anko.recyclerview.v7.recyclerView
import us.benedict.footballclub.MainActivity
import us.benedict.footballclub.R

class MainLayout:AnkoComponent<MainActivity>{
    lateinit var recycle_main: RecyclerView
    override fun createView(ui: AnkoContext<MainActivity>): View = with(ui){
        verticalLayout {
            recycle_main = recyclerView {}.lparams(width= matchParent, height = wrapContent)
        }
    }
}
