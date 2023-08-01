// For more information on writing tests, see
// https://scalameta.org/munit/docs/getting-started.html
import milestone3.life.viruses.{Capsid, Capsomer, NakedVirus}
import milestone3.life.viruses.genomes.GeneticMaterial.*
import milestone3.life.viruses.genomes.{GeneticMaterial, GenomeType, ViralGenome}
import munit.FunSuite

// just draft to start with something, something executable with meaningful values
import munit.FunSuite

class VirusSuite extends FunSuite {

  test("Create Astrovirus Naked Virus") {
    // Create a ViralGenome instance for Astrovirus
    val astrovirusGenome = ViralGenome(
      nucleotides = "ATCG",
      genomeType = GenomeType.RNA,
      geneticMaterial = GeneticMaterial.ss,
      length = 5000,
      origin = "Astrovirus Source",
      specificGenes = List("GeneA", "GeneB", "GeneC")
    )

    // Create a list of Capsomers for Astrovirus
    val astrovirusCapsomersList = Seq(
      Capsomer(aType = "Hexameric", shape = "Hexagon", size = "Small"),
      Capsomer(aType = "Hexameric", shape = "Hexagon", size = "Small"),
      Capsomer(aType = "Pentameric", shape = "Pentagon", size = "Medium")
    )

    // Convert the list of Capsomers to an array
    val astrovirusCapsomers = astrovirusCapsomersList.toArray
    val capsid = Capsid("AstrovirusShape", astrovirusCapsomers, "Icosahedral")

    // Create an Astrovirus instance
    val astrovirus = new NakedVirus(name = "Astrovirus", capsid, genome = astrovirusGenome)
    astrovirus.replicationProteins = List("ProteinX", "ProteinY")

    // Assertions to verify properties of the Astrovirus instance
    assertEquals(astrovirus.name, "Astrovirus")
    assertEquals(astrovirus.genome, astrovirusGenome)
    assertEquals(astrovirus.replicationProteins, List("ProteinX", "ProteinY"))
  }

}

