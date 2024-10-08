fun main() {
    println("Hello world")
  val person = Person("nimra",7,60)
    val student = Student("laiba",5,50,2024)



}
class Person (name: String){


    init{
        println("nimra")
    }
   init{
       println(7+7)
   }
    constructor(name:String,age:Int):this(name){}
    constructor(name:String,age:Int,marks:Int):this(name,age){}

}
//multiple constructor using properties method
class Student (name: String) {
    var name: String = "laiba"
    var age: Int = 5
    var marks : Int = 985
    var year : Int = 2024
    init {
        println("laiba")
    }

    init {
        println(5 + 7)
        println(985)
    }
    init {
        println(2024)
    }

    constructor(name: String, age: Int) : this(name) {
        this.name = name


    }

    constructor(name: String, age: Int, marks: Int) : this(name, age) {
        this.name = name
        this.age = age


    }
    constructor(name: String, age: Int, marks: Int, year : Int) : this(name, age,marks) {
        this.name = name
        this.age = age
        this.marks = marks
        this.year = year

    }
}