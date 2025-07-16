//Example of a Data Class and a Generic
data class Question<T>( //<-- the <T> is a generic
    val questionText: String,
    val answer: T,
    val difficulty: Difficulty
)
//Example of an Enum Class
enum class Difficulty{
    EASY, MEDIUM, HARD
}
// The instances of the reusable generic class 
class Quiz{
    val question1 = Question<String>("Quoth the raven ___", "nevermore", Difficulty.MEDIUM)
    val question2 = Question<Boolean>("The sky is green. True or false", false, Difficulty.EASY)
    val question3 = Question<Int>("How many days are there between full moons?", 28, Difficulty.HARD)
	companion object StudentProgress {
    	var total: Int = 10
    	var answered: Int = 3    
	}
}
//Adding an extention function
fun Quiz.StudentProgress.printProgressBar(){
    repeat(Quiz.answered) {
        print("▓")
    }
    repeat(Quiz.total - Quiz.answered){print("▒")}
    println()
    println(Quiz.progressText)
}
//Extending Classes: Adding an Extension Property
val Quiz.StudentProgress.progressText: String
	get() = "${answered} of ${total} answered."
fun main() {
    Quiz.printProgressBar()
