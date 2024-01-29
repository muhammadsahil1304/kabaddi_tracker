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
            binding.position.text ="Position:raider"
            binding.matches.text="Matches:32"
            binding.totalPoints.text="Points:54"
            binding.raids.text="Total Raids:171"
            binding.avgtime.text="Avg. time on mat:33.9%"
            binding.Effective.text="Effective points:21"
            binding.dob.text="D.O.B:14 May 1995"
            binding.nation.text="Nationality INDIA"
            binding.club.text="Club: Jaipur Pink Panthers"
            binding.pointsEarn.text = "16"
            binding.matches.text = "5"
        }
        if (name.equals("1002")) {
            binding.playerimgid.setImageResource(R.drawable.amir)
            binding.jaipurtextid.text = "Amirhossein Mohammad Maleki"

            binding.position.text ="Position:raider"
            binding.matches.text="Matches:1"
            binding.totalPoints.text="Points:5"
            binding.raids.text="Total Raids:5"
            binding.avgtime.text="Avg. time on mat:23.8%"
            binding.Effective.text="Effective points:4"
            binding.dob.text="D.O.B:25 April 1993"
            binding.nation.text="Nationality IRAN"
            binding.club.text="Club: Jaipur Pink Panthers"
            binding.pointsEarn.text = "5"
            binding.matches.text = "1"
        }
        if (name.equals("1003")) {
            binding.playerimgid.setImageResource(R.drawable.arjun)
            binding.jaipurtextid.text = "Arjun Deshwal"

            binding.position.text ="Position:raider"
            binding.matches.text="Matches:56"
            binding.totalPoints.text="Points:418"
            binding.raids.text="Total Raids:803"
            binding.avgtime.text="Avg. time on mat:66.7%"
            binding.Effective.text="Effective points:333"
            binding.dob.text="D.O.B:7 July 1999"
            binding.nation.text="Nationality INDIA"
            binding.club.text="Club: Jaipur Pink Panthers"
            binding.pointsEarn.text = "45"
            binding.matches.text = "5"
        }
        if (name.equals("1004")) {
            binding.playerimgid.setImageResource(R.drawable.ajith)
            binding.jaipurtextid.text = "V. Ajith"
            binding.position.text ="Position:raider"
            binding.matches.text="Matches:51"
            binding.totalPoints.text="Points:303"
            binding.raids.text="Total Raids:643"
            binding.avgtime.text="Avg. time on mat:61.7%"
            binding.Effective.text="Effective points:167"
            binding.dob.text="D.O.B:15 July 1998"
            binding.nation.text="Nationality INDIA"
            binding.club.text="Club: Jaipur Pink Panthers"
            binding.pointsEarn.text = "33"
            binding.matches.text = "5"
        }
        if (name.equals("1005")) {
            binding.playerimgid.setImageResource(R.drawable.navneet)
            binding.jaipurtextid.text = "Navneet"
            binding.position.text ="Position:raider"
            binding.matches.text="Matches:7"
            binding.totalPoints.text="Points:31"
            binding.raids.text="Total Raids:53"
            binding.avgtime.text="Avg. time on mat:50.3%"
            binding.Effective.text="Effective points:7"
            binding.dob.text="D.O.B:9 Oct 1995"
            binding.nation.text="Nationality INDIA"
            binding.club.text="Club: Jaipur Pink Panthers"
            binding.pointsEarn.text = "6"
            binding.matches.text = "3"
        }
        if (name.equals("1006")) {
            binding.playerimgid.setImageResource(R.drawable.devank)
            binding.jaipurtextid.text = "Devank"
            binding.position.text ="Position:raider"
            binding.matches.text="Matches:1"
            binding.totalPoints.text="Points:-"
            binding.raids.text="Total Raids:2"
            binding.avgtime.text="Avg. time on mat:-"
            binding.Effective.text="Effective points:1"
            binding.dob.text="D.O.B:5 Jan 2000"
            binding.nation.text="Nationality INDIA"
            binding.club.text="Club: Jaipur Pink Panthers"
            binding.pointsEarn.text = "1"
            binding.matches.text = "1"
        }
        if (name.equals("1007")) {
            binding.playerimgid.setImageResource(R.drawable.shashank)
            binding.jaipurtextid.text = "Shashank B"
            binding.position.text ="Position:raider"
            binding.matches.text="Matches:1"
            binding.totalPoints.text="Points:-"
            binding.raids.text="Total Raids:2"
            binding.avgtime.text="Avg. time on mat:-"
            binding.Effective.text="Effective points:1"
            binding.dob.text="D.O.B:27 July 2000"
            binding.nation.text="Nationality INDIA"
            binding.club.text="Club: Jaipur Pink Panthers"
            binding.pointsEarn.text = "57"
            binding.matches.text = "8"
        }
        if (name.equals("1008")) {
            binding.playerimgid.setImageResource(R.drawable.abhijeet)
            binding.jaipurtextid.text = "Abhijeet Malik"
            binding.position.text ="Position:raider"
            binding.matches.text="Matches:1"
            binding.totalPoints.text="Points:-"
            binding.raids.text="Total Raids:1"
            binding.avgtime.text="Avg. time on mat:30%"
            binding.Effective.text="Effective points:-"
            binding.dob.text="D.O.B:27 OCT 2003"
            binding.nation.text="Nationality INDIA"
            binding.club.text="Club: Jaipur Pink Panthers"
            binding.pointsEarn.text = "0"
            binding.matches.text = "1"
        }
        if (name.equals("1009")) {
            binding.playerimgid.setImageResource(R.drawable.sunil)
            binding.jaipurtextid.text = "Sunil Kumar"
            binding.position.text ="Position:Defender"
            binding.matches.text="Matches:122"
            binding.totalPoints.text="Points:271"
            binding.raids.text="Total Tackles:460"
            binding.avgtime.text="Avg. time on mat:87.3%"
            binding.Effective.text="Effective points:179"
            binding.dob.text="D.O.B:12 May 1997"
            binding.nation.text="Nationality INDIA"
            binding.club.text="Club: Jaipur Pink Panthers"
            binding.pointsEarn.text = "16"
            binding.matches.text = "6"
        }
        if (name.equals("1010")) {
            binding.playerimgid.setImageResource(R.drawable.sumit_jpr)
            binding.jaipurtextid.text = "Sumit"
            binding.position.text ="Position:Defender"
            binding.matches.text="Matches:20"
            binding.totalPoints.text="Points:20"
            binding.raids.text="Total Tackles:50"
            binding.avgtime.text="Avg. time on mat:63.5%"
            binding.Effective.text="Avg Success assist:15%"
            binding.dob.text="D.O.B:-"
            binding.nation.text="Nationality INDIA"
            binding.club.text="Club: Jaipur Pink Panthers"
            binding.pointsEarn.text = "16"
            binding.matches.text = "6"
        }
        if (name.equals("1011")) {
            binding.playerimgid.setImageResource(R.drawable.ankush)
            binding.jaipurtextid.text = "Ankush"
            binding.position.text ="Position:Defender"
            binding.matches.text="Matches:22"
            binding.totalPoints.text="Points:109"
            binding.raids.text="Total Tackles:147"
            binding.avgtime.text="Avg. time on mat:87%"
            binding.Effective.text="Avg Success assist:26%"
            binding.dob.text="D.O.B:-30 June 2003"
            binding.nation.text="Nationality INDIA"
            binding.club.text="Club: Jaipur Pink Panthers"
            binding.pointsEarn.text = "14"
            binding.matches.text = "6"
        }
        if (name.equals("1012")) {
            binding.playerimgid.setImageResource(R.drawable.lavish)
            binding.jaipurtextid.text = "Lavnish"
            binding.position.text ="Position:Defender"
            binding.matches.text="Matches:-"
            binding.totalPoints.text="Points:-"
            binding.raids.text="Total Tackles:-"
            binding.avgtime.text="Avg. time on mat:-"
            binding.Effective.text="Avg Success assist:-"
            binding.dob.text="D.O.B:-"
            binding.nation.text="Nationality INDIA"
            binding.club.text="Club: Jaipur Pink Panthers"
            binding.pointsEarn.text = "0"
            binding.matches.text = "0"
        }
        if (name.equals("1013")) {
            binding.playerimgid.setImageResource(R.drawable.sahul)
            binding.jaipurtextid.text = "Sahul Kumar"
            binding.position.text ="Position:Defender"
            binding.matches.text="Matches:-28"
            binding.totalPoints.text="Points:63"
            binding.raids.text="Total Tackles:144"
            binding.avgtime.text="Avg. time on mat:75.88%"
            binding.Effective.text="Avg Success assist:29"
            binding.dob.text="D.O.B:19th May 2001"
            binding.nation.text="Nationality INDIA"
            binding.club.text="Club: Jaipur Pink Panthers"
            binding.pointsEarn.text = "5"
            binding.matches.text = "5"
        }
        if (name.equals("1014")) {
            binding.playerimgid.setImageResource(R.drawable.lucky)
            binding.jaipurtextid.text = "Lucky Sharma"
            binding.position.text ="Position:Defender"
            binding.matches.text="Matches:-3"
            binding.totalPoints.text="Points:5"
            binding.raids.text="Total Tackles:11"
            binding.avgtime.text="Avg. time on mat:56.6%"
            binding.Effective.text="Avg Success assist:5"
            binding.dob.text="D.O.B:10th August 1996"
            binding.nation.text="Nationality INDIA"
            binding.club.text="Club: Jaipur Pink Panthers"
            binding.pointsEarn.text = "5"
            binding.matches.text = "2"
        }
        if (name.equals("1015")) {
            binding.playerimgid.setImageResource(R.drawable.ashish)
            binding.jaipurtextid.text = "Ashish"
            binding.position.text ="Position:Raider"
            binding.matches.text="Matches:5"
            binding.totalPoints.text="Points:5"
            binding.raids.text="Total Raids:25"
            binding.avgtime.text="Avg. time on mat:55.6%"
            binding.Effective.text="Effective points:4"
            binding.dob.text="D.O.B:24th July 2001"
            binding.nation.text="Nationality INDIA"
            binding.club.text="Club: Jaipur Pink Panthers"
            binding.pointsEarn.text = "0"
            binding.matches.text = "2"
        }
        if (name.equals("1016")) {
            binding.playerimgid.setImageResource(R.drawable.abhishek)
            binding.jaipurtextid.text = "Abhishek KS"
            binding.position.text ="Position:Defender"
            binding.matches.text="Matches:-5"
            binding.totalPoints.text="Points:4"
            binding.raids.text="Total Tackles:12"
            binding.avgtime.text="Avg. time on mat:76.1%"
            binding.Effective.text="Avg Success assist:9"
            binding.dob.text="D.O.B:23rd April 2001"
            binding.nation.text="Nationality INDIA"
            binding.club.text="Club: Jaipur Pink Panthers"
            binding.pointsEarn.text = "5"
            binding.matches.text = "4"
        }
        if (name.equals("1017")) {
            binding.playerimgid.setImageResource(R.drawable.reza)
            binding.jaipurtextid.text = "Reza Mirabagheri"
            binding.position.text ="Position:Defender"
            binding.matches.text="Matches:--"
            binding.totalPoints.text="Points:-"
            binding.raids.text="Total Tackles:-"
            binding.avgtime.text="Avg. time on mat:-"
            binding.Effective.text="Avg Success assist:-"
            binding.dob.text="D.O.B:31st May 2003"
            binding.nation.text="Nationality IRAN"
            binding.club.text="Club: Jaipur Pink Panthers"
            binding.pointsEarn.text = "10"
            binding.matches.text = "6"
        }
        /****************************************************Bengal*****************************************/
        if (name.equals("2000")) {
            binding.logoid.text="BENGAL WARRIORS"
            binding.logo.setImageResource(R.drawable.bengal_logo)
            binding.logo1.setImageResource(R.drawable.bengal_logo)
            binding.nameCard.text="Bengal Warriors"
            binding.logoid.setTextColor(getColor(R.color.bengal_col))
            binding.personal.setTextColor(getColor(R.color.bengal_col))
            binding.imgback.setCardBackgroundColor(getColor(R.color.bengal_col))
            binding.playerimgid.setImageResource(R.drawable.manvinder_singh)
            binding.jaipurtextid.text = "Manvinder Singh"
            binding.position.text ="Position:Raider"
            binding.matches.text="Matches:102"
            binding.totalPoints.text="Points:1003"
            binding.raids.text="Total Raids:1638"
            binding.avgtime.text="Avg. time on mat:58.14%"
            binding.Effective.text="Effective points:689"
            binding.dob.text="D.O.B:31 Jan 1990"
            binding.nation.text="Nationality INDIA"
            binding.club.text="Club:Bengal Warriors"
            binding.pointsEarn.text = "134"
            binding.matches.text = "14"
        }
        if (name.equals("2001")) {
            binding.logoid.text="BENGAL WARRIORS"
            binding.logo1.setImageResource(R.drawable.bengal_logo)
            binding.nameCard.text="Bengal Warriors"
            binding.logo.setImageResource(R.drawable.bengal_logo)
            binding.logoid.setTextColor(getColor(R.color.bengal_col))
            binding.personal.setTextColor(getColor(R.color.bengal_col))
            binding.imgback.setCardBackgroundColor(getColor(R.color.bengal_col))
            binding.playerimgid.setImageResource(R.drawable.shrikant)
            binding.jaipurtextid.text = "Shrikant Jadhav"
            binding.position.text ="Position:Raider"
            binding.matches.text="Matches:126"
            binding.totalPoints.text="Points:621"
            binding.raids.text="Total Raids:1294"
            binding.avgtime.text="Avg. time on mat:56.14%"
            binding.Effective.text="Effective points:333"
            binding.dob.text="D.O.B:17 Sept 1995"
            binding.nation.text="Nationality INDIA"
            binding.club.text="Club:Bengal Warriors"
            binding.pointsEarn.text = "68"
            binding.matches.text = "14"
        }
        if (name.equals("2002")) {
            binding.logoid.text="BENGAL WARRIORS"
            binding.logo1.setImageResource(R.drawable.bengal_logo)
            binding.nameCard.text="Bengal Warriors"
            binding.logo.setImageResource(R.drawable.bengal_logo)
            binding.logoid.setTextColor(getColor(R.color.bengal_col))
            binding.personal.setTextColor(getColor(R.color.bengal_col))
            binding.imgback.setCardBackgroundColor(getColor(R.color.bengal_col))
            binding.playerimgid.setImageResource(R.drawable.vishwas)
            binding.jaipurtextid.text = "Vishwas S"
            binding.position.text ="Position:Raider"
            binding.matches.text="Matches:9"
            binding.totalPoints.text="Points:17"
            binding.raids.text="Total Raids:50"
            binding.avgtime.text="Avg. time on mat:36.14%"
            binding.Effective.text="Effective points:4"
            binding.dob.text="D.O.B:20 Jan 1999"
            binding.nation.text="Nationality INDIA"
            binding.club.text="Club:Bengal Warriors"
            binding.pointsEarn.text = "22"
            binding.matches.text = "9"
        }
        if (name.equals("2003")) {
            binding.logoid.text="BENGAL WARRIORS"
            binding.logo1.setImageResource(R.drawable.bengal_logo)
            binding.nameCard.text="Bengal Warriors"
            binding.logo.setImageResource(R.drawable.bengal_logo)
            binding.logoid.setTextColor(getColor(R.color.bengal_col))
            binding.personal.setTextColor(getColor(R.color.bengal_col))
            binding.imgback.setCardBackgroundColor(getColor(R.color.bengal_col))
            binding.playerimgid.setImageResource(R.drawable.suyog)
            binding.jaipurtextid.text = "Suyog"
            binding.position.text ="Position:Defender"
            binding.matches.text="Matches:2"
            binding.totalPoints.text="Points:-"
            binding.raids.text="Total Tackles:-"
            binding.avgtime.text="Avg. time on mat:9.7%"
            binding.Effective.text="Effective points:-"
            binding.dob.text="D.O.B:18 jan 2001"
            binding.nation.text="Nationality INDIA"
            binding.club.text="Club:Bengal Warriors"
            binding.matches.text = "2"
            binding.pointsEarn.text = "1"
        }
        if (name.equals("2004")) {
            binding.logo1.setImageResource(R.drawable.bengal_logo)
            binding.nameCard.text="Bengal Warriors"
            binding.logoid.text="BENGAL WARRIORS"
            binding.logo.setImageResource(R.drawable.bengal_logo)
            binding.logoid.setTextColor(getColor(R.color.bengal_col))
            binding.personal.setTextColor(getColor(R.color.bengal_col))
            binding.imgback.setCardBackgroundColor(getColor(R.color.bengal_col))
            binding.playerimgid.setImageResource(R.drawable.guhan)
            binding.jaipurtextid.text = "R Guhan"
            binding.position.text ="Position:Raider"
            binding.matches.text="Matches:0"
            binding.totalPoints.text="Points:0"
            binding.raids.text="Total Tackles:0"
            binding.avgtime.text="Avg. time on mat:-"
            binding.Effective.text="Effective points:-"
            binding.dob.text="D.O.B:29 September"
            binding.nation.text="Nationality INDIA"
            binding.club.text="Club:Bengal Warriors"
            binding.matches.text = "0"
            binding.pointsEarn.text = "0"
        }
        if (name.equals("2005")) {
            binding.logo1.setImageResource(R.drawable.bengal_logo)
            binding.nameCard.text="Bengal Warriors"
            binding.logoid.text="BENGAL WARRIORS"
            binding.logo.setImageResource(R.drawable.bengal_logo)
            binding.logoid.setTextColor(getColor(R.color.bengal_col))
            binding.personal.setTextColor(getColor(R.color.bengal_col))
            binding.imgback.setCardBackgroundColor(getColor(R.color.bengal_col))
            binding.playerimgid.setImageResource(R.drawable.parshant)
            binding.jaipurtextid.text = "Parshant kumar"
            binding.position.text ="Position:Raider"
            binding.matches.text="Matches:0"
            binding.totalPoints.text="Points:0"
            binding.raids.text="Total Tackles:0"
            binding.avgtime.text="Avg. time on mat:-"
            binding.Effective.text="Effective points:-"
            binding.dob.text="D.O.B:"
            binding.nation.text="Nationality INDIA"
            binding.club.text="Club:Bengal Warriors"
            binding.matches.text = "0"
            binding.pointsEarn.text = "0"
        }
        if (name.equals("2006")) {
            binding.logoid.text="BENGAL WARRIORS"
            binding.logo1.setImageResource(R.drawable.bengal_logo)
            binding.nameCard.text="Bengal Warriors"
            binding.logo.setImageResource(R.drawable.bengal_logo)
            binding.logoid.setTextColor(getColor(R.color.bengal_col))
            binding.personal.setTextColor(getColor(R.color.bengal_col))
            binding.imgback.setCardBackgroundColor(getColor(R.color.bengal_col))
            binding.playerimgid.setImageResource(R.drawable.aslam)
            binding.jaipurtextid.text = "Aslam Thambi"
            binding.position.text ="Position:Raider"
            binding.matches.text="Matches:0"
            binding.totalPoints.text="Points:0"
            binding.raids.text="Total Tackles:0"
            binding.avgtime.text="Avg. time on mat:-"
            binding.Effective.text="Effective points:-"
            binding.dob.text="D.O.B:"
            binding.nation.text="Nationality INDIA"
            binding.club.text="Club:Bengal Warriors"
            binding.matches.text = "2"
            binding.pointsEarn.text = "2"
        }
        if (name.equals("2007")) {
            binding.logo1.setImageResource(R.drawable.bengal_logo)
            binding.nameCard.text="Bengal Warriors"
            binding.logoid.text="BENGAL WARRIORS"
            binding.logo.setImageResource(R.drawable.bengal_logo)
            binding.logoid.setTextColor(getColor(R.color.bengal_col))
            binding.personal.setTextColor(getColor(R.color.bengal_col))
            binding.imgback.setCardBackgroundColor(getColor(R.color.bengal_col))
            binding.playerimgid.setImageResource(R.drawable.maharudra)
            binding.jaipurtextid.text = "Maharudra Garje"
            binding.position.text ="Position:Raider"
            binding.matches.text="Matches:0"
            binding.totalPoints.text="Points:0"
            binding.raids.text="Total Tackles:0"
            binding.avgtime.text="Avg. time on mat:-"
            binding.Effective.text="Effective points:-"
            binding.dob.text="D.O.B:"
            binding.nation.text="Nationality INDIA"
            binding.club.text="Club:Bengal Warriors"
            binding.matches.text = "2"
            binding.pointsEarn.text = "0"
        }
        if (name.equals("2008")) {
            binding.logo1.setImageResource(R.drawable.bengal_logo)
            binding.nameCard.text="Bengal Warriors"
            binding.logoid.text="BENGAL WARRIORS"
            binding.logo.setImageResource(R.drawable.bengal_logo)
            binding.logoid.setTextColor(getColor(R.color.bengal_col))
            binding.personal.setTextColor(getColor(R.color.bengal_col))
            binding.imgback.setCardBackgroundColor(getColor(R.color.bengal_col))
            binding.playerimgid.setImageResource(R.drawable.nitin)
            binding.jaipurtextid.text = "Nitin Kumar"
            binding.position.text ="Position:Raider"
            binding.matches.text="Matches:21"
            binding.totalPoints.text="Points:121"
            binding.raids.text="Total Raids:339"
            binding.avgtime.text="Avg. time on mat:79.32%"
            binding.Effective.text="Effective points:78"
            binding.dob.text="D.O.B:21 May 2001"
            binding.nation.text="Nationality INDIA"
            binding.club.text="Club:Bengal Warriors"
            binding.matches.text = "13"
            binding.pointsEarn.text = "103"
        }
        if (name.equals("2010")) {
            binding.logoid.text="BENGAL WARRIORS"
            binding.logo1.setImageResource(R.drawable.bengal_logo)
            binding.nameCard.text="Bengal Warriors"
            binding.logo.setImageResource(R.drawable.bengal_logo)
            binding.logoid.setTextColor(getColor(R.color.bengal_col))
            binding.personal.setTextColor(getColor(R.color.bengal_col))
            binding.imgback.setCardBackgroundColor(getColor(R.color.bengal_col))
            binding.playerimgid.setImageResource(R.drawable.shubham)
            binding.jaipurtextid.text = "Shubham Shinde"
            binding.position.text ="Position:Defender"
            binding.matches.text="Matches:64"
            binding.totalPoints.text="Points:119"
            binding.raids.text="Total Tackles:214"
            binding.avgtime.text="Avg. time on mat:62.32%"
            binding.Effective.text="Avg Success assist:50"
            binding.dob.text="D.O.B:21 Feb 1999"
            binding.nation.text="Nationality INDIA"
            binding.club.text="Club:Bengal Warriors"
            binding.matches.text = "15"
            binding.pointsEarn.text = "54"
        }
        if (name.equals("2011")) {
            binding.logo1.setImageResource(R.drawable.bengal_logo)
            binding.nameCard.text="Bengal Warriors"
            binding.logoid.text="BENGAL WARRIORS"
            binding.logo.setImageResource(R.drawable.bengal_logo)
            binding.logoid.setTextColor(getColor(R.color.bengal_col))
            binding.personal.setTextColor(getColor(R.color.bengal_col))
            binding.imgback.setCardBackgroundColor(getColor(R.color.bengal_col))
            binding.playerimgid.setImageResource(R.drawable.akshay)
            binding.jaipurtextid.text = "Akshay Kumar"
            binding.position.text ="Position:Defender"
            binding.matches.text="Matches:31"
            binding.totalPoints.text="Points:89"
            binding.raids.text="Total Tackles:174"
            binding.avgtime.text="Avg. time on mat:67.32%"
            binding.Effective.text="Avg Success assist:24"
            binding.dob.text="D.O.B:"
            binding.nation.text="Nationality INDIA"
            binding.club.text="Club:Bengal Warriors"
            binding.matches.text = "4"
            binding.pointsEarn.text = "4"
        }
        if (name.equals("2012")) {
            binding.logoid.text="BENGAL WARRIORS"
            binding.logo.setImageResource(R.drawable.bengal_logo)
            binding.logo1.setImageResource(R.drawable.bengal_logo)
            binding.nameCard.text="Bengal Warriors"
            binding.logoid.setTextColor(getColor(R.color.bengal_col))
            binding.personal.setTextColor(getColor(R.color.bengal_col))
            binding.imgback.setCardBackgroundColor(getColor(R.color.bengal_col))
            binding.playerimgid.setImageResource(R.drawable.vaibhav_garje)
            binding.jaipurtextid.text = "Vaibhav Garje"
            binding.position.text ="Position:Defender"
            binding.matches.text="Matches:11"
            binding.totalPoints.text="Points:21"
            binding.raids.text="Total Tackles:51"
            binding.avgtime.text="Avg. time on mat:72.32%"
            binding.Effective.text="Avg Success assist:14"
            binding.dob.text="D.O.B:"
            binding.nation.text="Nationality INDIA"
            binding.club.text="Club:Bengal Warriors"
            binding.matches.text = "15"
            binding.pointsEarn.text = "35"
        }
        if (name.equals("2013")) {
            binding.logo1.setImageResource(R.drawable.bengal_logo)
            binding.nameCard.text="Bengal Warriors"
            binding.logoid.text="BENGAL WARRIORS"
            binding.logo.setImageResource(R.drawable.bengal_logo)
            binding.logoid.setTextColor(getColor(R.color.bengal_col))
            binding.personal.setTextColor(getColor(R.color.bengal_col))
            binding.imgback.setCardBackgroundColor(getColor(R.color.bengal_col))
            binding.playerimgid.setImageResource(R.drawable.aditya_shinde)
            binding.jaipurtextid.text = "Aditya Shinde"
            binding.position.text ="Position:Defender"
            binding.matches.text="Matches:6"
            binding.totalPoints.text="Points:6"
            binding.raids.text="Total Tackles:28"
            binding.avgtime.text="Avg. time on mat:79.32%"
            binding.Effective.text="Avg Success assist:8"
            binding.dob.text="D.O.B:"
            binding.nation.text="Nationality INDIA"
            binding.club.text="Club:Bengal Warriors"
            binding.matches.text = "13"
            binding.pointsEarn.text = "25"
        }
        if (name.equals("2014")) {
            binding.logoid.text="BENGAL WARRIORS"
            binding.logo1.setImageResource(R.drawable.bengal_logo)
            binding.nameCard.text="Bengal Warriors"
            binding.logo.setImageResource(R.drawable.bengal_logo)
            binding.logoid.setTextColor(getColor(R.color.bengal_col))
            binding.personal.setTextColor(getColor(R.color.bengal_col))
            binding.imgback.setCardBackgroundColor(getColor(R.color.bengal_col))
            binding.playerimgid.setImageResource(R.drawable.deepak)
            binding.jaipurtextid.text = "Deepak Shinde"
            binding.position.text ="Position:Defender"
            binding.matches.text="Matches:2"
            binding.totalPoints.text="Points:-"
            binding.raids.text="Total Tackles:-"
            binding.avgtime.text="Avg. time on mat:5.32%"
            binding.Effective.text="Avg Success assist:-"
            binding.dob.text="D.O.B:"
            binding.nation.text="Nationality INDIA"
            binding.club.text="Club:Bengal Warriors"
            binding.matches.text = "7"
            binding.pointsEarn.text = "0"
        }
        if (name.equals("2015")) {
            binding.logo1.setImageResource(R.drawable.bengal_logo)
            binding.nameCard.text="Bengal Warriors"
            binding.logoid.text="BENGAL WARRIORS"
            binding.logo.setImageResource(R.drawable.bengal_logo)
            binding.logoid.setTextColor(getColor(R.color.bengal_col))
            binding.personal.setTextColor(getColor(R.color.bengal_col))
            binding.imgback.setCardBackgroundColor(getColor(R.color.bengal_col))
            binding.playerimgid.setImageResource(R.drawable.akshay_bharat)
            binding.jaipurtextid.text = "Akshay Bharat"
            binding.position.text ="Position:Defender"
            binding.matches.text="Matches:4"
            binding.totalPoints.text="Points:-"
            binding.raids.text="Total Tackles:2"
            binding.avgtime.text="Avg. time on mat:27.32%"
            binding.Effective.text="Avg Success assist:3"
            binding.dob.text="D.O.B:"
            binding.nation.text="Nationality INDIA"
            binding.club.text="Club:Bengal Warriors"
            binding.matches.text = "4"
            binding.pointsEarn.text = "0"
        }
/*******************************************Banglore**************************************************************************/
        if (name.equals("3000")) {
            binding.logoid.text="BENGALURU BULLS"
            binding.logo1.setImageResource(R.drawable.bengaluru_logo)
            binding.nameCard.text="Bengaluru Bulls"
            binding.personal.setTextColor(getColor(R.color.bengluru_col))
            binding.logo.setImageResource(R.drawable.bengaluru_logo)
            binding.logoid.setTextColor(getColor(R.color.bengluru_col))
            binding.playerimgid.setImageResource(R.drawable.vikas)
            binding.jaipurtextid.text = "Vikas"
            binding.position.text ="Position:Raider"
            binding.matches.text="Matches:103"
            binding.totalPoints.text="Points:779"
            binding.raids.text="Total Raids:1635"
            binding.avgtime.text="Avg. time on mat:69.14%"
            binding.Effective.text="Effective points:478"
            binding.dob.text="D.O.B:31 Jan 1990"
            binding.nation.text="Nationality INDIA"
            binding.club.text="Club:Bengaluru Bulls"
            binding.pointsEarn.text = "58"
            binding.matches.text = "15"
        }
        if (name.equals("3001")) {
            binding.personal.setTextColor(getColor(R.color.bengluru_col))
            binding.logo1.setImageResource(R.drawable.bengaluru_logo)
            binding.nameCard.text="Bengaluru Bulls"
            binding.logoid.text="BENGALURU BULLS"
            binding.logo.setImageResource(R.drawable.bengaluru_logo)
            binding.logoid.setTextColor(getColor(R.color.bengluru_col))
            binding.playerimgid.setImageResource(R.drawable.monu)
            binding.jaipurtextid.text = "Monu"
            binding.position.text ="Position:Raider"
            binding.matches.text="Matches:87"
            binding.totalPoints.text="Points:567"
            binding.raids.text="Total Raids:1150"
            binding.avgtime.text="Avg. time on mat:64.14%"
            binding.Effective.text="Effective points:273"
            binding.dob.text="D.O.B:17 Sept 1995"
            binding.nation.text="Nationality INDIA"
            binding.club.text="Club:Bengaluru Bulls"
            binding.pointsEarn.text = "68"
            binding.matches.text = "14"
        }
        if (name.equals("3002")) {
            binding.personal.setTextColor(getColor(R.color.bengluru_col))
            binding.logo1.setImageResource(R.drawable.bengaluru_logo)
            binding.nameCard.text="Bengaluru Bulls"
            binding.logoid.text="BENGALURU BULLS"
            binding.logo.setImageResource(R.drawable.bengaluru_logo)
            binding.logoid.setTextColor(getColor(R.color.bengluru_col))
            binding.imgback.setCardBackgroundColor(getColor(R.color.bengluru_col))
            binding.playerimgid.setImageResource(R.drawable.piotr)
            binding.jaipurtextid.text = "PAMULAK PIOTR"
            binding.position.text ="Position:Raider"
            binding.matches.text="Matches:4"
            binding.totalPoints.text="Points:31"
            binding.raids.text="Total Raids:77"
            binding.avgtime.text="Avg. time on mat:65.14%"
            binding.Effective.text="Effective points:14"
            binding.dob.text="D.O.B:20 Jan 1999"
            binding.nation.text="Nationality POLAND"
            binding.club.text="Club:Bengaluru Bulls"
            binding.pointsEarn.text = "0"
            binding.matches.text = "0"
        }
        if (name.equals("3003")) {
            binding.personal.setTextColor(getColor(R.color.bengluru_col))
            binding.logo1.setImageResource(R.drawable.bengaluru_logo)
            binding.nameCard.text="Bengaluru Bulls"
            binding.logoid.text="BENGALURU BULLS"
            binding.logo.setImageResource(R.drawable.bengaluru_logo)
            binding.logoid.setTextColor(getColor(R.color.bengluru_col))
            binding.imgback.setCardBackgroundColor(getColor(R.color.bengluru_col))
            binding.playerimgid.setImageResource(R.drawable.abhisheksingh)
            binding.jaipurtextid.text = "Abhishek Singh"
            binding.position.text ="Position:Defender"
            binding.matches.text="Matches:68"
            binding.totalPoints.text="Points:448"
            binding.raids.text="Total Tackles:927"
            binding.avgtime.text="Avg. time on mat:64.7%"
            binding.Effective.text="Effective points:241"
            binding.dob.text="D.O.B:18 jan 2001"
            binding.nation.text="Nationality INDIA"
            binding.club.text="Club:Bengaluru Bulls"
            binding.matches.text = "4"
            binding.pointsEarn.text = "3"
        }
        if (name.equals("3004")) {
            binding.personal.setTextColor(getColor(R.color.bengluru_col))
            binding.logo1.setImageResource(R.drawable.bengaluru_logo)
            binding.nameCard.text="Bengaluru Bulls"
            binding.logoid.text="BENGALURU BULLS"
            binding.logo.setImageResource(R.drawable.bengaluru_logo)
            binding.logoid.setTextColor(getColor(R.color.bengluru_col))
            binding.imgback.setCardBackgroundColor(getColor(R.color.bengluru_col))
            binding.playerimgid.setImageResource(R.drawable.banty)
            binding.jaipurtextid.text = "Banty"
            binding.position.text ="Position:Raider"
            binding.matches.text="Matches:20"
            binding.totalPoints.text="Points:78"
            binding.raids.text="Total Tackles:144"
            binding.avgtime.text="Avg. time on mat:49%"
            binding.Effective.text="Effective points:35"
            binding.dob.text="D.O.B:29 September"
            binding.nation.text="Nationality INDIA"
            binding.club.text="Club:Bengaluru Bulls"
            binding.matches.text = "15"
            binding.pointsEarn.text = "25"
        }
        if (name.equals("3005")) {
            binding.personal.setTextColor(getColor(R.color.bengluru_col))
            binding.logo1.setImageResource(R.drawable.bengaluru_logo)
            binding.nameCard.text="Bengaluru Bulls"
            binding.logoid.text="BENGALURU BULLS"
            binding.logo.setImageResource(R.drawable.bengaluru_logo)
            binding.logoid.setTextColor(getColor(R.color.bengluru_col))
            binding.imgback.setCardBackgroundColor(getColor(R.color.bengluru_col))
            binding.playerimgid.setImageResource(R.drawable.neeraj_narwal)
            binding.jaipurtextid.text = "Neeraj Narwal"
            binding.position.text ="Position:Raider"
            binding.matches.text="Matches:50"
            binding.totalPoints.text="Points:178"
            binding.raids.text="Total Raids:383"
            binding.avgtime.text="Avg. time on mat:45%"
            binding.Effective.text="Effective points:74"
            binding.dob.text="D.O.B:"
            binding.nation.text="Nationality INDIA"
            binding.club.text="Club:Bengaluru Bulls"
            binding.matches.text = "12"
            binding.pointsEarn.text = "32"
        }
        if (name.equals("3006")) {
            binding.personal.setTextColor(getColor(R.color.bengluru_col))
            binding.logoid.text="BENGALURU BULLS"
            binding.logo1.setImageResource(R.drawable.bengaluru_logo)
            binding.nameCard.text="Bengaluru Bulls"
            binding.logo.setImageResource(R.drawable.bengaluru_logo)
            binding.logoid.setTextColor(getColor(R.color.bengluru_col))
            binding.imgback.setCardBackgroundColor(getColor(R.color.bengluru_col))
            binding.playerimgid.setImageResource(R.drawable.sushil)
            binding.jaipurtextid.text = "Sushil"
            binding.position.text ="Position:Raider"
            binding.matches.text="Matches:3"
            binding.totalPoints.text="Points:-"
            binding.raids.text="Total Tackles:18"
            binding.avgtime.text="Avg. time on mat:36%"
            binding.Effective.text="Effective points:3"
            binding.dob.text="D.O.B:"
            binding.nation.text="Nationality INDIA"
            binding.club.text="Club:Bengaluru Bulls"
            binding.matches.text = "9"
            binding.pointsEarn.text = "33"
        }
        if (name.equals("3007")) {
            binding.logo1.setImageResource(R.drawable.bengaluru_logo)
            binding.nameCard.text="Bengaluru Bulls"
            binding.logoid.text="BENGALURU BULLS"
            binding.personal.setTextColor(getColor(R.color.bengluru_col))
            binding.logo.setImageResource(R.drawable.bengaluru_logo)
            binding.logoid.setTextColor(getColor(R.color.bengluru_col))
            binding.imgback.setCardBackgroundColor(getColor(R.color.bengluru_col))
            binding.playerimgid.setImageResource(R.drawable.no_image)
            binding.jaipurtextid.text = "Bharat"
            binding.position.text ="Position:Raider"
            binding.matches.text="Matches:39"
            binding.totalPoints.text="Points:207"
            binding.raids.text="Total Raids:464"
            binding.avgtime.text="Avg. time on mat:64"
            binding.Effective.text="Effective points:140"
            binding.dob.text="D.O.B:"
            binding.nation.text="Nationality INDIA"
            binding.club.text="Club:Bengaluru Bulls"
            binding.matches.text = "14"
            binding.pointsEarn.text = "100"
        }
        if (name.equals("3008")) {
            binding.logo1.setImageResource(R.drawable.bengaluru_logo)
            binding.nameCard.text="Bengaluru Bulls"
            binding.logoid.text="BENGALURU BULLS"
            binding.logo.setImageResource(R.drawable.bengaluru_logo)
            binding.personal.setTextColor(getColor(R.color.bengluru_col))
            binding.logoid.setTextColor(getColor(R.color.bengluru_col))
            binding.imgback.setCardBackgroundColor(getColor(R.color.bengluru_col))
            binding.playerimgid.setImageResource(R.drawable.akshit)
            binding.jaipurtextid.text = "Akshit"
            binding.position.text ="Position:Raider"
            binding.matches.text="Matches:"
            binding.totalPoints.text="Points:"
            binding.raids.text="Total Raids:"
            binding.avgtime.text="Avg. time on mat:%"
            binding.Effective.text="Effective points:"
            binding.dob.text="D.O.B:"
            binding.nation.text="Nationality INDIA"
            binding.club.text="Club:Bengaluru Bulls"
            binding.matches.text = "3"
            binding.pointsEarn.text = "24"
        }
        if (name.equals("3009")) {
            binding.logo1.setImageResource(R.drawable.bengaluru_logo)
            binding.personal.setTextColor(getColor(R.color.bengluru_col))
            binding.nameCard.text="Bengaluru Bulls"
            binding.logoid.text="BENGALURU BULLS"
            binding.logo.setImageResource(R.drawable.bengaluru_logo)
            binding.logoid.setTextColor(getColor(R.color.bengluru_col))
            binding.imgback.setCardBackgroundColor(getColor(R.color.bengluru_col))
            binding.playerimgid.setImageResource(R.drawable.no_image)
            binding.jaipurtextid.text = "Surjeet Singh"
            binding.position.text ="Position:Defender"
            binding.matches.text="Matches:143"
            binding.totalPoints.text="Points:348"
            binding.raids.text="Total Tackles:647"
            binding.avgtime.text="Avg. time on mat:68.32%"
            binding.Effective.text="Avg Success assist:112"
            binding.dob.text="D.O.B:21 Feb 1999"
            binding.nation.text="Nationality INDIA"
            binding.club.text="Club:Bengaluru Bulls"
            binding.matches.text = "15"
            binding.pointsEarn.text = "49"
        }
        if (name.equals("3010")) {
            binding.logo1.setImageResource(R.drawable.bengaluru_logo)
            binding.personal.setTextColor(getColor(R.color.bengluru_col))
            binding.nameCard.text="Bengaluru Bulls"
            binding.logoid.text="BENGALURU BULLS"
            binding.logo.setImageResource(R.drawable.bengaluru_logo)
            binding.logoid.setTextColor(getColor(R.color.bengluru_col))
            binding.imgback.setCardBackgroundColor(getColor(R.color.bengluru_col))
            binding.playerimgid.setImageResource(R.drawable.vishal_bb)
            binding.jaipurtextid.text = "Vishal"
            binding.position.text ="Position:Defender"
            binding.matches.text="Matches:63"
            binding.totalPoints.text="Points:129"
            binding.raids.text="Total Tackles:271"
            binding.avgtime.text="Avg. time on mat:79.32%"
            binding.Effective.text="Avg Success assist:67"
            binding.dob.text="D.O.B:21 Feb 1999"
            binding.nation.text="Nationality INDIA"
            binding.club.text="Club:Bengaluru Bulls"
            binding.matches.text = "15"
            binding.pointsEarn.text = "54"
        }
        if (name.equals("3011")) {
            binding.logo1.setImageResource(R.drawable.bengaluru_logo)
            binding.nameCard.text="Bengaluru Bulls"
            binding.personal.setTextColor(getColor(R.color.bengluru_col))
            binding.logoid.text="BENGALURU BULLS"
            binding.logo.setImageResource(R.drawable.bengaluru_logo)
            binding.logoid.setTextColor(getColor(R.color.bengluru_col))
            binding.imgback.setCardBackgroundColor(getColor(R.color.bengluru_col))
            binding.playerimgid.setImageResource(R.drawable.rakshit)
            binding.jaipurtextid.text = "Rakshit"
            binding.position.text ="Position:Defender"
            binding.matches.text="Matches:21"
            binding.totalPoints.text="Points:51"
            binding.raids.text="Total Tackles:114"
            binding.avgtime.text="Avg. time on mat:31.32%"
            binding.Effective.text="Avg Success assist:10"
            binding.dob.text="D.O.B:"
            binding.nation.text="Nationality INDIA"
            binding.club.text="Club:Bengaluru Bulls"
            binding.matches.text = "2"
            binding.pointsEarn.text = "0"
        }
        if (name.equals("3012")) {
            binding.personal.setTextColor(getColor(R.color.bengluru_col))
            binding.logo1.setImageResource(R.drawable.bengaluru_logo)
            binding.nameCard.text="Bengaluru Bulls"
            binding.logoid.text="BENGALURU BULLS"
            binding.logo.setImageResource(R.drawable.bengaluru_logo)
            binding.logoid.setTextColor(getColor(R.color.bengluru_col))
            binding.imgback.setCardBackgroundColor(getColor(R.color.bengluru_col))
            binding.playerimgid.setImageResource(R.drawable.pon)
            binding.jaipurtextid.text = "Ponparthiban"
            binding.position.text ="Position:Defender"
            binding.matches.text="Matches:26"
            binding.totalPoints.text="Points:23"
            binding.raids.text="Total Tackles:72"
            binding.avgtime.text="Avg. time on mat:78.32%"
            binding.Effective.text="Avg Success assist:22"
            binding.dob.text="D.O.B:"
            binding.nation.text="Nationality INDIA"
            binding.club.text="Club:Bengaluru Bulls"
            binding.matches.text = "6"
            binding.pointsEarn.text = "1"
        }
        if (name.equals("3013")) {
            binding.personal.setTextColor(getColor(R.color.bengluru_col))
            binding.logo1.setImageResource(R.drawable.bengaluru_logo)
            binding.nameCard.text="Bengaluru Bulls"
            binding.logoid.text="BENGALURU BULLS"
            binding.logo.setImageResource(R.drawable.bengaluru_logo)
            binding.logoid.setTextColor(getColor(R.color.bengluru_col))
            binding.imgback.setCardBackgroundColor(getColor(R.color.bengluru_col))
            binding.playerimgid.setImageResource(R.drawable.saurabh)
            binding.jaipurtextid.text = "Saurabh nandal"
            binding.position.text ="Position:Defender"
            binding.matches.text="Matches:66"
            binding.totalPoints.text="Points:181"
            binding.raids.text="Total Tackles:307"
            binding.avgtime.text="Avg. time on mat:86.32%"
            binding.Effective.text="Avg Success assist:80"
            binding.dob.text="D.O.B:"
            binding.nation.text="Nationality INDIA"
            binding.club.text="Club:Bengaluru Bulls"
            binding.matches.text = "15"
            binding.pointsEarn.text = "38"
        }
        if (name.equals("3014")) {
            binding.personal.setTextColor(getColor(R.color.bengluru_col))
            binding.logo1.setImageResource(R.drawable.bengaluru_logo)
            binding.nameCard.text="Bengaluru Bulls"
            binding.logoid.text="BENGALURU BULLS"
            binding.logo.setImageResource(R.drawable.bengaluru_logo)
            binding.logoid.setTextColor(getColor(R.color.bengluru_col))
            binding.imgback.setCardBackgroundColor(getColor(R.color.bengluru_col))
            binding.playerimgid.setImageResource(R.drawable.aman)
            binding.jaipurtextid.text = "Aman"
            binding.position.text ="Position:Defender"
            binding.matches.text="Matches:34"
            binding.totalPoints.text="Points:78"
            binding.raids.text="Total Tackles:158"
            binding.avgtime.text="Avg. time on mat:73.32%"
            binding.Effective.text="Avg Success assist:41"
            binding.dob.text="D.O.B:"
            binding.nation.text="Nationality INDIA"
            binding.club.text="Club:Bengaluru Bulls"
            binding.matches.text = "13"
            binding.pointsEarn.text = "23"
        }
        if (name.equals("3015")) {
            binding.personal.setTextColor(getColor(R.color.bengluru_col))
            binding.logoid.text="BENGALURU BULLS"
            binding.logo1.setImageResource(R.drawable.bengaluru_logo)
            binding.nameCard.text="Bengaluru Bulls"
            binding.logo.setImageResource(R.drawable.bengaluru_logo)
            binding.logoid.setTextColor(getColor(R.color.bengluru_col))
            binding.imgback.setCardBackgroundColor(getColor(R.color.bengluru_col))
            binding.playerimgid.setImageResource(R.drawable.sunder)
            binding.jaipurtextid.text = "Sunder"
            binding.position.text ="Position:Defender"
            binding.matches.text="Matches:7"
            binding.totalPoints.text="Points:38"
            binding.raids.text="Total Tackles:17"
            binding.avgtime.text="Avg. time on mat:71.32%"
            binding.Effective.text="Avg Success assist:6"
            binding.dob.text="D.O.B:"
            binding.nation.text="Nationality INDIA"
            binding.club.text="Club:Bengaluru Bulls"
            binding.matches.text = "1"
            binding.pointsEarn.text = "0"
        }


    }






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



