package com.udacity.shoestore

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.udacity.shoestore.databinding.FragmentShoeDetailBinding
import com.udacity.shoestore.models.Shoe
import timber.log.Timber


class ShoeDetailFragment : Fragment() {
    private lateinit var viewModel: ShoeViewModel
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: FragmentShoeDetailBinding =
            DataBindingUtil.inflate(inflater,R.layout.fragment_shoe_detail, container, false)
        binding.shoe=Shoe("","","",0.0)
        viewModel = ViewModelProvider(parentFragment!!).get(ShoeViewModel::class.java)
        binding.button.setOnClickListener {
            Timber.plant(Timber.DebugTree())

            viewModel.addShoe(binding.shoe!!)
//            ViewModelProvider(this).get(ShoeViewModel::class.java)
            it.findNavController().popBackStack()
        }
        // Inflate the layout for this fragment
        return binding.root
    }


}