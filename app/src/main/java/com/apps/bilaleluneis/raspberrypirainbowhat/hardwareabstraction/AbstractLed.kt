package com.apps.bilaleluneis.raspberrypirainbowhat.hardwareabstraction

/**
 * @author Bilal El Uneis
 * @since Nov 2018
 * bilaleluneis@gmail.com
 * @link https://github.com/bilaleluneis/RaspberryPiRainbowHat/blob/master/rainbow_shield_abstract_impl.py
 */
abstract class AbstractLed(val index: Int) {

    var isOn: Boolean = false
        private set

    fun on(){ isOn = true }
    fun off(){ isOn = false}

}


