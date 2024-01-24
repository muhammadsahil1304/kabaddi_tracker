package com.sahilproject

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import android.view.Menu
import android.view.MenuItem
import com.sahilproject.databinding.ActivityMainBinding
import com.sahilproject.databinding.IndianTeamBinding
import com.sahilproject.databinding.TeamDescriptionBinding

class TeamDescription_activity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: TeamDescriptionBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = TeamDescriptionBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var myname=intent.getStringExtra("MYNAME");
        binding.nameid.text=myname

        var myimage=intent.getStringExtra("MYIMAGE");
        binding.nameid

    }


}