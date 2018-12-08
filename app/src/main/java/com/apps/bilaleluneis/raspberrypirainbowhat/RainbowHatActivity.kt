package com.apps.bilaleluneis.raspberrypirainbowhat

import android.app.Activity
import com.apps.bilaleluneis.raspberrypirainbowhat.hardwareabstraction.AbstractRpiRainbowStrip
import com.apps.bilaleluneis.raspberrypirainbowhat.hardwareabstraction.RandomPatternStrip

/**
 * @author Bilal El Uneis
 * @since Nov 2018
 * bilaleluneis@gmail.com
 */

class RainbowHatActivity : Activity(){

    private val strip:AbstractRpiRainbowStrip =  RandomPatternStrip()
    override fun onStart() {
        super.onStart()
        strip.delayBetweenUpdates = 200
        strip.execute(10)
    }

    /*override fun onStop() {
        super.onStop()
    }*/
}
