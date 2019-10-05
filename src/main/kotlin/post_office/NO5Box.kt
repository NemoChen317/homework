package post_office

class NO5Box(override var length: Float = 39.5f, override var width: Float = 27.5f, override var height: Int = 23) : Box() {
    override fun validate(length: Float, width: Float, height: Int): Boolean {
        return length < this.length && width < this.width && height < this.height
    }
}