package com.apps.bilaleluneis.raspberrypirainbowhat.hardwareabstraction

/**
 * @author Bilal El Uneis
 * @since Nov 2018
 * bilaleluneis@gmail.com
 * @link https://github.com/bilaleluneis/RaspberryPiRainbowHat/blob/master/rainbow_shield_abstract_impl.py
 */
abstract class AbstractLed (val identifier: Int){

    abstract fun on()
    abstract fun off()
    abstract fun blink()

}


