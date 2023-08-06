package milestone3.life.human.belivesystem

import milestone3.life.human.belivesystem.emotions.{Fear, Love}


/**
 * Represents the common attributes and methods of a human being, including the experience of emotions.
 * Note: Human stands outside of Any Beliefs System.
 * This trait represents the common attributes and methods of a human being,
 * including the experience of emotions such as love and fear, which are fundamental and universal.
 * The `experienceLove()` and `experienceFear()` methods are the base for representing and handling
 * different forms and variations of love and fear, allowing for flexibility and extensibility
 * when modeling human emotions and their interactions with belief systems and behavior.
*/
trait Human {

  def experienceLove(): Love;


  def experienceFear(): Fear; // Fear("Fear of the Unknown / Death")
}
