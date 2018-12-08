package com.apps.bilaleluneis.raspberrypirainbowhat.hardwareabstraction

import org.junit.Test

/**
 * @author Bilal El Uneis
 * @since Nov 2018
 * bilaleluneis@gmail.com
 * @see Color
 */

class ColorUnitTest {

    @Test
    fun obtain_rgb_from_color_test(){
        val rgbValue = colors["red"]?.rgb ?: Triple(0,0,0)
        assert((rgbValue.first == 255 && rgbValue.second == 0 && rgbValue.third == 0))
    }

    @Test
    fun equals_operator_test(){
        val redColor = Color(red=255, green=0, blue=0)
        val anotherRedColor = Color(red=255, green=0, blue=0)
        val blueColor = Color(red=0, green=0, blue=255)
        val redTest = redColor == anotherRedColor
        val blueTest = redColor == blueColor
        assert(redTest)
        assert(!blueTest)
    }
}