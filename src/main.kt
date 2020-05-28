var bFast: String? = null
var lunch: String? = null
var lbook: String? = null
var nBook: String? = null
var day: String? =null

fun main(){
    var robot = Robot("Vector")
    robot.start()
    daytime()
    robot.alarmRing()
    robot.makeCoffee("with Milk",2)
    robot.heatWater(10.4)
    timeTable()
    robot.packBag(lbook,nBook)
    cookfood()
    robot.cookFood(bFast,lunch)
    robot.ironCloths("White Shirt and Black Trouser")

}

fun daytime(){
    var time = "7:00 AM"
    var week = mutableListOf<String>("Monday","Tuesday","Wednesday","Thursday","Friday")

}

fun cookfood(){
    var breakfast = mutableListOf<String>("Sandwich","BrownBread","Juice","salad","fruit")
    var week = mutableListOf<String>("MasalaDosa","Kichdi","PannerTikka","Paneer","Dal-Roti")
    bFast = breakfast.random()
    lunch = week.random()
}

fun timeTable(){
    var book = mutableListOf<String>("English","Hindi","Science","Moral Values","Social Studies","Maths")
    var noteBook = mutableListOf<String>("English Copy","Hindi Copy","Science Copy","Moral Values Copy",
            "Social Studies Copy","Maths Copy")
    nBook = book[4]
    lbook = noteBook[5]
}