package milestone3

import milestone3.BigBang

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
