package com.sahilproject

import android.content.Intent
import android.os.Bundle
import android.util.Log
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import android.view.Menu
import android.view.MenuItem
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.Toast
import com.android.volley.Request
import com.android.volley.RequestQueue
import com.android.volley.Response
import com.android.volley.VolleyError
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import com.androidnetworking.AndroidNetworking
import com.androidnetworking.common.Priority
import com.androidnetworking.error.ANError
import com.androidnetworking.interfaces.JSONObjectRequestListener
import com.sahilproject.databinding.ActivityMainBinding
import com.sahilproject.databinding.IndianTeamBinding
import com.sahilproject.databinding.InstaMainBinding
import com.sahilproject.databinding.KabaddiBinding
import com.sahilproject.databinding.KabaddiDescriptionBinding
import org.json.JSONObject

class SahilActivity : AppCompatActivity() {

    private lateinit var binding: KabaddiBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = KabaddiBinding.inflate(layoutInflater)
        setContentView(binding.root)
        Log.e("oncreate2222222222","oncreate")
        AndroidNetworking.initialize(getApplicationContext());
/*************************post_create***********************************/

        AndroidNetworking.post("https://reqres.in/api/users")
            .addBodyParameter("name", "morpheus")
            .addBodyParameter("job", "leader")
            .setTag("test")
            .setPriority(Priority.HIGH)
            .build()
            .getAsJSONObject(object : JSONObjectRequestListener {
                override fun onResponse(response: JSONObject) {
                    // do anything with response
                    Log.d("response",response.toString())
                }

                override fun onError(error: ANError) {
                    // handle error
                    Log.e("response","error")
                }
            })
        /***********************************Post_register**************************************************/
        AndroidNetworking.post("https://reqres.in/api/register")
            .addBodyParameter("email", "eve.holt@reqres.in")
            //.addBodyParameter("password", "pistol")
            .setTag("test")
            .setPriority(Priority.HIGH)
            .build()
            .getAsJSONObject(object : JSONObjectRequestListener {
                override fun onResponse(response: JSONObject) {
                    // do anything with response
                    Log.d("register_response",response.toString())
                }

                override fun onError(error: ANError) {
                    // handle error
                    Log.e("register_response","error")
                }
            })
        /***********************************Post_login**************************************************/
        AndroidNetworking.post("https://reqres.in/api/login")
            .addBodyParameter("email", "eve.holt@reqres.in")
            //.addBodyParameter("password", "cityslicka")
            .setTag("test")
            .setPriority(Priority.HIGH)
            .build()
            .getAsJSONObject(object : JSONObjectRequestListener {
                override fun onResponse(response: JSONObject) {
                    // do anything with response
                    Log.d("login_response",response.toString())
                }

                override fun onError(error: ANError) {
                    // handle error
                    Log.e("login_response","error")
                }
            })

        sendAndRequestResponse()
        SendSingleUser()
        noSendSingleUser()
        ListResource()
        SingleResource()
        SingleResourceNotfound()

        val scaleanim: Animation=
            AnimationUtils.loadAnimation(applicationContext, R.anim.scaleanim)
        binding.jaipurimg.startAnimation(scaleanim)

        binding.jaipur.setOnClickListener {
          callingActivityData("1001")
        }
        binding.bengal.setOnClickListener {
            callingActivityData("1002")
        }

        binding.Bengaluru.setOnClickListener {
            callingActivityData("1003")
        }
        binding.up.setOnClickListener {
            callingActivityData("1004")
        }
        binding.Delhi.setOnClickListener {
            callingActivityData("1005")
        }
        binding.gujarat.setOnClickListener {
            callingActivityData("1006")
        }
        binding.haryana.setOnClickListener {
            callingActivityData("1007")
        }
        binding.patna.setOnClickListener {
            callingActivityData("1008")
        }
        binding.Pune.setOnClickListener {
            callingActivityData("1009")
        }
        binding.Tamil.setOnClickListener {
            callingActivityData("1010")
        }
        binding.Telugu.setOnClickListener {
            callingActivityData("1011")
        }
        binding.Mumbai.setOnClickListener {
            callingActivityData("1012")
        }




    }

    class GetUserApi {
     // Req
    }


    /********************************* List User *************************************/
    fun sendAndRequestResponse() {

        val queue = Volley.newRequestQueue(this)
        val url = "https://reqres.in/api/users?page=2"

        val stringRequest = StringRequest(Request.Method.GET, url,
            Response.Listener<String> { response ->
                // Display the first 500 characters of the response string.
                Log.e("Myresponse","List_User"+response);
             //   textView.text = "Response is: ${response.substring(0, 500)}"

            },
            Response.ErrorListener {
                Log.e("Myresponse","That didn't work!");
              //  textView.text = "That didn't work!"
            })

// Add the request to the RequestQueue.
        queue.add(stringRequest)
    }
    /************************************* Single Users *************************************************/
    fun SendSingleUser() {

        val queue = Volley.newRequestQueue(this)
        val url = "https://reqres.in/api/users/2"

        val stringRequest = StringRequest(Request.Method.GET, url,
            Response.Listener<String> { response ->
                // Display the first 500 characters of the response string.
                Log.e("MyResponse","Single_User"+response);
                //   textView.text = "Response is: ${response.substring(0, 500)}"

            },

            Response.ErrorListener {
                Log.e("Myresponse","That didn't work!");
                //  textView.text = "That didn't work!"
            })
        queue.add(stringRequest)
    }
    /************************************* no Single Users *************************************************/
    fun noSendSingleUser() {

        val queue = Volley.newRequestQueue(this)
        val url = "https://reqres.in/api/users/23"

        val stringRequest = StringRequest(Request.Method.GET, url,
            Response.Listener<String> { response ->
                // Display the first 500 characters of the response string.
                Log.e("MyResponse","noSingle_User"+response);
                //   textView.text = "Response is: ${response.substring(0, 500)}"

            },

            Response.ErrorListener {
                Log.e("Myresponse","That didn't work!");
                //  textView.text = "That didn't work!"
            })
        queue.add(stringRequest)
    }
    /************************************* ListResource *************************************************/
    fun ListResource() {

        val queue = Volley.newRequestQueue(this)
        val url = "https://reqres.in/api/unknown"

        val stringRequest = StringRequest(Request.Method.GET, url,
            Response.Listener<String> { response ->
                // Display the first 500 characters of the response string.
                Log.e("MyResponse","List_Resouce"+response);
                //   textView.text = "Response is: ${response.substring(0, 500)}"

            },

            Response.ErrorListener {
                Log.e("Myresponse","That didn't work!");
                //  textView.text = "That didn't work!"
            })
        queue.add(stringRequest)
    }
    /************************************* SingleResource *************************************************/
    fun SingleResource() {

        val queue = Volley.newRequestQueue(this)
        val url = "https://reqres.in/api/unknown/2"

        val stringRequest = StringRequest(Request.Method.GET, url,
            Response.Listener<String> { response ->
                // Display the first 500 characters of the response string.
                Log.e("MyResponse","Single_Resouce"+response);
                //   textView.text = "Response is: ${response.substring(0, 500)}"

            },

            Response.ErrorListener {
                Log.e("Myresponse","That didn't work!");
                //  textView.text = "That didn't work!"
            })
        queue.add(stringRequest)
    }
    /************************************* SingleResourcenotfound *************************************************/
    fun SingleResourceNotfound() {

        val queue = Volley.newRequestQueue(this)
        val url = "https://reqres.in/api/unknown/23"

        val stringRequest = StringRequest(Request.Method.GET, url,
            Response.Listener<String> { response ->
                // Display the first 500 characters of the response string.
                Log.e("MyResponse","Single_Usernot"+response);
                //   textView.text = "Response is: ${response.substring(0, 500)}"

            },

            Response.ErrorListener {
                Log.e("Myresponse","That didn't work!");
                //  textView.text = "That didn't work!"
            })
        queue.add(stringRequest)
    }
/*************************************Post method********************************************************/

    private fun callingActivityData(flags:String) {
       val intent = Intent(this, MainActivity2::class.java)
        intent.putExtra("TEAM_NUMBER",flags)
        startActivity(intent)
        overridePendingTransition(R.anim.rigth_anim,
            R.anim.leftanim);

    }


    override fun onStart() {
        super.onStart()
        Log.e("onstart","onstart")
    }

    override fun onResume() {
        super.onResume()
        Log.e("onresume","onresume")
    }

    override fun onPause() {
        super.onPause()
        Log.e("onpause","onpause")
    }

    override fun onStop() {
        super.onStop()
        Log.e("onstop","onstop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("ondestroy","ondestroy")
    }



}