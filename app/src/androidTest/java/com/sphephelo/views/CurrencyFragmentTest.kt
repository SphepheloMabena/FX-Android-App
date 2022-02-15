package com.sphephelo.views

import androidx.fragment.app.testing.FragmentScenario
import androidx.fragment.app.testing.launchFragmentInContainer
import androidx.lifecycle.Lifecycle
import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.sphephelo.fx.MainActivity
import com.sphephelo.fx.R
import junit.framework.TestCase
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class CurrencyFragmentTest
{
    private lateinit  var scenario: FragmentScenario<CurrencyFragment>
    private lateinit var activity:ActivityScenario<MainActivity>;

    @Before
    fun setUp()
    {
        activity= ActivityScenario.launch(MainActivity::class.java);
        activity.moveToState(Lifecycle.State.CREATED);

        scenario=launchFragmentInContainer(themeResId = R.style.Theme_Fx)
        scenario.moveToState(Lifecycle.State.CREATED);
    }


    @Test
    fun Test()
    {

        onView(withId(R.id.fromSpinner)).perform(click())
        //Espresso.onView(withId(R.id.profile_image)).perform(ViewActions.click());
    }
    @Test
    fun LowMemory(){
        scenario.recreate()

    }    }
