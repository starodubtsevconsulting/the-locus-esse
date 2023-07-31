package milestone3.life.cell

import milestone3.life.cell.CellTrait

class Cell(val cellType: String) extends CellTrait {

  override def performActivity(): Unit = {
    println(s"$cellType is performing its activity.")
  }

  def isInfected(): Boolean = {
    false
  }

  // Function to infect the cell
  def infect(): Unit = {
  }
}