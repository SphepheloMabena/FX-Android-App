package com.sphephelo.viewmodel


import com.sphephelo.models.currencies.CurrencyExRate
import com.sphephelo.time.TimeSeries
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Url

interface CurrencyExRateInterface {
    @GET

    fun CurrencyExRateInfom(@Url url:String):retrofit2.Call<CurrencyExRate>


}


class CurrencyExRateInstance(retrofit: Retrofit)
{
    val currencyExRateInterface:CurrencyExRateInterface
    init {
        // println("App staus : $msg")


        currencyExRateInterface=retrofit.create(CurrencyExRateInterface::class.java)


    }
}