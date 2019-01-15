object Shopping extends App {

  val shopping = List("Apples", "Oranges", "Apples")
  var total = 0.00
  var countApples = 0
  var countOranges = 0

  for(i <- 0 until shopping.length){

    if (shopping(i)== "Apples"){
      countApples + 1

      if(countApples %2 != 0) {
        total = total + 0.60
      }
    }

    if(shopping(i)=="Oranges"){
      total = total+0.25
    }

  }
println(s"£ $total")


}
