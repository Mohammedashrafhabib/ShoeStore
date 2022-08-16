package com.udacity.shoestore.models

import android.os.Parcelable
import android.util.Size
import android.widget.TextView
import androidx.databinding.BindingAdapter
import androidx.databinding.InverseBindingAdapter
import androidx.databinding.InverseBindingListener
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Shoe(var name: String,  var company: String, var description: String ,@JvmField var size:Double) : Parcelable{

                    fun getSize():String {return  size.toString()}
                    fun setSize(value:String) {size=value.toString().toDouble()}
                }