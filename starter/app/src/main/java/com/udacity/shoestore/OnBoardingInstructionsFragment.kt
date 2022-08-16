package com.udacity.shoestore

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import com.udacity.shoestore.databinding.FragmentOnBoardingBinding
import com.udacity.shoestore.databinding.FragmentOnBoardingInstructionsBinding


/**
 * A simple [Fragment] subclass.
 * Use the [OnBoardingInstructionsFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class OnBoardingInstructionsFragment : Fragment() {



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding:FragmentOnBoardingInstructionsBinding=
            DataBindingUtil.inflate(inflater,R.layout.fragment_on_boarding_instructions, container, false)
        // Inflate the layout for this fragment
        binding.donebutton.setOnClickListener{view: View ->
            view.findNavController().navigate(OnBoardingInstructionsFragmentDirections.actionOnBoardingInstructionsFragmentToShoeListingFragment())

        }

        // Inflate the layout for this fragment
        return binding.root
    }


}