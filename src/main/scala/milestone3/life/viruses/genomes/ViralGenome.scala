package milestone3.life.viruses.genomes

/*
 For viruses, the genome refers to the genetic material (either DNA or RNA) that carries the virus's genetic information.
 The viral genome is much simpler compared to the genomes of living organisms.

  In the context of viruses, the genome contains the instructions for the virus to replicate and produce new virus particles inside a host cell.
  It encodes the necessary information for the virus to interact with the host cell's machinery, hijack its cellular processes, and produce viral proteins and components.
*/
case class ViralGenome(
                        nucleotides: String,
                        genomeType: GenomeType.Value,
                        geneticMaterial: GeneticMaterial.Value,
                        length: Int,
                        origin: String,
                        specificGenes: List[String]
                      )

// Sample usage:
// val genomeType = GenomeType("RNA", "Single-stranded")
// val geneticMaterial = GeneticMaterial("DNA", "Double-stranded")
// val nucleotides = "ATCGATCG" // Example nucleotide sequence
// val length = nucleotides.length
// val origin = "Unknown"
// val specificGenes = List("GeneA", "GeneB", "GeneC")
//
// val viralGenome = ViralGenome(nucleotides, genomeType, geneticMaterial, length, origin, specificGenes)