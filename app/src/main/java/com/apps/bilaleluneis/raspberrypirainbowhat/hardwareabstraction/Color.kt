package com.apps.bilaleluneis.raspberrypirainbowhat.hardwareabstraction



/**
 * @author Bilal El Uneis
 * @since Nov 2018
 * bilaleluneis@gmail.com
 */

/** @link https://github.com/bilaleluneis/RaspberryPiRainbowHat/blob/master/rainbow_shield_abstract_impl.py*/
internal class Color(private val red: Int, private val green: Int, private val blue: Int) {

    val rgb: Triple<Int,Int,Int> get() = Triple(this.red,this.green,this.blue)

    override operator fun equals(other: Any?): Boolean {
        if(other == null) return false
        val color = other as Color
        return  (this.red == color.red) &&
                (this.green == color.green) &&
                (this.blue == color.blue)
    }

    //TODO: saw this as example of overriding hash map, not sure how correct it is
    override fun hashCode(): Int {
        var result = 17
        result = 31 * result + this.red
        result = 31 * result + this.green
        result = 32 * result + this.blue
        return result

    }

}

internal val colors: HashMap<String, Color> = hashMapOf(

    "red"    to Color(255, 0, 0),
    "orange" to Color(255, 127, 0),
    "yellow" to Color(255, 255, 0),
    "green"  to Color(0, 255, 0),
    "blue"   to Color(0, 0, 255),
    "violet" to Color(139, 0, 255),
    "white"  to Color(255, 255, 255),
    "none"   to Color(0, 0, 0)

)



