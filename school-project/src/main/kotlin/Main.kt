enum class Level { BASIC, INTERMEDIATE, HARD }

class User(val name: String)

data class EducationalContent(val name: String, var duration: Int = 60)

data class Education(val name: String, var contents: List<EducationalContent>) {

  val subscribers = mutableListOf<User>()

  fun enroll(user: User) {
    // TODO("Utilize o parâmetro $usuario para simular uma matrícula (usar a lista de $inscritos).")
    subscribers.add(user)
  }
}

fun main() {
  // TODO("Analise as classes modeladas para este domínio de aplicação e pense em formas de evoluí-las.")
  // TODO("Simule alguns cenários de teste. Para isso, crie alguns objetos usando as classes em questão.")
}