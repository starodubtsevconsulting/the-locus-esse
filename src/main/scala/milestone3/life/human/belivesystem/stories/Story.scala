package milestone3.life.human.belivesystem.stories

trait Story {
  def setup(): Unit
  def temptation(): Unit // or any stimulus
  def conflict(): Unit   // challenging the belief system
  def resolution(): Unit
}