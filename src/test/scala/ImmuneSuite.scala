// For more information on writing tests, see
// https://scalameta.org/munit/docs/getting-started.html
import milestone3.life.cell.immune.{DendriticCell, MHC, MHCClass, TCellImpl, TCellState}
import milestone3.life.viruses.genomes.GeneticMaterial.*
import milestone3.life.viruses.genomes.{GeneticMaterial, GenomeType, ViralGenome}
import milestone3.life.viruses.{Capsid, Capsomer, NakedVirus}
import munit.FunSuite

// just draft test to start with something, something executable with meaningful values

class ImmuneSuite extends FunSuite {

  // Test for simulating the immune response
  test("Test Immune Response") {
    // Create an instance of an antigen-presenting cell
    val apc = new DendriticCell()

    // Create a T-cell
    val tCell = new TCellImpl("TCell_Receptor")

    // Simulate antigen presentation and T-cell activation

    // Step 3: APC processes the antigen
    val processedPeptides = apc.processAntigen()
    assert(processedPeptides.nonEmpty)

    // Step 4: T cell recognizes the antigen-MHC complex
    val mhc = MHC(processedPeptides, MHCClass.ClassI)


    val antigen = "Influenza"
    println(s"Antigen-presenting cell presents antigen: $antigen")
    apc.activateTCell(tCell, mhc, antigen)

    // Check current state of T-cell
    assertEquals(tCell.state, TCellState.Activated)

    // Convert T-cell to memory T-cell
    tCell.convertToMemory()
    assertEquals(tCell.state, TCellState.Memory)

    // Reset T-cell to a naive state
    tCell.reset()
    assertEquals(tCell.state, TCellState.Naive)
  }

  test("Antigen presentation and T cell activation") {
    // Step 1: Create a DendriticCell and a T cell
    val apc = new DendriticCell()
    val tCell = new TCellImpl("TCell_Receptor")

    // Step 2: APC takes up the antigen
    val antigen = "Influenza"
    apc.takeAntigen(antigen)
    assertEquals(apc.antigen, Some(antigen))

    // Step 3: APC processes the antigen
    val processedPeptides = apc.processAntigen()
    assert(processedPeptides.nonEmpty)

    // Step 4: T cell recognizes the antigen-MHC complex
    val mhc = MHC(processedPeptides, MHCClass.ClassI)
    apc.activateTCell(tCell, mhc, antigen)

    // T cell should now be activated
    assertEquals(tCell.state, TCellState.Activated)

    tCell.presentedAntigen match {
      case Some(presentedAntigen) => assertEquals(presentedAntigen, antigen)
      case _ => fail("T cell's presented antigen should not be empty.")
    }

    // Step 5: T cell receives co-stimulatory signals (not implemented in this simplified example)
    tCell.coStimulated match {
      case Some(true) => assert(true, "T cell receives co-stimulatory signals.")
      case Some(false) => assert(false, "T cell does not receive co-stimulatory signals.")
      case _ => fail("T cell activation status should not be empty.")
    }

    // Step 6: T cell initiates an immune response (not implemented in this simplified example)
    tCell.convertToMemory()
    assertEquals(tCell.state, TCellState.Memory)

    // Reset the T cell
    tCell.reset()
    assertEquals(tCell.state, TCellState.Naive)
  }
}

