package milestone3.life.human.belivesystem

import milestone3.life.human.belivesystem.emotions.{Anxiety, Apprehension, ConditionalLove, Dread, Fear, Love, Panic, Terror, UnconditionalLove}

import scala.util.Random


/**
 * In the context of the described Belief Framework influenced by the Western world's Moral framework,
 * Here is class for an individual that reflects the emphasis on
 * - self-interest,
 * - materialistic values,
 * - competitive spirit, and
 * - meritocracy (government or the holding of power by people selected on the basis of their ability.).
 *
 * @param beliefs
 */
class ChristianIndividual(val name: String) extends Human with ChristianSystemOfBeliefs {

  override def experienceLove(): Love = {
    UnconditionalLove("UnconditionalLove") // variations are possible
  }

  override def experienceFear(): Fear = {
    // List of fear case classes
    val fears = List[Fear]()
    // Generate a random index to pick a fear case class
    val randomIndex = Random.nextInt(fears.length)
    fears(randomIndex)
  }

  // Method to display the individual's information
  def displayInfo(): Unit = {
    println(s"Name: $name")
    println("Beliefs: " + beliefs.mkString(", "))
  }
}

/**
 * A simulation of Adam and Eve's beliefs and actions after the tragic event in the Garden of Eden.
 * This simulation demonstrates how their belief system evolves due to the consequences of their actions.
 * The code is fictional and based on the Christian belief system and the story of Adam and Eve.
 *
 * (That is rather Draft for now)
 */
object GardenOfEdenSimulation extends App {

}

