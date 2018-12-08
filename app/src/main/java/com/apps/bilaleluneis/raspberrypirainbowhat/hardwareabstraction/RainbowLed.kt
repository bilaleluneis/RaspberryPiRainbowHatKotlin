package com.apps.bilaleluneis.raspberrypirainbowhat.hardwareabstraction

class RainbowLed(_index: Int, _color_name: String): AbstractLed(_index){

    private var _color: Color = colors[_color_name] ?: Color(0, 0, 0)
    val ledRgb: Triple<Int, Int, Int>
        get(){
            val rgb = this._color.rgb
            return Triple(rgb.first, rgb.second, rgb.third)
        }

    var color: String
        get(){
            for ((color_name, color_value) in colors)
                if(color_value == this._color)
                    return color_name
            throw Exception("Unknown Color !")
        }
        set(value) {
            val invalidColor = Color(-1,-1,-1)
            this._color = colors[value] ?: invalidColor
            if (this._color == invalidColor)
                throw Exception("Invalid Color assigned !")
        }


    /*override fun on() {
        this.apa102 = RainbowHat.openLedStrip()
        this.apa102.write(this._color.rgb.toList().toIntArray())
    }

    override fun off() {
        this.apa102.write(intArrayOf(0,0,0))
        this.apa102.close()
    }

    override fun blink() {
        this.on()
        Thread.sleep(this.delay.toLong())
        this.off()
    }*/

}