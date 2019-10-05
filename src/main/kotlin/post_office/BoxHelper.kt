package post_office

import com.post_office.NO5Box
import java.util.*

fun main(args: Array<String>) {
    print("Please enter object's length: ")
    var scanner = Scanner(System.`in`)
    var length: Float = scanner.nextFloat()
    print("Please enter object's Width: ")
    var width: Float = scanner.nextFloat()
    print("Please enter object's Height: ")
    var height: Int = scanner.nextInt()

    if (NO3Box().validate(length , width , height))
        print("BOX3")
    else if (post_office.NO5Box().validate(length , width , height))
        print("BOX5")
    else
        print("None")
}