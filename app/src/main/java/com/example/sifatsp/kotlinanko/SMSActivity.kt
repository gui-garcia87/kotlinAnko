package com.example.sifatsp.kotlinanko

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.text.Editable
import android.view.MenuItem
import android.view.View
import android.widget.AbsListView
import android.widget.Toolbar
import kotlinx.android.synthetic.main.content_sms.*
import org.jetbrains.anko.sendSMS

class SMSActivity:AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sms)
        val toolbar = findViewById(R.id.toolbar) as android.support.v7.widget.Toolbar
        setSupportActionBar(toolbar)


        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayShowHomeEnabled(true)


        et_msg.text = Editable.Factory.getInstance().newEditable(intent.getStringExtra("inicio texto"))

    }

    fun enviarSms(view: View?){
        sendSMS("99798912460", et_msg.toString())
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id = item.itemId
        if (id == android.R.id.home){
            finish()
            return true
        }

        return super.onOptionsItemSelected(item)
    }
}