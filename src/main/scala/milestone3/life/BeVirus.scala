package milestone3.life

import milestone3.life.cell.CellTrait
import milestone3.life.viruses.genomes.ViralGenome

trait BeVirus {

  def infectHostCell(cell: CellTrait): Unit

  def replicateGenome(): ViralGenome

  def assembleNewVirus(cell: CellTrait): BeVirus
}
