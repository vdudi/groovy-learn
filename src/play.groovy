'''class play {

}'''

println( "leanring Groovy")

// variables

var x = 5
println(x)
x = "str"
println(x)

// loops

 //0.upto(5) {println("$it")}

 //5.times {println("$it")}

0.step(9,2,{println("$it")})

// Decision Making
int y = 5
if(y ==3){
    print("if Y - ${y}")
} else {
    println("else Y - ${y}")
}

// List

def z = ["vd", "ps", "sd", "srd"]
println z
z.add("rd")
println(z.contains("vd"))
println(z.get(2))
println(z.reverse())

// Maps

def m = [fname:'vam', lname:'d', city:'ny']
println(m)
println(m.get("fname"))

// Closures

def myC ={
    println(" my closure")
}
myC()

def add = {
    a,b,c ->
        d= a+b+c
        println("addition of ${a},${b},${c} is ${d}")
}
add(1,2,3)

