/**
 * This enum represents different levels of difficulty of the content
 */
enum class Level { BASIC, INTERMEDIATE, HARD }

/**
 * The User class represents the classmate users. They can enroll in any [EducationalContent].
 */
class User(val name: String)

/**
 * The EducationalContent class represents the course that is given
 */
data class EducationalContent(val name: String, var duration: Int = 60, var level: Level)

/**
 * The Education class represents all the [EducationalContent] involved and contains all users enrolled
 */
data class Education(val name: String, var contents: List<EducationalContent>) {

  val subscribers = mutableListOf<User>()

  /**
   * Enrolls the user to the [Education]
   * @param user the user to be enrolled
   */
  fun enroll(user: User) {
    subscribers.add(user)
  }

  /**
   * Returns all the Education users' names
   */
  fun getClassmates(): List<String> {
    return subscribers.map { user: User -> user.name }
  }

}

fun main() {
  val layin = User("layin")
  val darkLayin = User("DarkLayin")
  val aliny = User("Aliny")
  val math = EducationalContent("Math", 30, Level.BASIC)
  val physics = EducationalContent("Physics", level = Level.INTERMEDIATE)
  var engineering = Education("Engineering", listOf(math, physics))

  engineering.enroll(layin)
  engineering.enroll(darkLayin)
  engineering.enroll(aliny)

  println(engineering.getClassmates())

}