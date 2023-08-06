package milestone3.life.human.belivesystem.stories

import milestone3.life.human.belivesystem.{Belief, ChristianIndividual}

// Object representing the Garden of Eden simulation story
object GardenOfEdenSimulationStory extends App with Story {

  // Create instances of ChristianIndividual named Adam and Eve
  val adam = new ChristianIndividual("Adam")
  val eve = new ChristianIndividual("Eve")

  // Setup - Display Adam and Eve's initial beliefs in Heaven
  override def setup(): Unit = {
    println("Adam's Beliefs in Heaven: " + adam.getAllBeliefs)
    println("Eve's Beliefs in Heaven: " + eve.getAllBeliefs)
  }

  // Temptation - The serpent tempts Eve to eat the forbidden fruit
  override def temptation(): Unit = {
    // Add specific implementation for temptation here if needed
    println("Eve is tempted by the serpent to eat the forbidden fruit.")
  }

  // Conflict - Adam and Eve take the forbidden fruit, and their beliefs change
  override def conflict(): Unit = {
    adam.addBelief(Belief("Original Sin", "Belief in the fallen nature of humanity due to the first sin of Adam and Eve."))
    adam.addBelief(Belief("Redemption", "Belief in the salvation and forgiveness of sins through Jesus Christ."))

    eve.addBelief(Belief("Original Sin", "Belief in the fallen nature of humanity due to the first sin of Adam and Eve."))
    eve.addBelief(Belief("Redemption", "Belief in the salvation and forgiveness of sins through Jesus Christ."))
  }

  // Resolution - Display Adam and Eve's updated beliefs after the tragic event in the Garden of Eden
  override def resolution(): Unit = {
    println("Adam's Beliefs after the Tragic Event: " + adam.getAllBeliefs)
    println("Eve's Beliefs after the Tragic Event: " + eve.getAllBeliefs)

    // Adam and Eve lose some virtues, like Empathy
    adam.removeBelief(Belief("Empathy", "Belief in understanding and sharing the feelings of others."))
    eve.removeBelief(Belief("Empathy", "Belief in understanding and sharing the feelings of others."))

    // Display Adam and Eve's beliefs after losing Empathy
    println("Adam's Beliefs after Losing Empathy: " + adam.getAllBeliefs)
    println("Eve's Beliefs after Losing Empathy: " + eve.getAllBeliefs)

    // Check if Adam and Eve have the belief 'Courage'
    println(s"Does Adam have the belief 'Courage'? ${adam.hasBelief(Belief("Courage"))}")
    println(s"Does Eve have the belief 'Courage'? ${eve.hasBelief(Belief("Courage"))}")

    // Check if Adam and Eve have the belief 'Love'
    println(s"Does Adam have the belief 'Love'? ${adam.hasBelief(Belief("Love"))}")
    println(s"Does Eve have the belief 'Love'? ${eve.hasBelief(Belief("Love"))}")
  }

  // Run the story
  setup()
  temptation()
  conflict()
  resolution()
}
