package milestone3.life


trait BeAlive {

  def isAlive: Boolean

  def age: Int

  def reproduce(withSomeoneAlive: BeAlive): BeAlive

  // use metabolism (that takes the Food and produce Energy)
  def consume(food: Food): Unit 
}