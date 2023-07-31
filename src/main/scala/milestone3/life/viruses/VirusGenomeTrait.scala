package milestone3.life.viruses

import milestone3.life.viruses.genomes.GeneticMaterial.GeneticMaterial
import milestone3.life.viruses.genomes.GenomeType.GenomeType

/*
 * The genome of a virus refers to its complete set of genetic material.
 * It contains the genetic instructions necessary for the virus to replicate and produce new virus particles.
 * The genome can be either DNA (deoxyribonucleic acid) or RNA (ribonucleic acid),
 * and its structure and composition vary depending on the type of virus.
*/
trait VirusGenomeTrait {
  def getGeneticMaterial: GeneticMaterial

  def getGenomeType: GenomeType
}
