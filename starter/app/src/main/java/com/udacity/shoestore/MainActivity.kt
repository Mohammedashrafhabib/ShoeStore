package com.udacity.shoestore

import android.os.Bundle
import android.widget.Toolbar
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI
import com.udacity.shoestore.databinding.ActivityMainBinding
import timber.log.Timber


class MainActivity : AppCompatActivity() {
private lateinit var toolbar: androidx.appcompat.widget.Toolbar
private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        binding=DataBindingUtil.setContentView(this,R.layout.activity_main)
        Timber.plant(Timber.DebugTree())
        toolbar=binding.toolbar
        setSupportActionBar(toolbar);
        val navController=this.findNavController(R.id.myNavHostFragment)
        val appBarConfiguration = AppBarConfiguration.Builder(navController.graph).build()
        NavigationUI.setupWithNavController(toolbar,navController,appBarConfiguration)
        //binding.toolbar.findNavController().navigate(R.id.action_shoeDetailFragment_to_shoeListingFragment)
        // val navController=binding.myNavHostFragment.findNavController()
//        NavigationUI.setupActionBarWithNavController(this,navController,drawerLayout)
      //  NavigationUI.setupWithNavController(binding.navView,navController)
     //  drawerLayout.setDrawerLockMode(DrawerLayout.LOCK_MODE_LOCKED_CLOSED)
//        binding.navView.setNavigationItemSelectedListener(this)
       // this.setSupportActionBar(binding.toolbar)

    }

    //    override fun onNavigationItemSelected(item: MenuItem): Boolean {
//
//        when (item.itemId) {
//            R.id.about_item -> navController.navigate(R.id.aboutFramgent)
//            R.id.settings_item -> navController.navigate(R.id.settingsFramgent)
//        }
//
//        return true
//    }

    override fun onSupportNavigateUp(): Boolean {
        val navController=this.findNavController(R.id.myNavHostFragment)
        return NavigationUI.navigateUp(navController,binding.appBarLayout)
    }
}
