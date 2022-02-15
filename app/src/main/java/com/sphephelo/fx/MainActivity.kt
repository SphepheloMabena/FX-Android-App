package com.sphephelo.fx

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.navigation.findNavController
import androidx.recyclerview.widget.LinearLayoutManager

import com.sphephelo.time.TimeSeries
import com.sphephelo.viewmodel.ProcessData
import com.sphephelo.viewmodel.TimeSeriesInstance
import retrofit2.Call
import retrofit2.Response
import retrofit2.Retrofit
import java.time.LocalDate
import javax.inject.Inject
import javax.security.auth.callback.Callback

class MainActivity : AppCompatActivity() {


    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       /* (applicationContext as MyApplication).appComponent.inject(this)
        println("Retrofit Object : ${retrofit}")*/
        findNavController(R.id.nav_host_fragment)



    }
}