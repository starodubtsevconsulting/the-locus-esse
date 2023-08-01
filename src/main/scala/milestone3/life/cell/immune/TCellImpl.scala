package milestone3.life.cell.immune

// TCellImpl class representing different states of T cells
// Concrete class TCellImpl implementing TCell
// In the context of the immune system and T cells, TCR stands for "T cell receptor." TCR is a protein located on the surface of T cells and is a crucial component of the adaptive immune system.
// It plays a central role in the recognition of antigens presented by antigen-presenting cells (such as dendritic cells).
class TCellImpl(val tcr: String) extends TCell {
  // Initialize the state as Naive, and other properties as None
  var state: TCellState.Value = TCellState.Naive
  var presentedAntigen: Option[String] = None
  var coStimulated: Option[Boolean] = None
}