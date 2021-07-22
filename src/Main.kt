fun main() {
    println(checkPalindrome("aba"))
}

fun checkPalindrome(inputString: String)=inputString==inputString.reversed()