package milestone3.life.human.belivesystem.biases

// ApplyingBiases class
class ApplyingBiases(decision: Decision, biases: List[Bias]) {
  def applyAllBiases(): Decision = {
    val biasedDecision = biases.foldLeft(decision) { (currentDecision, bias) =>
      bias.applyBias(currentDecision)
    }
    biasedDecision
  }
}

// Bias implementations...

object ApplyingBiasesTest extends App {

  val originalDecision = Decision(List("Option A", "Option B", "Option C"), "Option A")

  // List of bias implementations
  val biases: List[Bias] = List(
    // Add bias objects...
  )

  // Create ApplyingBiases instance
  val applyingBiases = new ApplyingBiases(originalDecision, biases)

  // Apply all biases to the decision
  val biasedDecision = applyingBiases.applyAllBiases()

  println(s"Original Decision: ${originalDecision.selectedOption}")
  println(s"Biased Decision: ${biasedDecision.selectedOption}")
}