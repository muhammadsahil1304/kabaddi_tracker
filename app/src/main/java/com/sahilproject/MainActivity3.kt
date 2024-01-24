package com.sahilproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.core.graphics.red
import androidx.navigation.ui.AppBarConfiguration
import com.sahilproject.databinding.IndianTeamBinding
import com.sahilproject.databinding.KabaddiBengalBinding
import com.sahilproject.databinding.KabaddiBinding
import com.sahilproject.databinding.KabaddiDescriptionBinding

class MainActivity3 : AppCompatActivity() {
    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: KabaddiDescriptionBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        binding = KabaddiDescriptionBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var name = intent.getStringExtra("TEAM_NUMBER");
        Log.e("name", "" + name);

        when (name) {

            "1001" -> {
                binding.pinkpanther9.setCardBackgroundColor(getColor(R.color.lightblue))
                binding.titleid.text = "JAIPUR PINK PANTHERS"
                binding.jaipur9img.setImageResource(R.drawable.rahul)
                binding.jaipur9text.text = "Rahul choudhary"

                binding.jaipur6text.text = "Bhavani Rajput"
                binding.jaipur6img.setImageResource(R.drawable.bhavani)

                binding.jaipur7img.setImageResource(R.drawable.amir)
                binding.jaipur7text.text = "Amirhossein Mohdammad Maleki"

                binding.jaipur1img.setImageResource(R.drawable.arjun)
                binding.jaipur1text.text = "Arjun Deshwal"

                binding.jaipur10img.setImageResource(R.drawable.ajith)
                binding.jaipur10text.text = "V. Ajith"

                binding.jaipur11text.text = "Navneet"
                binding.jaipur11img.setImageResource(R.drawable.navneet)

                binding.jaipur2text.text = "Devank"
                binding.jaipur2img.setImageResource(R.drawable.devank)

                binding.jaipur12text.text = "Shashank B"
                binding.jaipur12img.setImageResource(R.drawable.shashank)

                binding.jaipur13text.text = "Abhijeet Malik"
                binding.jaipur13img.setImageResource(R.drawable.abhijeet)

                binding.jaipur3text.text = "Sunil Kumar"
                binding.jaipur3img.setImageResource(R.drawable.sunil)

                binding.jaipur14text.text = "Sumit"
                binding.jaipur14img.setImageResource(R.drawable.sumit)

                binding.jaipur15text.text = "Ankush"
                binding.jaipur15img.setImageResource(R.drawable.ankush)

                binding.jaipur4text.text = "Lavish"
                binding.jaipur4img.setImageResource(R.drawable.lavish)

                binding.jaipur16text.text = "Sahul Kumar"
                binding.jaipur16img.setImageResource(R.drawable.sahul)

                binding.jaipur17text.text = "Lucky Sharma"
                binding.jaipur17img.setImageResource(R.drawable.lucky)

                binding.jaipur5text.text = "Ashish"
                binding.jaipur5img.setImageResource(R.drawable.ashish)

                binding.jaipur18text.text = "Abhishek KS"
                binding.jaipur18img.setImageResource(R.drawable.abhishek)

                binding.jaipur19text.text = "Reza Mirbagheri"
                binding.jaipur19img.setImageResource(R.drawable.reza)

                binding.infoJaipur1.text ="Coach= Sanjeev Baliyan\nTrophies won = 2\nHome ground= Swai Mansingh Stadium\nOfficial website= https://www.jaipurpinkpanthers.com/\nOwner= Abhishek Bachan"


            }

            "1002" -> {
                binding.pinkpanther9.setCardBackgroundColor(getColor(R.color.red))

                binding.titleid.text = "BANGAL WARRIORS"
                binding.titleid.textColors.equals(R.color.GREEN)

                binding.jaipur9img.setImageResource(R.drawable.manvinder_singh)
                binding.pinkpanther9.cardBackgroundColor.equals("fjf")
                binding.jaipur9text.text = "Manvinder singh"

                binding.jaipur6text.text = "Shrikant Jadav"
                binding.jaipur6img.setImageResource(R.drawable.shrikant)

                binding.jaipur7img.setImageResource(R.drawable.vishwas)
                binding.jaipur7text.text = "Vishwas"
                binding.jaipur1img.setImageResource(R.drawable.suyog)
                binding.jaipur1text.text = "Suyog Gaikar"
                binding.jaipur10img.setImageResource(R.drawable.guhan)
                binding.jaipur10text.text = "R Guhan"

                binding.jaipur11text.text = "Parshant Kumar"
                binding.jaipur11img.setImageResource(R.drawable.parshant)

                binding.jaipur2text.text = "Aslam Thambi"
                binding.jaipur2img.setImageResource(R.drawable.aslam)

                binding.jaipur12text.text = "Maharudra Garje"
                binding.jaipur12img.setImageResource(R.drawable.maharudra)

                binding.jaipur13text.text = "Nitin Kumar"
                binding.jaipur13img.setImageResource(R.drawable.nitin)

                binding.jaipur3text.text = "Chai-ming chung"
                binding.jaipur3img.setImageResource(R.drawable.no_image)

                binding.jaipur14text.text = "Shubham Shinde"
                binding.jaipur14img.setImageResource(R.drawable.shubham)

                binding.jaipur15text.text = "Akshay kumar"
                binding.jaipur15img.setImageResource(R.drawable.akshay)

                binding.jaipur4text.text = "Vaibhav garje"
                binding.jaipur4img.setImageResource(R.drawable.vaibhav_garje)

                binding.jaipur16text.text = "Shreyas umbardand"
                binding.jaipur16img.setImageResource(R.drawable.shreyas)

                binding.jaipur17text.text = "Darpan"
                binding.jaipur17img.setImageResource(R.drawable.darpan)

                binding.jaipur5text.text = "Aditya S Shinde"
                binding.jaipur5img.setImageResource(R.drawable.aditya)

                binding.jaipur18text.text = "Nitin Rawal"
                binding.jaipur18img.setImageResource(R.drawable.nitin_rawal)

                binding.jaipur19text.text = "Akshay Bharat"
                binding.jaipur19img.setImageResource(R.drawable.akshay_bharat)

                binding.infoJaipur1.text =
                    "Coach= Kasinathan Baskaran\nTrophies won = 1\nHome ground= Netaji Subhash Chandra Bose Indoor Stadium\nOfficial website= https://www.jaipurpinkpanthers.com/\nOwner= Future Group"


            }

            "1003" -> {

                binding.pinkpanther9.setCardBackgroundColor(getColor(R.color.maroon))

                binding.titleid.text = "BANGALURU BULLS"
                binding.jaipur9img.setImageResource(R.drawable.vikas)

                binding.jaipur9text.text = "Vikash"

                binding.jaipur6text.text = "Monu"
                binding.jaipur6img.setImageResource(R.drawable.monu)

                binding.jaipur7img.setImageResource(R.drawable.piotr)
                binding.jaipur7text.text = "Piotr \nPamulak"
                binding.jaipur1img.setImageResource(R.drawable.abhisheksingh)
                binding.jaipur1text.text = "Abhishek Singh"
                binding.jaipur10img.setImageResource(R.drawable.banty)
                binding.jaipur10text.text = "Banty"

                binding.jaipur11text.text = "Neeraj Narwal"
                binding.jaipur11img.setImageResource(R.drawable.neeraj_narwal)

                binding.jaipur2text.text = "Sushil"
                binding.jaipur2img.setImageResource(R.drawable.sushil)

                binding.jaipur12text.text = "Bharat"
                binding.jaipur12img.setImageResource(R.drawable.no_image)

                binding.jaipur13text.text = "Akshit"
                binding.jaipur13img.setImageResource(R.drawable.akshit)

                binding.jaipur3text.text = "Surjeet Singh"
                binding.jaipur3img.setImageResource(R.drawable.no_image)

                binding.jaipur14text.text = "Vishal"
                binding.jaipur14img.setImageResource(R.drawable.vishal)

                binding.jaipur15text.text = "Rakshit"
                binding.jaipur15img.setImageResource(R.drawable.rakshit)

                binding.jaipur4text.text = "Ponparthiban \nSubramanian"
                binding.jaipur4img.setImageResource(R.drawable.pon)

                binding.jaipur16text.text = "Saurabh \nNanda"
                binding.jaipur16img.setImageResource(R.drawable.saurabh)

                binding.jaipur17text.text = "Aman"
                binding.jaipur17img.setImageResource(R.drawable.aman)

                binding.jaipur5text.text = "Sunder"
                binding.jaipur5img.setImageResource(R.drawable.sunder)

                binding.jaipur18text.text = "Yash \nHooda"
                binding.jaipur18img.setImageResource(R.drawable.yash)

                binding.jaipur19text.text = "Md. Liton Ali"
                binding.jaipur19img.setImageResource(R.drawable.no_image)

                binding.infoJaipur1.text =
                    "Coach= Randhir Singh Sehrawat \nTrophies won = 1 \nHome ground= Shree Kanteerava Stadium, Bengaluru \nOfficial website= http://www.bengalurubulls.com// \nOwner= Kosmik Global Media"


            }

        }
    }}