package com.sahilproject

import android.content.Intent
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
import com.sahilproject.databinding.KabaddiDescriptionBinding

class MainActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: IndianTeamBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = IndianTeamBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.rohithid.setOnClickListener {
            var mytext=binding.rohithtextid.text.toString()
            callingactivitydata1(mytext)
        }
        binding.rohithid.setOnClickListener {
            var mypic=binding.rohitimageid.imageMatrix.toString()
            callingactivitydata2(mypic)

        }

        binding.shubhanid.setOnClickListener {
            var mytext=binding.shubhantextid.text.toString()
            callingactivitydata1(mytext)
        }
        binding.viratid.setOnClickListener {
            var mytext=binding.virattextid.text.toString()
            callingactivitydata1(mytext)
        }
        binding.iyerid.setOnClickListener {
            var mytext=binding.iyertextid.text.toString()
            callingactivitydata1(mytext)
        }
        binding.rahulid.setOnClickListener {
            var mytext=binding.rahultextid.text.toString()
            callingactivitydata1(mytext)
        }
        binding.suryaid.setOnClickListener {
            var mytext=binding.suryatextid.text.toString()
            callingactivitydata1(mytext)
        }
        binding.jadejaid.setOnClickListener {
            var mytext=binding.jadejatextid.text.toString()
            callingactivitydata1(mytext)
        }
        binding.kuldeepid.setOnClickListener {
            var mytext=binding.kuldeeptextid.text.toString()
            callingactivitydata1(mytext)
        }
        binding.shamiid.setOnClickListener {
            var mytext = binding.shamitextid.text.toString()
            callingactivitydata1(mytext)
        }
        binding.bumraid.setOnClickListener {
            var mytext = binding.bumratextid.text.toString()
            callingactivitydata1(mytext)
        }
        binding.sirajid.setOnClickListener {
            var mytext=binding.sirajtextid.text.toString()
            callingactivitydata1(mytext)}


    }

    private fun callingactivitydata1(mytext: String) {
        val intent = Intent(this, TeamDescription_activity::class.java)
        intent.putExtra("MYNAME",mytext)
        startActivity(intent)
    }
    private fun callingactivitydata2(mypic: String) {
        val intent = Intent(this, TeamDescription_activity::class.java)
        intent.putExtra("MYIMAGE",mypic)
        startActivity(intent)
    }



}