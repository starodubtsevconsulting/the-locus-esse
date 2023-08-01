package milestone3.life.cell.immune

/*
 * MHC stands for Major Histocompatibility Complex.
 * It is a group of genes that encode cell surface proteins involved in the presentation of antigens to T cells in the immune system.
 * MHC molecules play a critical role in adaptive immunity, helping the immune system recognize and respond to foreign substances, such as pathogens or antigens from infected or abnormal cells.
 * In the context of the MHC case class in the provided code, the peptide represents a processed antigen peptide. 
 * An antigen peptide is a short segment of a larger antigenic protein that has been processed by an antigen-presenting cell (APC) from an invading pathogen.
*/
case class MHC(peptide: String, mhcClass: MHCClass.Value) {
  // You can add other properties or methods related to MHC if needed
}

object MHCClass extends Enumeration {
  val ClassI, ClassII = Value
}
