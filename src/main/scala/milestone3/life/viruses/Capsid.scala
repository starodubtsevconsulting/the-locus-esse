package milestone3.life.viruses

/**
 * The capsid is a key component of a virus.
 * It is the protective protein coat that surrounds the viral genetic material,
 * which can be either DNA or RNA.
 * The capsid plays a crucial role in safeguarding the viral genome from degradation and damage,
 * particularly when the virus is outside a host cell.
 */
case class Capsid(shape: String, capsomers: Seq[Capsomer], symmetry: String)
