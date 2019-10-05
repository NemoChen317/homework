package post_office

import post_office.Box

class NO3Box(override var length: Float = 23f, override var width: Float = 14f, override var height: Int = 13) : Box() {
    override fun validate(length: Float, width: Float, height: Int): Boolean {
        return length < this.length && width < this.width && height < this.height
    }
}