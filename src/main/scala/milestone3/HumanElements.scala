package milestone3

/**
 * Note:
 * The universe is predominantly composed of two types of matter
 * - Dark Matter: ~27%
 * - Dark Energy: ~68%
 * - Baryonic Matter (Ordinary Matter): ~5%, from this:
 * -- Hydrogen is estimated to make up about 74%
 * -- Helium: ~24% (of the baryonic matter)
 * -- Elements beyond helium (about 0%): For those elements, additional processes like supernova nucleosynthesis are necessary to produce them.
 *    It involve extreme conditions and cataclysmic events in the life cycle of massive stars or astrophysical events like neutron star collisions.
 *    And those are most elements we happened to be formed from - i.e. the start dust.
 */
object HumanElements {

  val elements = Map(
    "Hydrogen" -> 0.70,
    "Helium" -> 0.18,
    "Lithium" -> 0.000002,
    "Beryllium" -> 0.0000002,
    "Boron" -> 0.0000001,
    "Carbon" -> 0.10,
    "Nitrogen" -> 0.03,
    "Oxygen" -> 0.18,
    "Fluorine" -> 0.00000005,
    "Neon" -> 0.0000005,
    "Sodium" -> 0.0015,
    "Magnesium" -> 0.0005,
    "Aluminum" -> 0.000082,
    "Silicon" -> 0.00000005,
    "Phosphorus" -> 0.011,
    "Sulfur" -> 0.002,
    "Chlorine" -> 0.0015,
    "Argon" -> 0.0000035,
    "Potassium" -> 0.002,
    "Calcium" -> 0.015,
    "Scandium" -> 0.00000002,
    "Titanium" -> 0.0000039,
    "Vanadium" -> 0.0000003,
    "Chromium" -> 0.00000005,
    "Manganese" -> 0.00001,
    "Iron" -> 0.00004,
    "Cobalt" -> 0.0000001,
    "Nickel" -> 0.0000075,
    "Copper" -> 0.00001,
    "Zinc" -> 0.00002,
    "Gallium" -> 0.000001,
    "Germanium" -> 0.000000000001,
    "Arsenic" -> 0.0000002,
    "Selenium" -> 0.000005,
    "Bromine" -> 0.00000005,
    "Krypton" -> 0.0000000001,
    "Rubidium" -> 0.0000003,
    "Strontium" -> 0.0000002,
    "Yttrium" -> 0.0000001,
    "Zirconium" -> 0.00000002,
    "Niobium" -> 0.0000000003,
    "Molybdenum" -> 0.0000001,
    "Technetium" -> 0.0000000000001,
    "Ruthenium" -> 0.0000000001,
    "Rhodium" -> 0.0000000001,
    "Palladium" -> 0.0000000004,
    "Silver" -> 0.0000000004,
    "Cadmium" -> 0.0000000003,
    "Indium" -> 0.00000000005,
    "Tin" -> 0.0000000003,
    "Antimony" -> 0.00000000002,
    "Tellurium" -> 0.000000000001,
    "Iodine" -> 0.0000005,
    "Xenon" -> 0.0000000001,
    "Cesium" -> 0.000000000001,
    "Barium" -> 0.00000000002,
    "Lanthanum" -> 0.00000000001,
    "Cerium" -> 0.00000000002,
    "Praseodymium" -> 0.000000000002,
    "Neodymium" -> 0.0000000001,
    "Promethium" -> 0.0000000000001,
    "Samarium" -> 0.00000000001,
    "Europium" -> 0.00000000001,
    "Gadolinium" -> 0.00000000001,
    "Terbium" -> 0.000000000002,
    "Dysprosium" -> 0.000000000005,
    "Holmium" -> 0.0000000000005,
    "Erbium" -> 0.0000000000005,
    "Thulium" -> 0.0000000000001,
    "Ytterbium" -> 0.000000000001,
    "Lutetium" -> 0.00000000000001,
    "Hafnium" -> 0.000000000002,
    "Tantalum" -> 0.0000000000002,
    "Tungsten" -> 0.0000000000001,
    "Rhenium" -> 0.00000000000005,
    "Osmium" -> 0.000000000000002,
    "Iridium" -> 0.000000000000001,
    "Platinum" -> 0.0000000000005,
    "Gold" -> 0.000000000000001,
    "Mercury" -> 0.000000000000001,
    "Thallium" -> 0.000000000000001,
    "Lead" -> 0.000000000000002,
    "Bismuth" -> 0.000000000000001,
    "Polonium" -> 0.0000000000000000001,
    "Astatine" -> 0.0000000000000000001,
    "Radon" -> 0.000000000000000001,
    "Francium" -> 0.000000000000000000001,
    "Radium" -> 0.000000000000000000001,
    "Actinium" -> 0.000000000000000000001,
    "Thorium" -> 0.000000000000000000000001,
    "Protactinium" -> 0.000000000000000000000000001,
    "Uranium" -> 0.00000000000000000000000001,
    "Neptunium" -> 0.000000000000000000000000000001,
    "Plutonium" -> 0.000000000000000000000000000001,
    "Americium" -> 0.0000000000000000000000000000001,
    "Curium" -> 0.0000000000000000000000000000001,
    "Berkelium" -> 0.00000000000000000000000000000001,
    "Californium" -> 0.00000000000000000000000000000001,
    "Einsteinium" -> 0.00000000000000000000000000000001,
    "Fermium" -> 0.00000000000000000000000000000001,
    "Mendelevium" -> 0.0000000000000000000000000000000001,
    "Nobelium" -> 0.00000000000000000000000000000000001,
    "Lawrencium" -> 0.00000000000000000000000000000000001,
    "Rutherfordium" -> 0.0000000000000000000000000000000000001,
    "Dubnium" -> 0.0000000000000000000000000000000000001,
    "Seaborgium" -> 0.0000000000000000000000000000000000001,
    "Bohrium" -> 0.0000000000000000000000000000000000001,
    "Hassium" -> 0.0000000000000000000000000000000000001,
    "Meitnerium" -> 0.0000000000000000000000000000000000001,
    "Darmstadtium" -> 0.0000000000000000000000000000000000001,
    "Roentgenium" -> 0.0000000000000000000000000000000000001,
    "Copernicium" -> 0.0000000000000000000000000000000000001,
    "Nihonium" -> 0.0000000000000000000000000000000000001,
    "Flerovium" -> 0.0000000000000000000000000000000000001,
    "Moscovium" -> 0.0000000000000000000000000000000000001,
    "Livermorium" -> 0.0000000000000000000000000000000000001,
    "Tennessine" -> 0.0000000000000000000000000000000000001,
    "Oganesson" -> 0.0000000000000000000000000000000000001
  )

  def main(args: Array[String]): Unit = {

    println("The human body is built from the following elements:")

    elements.foreach { case (element, percentage) =>
      val percentInHuman = percentage * 100 // Convert fraction to percentage
      println(s"$element: ${percentInHuman}%")
    }
  }
}

