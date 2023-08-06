package milestone3.life.human.belivesystem.emotions

trait Emotion

trait Love extends Emotion {
  val form: String
}

trait Fear extends Emotion {
  val form: String
}

// Emotions Derived from Love
case class ConditionalLove(form: String) extends Love
case class UnconditionalLove(form: String) extends Love
case class Affection(form: String) extends Love
case class Compassion(form: String) extends Love
case class Devotion(form: String) extends Love
case class Adoration(form: String) extends Love
case class Gratitude(form: String) extends Love

// Emotions Derived from Fear
case class Anxiety(form: String) extends Fear
case class Panic(form: String) extends Fear
case class Dread(form: String) extends Fear
case class Apprehension(form: String) extends Fear
case class Terror(form: String) extends Fear