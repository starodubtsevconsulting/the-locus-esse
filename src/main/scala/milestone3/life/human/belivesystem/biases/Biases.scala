package milestone3.life.human.belivesystem.biases

// Here's how we might relate biases and the decision class to reality within a software context:

/**
 * Here's how we might relate biases and the decision class to reality within a software context:
 * 
 * TODO:
 *
 * Applying Biases:
 * When we apply biases to a decision, we're simulating how those biases might impact real-life decision-making. 
 * The effects of the bias on the decision can be represented through modifying attributes like the selected option or adding new options.
 *
 * Reality Abstraction:
 * Keep in mind that biases are highly nuanced and influenced by numerous factors. 
 * The software representation simplifies these complexities for the purpose of modeling. 
 * The actual impact of biases in reality is often more intricate and context-dependent.
 *
 * Testing and Analysis:
 * After applying biases to a decision, we can analyze how the biases affect the outcome. 
 * This might involve measuring changes in the selected option, evaluating the overall quality of the decision, or tracking bias-related patterns over time.
 *
 * Contextualization:
 * Understand that biases don't operate in isolation. They interact with other biases, external factors, and cognitive processes. 
 * Your software model should aim to provide insights into the potential effects of biases within a controlled context.
 */


/*
 * Biases:
 * Each bias implementation (as shown in the previous examples) modifies the decision-making process in a specific way. The applyBias method within each bias implementation would simulate how that bias affects the decision.
 *
 */
trait Bias {
  def applyBias(decision: Decision): Decision
}

// ---

object ConfirmationBias extends Bias {
  def applyBias(decision: Decision): Decision = {
    // ...
    decision
  }
}

object AvailabilityBias extends Bias {
  def applyBias(decision: Decision): Decision = {
    // ...
    decision
  }
}

object AnchoringBias extends Bias {
  def applyBias(decision: Decision): Decision = {
    // ...
    decision
  }
}

object OverconfidenceBias extends Bias {
  def applyBias(decision: Decision): Decision = {
    // ...
    decision
  }
}

object HindsightBias extends Bias {
  def applyBias(decision: Decision): Decision = {
    // ...
    decision
  }
}

// 6
object DunningKrugerEffect extends Bias {
  def applyBias(decision: Decision): Decision = {
    // ...
    decision
  }
}

object SelfServingBias extends Bias {
  def applyBias(decision: Decision): Decision = {
    // ...
    decision
  }
}

object StatusQuoBias extends Bias {
  def applyBias(decision: Decision): Decision = {
    // ...
    decision
  }
}

// 10
object SunkCostFallacy extends Bias {
  def applyBias(decision: Decision): Decision = {
    // ...
    decision
  }
}


object LossAversion extends Bias {
  def applyBias(decision: Decision): Decision = {
    // ...
    decision
  }
}

object EndowmentEffect extends Bias {
  def applyBias(decision: Decision): Decision = {
    // ...
    decision
  }
}

object FramingEffect extends Bias {
  def applyBias(decision: Decision): Decision = {
    // ...
    decision
  }
}

object SelectionBias extends Bias {
  def applyBias(decision: Decision): Decision = {
    // ...
    decision
  }
}

object AuthorityBias extends Bias {
  def applyBias(decision: Decision): Decision = {
    // ...
    decision
  }
}

// 17
object FalseConsensusEffect extends Bias {
  def applyBias(decision: Decision): Decision = {
    // ...
    decision
  }
}

object FundamentalAttributionError extends Bias {
  def applyBias(decision: Decision): Decision = {
    // ...
    decision
  }
}

object InGroupBias extends Bias {
  def applyBias(decision: Decision): Decision = {
    // ...
    decision
  }
}

// 20
object OutGroupHomogeneityBias extends Bias {
  def applyBias(decision: Decision): Decision = {
    // ...
    decision
  }
}

object AnchoringAandAdjustmentBias extends Bias {
  def applyBias(decision: Decision): Decision = {
    // ...
    decision
  }
}

object CurseofKnowledge extends Bias {
  def applyBias(decision: Decision): Decision = {
    // ...
    decision
  }
}

object ZeroRiskBias extends Bias {
  def applyBias(decision: Decision): Decision = {
    // ...
    decision
  }
}

object JustWorldHypothesis extends Bias {
  def applyBias(decision: Decision): Decision = {
    // ...
    decision
  }
}

object Reactance extends Bias {
  def applyBias(decision: Decision): Decision = {
    // ...
    decision
  }
}

object TheBarnumEffect extends Bias {
  def applyBias(decision: Decision): Decision = {
    // ...
    decision
  }
}

object ActorObserverBias extends Bias {
  def applyBias(decision: Decision): Decision = {
    // ...
    decision
  }
}

object SelfHandicapping extends Bias {
  def applyBias(decision: Decision): Decision = {
    // ...
    decision
  }
}

// 30
object FocusingEffect extends Bias {
  def applyBias(decision: Decision): Decision = {
    // ...
    decision
  }
}

object BaseRateFallacy extends Bias {
  def applyBias(decision: Decision): Decision = {
    // ...
    decision
  }
}

object ClusteringIllusion extends Bias {
  def applyBias(decision: Decision): Decision = {
    // ...
    decision
  }
}

object Priming extends Bias {
  def applyBias(decision: Decision): Decision = {
    // ...
    decision
  }
}

object RecencyBias extends Bias {
  def applyBias(decision: Decision): Decision = {
    // ...
    decision
  }
}

object GamblersFallacy extends Bias {
  def applyBias(decision: Decision): Decision = {
    // ...
    decision
  }
}

object NeglectingProbability extends Bias {
  def applyBias(decision: Decision): Decision = {
    // ...
    decision
  }
}

object ImpactBias extends Bias {
  def applyBias(decision: Decision): Decision = {
    // ...
    decision
  }
}

object SemmelweisReflex extends Bias {
  def applyBias(decision: Decision): Decision = {
    // ...
    decision
  }
}

// 40
object RosyRetrospection extends Bias {
  def applyBias(decision: Decision): Decision = {
    // ...
    decision
  }
}

object ZeroSumBias extends Bias {
  def applyBias(decision: Decision): Decision = {
    // ...
    decision
  }
}

object IllusionOfControl extends Bias {
  def applyBias(decision: Decision): Decision = {
    // ...
    decision
  }
}

object AnchoringEffect extends Bias {
  def applyBias(decision: Decision): Decision = {
    // ...
    decision
  }
}

// 44
object ChoiceSupportiveBias extends Bias {
  def applyBias(decision: Decision): Decision = {
    // ...
    decision
  }
}

object SpotlightEffect extends Bias {
  def applyBias(decision: Decision): Decision = {
    // ...
    decision
  }
}

object TheTexasSharpshooterFallacy extends Bias {
  def applyBias(decision: Decision): Decision = {
    // ...
    decision
  }
}

object FalseMemory extends Bias {
  def applyBias(decision: Decision): Decision = {
    // ...
    decision
  }
}

// 48
object AttributionBias extends Bias {
  def applyBias(decision: Decision): Decision = {
    // ...
    decision
  }
}

object SurvivorshipBias extends Bias {
  def applyBias(decision: Decision): Decision = {
    // ...
    decision
  }
}

object IllusionOfTransparency extends Bias {
  def applyBias(decision: Decision): Decision = {
    // ...
    decision
  }
}

// ---

object Main extends App {
  val originalDecision = Decision(List("Option A", "Option B", "Option C"), "Option A")
  val biasedDecision = applyBiases(originalDecision, List(ConfirmationBias, AvailabilityBias))

  println(s"Original Decision: ${originalDecision.selectedOption}")
  println(s"Biased Decision: ${biasedDecision.selectedOption}")
}

def applyBiases(decision: Decision, biases: List[Bias]): Decision = {
  biases.foldLeft(decision) { (currentDecision, bias) =>
    bias.applyBias(currentDecision)
  }
}