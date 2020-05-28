class Robot(var name: String) {

    fun start(){
        println("Hey!! My Self ${this.name}")
    }
    fun alarmRing(){

    }

    fun <double> makeCoffee(type: String, spoon: double){
        println("Coffee Ready with $type and $spoon spoon sugar")
    }

    fun <double> heatWater(temp: double){
        println("Water at $temp celsius is ready to bath ")
    }

    fun packBag(book: String?, nBook: String?){
        println("Bag Packed with $book and $nBook")
    }

    fun cookFood(bFast: String?, lunch: String?) {
        println("$bFast in Breakfast and $lunch in Lunch")
    }

    fun ironCloths(s: String) {
        println("Cloths Ready $s")
    }
}

