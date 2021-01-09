class FiboEvenSum {
    fun solve(number: Int): Int
    {
        var sum = 0
        var current = 0
        var second = 1

        while(current + second < number){
            val these = current + second
            if(these % 2 == 0){
                sum += these
            }
            current = second
            second = these
        }
        println(sum)
        return sum
    }
}