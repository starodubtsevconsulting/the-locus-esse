package milestone3.life.viruses

import milestone3.life.BeVirus
import milestone3.life.cell.CellTrait
import milestone3.life.viruses.genomes.ViralGenome

import scala.util.Random

class EnvelopedVirus(var name: String, var genome: ViralGenome) extends BeVirus {

  // Array to store the capsomers of the virus
  var capsomers: Array[Capsomer] = Array.empty
  var symmetry: String = "" // Symmetry of the capsid (e.g., icosahedral, helical)
  var replicationProteins: List[String] = List.empty // Proteins involved in genome replication

  // Function to infect a host cell
  override def infectHostCell(cell: CellTrait): Unit = {
    println(s"$name is infecting a ${cell.cellType} cell.")

    val replicatedGenome = replicateGenome()

    // TODO:
  }

  /*
    Functionality: The replicateGenome method is responsible for replicating the viral genome inside the infected host cell.
    Purpose: Viruses typically carry their genetic material in the form of DNA or RNA.
    During the replication process, the virus uses the host cell's machinery to produce multiple copies of its own genetic material.
    These replicated genomes serve as the blueprint for creating new virus particles.
  */
  override def replicateGenome(): ViralGenome = { // making a copy

    println(s"Genome replication...")

    val replicatedGenome = genome.copy();

    println(s"Replication complete. New genome: ${replicatedGenome}")

    replicatedGenome
  }

  /*
  Functionality: The assembleNewVirus method is responsible for assembling the new virus particles using the replicated genome and other viral components, including the capsid.
  Purpose: After the viral genome is replicated inside the host cell, the virus needs to package this genetic material within a protective protein shell called the capsid.
  The assembleNewVirus method creates the capsomers and organizes them to form the capsid.
  It then packages the replicated genome inside the capsid to form new virus particles.
  
  Funny part is: viruses cannot replicate or copy themselves outside of a host cell. 
  The origin of viruses is a topic of scientific debate.
  So we have to keep cell as argument for this function of assembling a new instance of the virus.
  */  
  def assembleNewVirus(cell: CellTrait): EnvelopedVirus = {
    println(s"Assembling new $name particles inside the ${cell.cellType} cell.")

    val genome = replicateGenome()

    // Return the NakedVirus object after the assembly is complete
    val assembledVirus = new EnvelopedVirus(s"$name" + System.currentTimeMillis(), genome)
    assembledVirus
  }

  // --

  private def randomCapsomer(): Capsomer = {
    val capsomerType = s"Protein ${Random.nextInt(5) + 1}"
    val structure = if (Random.nextBoolean()) "Helical" else "Icosahedral"
    val function = if (Random.nextBoolean()) "Attachment to host cells" else "Protection of viral genetic material"
    Capsomer(capsomerType, structure, function)
  }
}
