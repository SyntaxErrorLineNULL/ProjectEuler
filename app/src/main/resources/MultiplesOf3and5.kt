class MultiplesOf3and5() {
    fun solve(number: Int): Int {
        var sumNaturalNumber = 0

        for(i in 1..number){
            if(i % 3 == 0 || i % 5 == 0){
                sumNaturalNumber += i
            }
        }

        println(sumNaturalNumber)
        return sumNaturalNumber
    }
}