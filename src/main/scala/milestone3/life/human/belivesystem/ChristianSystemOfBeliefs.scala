package milestone3.life.human.belivesystem

trait ChristianSystemOfBeliefs extends SystemOfBeliefs {
  val name: String
  var beliefs: List[Belief] = List(
    Belief("Trinity", "Belief in the Father, Son, and Holy Spirit as one God in three persons."),
    Belief("Jesus Christ as Savior", "Belief that Jesus Christ's death and resurrection offer salvation and forgiveness of sins."),
    Belief("The Bible", "Belief in the Bible as the inspired word of God and a guide for faith and practice."),
    Belief("Original Sin", "Belief that all humans are born with original sin due to Adam and Eve's disobedience."),
    Belief("Salvation by Faith", "Belief that salvation is attained through faith in Jesus Christ's redemptive work."),
    Belief("The Resurrection", "Belief in the bodily resurrection of Jesus Christ and the promise of eternal life."),
    Belief("The Second Coming", "Belief in the future return of Jesus Christ to Earth as described in the New Testament."),
    Belief("The Holy Spirit", "Belief in the presence and work of the Holy Spirit who guides, empowers, and comforts believers."),
    Belief("The Church", "Belief in the community of believers, the Church, as the body of Christ on Earth."),
    Belief("Prayer", "Belief in prayer as a means of communication with God and seeking guidance and strength.")
  )
}
