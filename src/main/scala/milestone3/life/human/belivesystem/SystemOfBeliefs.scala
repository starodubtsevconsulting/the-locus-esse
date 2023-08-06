package milestone3.life.human.belivesystem

/*
  Individuals are not just isolated entities with fixed identities but rather complex beings shaped by their beliefs, values, and the narratives they hold dear.
  Here we delves into the idea that it is our beliefs and the stories we embrace that define much of our perception, behavior, and interactions with the world.
  
  From this perspective, people are "belief systems" rather than merely separate, self-contained entities.
  This means that our identities and actions are heavily influenced by the systems of beliefs we hold.
  These belief systems can be religious, cultural, or ideological narratives that shape our understanding of reality and our place in it.

  In this context, the emphasis on narratives and myths becomes crucial. 
  The stories we believe in often provide the framework for how we interpret events, understand ourselves, and relate to others. 
  They can form the basis for our values, moral codes, and motivations.
 */

// Trait representing a system of beliefs
trait SystemOfBeliefs {

  var beliefs: List[Belief]

  def updateBeliefs(newBeliefs: List[Belief]): Unit = {
    beliefs = newBeliefs
  }

  def addBelief(newBelief: Belief): Unit = {
    beliefs = beliefs :+ newBelief
  }

  def removeBelief(beliefToRemove: Belief): Unit = {
    beliefs = beliefs.filterNot(_ == beliefToRemove)
  }

  def getAllBeliefs: List[Belief] = beliefs

  def hasBelief(beliefToCheck: Belief): Boolean = beliefs.contains(beliefToCheck)
}