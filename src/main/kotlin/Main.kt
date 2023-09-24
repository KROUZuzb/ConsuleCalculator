import java.util.Scanner

fun main(args: Array<String>) {

    val scanner = Scanner(System.`in`)

    print("Birinchi sonni kiriting:")
    val num1 = scanner.nextInt()

    print("Qaysi amaldan foydalanmoqchisiz:")
    var func = scanner.next()
    if (func == "+" || func == "-" || func == "*" || func == "/") {

        print("Ikkinchi sonni kiriting:")
        val num2 = scanner.nextInt()

        if (func == "+") {
            val equals = num1 + num2
            print("Javob:$equals")
        } else if (func == "-") {
            val equals = num1 - num2
            print("Javob:$equals")
        } else if (func == "*") {
            val equals = num1 * num2
            print("Javob:$equals")
        } else if (func == "/") {
            val equals = num1 / num2
            print("Javob:$equals")
        }

    } else {
        println("Siz kiritgan amal noto'g'ri")
        println("Iltimos to'g'ri amaldan fuydalaning")
        print("Amalni qaytadan kiriting:")
        val func1 = scanner.next()

        if (func1 == "+" || func1 == "-" || func1 == "*" || func1 == "/") {

            print("Ikkinchi sonni kiriting:")
            val num2 = scanner.nextInt()

            if (func1 == "+") {
                val equals = num1 + num2
                print("Javob:$equals")
            } else if (func1 == "-") {
                val equals = num1 - num2
                print("Javob:$equals")
            } else if (func1 == "*") {
                val equals = num1 * num2
                print("Javob:$equals")
            } else if (func1 == "/") {
                val equals = num1 / num2
                print("Javob:$equals")
            }

        }
    }


}
