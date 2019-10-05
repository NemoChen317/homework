package post_office

abstract class Box{
    abstract var length: Float
    abstract var width: Float
    abstract var height: Int
    abstract fun validate(length: Float , width: Float , height: Int):Boolean;
}