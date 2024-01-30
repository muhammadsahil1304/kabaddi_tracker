package com.sahilproject

import android.annotation.SuppressLint
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Bundle
import android.os.Handler
import android.util.Log
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.ui.AppBarConfiguration
import com.androidnetworking.AndroidNetworking
import com.androidnetworking.common.Priority
import com.androidnetworking.error.ANError
import com.androidnetworking.interfaces.JSONObjectRequestListener
import com.sahilproject.databinding.KabaddiDescriptionBinding
import okhttp3.OkHttpClient
import org.json.JSONObject


class MainActivity2 : AppCompatActivity() {
    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: KabaddiDescriptionBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        binding = KabaddiDescriptionBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var name = intent.getStringExtra("TEAM_NUMBER");
        Log.e("name", "" + name);



        val sahilanimation: Animation =
            AnimationUtils.loadAnimation(applicationContext, R.anim.right_animtion)
        binding.teamLogo.startAnimation(sahilanimation)
        val roatedtanimation: Animation =
            AnimationUtils.loadAnimation(applicationContext, R.anim.roatedanim)
        binding.jaipur9img.startAnimation(roatedtanimation)
        binding.jaipur6img.startAnimation(roatedtanimation)
        binding.jaipur7img.startAnimation(roatedtanimation)
        binding.jaipur1img.startAnimation(roatedtanimation)


        Handler().postDelayed(
            Runnable {
                binding.jaipur9img.clearAnimation();
                binding.jaipur6img.clearAnimation();
                binding.jaipur7img.clearAnimation();
                binding.jaipur1img.clearAnimation();
            }, 4000
        );

        binding.back.setOnClickListener{
            finish();
        }
        if (name.equals("1001")) {


            binding.pinkpanther9.setOnClickListener {
                callingActivityData("1000")

            }
            binding.pinkpanther6.setOnClickListener {
                callingActivityData("1001")

            }
            binding.pinkpanther7.setOnClickListener {
                callingActivityData("1002")

            }
            binding.pinkpanther1.setOnClickListener {
                callingActivityData("1003")

            }
            binding.pinkpanther10.setOnClickListener {
                callingActivityData("1004")

            }
            binding.pinkpanther11.setOnClickListener {
                callingActivityData("1005")

            }
            binding.pinkpanther2.setOnClickListener {
                callingActivityData("1006")

            }
            binding.pinkpanther12.setOnClickListener {
                callingActivityData("1007")

            }
            binding.pinkpanther13.setOnClickListener {
                callingActivityData("1008")

            }
            binding.pinkpanther3.setOnClickListener {
                callingActivityData("1009")

            }
            binding.pinkpanther14.setOnClickListener {
                callingActivityData("1010")

            }
            binding.pinkpanther15.setOnClickListener {
                callingActivityData("1011")

            }
            binding.pinkpanther4.setOnClickListener {
                callingActivityData("1012")

            }
            binding.pinkpanther16.setOnClickListener {
                callingActivityData("1013")

            }
            binding.pinkpanther17.setOnClickListener {
                callingActivityData("1014")

            }
            binding.pinkpanther5.setOnClickListener {
                callingActivityData("1015")

            }
            binding.pinkpanther18.setOnClickListener {
                callingActivityData("1016")

            }
            binding.pinkpanther19.setOnClickListener {
                callingActivityData("1017")

            }
        }
        if (name.equals("1002")) {


            binding.pinkpanther9.setOnClickListener {
                callingActivityData("2000")

            }
            binding.pinkpanther6.setOnClickListener {
                callingActivityData("2001")

            }
            binding.pinkpanther7.setOnClickListener {
                callingActivityData("2002")

            }
            binding.pinkpanther1.setOnClickListener {
                callingActivityData("2003")

            }
            binding.pinkpanther10.setOnClickListener {
                callingActivityData("2004")

            }
            binding.pinkpanther11.setOnClickListener {
                callingActivityData("2005")

            }
            binding.pinkpanther2.setOnClickListener {
                callingActivityData("2006")

            }
            binding.pinkpanther12.setOnClickListener {
                callingActivityData("2007")

            }
            binding.pinkpanther13.setOnClickListener {
                callingActivityData("2008")

            }
            binding.pinkpanther3.setOnClickListener {
                callingActivityData("2009")

            }
            binding.pinkpanther14.setOnClickListener {
                callingActivityData("2010")

            }
            binding.pinkpanther15.setOnClickListener {
                callingActivityData("2011")

            }
            binding.pinkpanther4.setOnClickListener {
                callingActivityData("2012")

            }
            binding.pinkpanther16.setOnClickListener {
                callingActivityData("2013")

            }
            binding.pinkpanther17.setOnClickListener {
                callingActivityData("2014")

            }
            binding.pinkpanther5.setOnClickListener {
                callingActivityData("2015")

            }
            binding.pinkpanther18.setOnClickListener {
                callingActivityData("2016")

            }
            binding.pinkpanther19.setOnClickListener {
                callingActivityData("2017")

            }
        }
        if (name.equals("1003")) {


            binding.pinkpanther9.setOnClickListener {
                callingActivityData("3000")

            }
            binding.pinkpanther6.setOnClickListener {
                callingActivityData("3001")

            }
            binding.pinkpanther7.setOnClickListener {
                callingActivityData("3002")

            }
            binding.pinkpanther1.setOnClickListener {
                callingActivityData("3003")

            }
            binding.pinkpanther10.setOnClickListener {
                callingActivityData("3004")

            }
            binding.pinkpanther11.setOnClickListener {
                callingActivityData("3005")

            }
            binding.pinkpanther2.setOnClickListener {
                callingActivityData("3006")

            }
            binding.pinkpanther12.setOnClickListener {
                callingActivityData("3007")

            }
            binding.pinkpanther13.setOnClickListener {
                callingActivityData("3008")

            }
            binding.pinkpanther3.setOnClickListener {
                callingActivityData("3009")

            }
            binding.pinkpanther14.setOnClickListener {
                callingActivityData("3010")

            }
            binding.pinkpanther15.setOnClickListener {
                callingActivityData("3011")

            }
            binding.pinkpanther4.setOnClickListener {
                callingActivityData("3012")

            }
            binding.pinkpanther16.setOnClickListener {
                callingActivityData("3013")

            }
            binding.pinkpanther17.setOnClickListener {
                callingActivityData("3014")
            }
            binding.pinkpanther5.setOnClickListener {
                callingActivityData("3015")

            }
            binding.pinkpanther18.setOnClickListener {
                callingActivityData("3016")

            }
            binding.pinkpanther19.setOnClickListener {
                callingActivityData("3017")

            }
        }
        if (name.equals("1004")) {


            binding.pinkpanther9.setOnClickListener {
                callingActivityData("4000")

            }
            binding.pinkpanther6.setOnClickListener {
                callingActivityData("4001")

            }
            binding.pinkpanther7.setOnClickListener {
                callingActivityData("4002")

            }
            binding.pinkpanther1.setOnClickListener {
                callingActivityData("4003")

            }
            binding.pinkpanther10.setOnClickListener {
                callingActivityData("4004")

            }
            binding.pinkpanther11.setOnClickListener {
                callingActivityData("4005")

            }
            binding.pinkpanther2.setOnClickListener {
                callingActivityData("4006")

            }
            binding.pinkpanther12.setOnClickListener {
                callingActivityData("4007")

            }
            binding.pinkpanther13.setOnClickListener {
                callingActivityData("4008")

            }
            binding.pinkpanther3.setOnClickListener {
                callingActivityData("4009")

            }
            binding.pinkpanther14.setOnClickListener {
                callingActivityData("4010")

            }
            binding.pinkpanther15.setOnClickListener {
                callingActivityData("4011")

            }
            binding.pinkpanther4.setOnClickListener {
                callingActivityData("4012")

            }
            binding.pinkpanther16.setOnClickListener {
                callingActivityData("4013")

            }
            binding.pinkpanther17.setOnClickListener {
                callingActivityData("4014")
            }
            binding.pinkpanther5.setOnClickListener {
                callingActivityData("4015")

            }
            binding.pinkpanther18.setOnClickListener {
                callingActivityData("4016")

            }
            binding.pinkpanther19.setOnClickListener {
                callingActivityData("4017")

            }
        }
        if (name.equals("1001")) {
            binding.titleid.text = "JAIPUR PINK PANTHERS"
            binding.teamLogo.setImageResource(R.drawable.jaipur_logo)
            binding.titleid.setTextColor(getColor(R.color.maroon))

            binding.jaipur9img.setImageResource(R.drawable.rahul_jpr)
            binding.jaipur9text.text = "Rahul choudhary"

            binding.jaipur6text.text = "Bhavani Rajput"
            binding.jaipur6img.setImageResource(R.drawable.bhavani)

            binding.jaipur7img.setImageResource(R.drawable.amir)
            binding.jaipur7text.text = "Amirhossein Mohdammad Maleki"

            binding.jaipur1img.setImageResource(R.drawable.arjun)
            binding.jaipur1text.text = "Arjun \nDeshwal"

            binding.jaipur10img.setImageResource(R.drawable.ajith)
            binding.jaipur10text.text = "V. Ajith"

            binding.jaipur11text.text = "Navneet"
            binding.jaipur11img.setImageResource(R.drawable.navneet)

            binding.jaipur2text.text = "Devank"
            binding.jaipur2img.setImageResource(R.drawable.devank)

            binding.jaipur12text.text = "Shashank B"
            binding.jaipur12img.setImageResource(R.drawable.shashank)

            binding.jaipur13text.text = "Abhijeet \nMalik"
            binding.jaipur13img.setImageResource(R.drawable.abhijeet)

            binding.jaipur3text.text = "Sunil \nKumar"
            binding.jaipur3img.setImageResource(R.drawable.sunil)

            binding.jaipur14text.text = "Sumit"
            binding.jaipur14img.setImageResource(R.drawable.sumit_jpr)

            binding.jaipur15text.text = "Ankush"
            binding.jaipur15img.setImageResource(R.drawable.ankush)

            binding.jaipur4text.text = "Lavish"
            binding.jaipur4img.setImageResource(R.drawable.lavish)

            binding.jaipur16text.text = "Sahul \nKumar"
            binding.jaipur16img.setImageResource(R.drawable.sahul)

            binding.jaipur17text.text = "Lucky \nSharma"
            binding.jaipur17img.setImageResource(R.drawable.lucky)

            binding.jaipur5text.text = "Ashish"
            binding.jaipur5img.setImageResource(R.drawable.ashish)

            binding.jaipur18text.text = "Abhishek KS"
            binding.jaipur18img.setImageResource(R.drawable.abhishek)

            binding.jaipur19text.text = "Reza Mirbagheri"
            binding.jaipur19img.setImageResource(R.drawable.reza)

            binding.infoJaipur1.text =
                "Coach= Sanjeev Baliyan\nTrophies won = 2\nHome ground= Swai Mansingh Stadium\nOfficial website= https://www.jaipurpinkpanthers.com/\nOwner= Abhishek Bachan\n"


        }else if (name.equals("1002")){


            binding.titleid.text="BENGAL WARRIORS"
            binding.teamLogo.setImageResource(R.drawable.bengal_logo)

            binding.titleid.setTextColor(getColor(R.color.bengal_col))
            binding.infoJaipur.setBackgroundColor(getColor(R.color.bengal_col))

            binding.jaipur9img.setImageResource(R.drawable.manvinder_singh)
            binding.jaipur9text.text="Manvinder singh"
            binding.pinkpanther9.setCardBackgroundColor(getColor(R.color.bengal_col))

            binding.pinkpanther6.setCardBackgroundColor(getColor(R.color.bengal_col))
            binding.jaipur6text.text="Shrikant Jadav"
            binding.jaipur6img.setImageResource(R.drawable.shrikant)

            binding.pinkpanther7.setCardBackgroundColor(getColor(R.color.bengal_col))
            binding.jaipur7img.setImageResource(R.drawable.vishwas)
            binding.jaipur7text.text="Vishwas"

            binding.pinkpanther1.setCardBackgroundColor(getColor(R.color.bengal_col))
            binding.jaipur1img.setImageResource(R.drawable.suyog)
            binding.jaipur1text.text="Suyog Gaikar"

            binding.pinkpanther10.setCardBackgroundColor(getColor(R.color.bengal_col))
            binding.jaipur10img.setImageResource(R.drawable.guhan)
            binding.jaipur10text.text="R Guhan"

            binding.pinkpanther11.setCardBackgroundColor(getColor(R.color.bengal_col))
            binding.jaipur11text.text="Parshant Kumar"
            binding.jaipur11img.setImageResource(R.drawable.parshant)

            binding.pinkpanther2.setCardBackgroundColor(getColor(R.color.bengal_col))
            binding.jaipur2text.text="Aslam Thambi"
            binding.jaipur2img.setImageResource(R.drawable.aslam)

            binding.pinkpanther12.setCardBackgroundColor(getColor(R.color.bengal_col))
            binding.jaipur12text.text="Maharudra Garje"
            binding.jaipur12img.setImageResource(R.drawable.maharudra)

            binding.pinkpanther13.setCardBackgroundColor(getColor(R.color.bengal_col))
            binding.jaipur13text.text="Nitin Kumar"
            binding.jaipur13img.setImageResource(R.drawable.nitin)

            binding.pinkpanther3.setCardBackgroundColor(getColor(R.color.bengal_col))
            binding.jaipur3text.text="Chai-ming chung"
            binding.jaipur3img.setImageResource(R.drawable.no_image)

            binding.pinkpanther14.setCardBackgroundColor(getColor(R.color.bengal_col))
            binding.jaipur14text.text="Shubham Shinde"
            binding.jaipur14img.setImageResource(R.drawable.shubham)

            binding.pinkpanther15.setCardBackgroundColor(getColor(R.color.bengal_col))
            binding.jaipur15text.text="Akshay kumar"
            binding.jaipur15img.setImageResource(R.drawable.akshay)

            binding.pinkpanther4.setCardBackgroundColor(getColor(R.color.bengal_col))
            binding.jaipur4text.text="Vaibhav garje"
            binding.jaipur4img.setImageResource(R.drawable.vaibhav_garje)

            binding.pinkpanther16.setCardBackgroundColor(getColor(R.color.bengal_col))
            binding.jaipur16text.text="Shreyas umbardand"
            binding.jaipur16img.setImageResource(R.drawable.shreyas)

            binding.pinkpanther17.setCardBackgroundColor(getColor(R.color.bengal_col))
            binding.jaipur17text.text="Darpan"
            binding.jaipur17img.setImageResource(R.drawable.darpan)

            binding.pinkpanther5.setCardBackgroundColor(getColor(R.color.bengal_col))
            binding.jaipur5text.text="Aditya S Shinde"
            binding.jaipur5img.setImageResource(R.drawable.aditya)

            binding.pinkpanther18.setCardBackgroundColor(getColor(R.color.bengal_col))
            binding.jaipur18text.text="Nitin Rawal"
            binding.jaipur18img.setImageResource(R.drawable.nitin_rawal)

            binding.pinkpanther19.setCardBackgroundColor(getColor(R.color.bengal_col))
            binding.jaipur19text.text="Akshay Bharat"
            binding.jaipur19img.setImageResource(R.drawable.akshay_bharat)

            binding.infoJaipur1.text="Coach= Kasinathan Baskaran\nTrophies won = 1\nHome ground= Netaji Subhash Chandra Bose Indoor Stadium\nOfficial website= https://www.jaipurpinkpanthers.com/\nOwner= Future Group"




        }else if(name.equals("1003")){
            binding.titleid.setTextColor(getColor(R.color.bengluru_col))
            binding.teamLogo.setImageResource(R.drawable.bengaluru_logo)
            binding.infoJaipur.setBackgroundColor(getColor(R.color.bengluru_col))
            binding.pinkpanther9.setCardBackgroundColor(getColor(R.color.bengluru_col))

            binding.titleid.text="BENGALURU BULLS"
            binding.jaipur9img.setImageResource(R.drawable.vikas)

            binding.titleid.setTextColor(getColor(R.color.bengluru_col))

            binding.jaipur9text.text="Vikash"

            binding.jaipur6text.text="Monu"
            binding.jaipur6img.setImageResource(R.drawable.monu)
            binding.pinkpanther6.setCardBackgroundColor(getColor(R.color.bengluru_col))

            binding.jaipur7img.setImageResource(R.drawable.piotr)
            binding.jaipur7text.text="Piotr \nPamulak"
            binding.pinkpanther7.setCardBackgroundColor(getColor(R.color.bengluru_col))
            binding.jaipur1img.setImageResource(R.drawable.abhisheksingh)
            binding.pinkpanther1.setCardBackgroundColor(getColor(R.color.bengluru_col))
            binding.jaipur1text.text="Abhishek Singh"
            binding.jaipur10img.setImageResource(R.drawable.banty)
            binding.jaipur10text.text="Banty"
            binding.pinkpanther10.setCardBackgroundColor(getColor(R.color.bengluru_col))

            binding.jaipur11text.text="Neeraj Narwal"
            binding.jaipur11img.setImageResource(R.drawable.neeraj_narwal)
            binding.pinkpanther11.setCardBackgroundColor(getColor(R.color.bengluru_col))

            binding.jaipur2text.text="Sushil"
            binding.pinkpanther2.setCardBackgroundColor(getColor(R.color.bengluru_col))
            binding.jaipur2img.setImageResource(R.drawable.sushil)

            binding.jaipur12text.text="Bharat"
            binding.pinkpanther12.setCardBackgroundColor(getColor(R.color.bengluru_col))
            binding.jaipur12img.setImageResource(R.drawable.no_image)

            binding.jaipur13text.text="Akshit"
            binding.pinkpanther13.setCardBackgroundColor(getColor(R.color.bengluru_col))
            binding.jaipur13img.setImageResource(R.drawable.akshit)

            binding.jaipur3text.text="Surjeet Singh"
            binding.pinkpanther3.setCardBackgroundColor(getColor(R.color.bengluru_col))
            binding.jaipur3img.setImageResource(R.drawable.no_image)

            binding.jaipur14text.text="Vishal"
            binding.pinkpanther14.setCardBackgroundColor(getColor(R.color.bengluru_col))
            binding.jaipur14img.setImageResource(R.drawable.vishal_bb)

            binding.jaipur15text.text="Rakshit"
            binding.pinkpanther15.setCardBackgroundColor(getColor(R.color.bengluru_col))
            binding.jaipur15img.setImageResource(R.drawable.rakshit)

            binding.jaipur4text.text="Ponparthiban \nSubramanian"
            binding.jaipur4img.setImageResource(R.drawable.pon)
            binding.pinkpanther4.setCardBackgroundColor(getColor(R.color.bengluru_col))

            binding.jaipur16text.text="Saurabh \nNanda"
            binding.pinkpanther16.setCardBackgroundColor(getColor(R.color.bengluru_col))
            binding.jaipur16img.setImageResource(R.drawable.saurabh)

            binding.jaipur17text.text="Aman"
            binding.pinkpanther17.setCardBackgroundColor(getColor(R.color.bengluru_col))
            binding.jaipur17img.setImageResource(R.drawable.aman)

            binding.jaipur5text.text="Sunder"
            binding.pinkpanther5.setCardBackgroundColor(getColor(R.color.bengluru_col))
            binding.jaipur5img.setImageResource(R.drawable.sunder)

            binding.jaipur18text.text="Yash \nHooda"
            binding.pinkpanther18.setCardBackgroundColor(getColor(R.color.bengluru_col))
            binding.jaipur18img.setImageResource(R.drawable.yash)

            binding.jaipur19text.text="Md. Liton Ali"
            binding.pinkpanther19.setCardBackgroundColor(getColor(R.color.bengluru_col))
            binding.jaipur19img.setImageResource(R.drawable.no_image)

            binding.infoJaipur1.text="Coach= Randhir Singh Sehrawat \nTrophies won = 1 \nHome ground= Shree Kanteerava Stadium, Bengaluru \nOfficial website= http://www.bengalurubulls.com// \nOwner= Kosmik Global Media"


        }
        else if(name.equals("1004")){
            binding.titleid.setTextColor(getColor(R.color.up_col))
            binding.teamLogo.setImageResource(R.drawable.up_logo)
            binding.infoJaipur.setBackgroundColor(getColor(R.color.up_col))

            binding.pinkpanther9.setCardBackgroundColor(getColor(R.color.maroon))

            binding.titleid.text="UP YODDHA"
            binding.jaipur9img.setImageResource(R.drawable.pardeep)
            binding.pinkpanther9.setCardBackgroundColor(getColor(R.color.up_col))
            binding.jaipur9text.text="Pardeep Narwal"

            binding.jaipur6text.text="Gulveer Singh"
            binding.pinkpanther6.setCardBackgroundColor(getColor(R.color.up_col))
            binding.jaipur6img.setImageResource(R.drawable.gulveer)

            binding.jaipur7img.setImageResource(R.drawable.surender)
            binding.pinkpanther7.setCardBackgroundColor(getColor(R.color.up_col))
            binding.jaipur7text.text="Surender Gill"
            binding.jaipur1img.setImageResource(R.drawable.mahipal)
            binding.pinkpanther1.setCardBackgroundColor(getColor(R.color.up_col))
            binding.jaipur1text.text="Mahipal"
            binding.jaipur10img.setImageResource(R.drawable.anil)
            binding.pinkpanther10.setCardBackgroundColor(getColor(R.color.up_col))
            binding.jaipur10text.text="Anil Kumar"

            binding.jaipur11text.text="Gagana Gowda"
            binding.pinkpanther11.setCardBackgroundColor(getColor(R.color.up_col))
            binding.jaipur11img.setImageResource(R.drawable.gagana)

            binding.jaipur2text.text="Shivam Chaudhary"
            binding.pinkpanther2.setCardBackgroundColor(getColor(R.color.up_col))
            binding.jaipur2img.setImageResource(R.drawable.shivam)

            binding.jaipur12text.text="Nitesh Kumar"
            binding.pinkpanther12.setCardBackgroundColor(getColor(R.color.up_col))
            binding.jaipur12img.setImageResource(R.drawable.nitesh)

            binding.jaipur13text.text="Harendra Kumar"
            binding.pinkpanther13.setCardBackgroundColor(getColor(R.color.up_col))
            binding.jaipur13img.setImageResource(R.drawable.harendra)

            binding.jaipur3text.text="Sumit"
            binding.pinkpanther3.setCardBackgroundColor(getColor(R.color.up_col))
            binding.jaipur3img.setImageResource(R.drawable.sumit)

            binding.jaipur14text.text="Ashu Singh"
            binding.pinkpanther14.setCardBackgroundColor(getColor(R.color.up_col))
            binding.jaipur14img.setImageResource(R.drawable.no_image)

            binding.jaipur15text.text="Kiran Magar"
            binding.pinkpanther15.setCardBackgroundColor(getColor(R.color.up_col))
            binding.jaipur15img.setImageResource(R.drawable.kiran)

            binding.jaipur4text.text="Hitesh"
            binding.pinkpanther4.setCardBackgroundColor(getColor(R.color.up_col))
            binding.jaipur4img.setImageResource(R.drawable.hitesh)

            binding.jaipur16text.text="Vijay Malik"
            binding.pinkpanther16.setCardBackgroundColor(getColor(R.color.up_col))
            binding.jaipur16img.setImageResource(R.drawable.vijay_up)

            binding.jaipur17text.text="Gurdeep"
            binding.pinkpanther17.setCardBackgroundColor(getColor(R.color.up_col))
            binding.jaipur17img.setImageResource(R.drawable.gurdeep)

            binding.jaipur5text.text="Nitin Panwar"
            binding.pinkpanther5.setCardBackgroundColor(getColor(R.color.up_col))
            binding.jaipur5img.setImageResource(R.drawable.nitin)

            binding.jaipur18text.text="Helvic wanjala"
            binding.pinkpanther18.setCardBackgroundColor(getColor(R.color.up_col))
            binding.jaipur18img.setImageResource(R.drawable.helvic)

            binding.jaipur19text.text="Samuel Wafula"
            binding.pinkpanther19.setCardBackgroundColor(getColor(R.color.up_col))
            binding.jaipur19img.setImageResource(R.drawable.samuel)

            binding.infoJaipur1.text="Coach= Jasveer Singh \nTrophies won = 0 \nHome ground= Vijay Singh Pathik Sports Complex,Greater \nOfficial website= https://www.upyoddha.co.in/ \nOwner= GMR Group"


        }
        else if(name.equals("1005")){
            binding.teamLogo.setImageResource(R.drawable.delhi_logo)
            binding.titleid.setTextColor(getColor(R.color.delhi_col))
            binding.infoJaipur.setBackgroundColor(getColor(R.color.delhi_col))

            binding.pinkpanther9.setCardBackgroundColor(getColor(R.color.delhi_col))

            binding.titleid.text="DABBANG DELHI"
            binding.jaipur9img.setImageResource(R.drawable.naveen)

            binding.jaipur9text.text="Naveen kumar"

            binding.jaipur6text.text="Manjeet"
            binding.pinkpanther6.setCardBackgroundColor(getColor(R.color.delhi_col))
            binding.jaipur6img.setImageResource(R.drawable.manjeet)

            binding.jaipur7img.setImageResource(R.drawable.meetu)
            binding.pinkpanther7.setCardBackgroundColor(getColor(R.color.delhi_col))
            binding.jaipur7text.text="Meetu Sharma"
            binding.jaipur1img.setImageResource(R.drawable.ashu_malik)
            binding.pinkpanther1.setCardBackgroundColor(getColor(R.color.delhi_col))
            binding.jaipur1text.text="Ashu Malik"
            binding.jaipur10img.setImageResource(R.drawable.suraj)
            binding.pinkpanther10.setCardBackgroundColor(getColor(R.color.delhi_col))
            binding.jaipur10text.text="Suraj Panwar"

            binding.jaipur11text.text="Manu"
            binding.pinkpanther11.setCardBackgroundColor(getColor(R.color.delhi_col))
            binding.jaipur11img.setImageResource(R.drawable.manu)

            binding.jaipur2text.text="Vishal Bhardwaj"
            binding.pinkpanther2.setCardBackgroundColor(getColor(R.color.delhi_col))
            binding.jaipur2img.setImageResource(R.drawable.vishal)

            binding.jaipur12text.text="Sunil"
            binding.pinkpanther12.setCardBackgroundColor(getColor(R.color.delhi_col))
            binding.jaipur12img.setImageResource(R.drawable.no_image)

            binding.jaipur13text.text="Bhalasaheb"
            binding.pinkpanther13.setCardBackgroundColor(getColor(R.color.delhi_col))
            binding.jaipur13img.setImageResource(R.drawable.balasaheb)

            binding.jaipur3text.text="Nitin Chandel"
            binding.pinkpanther3.setCardBackgroundColor(getColor(R.color.delhi_col))
            binding.jaipur3img.setImageResource(R.drawable.nitin_chandel)

            binding.jaipur14text.text="Vijay"
            binding.pinkpanther14.setCardBackgroundColor(getColor(R.color.delhi_col))
            binding.jaipur14img.setImageResource(R.drawable.vijay)

            binding.jaipur15text.text="Himmat Antil"
            binding.pinkpanther15.setCardBackgroundColor(getColor(R.color.delhi_col))
            binding.jaipur15img.setImageResource(R.drawable.himmat)

            binding.jaipur4text.text="Ashish"
            binding.pinkpanther4.setCardBackgroundColor(getColor(R.color.delhi_col))
            binding.jaipur4img.setImageResource(R.drawable.ashish)

            binding.jaipur16text.text="Yogesh"
            binding.pinkpanther16.setCardBackgroundColor(getColor(R.color.delhi_col))
            binding.jaipur16img.setImageResource(R.drawable.yogesh)

            binding.jaipur17text.text="Vikrant"
            binding.pinkpanther17.setCardBackgroundColor(getColor(R.color.delhi_col))
            binding.jaipur17img.setImageResource(R.drawable.vikrant)

            binding.jaipur5text.text="Felix Li"
            binding.pinkpanther5.setCardBackgroundColor(getColor(R.color.delhi_col))
            binding.jaipur5img.setImageResource(R.drawable.felix)

            binding.jaipur18text.text="Yuvraj Pandeya"
            binding.pinkpanther18.setCardBackgroundColor(getColor(R.color.delhi_col))
            binding.jaipur18img.setImageResource(R.drawable.yuvraj)

            binding.jaipur19text.text="Mohit"
            binding.pinkpanther19.setCardBackgroundColor(getColor(R.color.delhi_col))
            binding.jaipur19img.setImageResource(R.drawable.mohit)

            binding.infoJaipur1.text="Coach= Ranbir Singh Khokhar\nTrophies won = 3 \nHome ground= Thyagaraj Sports Complex, Delhi \nOfficial website= https://www.dabangdelhikc.com// \nOwner= Radha Kapoor"


        }

        else if(name.equals("1006")){
            binding.teamLogo.setImageResource(R.drawable.gujarat_logo)
            binding.titleid.setTextColor(getColor(R.color.gujarat_col))
            binding.infoJaipur.setBackgroundColor(getColor(R.color.gujarat_col))

            binding.pinkpanther9.setCardBackgroundColor(getColor(R.color.gujarat_col))

            binding.titleid.text="GUJARAT GIANTS"
            binding.jaipur9img.setImageResource(R.drawable.sonu)

            binding.jaipur9text.text="Sonu"

            binding.jaipur6text.text="Jagdeep"
            binding.pinkpanther6.setCardBackgroundColor(getColor(R.color.gujarat_col))
            binding.jaipur6img.setImageResource(R.drawable.jagdeep)

            binding.jaipur7img.setImageResource(R.drawable.rakesh)
            binding.pinkpanther7.setCardBackgroundColor(getColor(R.color.gujarat_col))
            binding.jaipur7text.text="Rakesh"
            binding.jaipur1img.setImageResource(R.drawable.no_image)
            binding.pinkpanther1.setCardBackgroundColor(getColor(R.color.gujarat_col))
            binding.jaipur1text.text="Parteek Dahiya"
            binding.jaipur10img.setImageResource(R.drawable.no_image)
            binding.pinkpanther10.setCardBackgroundColor(getColor(R.color.gujarat_col))
            binding.jaipur10text.text="Nitin"

            binding.jaipur11text.text="Fazel Atrachali"
            binding.pinkpanther11.setCardBackgroundColor(getColor(R.color.gujarat_col))
            binding.jaipur11img.setImageResource(R.drawable.fazel)

            binding.jaipur2text.text="Ravi Kumar"
            binding.pinkpanther2.setCardBackgroundColor(getColor(R.color.gujarat_col))
            binding.jaipur2img.setImageResource(R.drawable.ravi)

            binding.jaipur12text.text="Sombir"
            binding.pinkpanther12.setCardBackgroundColor(getColor(R.color.gujarat_col))
            binding.jaipur12img.setImageResource(R.drawable.sombir)

            binding.jaipur13text.text="Sourav Gulia"
            binding.pinkpanther13.setCardBackgroundColor(getColor(R.color.gujarat_col))
            binding.jaipur13img.setImageResource(R.drawable.sourav_gulia)

            binding.jaipur3text.text="Manuj"
            binding.pinkpanther3.setCardBackgroundColor(getColor(R.color.gujarat_col))
            binding.jaipur3img.setImageResource(R.drawable.manuj)

            binding.jaipur14text.text="Deepak Singh"
            binding.pinkpanther14.setCardBackgroundColor(getColor(R.color.gujarat_col))
            binding.jaipur14img.setImageResource(R.drawable.no_image)

            binding.jaipur15text.text="Nitesh"
            binding.pinkpanther15.setCardBackgroundColor(getColor(R.color.gujarat_col))
            binding.jaipur15img.setImageResource(R.drawable.no_image)

            binding.jaipur4text.text="Narender Hooda"
            binding.pinkpanther4.setCardBackgroundColor(getColor(R.color.gujarat_col))
            binding.jaipur4img.setImageResource(R.drawable.no_image)

            binding.jaipur16text.text="Rohit Gulia"
            binding.pinkpanther16.setCardBackgroundColor(getColor(R.color.gujarat_col))
            binding.jaipur16img.setImageResource(R.drawable.rohit)

            binding.jaipur17text.text="Vikash jaglan"
            binding.pinkpanther17.setCardBackgroundColor(getColor(R.color.gujarat_col))
            binding.jaipur17img.setImageResource(R.drawable.vikash)

            binding.jaipur5text.text="Arkam Shaikh"
            binding.pinkpanther5.setCardBackgroundColor(getColor(R.color.gujarat_col))
            binding.jaipur5img.setImageResource(R.drawable.arkam)

            binding.jaipur18text.text="Mohammad Nabibakhsh"
            binding.pinkpanther18.setCardBackgroundColor(getColor(R.color.gujarat_col))
            binding.jaipur18img.setImageResource(R.drawable.mohd)

            binding.jaipur19text.text="Jitender Yadav"
            binding.pinkpanther19.setCardBackgroundColor(getColor(R.color.gujarat_col))
            binding.jaipur19img.setImageResource(R.drawable.jitender)

            binding.infoJaipur1.text="Coach= Ram mehar Singh \nTrophies won = 0 \nHome ground= EKA Arena by TransStadia, Ahmedabad \nOfficial website= https://www.gujaratgiants.com/ \nOwner= Adani Wilmar ltd."


        }
        else if(name.equals("1007")){
            binding.teamLogo.setImageResource(R.drawable.haryana_logo)
            binding.titleid.setTextColor(getColor(R.color.haryana_col))
            binding.infoJaipur.setBackgroundColor(getColor(R.color.haryana_col))

            binding.pinkpanther9.setCardBackgroundColor(getColor(R.color.haryana_col))

            binding.titleid.text="HARYANA STEELERS"
            binding.jaipur9img.setImageResource(R.drawable.chandran)

            binding.jaipur9text.text="Chandran_Ranjit"

            binding.jaipur6text.text="K.\nPrapanjan"
            binding.pinkpanther6.setCardBackgroundColor(getColor(R.color.haryana_col))
            binding.jaipur6img.setImageResource(R.drawable.prapanjan)

            binding.jaipur7img.setImageResource(R.drawable.siddharth)
            binding.pinkpanther7.setCardBackgroundColor(getColor(R.color.haryana_col))
            binding.jaipur7text.text="Siddharth Desai"
            binding.jaipur1img.setImageResource(R.drawable.vinay)
            binding.pinkpanther1.setCardBackgroundColor(getColor(R.color.haryana_col))
            binding.jaipur1text.text="Vinay"
            binding.jaipur10img.setImageResource(R.drawable.no_image)
            binding.pinkpanther10.setCardBackgroundColor(getColor(R.color.haryana_col))
            binding.jaipur10text.text="Tejas Patil"

            binding.jaipur11text.text="Shivam Patare"
            binding.pinkpanther11.setCardBackgroundColor(getColor(R.color.haryana_col))
            binding.jaipur11img.setImageResource(R.drawable.shivam)

            binding.jaipur2text.text="Vishal Tate"
            binding.pinkpanther2.setCardBackgroundColor(getColor(R.color.haryana_col))
            binding.jaipur2img.setImageResource(R.drawable.tate)

            binding.jaipur12text.text="Ghanshyam"
            binding.pinkpanther12.setCardBackgroundColor(getColor(R.color.haryana_col))
            binding.jaipur12img.setImageResource(R.drawable.ghanshyam)

            binding.jaipur13text.text="Hasan Balbool"
            binding.pinkpanther13.setCardBackgroundColor(getColor(R.color.haryana_col))
            binding.jaipur13img.setImageResource(R.drawable.hasan)

            binding.jaipur3text.text="Hardeep"
            binding.pinkpanther3.setCardBackgroundColor(getColor(R.color.haryana_col))
            binding.jaipur3img.setImageResource(R.drawable.hardeep)

            binding.jaipur14text.text="Jaideep"
            binding.pinkpanther14.setCardBackgroundColor(getColor(R.color.haryana_col))
            binding.jaipur14img.setImageResource(R.drawable.jaideep)

            binding.jaipur15text.text="Rahul Sethpal"
            binding.pinkpanther15.setCardBackgroundColor(getColor(R.color.haryana_col))
            binding.jaipur15img.setImageResource(R.drawable.rahul)

            binding.jaipur4text.text="Ravinder Chauhan"
            binding.pinkpanther4.setCardBackgroundColor(getColor(R.color.haryana_col))
            binding.jaipur4img.setImageResource(R.drawable.ravindra)

            binding.jaipur16text.text="Mohit Nandal"
            binding.pinkpanther16.setCardBackgroundColor(getColor(R.color.haryana_col))
            binding.jaipur16img.setImageResource(R.drawable.mohit_nandal)

            binding.jaipur17text.text="Monu Hooda"
            binding.pinkpanther17.setCardBackgroundColor(getColor(R.color.haryana_col))
            binding.jaipur17img.setImageResource(R.drawable.monu_hooda)

            binding.jaipur5text.text="Naveen Kundu"
            binding.pinkpanther5.setCardBackgroundColor(getColor(R.color.haryana_col))
            binding.jaipur5img.setImageResource(R.drawable.naveen_kundu)

            binding.jaipur18text.text="Harsh"
            binding.pinkpanther18.setCardBackgroundColor(getColor(R.color.haryana_col))
            binding.jaipur18img.setImageResource(R.drawable.harsh)

            binding.jaipur19text.text="Sunny Sehrawat"
            binding.pinkpanther19.setCardBackgroundColor(getColor(R.color.haryana_col))
            binding.jaipur19img.setImageResource(R.drawable.sunny)

            binding.infoJaipur1.text="Coach= Manpreet Singh \nTrophies won = 0 \nHome ground= Tau Devilal Sports Complex, Panchkula \nOfficial website= http://www.haryanasteelers.com \nOwner= JWS Sports"


        }

        else if(name.equals("1008")){
            binding.teamLogo.setImageResource(R.drawable.patna_logo)
            binding.titleid.setTextColor(getColor(R.color.patna_col))
            binding.infoJaipur.setBackgroundColor(getColor(R.color.patna_col))

            binding.pinkpanther9.setCardBackgroundColor(getColor(R.color.patna_col))

            binding.titleid.text="PATNA PIRATES"
            binding.jaipur9img.setImageResource(R.drawable.rakesh_pp)

            binding.jaipur9text.text="Rakesh Narwal"

            binding.jaipur6text.text="Manjeet"
            binding.pinkpanther6.setCardBackgroundColor(getColor(R.color.patna_col))
            binding.jaipur6img.setImageResource(R.drawable.manjeet_pp)

            binding.jaipur7img.setImageResource(R.drawable.sachin)
            binding.pinkpanther7.setCardBackgroundColor(getColor(R.color.patna_col))
            binding.jaipur7text.text="Sachin"
            binding.jaipur1img.setImageResource(R.drawable.kunal)
            binding.pinkpanther1.setCardBackgroundColor(getColor(R.color.patna_col))
            binding.jaipur1text.text="Kunal Mehta"
            binding.jaipur10img.setImageResource(R.drawable.sudhakar)
            binding.pinkpanther10.setCardBackgroundColor(getColor(R.color.patna_col))
            binding.jaipur10text.text="Sudhakar M"

            binding.jaipur11text.text="Ranjit Naik"
            binding.pinkpanther11.setCardBackgroundColor(getColor(R.color.patna_col))
            binding.jaipur11img.setImageResource(R.drawable.no_image)

            binding.jaipur2text.text="Anuj Kumar"
            binding.pinkpanther2.setCardBackgroundColor(getColor(R.color.patna_col))
            binding.jaipur2img.setImageResource(R.drawable.anuj_patna)

            binding.jaipur12text.text="sandeep kumar"
            binding.pinkpanther12.setCardBackgroundColor(getColor(R.color.patna_col))
            binding.jaipur12img.setImageResource(R.drawable.no_image)

            binding.jaipur13text.text="Zheng-Wei Chen"
            binding.pinkpanther13.setCardBackgroundColor(getColor(R.color.patna_col))
            binding.jaipur13img.setImageResource(R.drawable.no_image)

            binding.jaipur3text.text="Neeraj Kumar"
            binding.pinkpanther3.setCardBackgroundColor(getColor(R.color.patna_col))
            binding.jaipur3img.setImageResource(R.drawable.neeraj_patna)

            binding.jaipur14text.text="Mahender chaudhary"
            binding.pinkpanther14.setCardBackgroundColor(getColor(R.color.patna_col))
            binding.jaipur14img.setImageResource(R.drawable.mahendra_patna)

            binding.jaipur15text.text="Thiyagarajan Yuvaraj"
            binding.pinkpanther15.setCardBackgroundColor(getColor(R.color.patna_col))
            binding.jaipur15img.setImageResource(R.drawable.thiya)

            binding.jaipur4text.text="Krishan"
            binding.pinkpanther4.setCardBackgroundColor(getColor(R.color.patna_col))
            binding.jaipur4img.setImageResource(R.drawable.krishan)

            binding.jaipur16text.text="Manish"
            binding.pinkpanther16.setCardBackgroundColor(getColor(R.color.patna_col))
            binding.jaipur16img.setImageResource(R.drawable.manish)

            binding.jaipur17text.text="Naveen Sharma"
            binding.pinkpanther17.setCardBackgroundColor(getColor(R.color.patna_col))
            binding.jaipur17img.setImageResource(R.drawable.naveen_patna)

            binding.jaipur5text.text="Abinand Subhash"
            binding.pinkpanther5.setCardBackgroundColor(getColor(R.color.patna_col))
            binding.jaipur5img.setImageResource(R.drawable.abinand)

            binding.jaipur18text.text="sanjay"
            binding.pinkpanther18.setCardBackgroundColor(getColor(R.color.patna_col))
            binding.jaipur18img.setImageResource(R.drawable.sanjay)

            binding.jaipur19text.text="Deepak Kumar"
            binding.pinkpanther19.setCardBackgroundColor(getColor(R.color.patna_col))
            binding.jaipur19img.setImageResource(R.drawable.deepak)

            binding.infoJaipur1.text="Coach= Narender Redu \nTrophies won = 3 \nHome ground= Patliputra Sports Complex, Patna \nOfficial website= https://www.patnapirates.net/ \nOwner= Rajesh Shah"


        }

        else if(name.equals("1009")){
            binding.teamLogo.setImageResource(R.drawable.pune_logo)

            binding.titleid.setTextColor(getColor(R.color.puneri_col))
            binding.infoJaipur.setBackgroundColor(getColor(R.color.puneri_col))

            binding.titleid.text="PUNERI PALTAN"
            binding.jaipur9img.setImageResource(R.drawable.pankaj)

            binding.jaipur9text.text="Pankaj Mohite"
            binding.pinkpanther9.setCardBackgroundColor(getColor(R.color.puneri_col))
            binding.jaipur6text.text="Mohit Goyat"
            binding.pinkpanther6.setCardBackgroundColor(getColor(R.color.puneri_col))
            binding.jaipur6img.setImageResource(R.drawable.mohit_gayot)

            binding.jaipur7img.setImageResource(R.drawable.no_image)
            binding.pinkpanther7.setCardBackgroundColor(getColor(R.color.puneri_col))
            binding.jaipur7text.text="Nitin R"
            binding.jaipur1img.setImageResource(R.drawable.akash_shinde)
            binding.pinkpanther1.setCardBackgroundColor(getColor(R.color.puneri_col))
            binding.jaipur1text.text="Akash Shinde"
            binding.jaipur10img.setImageResource(R.drawable.aditya_shinde)
            binding.pinkpanther10.setCardBackgroundColor(getColor(R.color.puneri_col))
            binding.jaipur10text.text="Aditya Shinde"

            binding.jaipur11text.text="Sanket Sawat"
            binding.pinkpanther11.setCardBackgroundColor(getColor(R.color.puneri_col))
            binding.jaipur11img.setImageResource(R.drawable.sanket)

            binding.jaipur2text.text="Abinesh Nadarajan"
            binding.pinkpanther2.setCardBackgroundColor(getColor(R.color.puneri_col))
            binding.jaipur2img.setImageResource(R.drawable.abhinesh)

            binding.jaipur12text.text="Badal Singh"
            binding.pinkpanther12.setCardBackgroundColor(getColor(R.color.puneri_col))
            binding.jaipur12img.setImageResource(R.drawable.badal)

            binding.jaipur13text.text="Gaurav Khatri"
            binding.pinkpanther13.setCardBackgroundColor(getColor(R.color.puneri_col))
            binding.jaipur13img.setImageResource(R.drawable.gaurav)

            binding.jaipur3text.text="Vaibhav \nkamble"
            binding.pinkpanther3.setCardBackgroundColor(getColor(R.color.puneri_col))
            binding.jaipur3img.setImageResource(R.drawable.vaibhav)

            binding.jaipur14text.text="Dadasao Pujari"
            binding.pinkpanther14.setCardBackgroundColor(getColor(R.color.puneri_col))
            binding.jaipur14img.setImageResource(R.drawable.no_image)

            binding.jaipur15text.text="Tushar Dattaray Adhavade"
            binding.pinkpanther15.setCardBackgroundColor(getColor(R.color.puneri_col))
            binding.jaipur15img.setImageResource(R.drawable.tushar)

            binding.jaipur4text.text="Ishwar"
            binding.pinkpanther4.setCardBackgroundColor(getColor(R.color.puneri_col))
            binding.jaipur4img.setImageResource(R.drawable.ishwar)

            binding.jaipur16text.text="Hardeep"
            binding.pinkpanther16.setCardBackgroundColor(getColor(R.color.puneri_col))
            binding.jaipur16img.setImageResource(R.drawable.no_image)

            binding.jaipur17text.text="Vahid RezaEimehr"
            binding.pinkpanther17.setCardBackgroundColor(getColor(R.color.puneri_col))
            binding.jaipur17img.setImageResource(R.drawable.vahid)

            binding.jaipur5text.text="Mohamadreza \nChinayesh"
            binding.pinkpanther5.setCardBackgroundColor(getColor(R.color.puneri_col))
            binding.jaipur5img.setImageResource(R.drawable.mohd_reza)

            binding.jaipur18text.text="Aslam \nMustafa"
            binding.pinkpanther18.setCardBackgroundColor(getColor(R.color.puneri_col))
            binding.jaipur18img.setImageResource(R.drawable.aslam_puneri)

            binding.jaipur19text.text="Ahmed Enamdar"
            binding.pinkpanther19.setCardBackgroundColor(getColor(R.color.puneri_col))
            binding.jaipur19img.setImageResource(R.drawable.ahmed)

            binding.infoJaipur1.text="Coach= BC Ramesh \nTrophies won = 0 \nHome ground= Shree Shiv Chhatrapati Sports Complex, Pune \nOfficial website= http://www.puneripaltan.com/ \nOwner= Insurekot Sports"


        }

        else if(name.equals("1010")){
            binding.teamLogo.setImageResource(R.drawable.tamil_logo)
            binding.titleid.setTextColor(getColor(R.color.tamil_col))
            binding.infoJaipur.setBackgroundColor(getColor(R.color.tamil_col))
            binding.pinkpanther9.setCardBackgroundColor(getColor(R.color.tamil_col))

            binding.titleid.text="TAMIL THALAIVAS"
            binding.jaipur9img.setImageResource(R.drawable.selvamani)

            binding.jaipur9text.text="Selvamani K"

            binding.jaipur6text.text="Ajinkya Pawar"
            binding.pinkpanther6.setCardBackgroundColor(getColor(R.color.tamil_col))
            binding.jaipur6img.setImageResource(R.drawable.ajinkaya)

            binding.jaipur7img.setImageResource(R.drawable.no_image)
            binding.pinkpanther7.setCardBackgroundColor(getColor(R.color.tamil_col))
            binding.jaipur7text.text="Vishal chahal"
            binding.jaipur1img.setImageResource(R.drawable.himanshu_narwal)
            binding.pinkpanther1.setCardBackgroundColor(getColor(R.color.tamil_col))
            binding.jaipur1text.text="Himanshu Narwal"
            binding.jaipur10img.setImageResource(R.drawable.himanshu_singh)
            binding.pinkpanther10.setCardBackgroundColor(getColor(R.color.tamil_col))
            binding.jaipur10text.text="Himanshu singh"

            binding.jaipur11text.text="Nitin singh"
            binding.pinkpanther11.setCardBackgroundColor(getColor(R.color.tamil_col))
            binding.jaipur11img.setImageResource(R.drawable.nitin_singh)

            binding.jaipur2text.text="Narender"
            binding.pinkpanther2.setCardBackgroundColor(getColor(R.color.tamil_col))
            binding.jaipur2img.setImageResource(R.drawable.narendra_tt)

            binding.jaipur12text.text="jatin"
            binding.pinkpanther12.setCardBackgroundColor(getColor(R.color.tamil_col))
            binding.jaipur12img.setImageResource(R.drawable.jatin_tt)

            binding.jaipur13text.text="sathish kannan"
            binding.pinkpanther13.setCardBackgroundColor(getColor(R.color.tamil_col))
            binding.jaipur13img.setImageResource(R.drawable.no_image)

            binding.jaipur3text.text="Masanamuthu Lakshnanan"
            binding.pinkpanther3.setCardBackgroundColor(getColor(R.color.tamil_col))
            binding.jaipur3img.setImageResource(R.drawable.masanamuthu)

            binding.jaipur14text.text="M. Abhishek"
            binding.pinkpanther14.setCardBackgroundColor(getColor(R.color.tamil_col))
            binding.jaipur14img.setImageResource(R.drawable.m_abhishek)

            binding.jaipur15text.text="Himanshu"
            binding.pinkpanther15.setCardBackgroundColor(getColor(R.color.tamil_col))
            binding.jaipur15img.setImageResource(R.drawable.himanshu_tamil)

            binding.jaipur4text.text="Sagar"
            binding.pinkpanther4.setCardBackgroundColor(getColor(R.color.tamil_col))
            binding.jaipur4img.setImageResource(R.drawable.no_image)

            binding.jaipur16text.text="Aashish"
            binding.pinkpanther16.setCardBackgroundColor(getColor(R.color.tamil_col))
            binding.jaipur16img.setImageResource(R.drawable.ashish_tt)

            binding.jaipur17text.text="Mohit"
            binding.pinkpanther17.setCardBackgroundColor(getColor(R.color.tamil_col))
            binding.jaipur17img.setImageResource(R.drawable.mohit_tamil)

            binding.jaipur5text.text="Sahil Gulia"
            binding.pinkpanther5.setCardBackgroundColor(getColor(R.color.tamil_col))
            binding.jaipur5img.setImageResource(R.drawable.sahil)

            binding.jaipur18text.text="Amirhossein Bastami"
            binding.pinkpanther18.setCardBackgroundColor(getColor(R.color.tamil_col))
            binding.jaipur18img.setImageResource(R.drawable.amir_tamil)

            binding.jaipur19text.text="Ronak"
            binding.pinkpanther19.setCardBackgroundColor(getColor(R.color.tamil_col))
            binding.jaipur19img.setImageResource(R.drawable.ronak)

            binding.infoJaipur1.text="Coach= Ashan kumar \nTrophies won = 0 \nHome ground= Jawaharlal Nehru Indoor Stadium, Chenna \nOfficial website= https://tamilthalaivas.co.in/ \nOwner= Magnum Sports"


        }

        else if(name.equals("1011")){
            binding.teamLogo.setImageResource(R.drawable.telugu_logo)
            binding.titleid.setTextColor(getColor(R.color.telugu_col))
            binding.infoJaipur.setBackgroundColor(getColor(R.color.telugu_col))

            binding.pinkpanther9.setCardBackgroundColor(getColor(R.color.telugu_col))

            binding.titleid.text="TELUGU TITANS"
            binding.jaipur9img.setImageResource(R.drawable.pawan)

            binding.jaipur9text.text="Pawan Sehrawat"

            binding.jaipur6text.text="Rajnish"
            binding.pinkpanther6.setCardBackgroundColor(getColor(R.color.telugu_col))
            binding.jaipur6img.setImageResource(R.drawable.rajnish)

            binding.jaipur7img.setImageResource(R.drawable.no_image)
            binding.pinkpanther7.setCardBackgroundColor(getColor(R.color.telugu_col))
            binding.jaipur7text.text="Prafull Zaware"
            binding.jaipur1img.setImageResource(R.drawable.omkar)
            binding.pinkpanther1.setCardBackgroundColor(getColor(R.color.telugu_col))
            binding.jaipur1text.text="Omkar Patil"
            binding.jaipur10img.setImageResource(R.drawable.robin)
            binding.pinkpanther10.setCardBackgroundColor(getColor(R.color.telugu_col))
            binding.jaipur10text.text="Robin Chaudhary"

            binding.jaipur11text.text="Sandeep"
            binding.pinkpanther11.setCardBackgroundColor(getColor(R.color.telugu_col))
            binding.jaipur11img.setImageResource(R.drawable.no_image)

            binding.jaipur2text.text="Parvesh bhainswal"
            binding.pinkpanther2.setCardBackgroundColor(getColor(R.color.telugu_col))
            binding.jaipur2img.setImageResource(R.drawable.parvesh)

            binding.jaipur12text.text="gaurav dahiya"
            binding.pinkpanther12.setCardBackgroundColor(getColor(R.color.telugu_col))
            binding.jaipur12img.setImageResource(R.drawable.gaurav_dahiya)

            binding.jaipur13text.text="Ankit"
            binding.pinkpanther13.setCardBackgroundColor(getColor(R.color.telugu_col))
            binding.jaipur13img.setImageResource(R.drawable.no_image)

            binding.jaipur3text.text="Mohit Narwal"
            binding.pinkpanther3.setCardBackgroundColor(getColor(R.color.telugu_col))
            binding.jaipur3img.setImageResource(R.drawable.mohit_narwal)

            binding.jaipur14text.text="Nitin"
            binding.pinkpanther14.setCardBackgroundColor(getColor(R.color.telugu_col))
            binding.jaipur14img.setImageResource(R.drawable.nitin_telugu)

            binding.jaipur15text.text="ajit pawar"
            binding.pinkpanther15.setCardBackgroundColor(getColor(R.color.telugu_col))
            binding.jaipur15img.setImageResource(R.drawable.ajith_pawar)

            binding.jaipur4text.text="mohit"
            binding.pinkpanther4.setCardBackgroundColor(getColor(R.color.telugu_col))
            binding.jaipur4img.setImageResource(R.drawable.no_image)

            binding.jaipur16text.text="Mllad jabbari"
            binding.pinkpanther16.setCardBackgroundColor(getColor(R.color.telugu_col))
            binding.jaipur16img.setImageResource(R.drawable.milad)

            binding.jaipur17text.text="Sanjeevni"
            binding.pinkpanther17.setCardBackgroundColor(getColor(R.color.telugu_col))
            binding.jaipur17img.setImageResource(R.drawable.sanjeevi)

            binding.jaipur5text.text="Hamid nader"
            binding.pinkpanther5.setCardBackgroundColor(getColor(R.color.telugu_col))
            binding.jaipur5img.setImageResource(R.drawable.hamid)

            binding.jaipur18text.text="Shankar gadai"
            binding.pinkpanther18.setCardBackgroundColor(getColor(R.color.telugu_col))
            binding.jaipur18img.setImageResource(R.drawable.shankar)

            binding.jaipur19text.text="Omkar R"
            binding.pinkpanther19.setCardBackgroundColor(getColor(R.color.telugu_col))
            binding.jaipur19img.setImageResource(R.drawable.omkar_r)

            binding.infoJaipur1.text="Coach= Srinivasreddy \nTrophies won = 0 \nHome ground= Gachibowli Indoor Stadium, Hyderabad \nOfficial website= http://www.telugutitans.in/ \nOwner= Srini"


        }
        else if(name.equals("1012")){
            binding.teamLogo.setImageResource(R.drawable.mumbai_logo)
            binding.titleid.setTextColor(getColor(R.color.mumbai_col))
            binding.infoJaipur.setBackgroundColor(getColor(R.color.mumbai_col))


            binding.pinkpanther9.setCardBackgroundColor(getColor(R.color.mumbai_col))

            binding.titleid.text="U MUMBA"
            binding.jaipur9img.setImageResource(R.drawable.guman)

            binding.jaipur9text.text="Guman Singh"

            binding.jaipur6text.text="Shivam"
            binding.pinkpanther6.setCardBackgroundColor(getColor(R.color.mumbai_col))
            binding.jaipur6img.setImageResource(R.drawable.shivam_um)

            binding.jaipur7img.setImageResource(R.drawable.rohit_um)
            binding.pinkpanther7.setCardBackgroundColor(getColor(R.color.mumbai_col))
            binding.jaipur7text.text="Rohit Yadav"
            binding.jaipur1img.setImageResource(R.drawable.jai)
            binding.pinkpanther1.setCardBackgroundColor(getColor(R.color.mumbai_col))
            binding.jaipur1text.text="Jai"
            binding.jaipur10img.setImageResource(R.drawable.rupesh)
            binding.jaipur10text.text="Rupesh"
            binding.pinkpanther10.setCardBackgroundColor(getColor(R.color.mumbai_col))

            binding.jaipur11text.text="Pranay Rana"
            binding.pinkpanther11.setCardBackgroundColor(getColor(R.color.mumbai_col))
            binding.jaipur11img.setImageResource(R.drawable.pranay)

            binding.jaipur2text.text="Heidarali Ekrami"
            binding.pinkpanther2.setCardBackgroundColor(getColor(R.color.mumbai_col))
            binding.jaipur2img.setImageResource(R.drawable.heidarali)

            binding.jaipur12text.text="Kunal"
            binding.pinkpanther12.setCardBackgroundColor(getColor(R.color.mumbai_col))
            binding.jaipur12img.setImageResource(R.drawable.kunal_um)

            binding.jaipur13text.text="Saurav Parthe"
            binding.pinkpanther13.setCardBackgroundColor(getColor(R.color.mumbai_col))
            binding.jaipur13img.setImageResource(R.drawable.saurav_mumbai)

            binding.jaipur3text.text="Alireza Mirzaeian"
            binding.pinkpanther3.setCardBackgroundColor(getColor(R.color.mumbai_col))
            binding.jaipur3img.setImageResource(R.drawable.alireza)

            binding.jaipur14text.text="Girish Maruti"
            binding.pinkpanther14.setCardBackgroundColor(getColor(R.color.mumbai_col))
            binding.jaipur14img.setImageResource(R.drawable.girish)

            binding.jaipur15text.text="mahender Singh"
            binding.pinkpanther15.setCardBackgroundColor(getColor(R.color.mumbai_col))
            binding.jaipur15img.setImageResource(R.drawable.no_image)

            binding.jaipur4text.text="Surinder"
            binding.pinkpanther4.setCardBackgroundColor(getColor(R.color.mumbai_col))
            binding.jaipur4img.setImageResource(R.drawable.surinder)

            binding.jaipur16text.text="Gokulakannan"
            binding.pinkpanther16.setCardBackgroundColor(getColor(R.color.mumbai_col))
            binding.jaipur16img.setImageResource(R.drawable.no_image)

            binding.jaipur17text.text="Rinku"
            binding.pinkpanther17.setCardBackgroundColor(getColor(R.color.mumbai_col))
            binding.jaipur17img.setImageResource(R.drawable.rinku)

            binding.jaipur5text.text="Shivansh"
            binding.pinkpanther5.setCardBackgroundColor(getColor(R.color.mumbai_col))
            binding.jaipur5img.setImageResource(R.drawable.no_image)

            binding.jaipur18text.text="Bittu"
            binding.pinkpanther18.setCardBackgroundColor(getColor(R.color.mumbai_col))
            binding.jaipur18img.setImageResource(R.drawable.no_image)

            binding.jaipur19text.text="Sombir"
            binding.pinkpanther19.setCardBackgroundColor(getColor(R.color.mumbai_col))
            binding.jaipur19img.setImageResource(R.drawable.sombir_um)

            binding.infoJaipur1.text="Coach= Gholamreza \nTrophies won = 0 \nHome ground= Dome, NSCI, SVP Stadium, Mumbai \nOfficial website= https://www.usports.in/umumba \nOwner= Unilazer ventures"


        }


    }



/*    fun checkPermission() {
        if (ContextCompat.checkSelfPermission(this,
                Manifest.permission.CALL)
            != PackageManager.PERMISSION_GRANTED) {

            // Permission is not granted
            // Should we show an explanation?
            if (ActivityCompat.shouldShowRequestPermissionRationale(this,
                    Manifest.permission.CALL_PHONE)) {
                // Show an explanation to the user *asynchronously* -- don't block
                // this thread waiting for the user's response! After the user
                // sees the explanation, try again to request the permission.
            } else {
                // No explanation needed, we can request the permission.
                ActivityCompat.requestPermissions(this,
                    arrayOf(Manifest.permission.CALL_PHONE),
                    42)
            }
        } else {
            // Permission has already been granted
            callPhone()
        }
    }*/

    @SuppressLint("MissingSuperCall")
    override fun onRequestPermissionsResult(requestCode: Int,
                                            permissions: Array<String>, grantResults: IntArray) {
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
    private fun callingActivityData(flags: String) {


        val intent = Intent(this, Player_desc::class.java)
        intent.putExtra("TEAM_NUMBER",flags)
        startActivity(intent)
    }

    fun callPhone(){
        val intent = Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "+919782175002"))
        startActivity(intent)
    }


}