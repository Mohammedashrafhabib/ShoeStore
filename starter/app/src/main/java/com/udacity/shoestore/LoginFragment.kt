package com.udacity.shoestore

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import com.udacity.shoestore.databinding.FragmentLoginBinding


/**
 * A simple [Fragment] subclass.
 * Use the [LoginFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class LoginFragment : Fragment() {

    /*override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }
*/
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding:FragmentLoginBinding= DataBindingUtil.inflate(inflater,R.layout.fragment_login, container, false)
        // Inflate the layout for this fragment
        binding.LoginBut.setOnClickListener {
            if (!binding.usertnametxtbox.text.isNullOrBlank()&&!binding.password.text.isNullOrBlank()) {
                it.findNavController()
                    .navigate(LoginFragmentDirections.actionLoginFragmentToOnBoardingFragment(binding.usertnametxtbox.text.toString()))
            }
            else{
                Toast.makeText(context, "please Enter username and password", Toast.LENGTH_SHORT).show()
            }

        }

        binding.Register.setOnClickListener {
            if (!binding.usertnametxtbox.text.isNullOrBlank()&&!binding.password.text.isNullOrBlank()) {
                it.findNavController()
                    .navigate(LoginFragmentDirections.actionLoginFragmentToOnBoardingFragment(binding.usertnametxtbox.text.toString()))
            }
            else{
            Toast.makeText(context, "please Enter username and password", Toast.LENGTH_SHORT).show()
        }
        }
        // Inflate the layout for this fragment

        return binding.root
    }


}