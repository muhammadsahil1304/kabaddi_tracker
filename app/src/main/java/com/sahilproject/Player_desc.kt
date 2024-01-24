package com.sahilproject

import android.annotation.SuppressLint
import android.content.ActivityNotFoundException
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.view.View
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.sahilproject.databinding.KabaddiPlayerBinding

class Player_desc : AppCompatActivity() {

    private lateinit var binding: KabaddiPlayerBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = KabaddiPlayerBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var name = intent.getStringExtra("TEAM_NUMBER");
        Log.e("name", "" + name);

        Log.e("oncreate", "oncreate")

        binding.msg.setOnClickListener {
            sendmessage()
        }
        binding.back.setOnClickListener{
            finish();
        }


        binding.phone.setOnClickListener {
            callPhone()
        }
        val facebookUsername = "RahulChaudhariKabaddi" // Replace with the actual Facebook username
        binding.fb.setOnClickListener {
            openFacebookProfile(facebookUsername)
        }
        val username = "rahulkabaddi"
        binding.insta.setOnClickListener{

            // Replace with the actual Instagram username
            sendInstagram(username)
        }
        //finish();
        if (name.equals("1001")) {
            binding.playerimgid.setImageResource(R.drawable.bhavani)
            binding.jaipurtextid.text = "Bhavani Rajput"
            binding.personal.text =
                "S/O Bhawani Singh\n Nickname=----\n\n Nationality=Indian\n Born=14 May 1995 in Jabalpur, MP\n\nYears active=2018-present\n Height= 5 ft 9"
            binding.sports.text =
                "Country= India\n Sport= Kabaddi\n Position= Raider\n\n Club= Jaipur Pink Panthers\n Team= ---"
            binding.pointsEarn.text = "16"
            binding.matches.text = "5"
        }
        if (name.equals("1002")) {
            binding.playerimgid.setImageResource(R.drawable.amir)
            binding.jaipurtextid.text = "Amirhossein Mohammad Maleki"
            binding.personal.text =
                "\n Nickname=----\n\n Nationality=Indian\n Born=25 April 1993 in Iran\nYears active=2018-present\n Height= 5 ft 5"
            binding.sports.text =
                "Country= Iran\n Sport= Kabaddi\n Position= Raider\n\n Club= Jaipur Pink Panthers\n Team= Iran"
            binding.pointsEarn.text = "5"
            binding.matches.text = "1"
        }
        if (name.equals("1003")) {
            binding.playerimgid.setImageResource(R.drawable.arjun)
            binding.jaipurtextid.text = "Arjun Deshwal"
            binding.personal.text =
                "\n Nickname=----\n\n Nationality=Indian\n Born=7 July 1999 in Muzaffarnagar in \nYears active=2018-present\n Height= 5 ft 10"
            binding.sports.text =
                "Country= India\n Sport= Kabaddi\n Position= Raider\n\n Club= Jaipur Pink Panthers\n Team= India"
            binding.pointsEarn.text = "45"
            binding.matches.text = "5"
        }
        if (name.equals("1004")) {
            binding.playerimgid.setImageResource(R.drawable.ajith)
            binding.jaipurtextid.text = "V. Ajith"
            binding.personal.text =
                "\n Nickname=----\n\n Nationality=Indian\n Born=15 July 1998 in karur, Tamil Nadu \nYears active=2019-present\n Height= 5 ft 10"
            binding.sports.text =
                "Country= India\n Sport= Kabaddi\n Position= Raider\n\n Club= Jaipur Pink Panthers\n Team= India"
            binding.pointsEarn.text = "33"
            binding.matches.text = "5"
        }
        if (name.equals("1005")) {
            binding.playerimgid.setImageResource(R.drawable.navneet)
            binding.jaipurtextid.text = "Navneet"
            binding.personal.text =
                "\n Nickname=----\n\n Nationality=Indian\n Born=9 Oct 1995 in Sultanpur \nYears active=2019-present\n Height= 5 ft 8"
            binding.sports.text =
                "Country= India\n Sport= Kabaddi\n Position= All Rounder\n\n Club= Jaipur Pink Panthers\n Team= India"
            binding.pointsEarn.text = "6"
            binding.matches.text = "3"
        }
        if (name.equals("1006")) {
            binding.playerimgid.setImageResource(R.drawable.devank)
            binding.jaipurtextid.text = "Devank"
            binding.personal.text =
                "\n Nickname=----\n\n Nationality=Indian\n Born=5 Jan 2000 in Bhainswal Kalan, Sonipat, Haryana \nYears active=2019-present\n Height= 5 ft 8"
            binding.sports.text =
                "Country= India\n Sport= Kabaddi\n Position= All Rounder\n\n Club= Jaipur Pink Panthers\n Team= India"
            binding.pointsEarn.text = "1"
            binding.matches.text = "1"
        }
        if (name.equals("1007")) {
            binding.playerimgid.setImageResource(R.drawable.shashank)
            binding.jaipurtextid.text = "Shashank B"
            binding.personal.text =
                "\n Nickname=----\n\n Nationality=Indian\n Born=27 July 2000 in India \nYears active=2019-present\n Height= 5 ft 8"
            binding.sports.text =
                "Country= India\n Sport= Kabaddi\n Position= Raider\n\n Club= Jaipur Pink Panthers\n Team= India"
            binding.pointsEarn.text = "57"
            binding.matches.text = "8"
        }
        if (name.equals("1008")) {
            binding.playerimgid.setImageResource(R.drawable.abhijeet)
            binding.jaipurtextid.text = "Abhijeet Malik"
            binding.personal.text =
                "\n Nickname=----\n\n Nationality=Indian\n Born=27 OCT 2003 in India \nYears active=2022-present\n Height=--"
            binding.sports.text =
                "Country= India\n Sport= Kabaddi\n Position= Raider\n\n Club= Jaipur Pink Panthers\n Team= India"
            binding.pointsEarn.text = "0"
            binding.matches.text = "1"
        }
        if (name.equals("1009")) {
            binding.playerimgid.setImageResource(R.drawable.sunil)
            binding.jaipurtextid.text = "Sunil Kumar"
            binding.personal.text =
                "\n Nickname=----\n\n Nationality=Indian\n Born=12 May 1997 Bhainswal Kalan, Sonipat District, Haryana\nYears active=2018-present\n Height=--"
            binding.sports.text =
                "Country= India\n Sport= Kabaddi\n Position= Defender\n\n Club= Jaipur Pink Panthers\n Team= India"
            binding.pointsEarn.text = "16"
            binding.matches.text = "6"
        }
        if (name.equals("1010")) {
            binding.playerimgid.setImageResource(R.drawable.sumit_jpr)
            binding.jaipurtextid.text = "Sumit"
            binding.personal.text =
                "\n Nickname=----\n\n Nationality=Indian\n Born=24 May 1999 \nYears active=2018-present\n Height=6 ft 0"
            binding.sports.text =
                "Country= India\n Sport= Kabaddi\n Position= Defender\n\n Club= Jaipur Pink Panthers\n Team= India"
            binding.pointsEarn.text = "16"
            binding.matches.text = "6"
        }
        if (name.equals("1011")) {
            binding.playerimgid.setImageResource(R.drawable.ankush)
            binding.jaipurtextid.text = "Ankush"
            binding.personal.text =
                "\n Nickname=----\n\n Nationality=Indian\n Born=30 June 2003  \nYears active=2022-present\n Height=5 ft 7"
            binding.sports.text =
                "Country= India\n Sport= Kabaddi\n Position= Defender\n\n Club= Jaipur Pink Panthers\n Team= India"
            binding.pointsEarn.text = "14"
            binding.matches.text = "6"
        }
        if (name.equals("1012")) {
            binding.playerimgid.setImageResource(R.drawable.lavish)
            binding.jaipurtextid.text = "Lavnish"
            binding.personal.text =
                "\n Nickname=----\n\n Nationality=Indian\n Born=1st January 1970  \nYears active=2017-present\n Height=5 ft 8"
            binding.sports.text =
                "Country= India\n Sport= Kabaddi\n Position= Defender\n\n Club= Jaipur Pink Panthers\n Team= India"
            binding.pointsEarn.text = "0"
            binding.matches.text = "0"
        }
        if (name.equals("1013")) {
            binding.playerimgid.setImageResource(R.drawable.sahul)
            binding.jaipurtextid.text = "Sahul Kumar"
            binding.personal.text =
                "\n Nickname=----\n\n Nationality=Indian\n Born=19th May 2001  \nYears active=2019-present\n Height=5 ft 8"
            binding.sports.text =
                "Country= India\n Sport= Kabaddi\n Position= Defender\n\n Club= Jaipur Pink Panthers\n Team= India"
            binding.pointsEarn.text = "5"
            binding.matches.text = "5"
        }
        if (name.equals("1014")) {
            binding.playerimgid.setImageResource(R.drawable.lucky)
            binding.jaipurtextid.text = "Lucky Sharma"
            binding.personal.text =
                "\n Nickname=----\n\n Nationality=Indian\n Born=10th August 1996 \nYears active=2017-present\n Height=5 ft 9"
            binding.sports.text =
                "Country= India\n Sport= Kabaddi\n Position= Defender\n\n Club= Jaipur Pink Panthers\n Team= India"
            binding.pointsEarn.text = "5"
            binding.matches.text = "2"
        }
        if (name.equals("1015")) {
            binding.playerimgid.setImageResource(R.drawable.ashish)
            binding.jaipurtextid.text = "Ashish"
            binding.personal.text =
                "\n Nickname=----\n\n Nationality=Indian\n Born=24th July 2001\nYears active=2019-present\n Height=5 ft 7"
            binding.sports.text =
                "Country= India\n Sport= Kabaddi\n Position= Defender\n\n Club= Jaipur Pink Panthers\n Team= India"
            binding.pointsEarn.text = "0"
            binding.matches.text = "2"
        }
        if (name.equals("1016")) {
            binding.playerimgid.setImageResource(R.drawable.abhishek)
            binding.jaipurtextid.text = "Abhishek KS"
            binding.personal.text =
                "\n Nickname=----\n\n Nationality=Indian\n Born=23rd April 2001\nYears active=2018-present\n Height=5 ft 7"
            binding.sports.text =
                "Country= India\n Sport= Kabaddi\n Position= Defender\n\n Club= Jaipur Pink Panthers\n Team= India"
            binding.pointsEarn.text = "5"
            binding.matches.text = "4"
        }
        if (name.equals("1017")) {
            binding.playerimgid.setImageResource(R.drawable.reza)
            binding.jaipurtextid.text = "Reza Mirabagheri"
            binding.personal.text =
                "\n Nickname=----\n\n Nationality=Iran\n Born=31st May 2003 \nYears active=2020-present\n Height=6 ft 0"
            binding.sports.text =
                "Country= Iran\n Sport= Kabaddi\n Position= Defender\n\n Club= Jaipur Pink Panthers\n Team= Iran"
            binding.pointsEarn.text = "10"
            binding.matches.text = "6"
        }}






    @SuppressLint("MissingSuperCall")
    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<String>, grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if (requestCode == 42) {
            // If request is cancelled, the result arrays are empty.
            if ((grantResults.isNotEmpty() && grantResults[0] == PackageManager.PERMISSION_GRANTED)) {
                // permission was granted, yay!
                callPhone()
            } else {
                // permission denied, boo! Disable the
                // functionality
            }
            return
        }
    }

    fun callPhone() {
        val intent = Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "+918824080769"))
        startActivity(intent)
    }

    fun sendmessage() {


        val uri = Uri.parse("smsto:9782175002")
        val intent = Intent(Intent.ACTION_SENDTO, uri)
        intent.putExtra("sms_body", "The SMS text is here on data")
        startActivity(intent)

        /* var number="9782175002";
        val intent = Intent(Intent.ACTION_VIEW, Uri.fromParts("sms", number, null))
        startActivity(intent)*/


    }

    fun sendInstagram(username: String) {
        val uri = Uri.parse("http://instagram.com/_u/$username")
        val intent = Intent(Intent.ACTION_VIEW, uri)
        intent.setPackage("com.instagram.android")

        // Check if the Instagram app is installed on the device
        if (intent.resolveActivity(packageManager) != null) {
            startActivity(intent)
        } else {
            // If the Instagram app is not installed, open the Instagram website in a browser
            intent.data = Uri.parse("http://instagram.com/$username")
            startActivity(intent)
        }
    }
    private fun openFacebookProfile(username: String) {
        val uri = Uri.parse("fb://facewebmodal/f?href=https://www.facebook.com/$username")
        //val uri = Uri.parse("https://www.facebook.com/")
        val intent = Intent(Intent.ACTION_VIEW,uri)
        intent.setPackage("com.facebook.katana") // Facebook app package name

        try {
            startActivity(intent)
        } catch (e: ActivityNotFoundException) {
            // If the Facebook app is not installed, open the Facebook website in a browser
            val webIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/$username"))
            try {
                startActivity(webIntent)
            } catch (e: ActivityNotFoundException) {
                // Handle the case where there is no app or browser installed
                Log.e("Player_desc", "No activity found to handle Facebook profile", e)
            }
        }
    }


}

    // Inside your onCreate method, replace the existing click listener for the Instagram button



