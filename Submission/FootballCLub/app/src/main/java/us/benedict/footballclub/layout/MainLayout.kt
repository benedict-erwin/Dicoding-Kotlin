/*
*
* Submission 1  : Aplikasi Football Club
* Author        : Benedict E. Pranata (benedict.erwin@gmail.com)
* cDate         : 5 September 2018
* Rev           : 5 - 10 September 2018
*
* */

package us.benedict.footballclub.layout

import android.support.v7.widget.RecyclerView
import android.view.View
import org.jetbrains.anko.*
import org.jetbrains.anko.recyclerview.v7.recyclerView
import us.benedict.footballclub.MainActivity

class MainLayout:AnkoComponent<MainActivity>{
    lateinit var recycleMain: RecyclerView
    override fun createView(ui: AnkoContext<MainActivity>): View = with(ui){
        verticalLayout {
            recycleMain = recyclerView {}.lparams(width= matchParent, height = wrapContent)
        }
    }
}
