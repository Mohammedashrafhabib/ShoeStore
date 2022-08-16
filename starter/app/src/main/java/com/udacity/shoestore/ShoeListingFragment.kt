package com.udacity.shoestore

import android.os.Build
import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.cardview.widget.CardView
import androidx.core.view.children
import androidx.core.view.get
import androidx.core.view.marginBottom
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelStore
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI

import com.udacity.shoestore.databinding.FragmentShoeListingBinding
import com.udacity.shoestore.models.Shoe
import kotlinx.android.synthetic.main.cardlayout.view.*
import kotlinx.android.synthetic.main.cardlayout.view.nametxt
import kotlinx.android.synthetic.main.fragment_shoe_detail.view.*
import kotlinx.android.synthetic.main.fragment_shoe_listing.*
import kotlinx.android.synthetic.main.fragment_shoe_listing.view.*
import java.util.zip.Inflater


class ShoeListingFragment : Fragment() {
    private lateinit var viewModel: ShoeViewModel
   // private  lateinit var shoe:Shoe
    private lateinit var  binding: FragmentShoeListingBinding
    @RequiresApi(Build.VERSION_CODES.Q)
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
         binding =
            DataBindingUtil.inflate(inflater,R.layout.fragment_shoe_listing, container, false)

        binding.floatingActionButton.setOnClickListener{view: View ->
            view.findNavController().navigate(ShoeListingFragmentDirections.actionShoeListingFragmentToShoeDetailFragment())

        }

        viewModel = ViewModelProvider(parentFragment!!).get(ShoeViewModel::class.java)

//        binding.floatingActionButton.setOnClickListener()
        for(shoe in viewModel.shoes.value!!){

           //var x=
             var x= View.inflate(context,R.layout.cardlayout,null)
           x.nametxt.text=shoe.name
            x.companytxt.text=shoe.company
            x.sizetxt.text=shoe.size.toString()
            x.descriptiontxt.text=shoe.description

            binding.linearlayout.addView(x)
            binding.linearlayout.dividerPadding=6


           // binding.linearlayout.addView(x)

        }


//             Inflate the layout for this fragment
        setHasOptionsMenu(true)
        return binding.root
    }
    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.overflow,menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return NavigationUI.onNavDestinationSelected(item, requireView().findNavController()) ||super.onOptionsItemSelected(item)
    }
    override fun onResume() {
        super.onResume()

    }
}