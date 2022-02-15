package com.sphephelo.di

import com.sphephelo.fx.MainActivity
import com.sphephelo.viewmodel.CurrencyExRateInstance
import com.sphephelo.views.CurrencyFragment
import dagger.Component

@Component(modules = [NetworkModule::class])
interface ApplicationComponent {
    // This tells Dagger that LoginActivity requests injection so the graph needs to
    // satisfy all the dependencies of the fields that LoginActivity is requesting.
    // fun inject(activity: MainActivity)
    fun inject(fragment: CurrencyFragment)


}