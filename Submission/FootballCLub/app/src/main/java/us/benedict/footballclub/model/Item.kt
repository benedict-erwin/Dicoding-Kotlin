/*
*
* Submission 1  : Aplikasi Football Club
* Author        : Benedict E. Pranata (benedict.erwin@gmail.com)
* cDate         : 5 September 2018
* Rev           : 5 - 10 September 2018
*
* */

package us.benedict.footballclub.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

/* Item Class - Data Abstraction */
@Parcelize
data class Item (val name: String?, val image: Int?, val desc: String?) : Parcelable