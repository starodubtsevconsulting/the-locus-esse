package milestone3.life.human

trait Playful {
  def play(): Unit
  def enjoy(): Unit
}

class Life(var age: Int, var friends: List[String], var activities: List[String]) extends Playful {
  def play(): Unit = {
    println("Life is a playful game! Let's have fun!")
  }

  def enjoy(): Unit = {
    println("Enjoying the moments of life's playfulness.")
  }

  def addFriend(name: String): Unit = {
    friends = name :: friends
  }

  def addActivity(activity: String): Unit = {
    activities = activity :: activities
  }

  def showDetails(): Unit = {
    println(s"Age: $age")
    println("Friends: ")
    friends.foreach(println)
    println("Activities: ")
    activities.foreach(println)
  }
}

object Main {
  def main(args: Array[String]): Unit = {
    val myLife = new Life(6, List("Friend1", "Friend2"), List("Playing Chess", "Reading"))
    myLife.play()
    myLife.enjoy()

    // Adding new friends and activities
    myLife.addFriend("NewFriend")
    myLife.addActivity("Hiking")

    // Displaying life's details
    myLife.showDetails()
  }
}





