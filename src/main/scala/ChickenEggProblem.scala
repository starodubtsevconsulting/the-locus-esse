object ChickenEggProblem extends App {

  def whoCameFirst(animal: String, count: Int, isGoldenEgg: Boolean): String = {
    if (count == 0) {
      if (isGoldenEgg) "Smith came first!"
      else "It's a mystery!"
    } else if (animal == "chicken") {
      whoCameFirst("egg", count - 1, isGoldenEgg)
    } else {
      whoCameFirst("chicken", count - 1, isGoldenEgg)
    }
  }

  val numberOfGenerations = 10
  val isGoldenEgg = false

  val result = whoCameFirst("chicken", numberOfGenerations, isGoldenEgg)
  println(s"After $numberOfGenerations generations, $result")
}

