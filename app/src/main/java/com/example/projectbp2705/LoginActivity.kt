package com.example.projectbp2705

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        //instance
        val btnLogin:Button = findViewById(R.id.btnLogin)
        val txtUsername:EditText = findViewById(R.id.editTextUsername)
        val txtPassword:EditText = findViewById(R.id.editTextPassword)

        //ipen ssat baten login klik
        btnLogin.setOnClickListener {
            //Login CHEEEEECK
            if(txtUsername.text.toString().equals("ditzu") &&
               txtPassword.text.toString().equals("amikom")){
                //call homepageeee
                val intent = Intent(this,HomeActivity::class.java)
                startActivity(Intent)
            }else{
                Toast.makeText(this)
            }
        }
    }
}