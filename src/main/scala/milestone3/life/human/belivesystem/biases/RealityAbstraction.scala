package milestone3.life.human.belivesystem.biases

/**
 * Biases are highly nuanced and influenced by numerous factors.
 * The software representation simplifies these complexities for the purpose of modeling.
 * The actual impact of biases in reality is often more intricate and context-dependent.
 * @param decision
 * @param biases
 */
class RealityAbstraction(decision: Decision, biases: List[Bias]) {
  def applyBiases(): Decision = {
    val biasedDecision = biases.foldLeft(decision) { (currentDecision, bias) =>
      bias.applyBias(currentDecision)
    }
    biasedDecision
  }
}


object RealityAbstractionTest extends App {

  val originalDecision = Decision(List("Option A", "Option B", "Option C"), "Option A")

  // List of bias implementations
  val biases: List[Bias] = List(
    // Add bias objects...
  )

  // Create Reality Abstraction instance
  val reality = new RealityAbstraction(originalDecision, biases)

  // Apply biases to the decision within the Reality Abstraction context
  val biasedDecision = reality.applyBiases()

  println(s"Original Decision: ${originalDecision.selectedOption}")
  println(s"Biased Decision: ${biasedDecision.selectedOption}")
}
