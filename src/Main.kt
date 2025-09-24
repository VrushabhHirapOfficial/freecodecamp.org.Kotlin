import kotlin.math.max

fun main(){

    //here the var is the keyword that we start the variable from and the name
    // is the name of the variable and then String is the Data type of that variable
    // her the one most imp concept comes called type inference
//    basically what we can do is just write like this
    var userName: String = "Vrushabh" // now here the compiler will automatically inferences userName as the String
    // means what when you otherwise try to put the int value in the userName that is not valid because
    // the userName is infered as the String first
    userName = "raja sahab"
    var name: String = "Vrushabh"
    println("Hello I'm $name")

    name = "hirap"
    println(name)

    //When we start declaring the variable with the val its basically defining
    // the constant value that cannot be changed
//    val PI: Float = 3.14
//    println(PI)

    var age : Int = 19
    print("Hello my age is $age")


    //Aslo the most imp concept here one more comes that the lateinit

    lateinit var Name: String

    // now here we are definng the variable Name but not telling comipler yet what we are going to store in it
    // soo we can just define that Name and then later store anything you want in it

    Name = "Aayush Hirap"

    println(Name)


    var maxIntValue = Int.MAX_VALUE
    val minIntValue = Int.MIN_VALUE

    println(maxIntValue)
    println(minIntValue)

//    maxIntValue = 2147483648 cant put this number because it is bigger than the Int size

    val maxByteValue = Byte.MAX_VALUE
    val minByteValue = Byte.MIN_VALUE

    println(maxByteValue)
    println(minByteValue)


    val maxShortValue = Short.MAX_VALUE
    val minShortValue = Short.MIN_VALUE

    println(maxShortValue)
    println(minShortValue)

    val maxLongValue = Long.MAX_VALUE
    val minLongValue = Long.MIN_VALUE

    println(maxLongValue)
    println(minLongValue)

    val maxDoubleValue = Double.MAX_VALUE
    val minDoubleValue = Double.MIN_VALUE

    println(maxDoubleValue)
    println(minDoubleValue)


    var no = 25
    // now the above no is implicitly imfered as the int incase if you explicitly specify
    // that the no is short or byte or long then only it will going to take that datatype

    //if you want to create a float no
    var fl = 3.5
    // now this is by defalult inferred as the double
    // to convert it into the float you can add the f in capital or small
    // after the number 2.5f like this



    // for storing the char value write it in the single quote
    // then only it will store the no in the char

    val ch:Char = 'V'
    println(ch)
//    var ch = 'ch' now this value becomes string store it in doulbe quotes



    val boolTrue:Boolean = true
    println(boolTrue)

    val boolFalse: Boolean = false
    println(boolFalse)


    val a = 10
    val b = 29

    var result = a + b
    println(result)

    result = b - a
    println(result)

    result = b * a
    println(result)

    result = b / a
    println(result)

    result = b % a
    println(result)



    var x = 0
    println(x)
    println(x++)
    println(++x)


    val isActive = false

    if(isActive){
        println("Hallo! Ich heiße Vrushabh")
    }else{
        println("youre not a vrushabh")
    }

    println("Enter the no to check:")
    val myNumber = readLine()?.toIntOrNull()
    if (myNumber != null) {
        if(myNumber <= 100){
            println("Valid marks")
            println("you got $myNumber marks ")
        }else if(myNumber != 150 ){
            println("Ther number is not equal to 150")
        }else{
            println("the num is greater than 100 ")
        }
    }else{
        println("the no is null")
    }

//    •	readLine() returns a String? (nullable string). That means it might give you:
//    •	The text the user typed
//    •	Or null (for example, if input stream is closed)
//    •	By writing ?.toIntOrNull(), you’re saying:
//    •	“If readLine() gave me a non-null string, try to convert it to an Int.”
//    •	“If readLine() gave me null, just skip the conversion and keep the result as null.”
//
//    So, without the ?, you’d risk a NullPointerException if readLine() was null. With the ?, Kotlin safely avoids that.

    val isA = false

    if(!isA){
        println("the val is false ")
    }else{
        println("the val is true")
    }


    val active = true
     val score = 90

    if (active && (score == 90))
        println("Game is active and the score is 90")
    else if (active || (score == 90))
        println("Game is active or the score is 90 or the both can be also true")



    //To avoid the null pointer exception kotlin has beutifully managed it by the quesion mark like below
    var str:String? = "something"
    //now this something should not be null but if we add the question mark then it can be null also
    var str12:String? = "something 1 "
    //just like this
    if(str12 != null){
        println(str12.length)
    }else{
        println("the str12 is null")
    }

    //And the shorter way to implement the safe call operator is to

    // this is the opearing as the if the str is null then print or say null if not so then only try to print the output
    println(str?.length)// this is the equivalet to the if stmt that we have previously to check whether the str is null of not


//    val ws:String? = null
//    println(ws!!.length)
    // this above line of code is saying that if the str is null then throw the exception and if not so then print the output


    var text1:String? = null
    var text2 = text1 ?: "Something new"
    //If this var text1 is null then assign the "something new " to it(text2) and if not so
    // then assign the text1 value to the text2

    println(text2)
    println(text2.length)

    // the longer way to doing the same thing is

    if(text1 != null){
        text2= text1
    }else{
        text2 = "Something new"
    }
    println(text2)
    println(text2.length)

    sayHello("Vrushabh", 19)
    val hasInternetConnection = false

    if(hasInternetConnection){
        getData("hello data is here")
    }else{
        showMsg()
    }

    val max = getMax(10,10)
    if (max!= null)
        println("The max of two nos is : $max")
    else println("both are the same")




    defParaExamFun("Vrushabh"," la al lala ajdfajdofasojfasdi")
    defParaExamFun()
}
fun sayHello(name: String, age:Int){
    println("Hello, $name! You're age is $age")
}
fun getData(data:String){
    println("You're data is : $data")
}
fun showMsg(){
    println("There is no internet connection")
}

fun getMax(a:Int, b:Int) :Int?{
//    if (a>b){
//        println("A is the greatest")
//    }else if (b>a){
//        println("B is the greatest")
//    }else{
//        println("Both must be the same")
//    }
//    val max: Int? = if (a>b) a else if (b>a) b else null
//    return max
    return if (a>b) a else if (b>a) b else null
}

//this is the shorter way to return the funtion values like this direcly writing equal to and then write what you want to return
fun getMin(a:Int, b:Int):Int? = if (a<b) a else if (b<a) b else null

fun defParaExamFun(name: String = "ritu", msg: String="hello how are you"){
    println("Hello $name. This is the msg for you: $msg")
}