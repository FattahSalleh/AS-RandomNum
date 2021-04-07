package example.myapp

//abstract  class AquariumFish{
//    abstract val color: String
//}

class Shark: FishAction, FishColor{
//    override val color = "gray"
    override val color = "gray"
    override fun eat(){
        println("Hunt and eat fish")
    }
}

class Plecostomus(fishColor: FishColor = GoldColor): FishAction by PrintingFishAction("Eat Algae"), FishColor by fishColor{
//    override val color = "gold"
//    override val color = "gold"
//    override fun eat(){
//        println("Eat algae")
//    }
}

//=========================

interface FishAction{
    fun eat()
}

interface FishColor{
    val color: String
}

//=========================

object GoldColor: FishColor {
    override val color = "gold"
}

//=======================

class PrintingFishAction(val food:String) : FishAction{
    override fun eat(){
        println(food)
    }
}