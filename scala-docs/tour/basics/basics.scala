object Basics{
  
  def main(args: Array[String]): Unit = {
    // Expressions
    println("\nEXPRESSIONS:")
    var z = 1 + 1
    z = 3
    println(z * z)

    var a: Int = 1 + 1

    // Blocks
    println("\nBLOCKS:")
    println({
      val b = 1 + 1
      b + 1
    })

    // Functions
    println("\nFUNCTIONS:")
    val addOne = (x: Int) => x + 1
    println(addOne(1))

    val add = (x: Int, y:Int) => x + y
    println(add(1, 2))

    val getTheAnswer = () => 42
    println(getTheAnswer())
    
    // Methods
    println("\nMETHODS:")
    def add_method(x: Int, y: Int): Int = x + y
    println(add(1, 2))

    def addThenMultiply(x: Int, y: Int)(multiplier: Int): Int = (x + y) * multiplier
    println(addThenMultiply(1, 2)(3))

    def name: String = System.getProperty("user.name")
    println("Hello, " + name + "!")

    def getSquareString(input: Double): String = {
      val square = input * input
      square.toString
    }
    println(getSquareString(2.5))

    // Classes
    println("\nCLASSES:")
    class Greeter(prefix: String, suffix: String) {
      def greet(name: String): Unit =
        println(prefix + name + suffix)
    }

    val greeter = new Greeter("Hello, ", "!")
    greeter.greet("Scala developer") // Hello, Scala developer

    //Case Classes
    println("\nCASE CLASSES:")
    case class Point(x: Int, y: Int)

    val point = Point(1, 2)
    val anotherPoint = Point(1, 2)
    val yetAnotherPoint = Point(2, 2)

    if (point == anotherPoint) {
      println(s"$point and $anotherPoint are the same.")
    } else {
      println(s"$point and $anotherPoint are different.")
    }

    if (point == yetAnotherPoint) {
      println(s"$point and $yetAnotherPoint are the same.")
    } else {
      println(s"$point and $yetAnotherPoint are different.")
    }

    // Objects
    println("\nOBJECTS:")
    object IdFactory {
      private var counter = 0
      def create(): Int = {
        counter += 1
        counter
      }
    }

    val newId: Int = IdFactory.create()
    println(newId)
    val newerId: Int = IdFactory.create()
    println(newerId)
  }
}
