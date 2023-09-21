package com.example.kotlin


//The open keyword means “open for extension“
// i.e. it's possible to create subclasses of an open class:

//The open annotation on a class is the opposite of Java's final:
// it allows others to inherit from this class. By default, all classes in Kotlin are final,
// which corresponds to Effective Java,
// Item 17: Design and document for inheritance or else prohibit it.


//Note that public is the default if nothing else is specified explicitly


open class Parent{   //Use open keyword before class
                     // as in Kotlin The Classes are by default final
                    //we cannot do inheritance without making open


    open var name = "valen"   //using open to override the value of name in  InheritanceInKotlin class
   open fun add(a : Int, b : Int) : Int{
        return a+b
    }
}

class Child : Parent(){
    override var  name : String = "valen Rajubhai Patel"

    //Method Override

    override fun add (a : Int, b : Int) : Int{
        val sum = super.add(a, b)
        val sqr = sum*sum
        return sqr
    }
}
class InheritanceInKotli {
}
fun main(){
val b = Child()
    println(b.name)
    println("The Sum is : "+b.add(2,2))


    b.name = "valen patel"
    println(b.name)

    val c = Parent()
    println(c.add(1,2))
}



//The public keyword acts as a visibility modifier that can be applied on classes, functions, member functions, etc.
// If a top-level class or function is public, it means it can be used from other files, including from other modules.