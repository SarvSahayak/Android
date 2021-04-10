package com.simran.sarvsahayakp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.android.volley.Request
import com.android.volley.RequestQueue
import com.android.volley.Response
import com.android.volley.toolbox.JsonObjectRequest
import com.android.volley.toolbox.Volley

class RegisterActivity : AppCompatActivity() {
    lateinit var btSliderLogin: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        btSliderLogin = findViewById(R.id.btSliderLogin)
        btSliderLogin.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)

            overridePendingTransition(R.anim.slide_from_left, R.anim.slide_to_right)
            finish()

        }

    }


}