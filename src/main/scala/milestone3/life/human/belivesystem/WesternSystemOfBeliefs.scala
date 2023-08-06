package milestone3.life.human.belivesystem

// Trait representing a Western individual with a belief system and economic status
trait WesternSystemOfBeliefs extends SystemOfBeliefs {
  val name: String
  var beliefs: List[Belief] = List(
    Belief("Individual Achievement", "Belief in the importance of personal accomplishments and success."),
    Belief("Material Success", "Belief in the significance of acquiring wealth and material possessions."),
    Belief("Competition", "Belief in the value of competitive spirit and striving to outperform others."),
    Belief("Meritocracy", "Belief in a system where rewards are based on individual effort and ability.")
  )
  var economicStatus: String
}