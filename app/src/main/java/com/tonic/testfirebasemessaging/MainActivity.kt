package com.tonic.testfirebasemessaging

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.google.firebase.installations.FirebaseInstallations
import com.google.firebase.messaging.FirebaseMessaging

//接收來自"yuchiehtn@gmail.com"的專案"FirebaseNotification"的FCM(測試成功)
class MainActivity : AppCompatActivity() {
    private val mTAG = MainActivity::class.java.name
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val iidToken = FirebaseInstallations.getInstance().getToken(true)
        Log.d(mTAG, "IID_TOKEN = $iidToken")



        FirebaseMessaging.getInstance().subscribeToTopic("test")
    }
}