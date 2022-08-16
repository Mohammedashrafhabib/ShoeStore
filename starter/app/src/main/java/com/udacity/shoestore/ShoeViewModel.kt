package com.udacity.shoestore

import android.graphics.ColorSpace
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewmodel.ViewModelInitializer
import com.udacity.shoestore.models.Shoe

class ShoeViewModel: ViewModel() {
private  val _shoes= MutableLiveData<MutableList<Shoe>>()
    val shoes:LiveData<MutableList<Shoe>>
        get() = _shoes
init {
    _shoes.value= mutableListOf()
}

    override fun onCleared() {
        super.onCleared()
    }
     fun addShoe(shoe:Shoe){
        _shoes.value?.add(shoe)
    }
}