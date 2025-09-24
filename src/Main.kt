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


    val isActive = true

    if(isActive){
        println("Hallo! Ich bin Vrushabh")
    }



}