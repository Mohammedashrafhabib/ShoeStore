package com.udacity.shoestore

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.udacity.shoestore.databinding.FragmentLoginBinding
import com.udacity.shoestore.databinding.FragmentOnBoardingBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER


class OnBoardingFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: FragmentOnBoardingBinding =
            DataBindingUtil.inflate(inflater,R.layout.fragment_on_boarding, container, false)
        // Inflate the layout for this fragment
        val arg =OnBoardingFragmentArgs.fromBundle(arguments!!)
        with(binding) {
            textView.text = binding.textView.text.toString() + " " + arg.username
            nextbutton.setOnClickListener { view: View ->
                view.findNavController()
                    .navigate(OnBoardingFragmentDirections.actionOnBoardingFragmentToOnBoardingInstructionsFragment())

            }
        }
        // Inflate the layout for this fragment

        return binding.root
    }


}