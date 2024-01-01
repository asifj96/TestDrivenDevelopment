package com.tdd.testDrivenDevelopment

object Homework {


    fun fib(n: Int): Long {
        if (n == 0 || n == 1) {
            return n.toLong()
        }
        var a = 0L
        var b = 1L
        var c = 1L
        (1..n - 2).forEach { i ->
            c = a + b
            a = b
            b = c
        }
        return c
    }

    /**
        * Checks if the braces are set correctly
        * e.g "((a+b))" should return false
     */
//    fun checkBraces(inputString: String): Boolean {
//        return inputString.count { it == '(' } == inputString.count { it == ')' }
//    }

    fun checkBraces(string: String): Boolean {
        if (string.isEmpty()) {
            return false
        }
        if (string.contains("((") || string.contains("))")) {
            return false
        }
        if (string.contains("{") || string.contains("}")) {
            return false
        }
        if (string[0] == ')' && string[string.lastIndex] == '(') {
            return false
        }
        if (string[0] == '(' && string[string.lastIndex] == ')') {
            return true
        }
        return true
    }
}