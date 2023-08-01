package milestone3.life.cell.immune

trait TCell {
  def tcr: String
  var state: TCellState.Value
  var presentedAntigen: Option[String]
  var coStimulated: Option[Boolean]

  def activate(presentedAntigen: String, coStimulated: Boolean): Unit = {
    if (state == TCellState.Naive && coStimulated) {
      println(s"T-cell is activated by antigen: $presentedAntigen")
      state = TCellState.Activated
      this.presentedAntigen = Some(presentedAntigen)
      this.coStimulated = Some(coStimulated)
    } else {
      println("T-cell is already activated or requires co-stimulation.")
    }
  }

  def convertToMemory(): Unit = {
    if (state == TCellState.Activated) {
      println("Converting T-cell to memory T-cell.")
      state = TCellState.Memory
    } else {
      println("T-cell must be activated before it can become a memory T-cell.")
    }
  }

  def reset(): Unit = {
    println("Resetting T-cell to a naive state.")
    state = TCellState.Naive
    presentedAntigen = None
    coStimulated = None
  }
}