package com.apps.bilaleluneis.raspberrypirainbowhat.hardwareabstraction

import android.graphics.Color
import android.os.SystemClock
import com.google.android.things.contrib.driver.apa102.Apa102

abstract class AbstractRpiRainbowStrip(private val numOfLeds: Int): Apa102("SPI0.0", Apa102.Mode.BGR) {

    private val leds = HashMap<String, RainbowLed>()
    var delayBetweenUpdates: Long = 300 //default to 300 milliseconds

    protected abstract var pattern: Array< Array<RainbowLed> >

    fun execute(numberOfTimes: Int){
        for(iterations in 0..numberOfTimes){
            for(aPattern in pattern){
                this.write(updateStrip(aPattern))
                SystemClock.sleep(this.delayBetweenUpdates)
            }
        }
        //clear the strip to turn off all RGB leds and then close
        this.write(Array(this.numOfLeds) {Color.rgb(0,0,0)}.toIntArray())
        this.close()
    }

    private fun updateStrip(pattern: Array<RainbowLed>): IntArray {
        val ledStrip = Array(this.numOfLeds){Color.rgb(0,0,0)}
        for(led in pattern){
            val (r, g, b) = led.ledRgb
            val index = led.index
            ledStrip[index] = Color.rgb(r, g, b)
        }
        return ledStrip.toIntArray()
    }


}


class RandomPatternStrip: AbstractRpiRainbowStrip(7){
    override var pattern: Array< Array<RainbowLed> >
        get() = arrayOf(
            arrayOf(RainbowLed(0,"red"), RainbowLed(3,"green"),RainbowLed(6,"blue")),
            arrayOf(RainbowLed(0,"yellow"), RainbowLed(6,"red")),
            arrayOf(RainbowLed(0,"green"), RainbowLed(6,"yellow")),
            arrayOf(RainbowLed(0,"blue"), RainbowLed(6,"red")),
            arrayOf(RainbowLed(0,"orange"), RainbowLed(6,"violet")),
            arrayOf(RainbowLed(0,"violet"), RainbowLed(6,"green")),
            arrayOf(RainbowLed(0,"red"), RainbowLed(6,"red"))
        )
        set(value) {}


}

