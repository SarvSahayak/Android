package com.simran.sarvsahayakp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.android.volley.RequestQueue

class LoginActivity : AppCompatActivity() {
    lateinit var btLogin:Button
    lateinit var btSliderRegister:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        btSliderRegister=findViewById(R.id.btSliderRegister)
        btSliderRegister.setOnClickListener {
            val intent=Intent(this,RegisterActivity::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.slide_from_right,R.anim.slide_to_left)

            finish()



        }



    }


}