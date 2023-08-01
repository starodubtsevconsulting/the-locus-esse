package milestone3.life.cell.immune

// AntigenPresentingCell.scala

// Base trait representing the common characteristics of an APC
trait AntigenPresentingCell {
  var antigen: Option[String] = None

  def presentAntigen(antigen: String): (String, Boolean)

  def activateTCell(tCell: TCell, mhc: MHC, antigen: String): Unit = {
    val (presentedAntigen, coStimulated) = presentAntigen(antigen)
    tCell.activate(presentedAntigen, coStimulated)
  }

  // Default implementation of takeAntigen method
  def takeAntigen(antigen: String): Unit = {
    this.antigen = Some(antigen)
  }

  // Default implementation of processAntigen method
  def processAntigen(): String = {
    // In a real system, this method would process the antigen and generate peptides
    "Processed antigen peptides"
  }
}


/*
 * AntigenPresentingCell activates a T cell,
 * it calls the activate method on the T cell with the antigen and co-stimulation information.
 * The T cell's state is then updated accordingly.
*/

class DendriticCell extends AntigenPresentingCell {

  def presentAntigen(antigen: String): (String, Boolean) = {
    // In real scenarios, the co-stimulation may depend on additional factors
    val coStimulated = scala.util.Random.nextBoolean()
    (antigen, coStimulated)
  }

  // Override the takeAntigen method to customize the behavior
  override def takeAntigen(antigen: String): Unit = {
    println("Dendritic cell takes up antigen.")
    super.takeAntigen(antigen) // Call the original implementation in the parent class
  }

}

// --

// Macrophage class representing macrophages
class Macrophage extends AntigenPresentingCell {
  def presentAntigen(antigen: String): (String, Boolean) = {
    ???
  }
}

// B Cell class representing B cells
class BCell extends AntigenPresentingCell {
  def presentAntigen(antigen: String): (String, Boolean) = {
    ???
  }
}

// Langerhans Cell class representing Langerhans cells
class LangerhansCell extends AntigenPresentingCell {
  def presentAntigen(antigen: String): (String, Boolean) = {
    ???
  }
}

