package milestone3

/*
* The Big Bang primarily produced the two lightest elements, hydrogen (H) and helium (He), along with trace amounts of lithium (Li) and beryllium (Be).
* The synthesis of heavier elements beyond helium required processes that occurred in the cores of stars and during stellar explosions, such as supernovae.
*/

object BigBangSimulation {
  def main(args: Array[String]): Unit = {
    val bigBang = new BigBang()
    println("Elements produced during the early universe after the Big Bang:")
    val elementsProduced = bigBang.bang()
    elementsProduced.foreach { element =>
      println(s"${element.title} (${element.code})")
    }
  }
}
