package milestone3.life.cell

// Define the CellTraits trait
trait CellTrait {
  // Field to represent the type of the cell
  val cellType: String

  // Function to perform basic cell activity
  def performActivity(): Unit

  // Function to check if the cell is infected
  def isInfected(): Boolean

}
