package com.apps.bilaleluneis.raspberrypirainbowhat.hardwareabstraction

/**
 * @author Bilal El Uneis
 * @since Nov 2018
 * bilaleluneis@gmail.com
 */

/** @link https://github.com/bilaleluneis/RaspberryPiRainbowHat/blob/master/rainbow_shield_abstract_impl.py*/
class Color(private val red: Int, private val green: Int, private val blue: Int) {

    val rgb: Triple<Int,Int,Int> get() = Triple(this.red,this.green,this.blue)

    override operator fun equals(other: Any?): Boolean {
        if(other == null) return false
        val color = other as Color
        return  (this.red == color.red) &&
                (this.green == color.green) &&
                (this.blue == color.blue)
    }

}



