/*
*
* Submission 1 : Aplikasi Football Club
* Author : Benedict E. Pranata (benedict.erwin@gmail.com)
* Date: 5 September 2018
*
* */

package us.benedict.footballclub.layout

import android.view.View
import org.jetbrains.anko.*
import org.jetbrains.anko.recyclerview.v7.recyclerView
import us.benedict.footballclub.MainActivity
import us.benedict.footballclub.R

class MainLayout:AnkoComponent<MainActivity>{
    override fun createView(ui: AnkoContext<MainActivity>): View = with(ui){
        verticalLayout {
            recyclerView {
                id = R.id.recycle_main
            }.lparams(width= matchParent, height = wrapContent)
        }
    }
}
