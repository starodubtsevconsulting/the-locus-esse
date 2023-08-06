package milestone3.life.human.believesystem.stories

import milestone3.life.human.belivesystem.stories.Story
import milestone3.life.human.belivesystem.{Belief, WesternIndividual}


// Object representing the WesternIndividual's story
object WesternIndividualStory extends App with Story {

  // Create an instance of WesternIndividual
  val johnDoe = new WesternIndividual("John Doe", List.empty, "Wealthy")

  // Implement the WesternIndividual's story based on the WesternStory trait
  override def setup(): Unit = {
    println(s"${johnDoe.name}'s Initial Beliefs: " + johnDoe.getAllBeliefs)
    println(s"${johnDoe.name}'s Economic Status: ${johnDoe.economicStatus}")
  }

  override def temptation(): Unit = {
    println(s"${johnDoe.name} is tempted by a materialistic offer.")
  }

  override def conflict(): Unit = {
    johnDoe.addBelief(Belief("Desire for Success", "Belief in the importance of achieving great success."))
    johnDoe.addBelief(Belief("Pursuit of Wealth", "Belief in the pursuit of financial prosperity."))
  }

  override def resolution(): Unit = {
    println(s"${johnDoe.name}'s Final Beliefs: " + johnDoe.getAllBeliefs)

    // John Doe experiences love and fear one more time
    val loveExperience = johnDoe.experienceLove()
    val fearExperience = johnDoe.experienceFear()

    println(s"${johnDoe.name} experiences love: $loveExperience")
    println(s"${johnDoe.name} experiences fear: $fearExperience")
  }

  // Run the WesternIndividual's story
  setup()
  temptation()
  conflict()
  resolution()
}
