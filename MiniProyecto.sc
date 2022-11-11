def integracion(f: Double => Double, a: Double, b: Double) : Double = {

  (b - a) * ((f(a) + (4 * f((a + b)/2)) + f(b))) / 6

}

val funcion1 = (a: Double) => (-Math.pow(a,2)) + (8 * a) - 12

val funcion2 = (a: Double) => (3 * Math.pow(a,2))

val funcion3 = (a: Double) => (a + (2 * Math.pow(a,2)) - Math.pow(a,3) + (5 * Math.pow(a,4)))

val funcion4 = (a: Double) => ((2 * a) + 1) / (Math.pow(a,2) + a)

val funcion5 = (a: Double) => (Math.pow(Math.E, a))

val funcion6 = (a: Double) => (1 / Math.sqrt(a - 1))

val funcion7 = (a: Double) => (1 / (1 + Math.pow(a, 2)))

val resul1 = integracion(funcion1, 3, 5)

val resul2 = integracion(funcion2, 0, 2)

val resul3 = integracion(funcion3, -1, 1)

val resul4 = integracion(funcion4, 1, 2)

val resul5 = integracion(funcion5, 0, 1)

val resul6 = integracion(funcion6, 2, 3)

val resul7 =integracion(funcion7, 0, 1)

def calcularError(a : Double, b : Double) : Double = Math.abs(b - a)

calcularError(7.33, resul1)

calcularError(8, resul2)

calcularError(3.333, resul3)

calcularError(1.09861, resul4)

calcularError(1.71828, resul5)

calcularError(0.828427, resul6)

calcularError(0.785398, resul7)