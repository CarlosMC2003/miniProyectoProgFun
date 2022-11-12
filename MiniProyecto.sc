def simpson(f: Double => Double, a: Int, b: Int) : Double = {

  (b - a) * ((f(a) + (4 * f((a + b)/2)) + f(b))) / 6

}
/*
def simpsonCompuesta(f: Double => Double, a: Int) : Double = {



}*/

val funcion1 = (a: Double) => (-Math.pow(a,2)) + (8 * a) - 12

val funcion2 = (a: Double) => (3 * Math.pow(a,2))

val funcion3 = (a: Double) => (a + (2 * Math.pow(a,2)) - Math.pow(a,3) + (5 * Math.pow(a,4)))

val funcion4 = (a: Double) => ((2 * a) + 1) / (Math.pow(a,2) + a)

val funcion5 = (a: Double) => (Math.pow(Math.E, a))

val funcion6 = (a: Double) => (1 / Math.sqrt(a - 1))

val funcion7 = (a: Double) => (1 / (1 + Math.pow(a, 2)))

simpson(funcion1, 3, 5)

simpson(funcion2, 0, 2)

simpson(funcion3, -1, 1)

simpson(funcion4, 1, 2)

simpson(funcion5, 0, 1)

simpson(funcion6, 2, 3)

simpson(funcion7, 0, 1)
