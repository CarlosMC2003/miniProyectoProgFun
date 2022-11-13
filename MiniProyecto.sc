def simpson(f: Double => Double, a: Int, b: Int) : Double = {

  (b - a) * ((f(a) + (4 * f((a + b)/2)) + f(b))) / 6

}

def simpsonCompuesta(f: Double => Double, a: Double, b : Double, n : Int) : Double = {

  def xj (a: Double, j: Double, h: Double ): Double = {
    a + j * h
  }
  val h = (b - a) / n

  (h/3) * (1 to n / 2).toList.map(
    x => f(xj(a, 2 * x - 2, h)) + 4 * f(xj(a, 2 * x - 1, h))
      + f(xj(a, 2 * x, h))).sum

}

def simpsonExtendida(f: Double => Double, a: Double, b : Double) : Double = {

  def n = {
    2 * (b - a)
  }
  val h = (b - a) / n

  (h/3) * (f(a) + 4 * (1 to n.toInt - 1).toList.map(
    x => f(a + x * h)).sum + 2 * (1 to n.toInt - 2).toList.map(x => f(a + x * h)).sum
    + f(b) )

}

val funcion1 = (a: Double) => (-Math.pow(a,2)) + (8 * a) - 12

val funcion2 = (a: Double) => (3 * Math.pow(a,2))

val funcion3 = (a: Double) => (a + (2 * Math.pow(a,2)) - Math.pow(a,3) + (5 * Math.pow(a,4)))

val funcion4 = (a: Double) => ((2 * a) + 1) / (Math.pow(a,2) + a)

val funcion5 = (a: Double) => (Math.pow(Math.E, a))

val funcion6 = (a: Double) => (1 / Math.sqrt(a - 1))

val funcion7 = (a: Double) => (1 / (1 + Math.pow(a, 2)))

println("SIMPSON 1/3")
simpson(funcion1, 3, 5)

simpson(funcion2, 0, 2)

simpson(funcion3, -1, 1)

simpson(funcion4, 1, 2)

simpson(funcion5, 0, 1)

simpson(funcion6, 2, 3)

simpson(funcion7, 0, 1)

println("SIMPSON COMPUESTA")
simpsonCompuesta(funcion1, 3, 5, 20)

simpsonCompuesta(funcion2, 0, 2, 20)

simpsonCompuesta(funcion3, -1, 1, 20)

simpsonCompuesta(funcion4, 1, 2, 20)

simpsonCompuesta(funcion5, 0, 1, 20)

simpsonCompuesta(funcion6, 2, 3, 20)

simpsonCompuesta(funcion7, 0, 1, 20)

println("SIMPSON EXTENDIDA")
simpsonExtendida(funcion1, 3, 5)

simpsonExtendida(funcion2, 0, 2)

simpsonExtendida(funcion3, -1, 1)

simpsonExtendida(funcion4, 1, 2)

simpsonExtendida(funcion5, 0, 1)

simpsonExtendida(funcion6, 2, 3)

simpsonExtendida(funcion7, 0, 1)