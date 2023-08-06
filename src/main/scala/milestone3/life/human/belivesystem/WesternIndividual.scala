package milestone3.life.human.belivesystem

import milestone3.life.human.belivesystem.emotions.{Anxiety, Apprehension, ConditionalLove, Dread, Fear, Love, Panic, Terror}

import scala.util.Random

class WesternIndividual(val name: String, var customBeliefs: List[Belief], var economicStatus: String) extends Human with ChristianSystemOfBeliefs {

  override def experienceLove(): Love = {
    ConditionalLove("Conditional Love")
  }

  override def experienceFear(): Fear = {
    // List of fear case classes
    val fears = List(
      Anxiety("Fear of the Unknown / Death"),
      Panic("Fear of Loss of Control"),
      Dread("Fear of Upcoming Event"),
      Apprehension("Fear of Uncertain Outcome"),
      Terror("Fear of Extreme Danger")
    )

    // Generate a random index to pick a fear case class
    val randomIndex = Random.nextInt(fears.length)
    fears(randomIndex)
  }

  def displayInfo(): Unit = {
    println(s"Name: $name")
    println("Beliefs: " + beliefs.mkString(", "))
    println(s"Economic Status: $economicStatus")
  }
}

object WesternIndividualRun extends App {

    val initialBeliefs = List(
      Belief("Individual Achievement", "Belief in the importance of personal accomplishments and success."),
      Belief("Material Success", "Belief in the significance of acquiring wealth and material possessions."),
      Belief("Competition", "Belief in the value of competitive spirit and striving to outperform others."),
      Belief("Meritocracy", "Belief in a system where rewards are based on individual effort and ability.")
    )
    val individual = new WesternIndividual("John Doe", initialBeliefs, "Wealthy")

    individual.displayInfo()

    individual.addBelief(Belief("Personal Progress"))
    individual.updateBeliefs(List(Belief("Financial Security"), Belief("Personal Progress")))

    individual.displayInfo()

    println(s"Does ${individual.name} have the belief 'Competition'? ${individual.hasBelief(Belief("Competition"))}")
    println(s"Does ${individual.name} have the belief 'Altruism'? ${individual.hasBelief(Belief("Altruism"))}")
}

