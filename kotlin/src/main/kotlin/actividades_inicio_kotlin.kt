import com.sun.jdi.IntegerValue
import java.util.Vector

fun main(args: Array<String>) {

    """    print("cuantas veces quieres repetir la palabra?")
    val repeticiones = Integer.valueOf(readLine())
    print("que palabra quieres repetir?")
    val palabra = readln()

    for (i in 1..repeticiones){
        println(palabra)

    }


    var j=0
    print("cuantos años tienes?")
    val anio = Integer.valueOf(readLine())
    while (j!= anio){

        j++
        println(j)
    }

    var numeros_impares=1
    print("dime un numero")
    val numero=Integer.valueOf(readLine())

    while (numero>=numeros_impares){
        print("numeros_impares ,")
        numeros_impares = numeros_impares+2
        if(numero-numeros_impares<0)
            print("\b")
    }

    print("dime la nota que has sacado: ")
    val nota=Integer.valueOf(readLine())
    when (nota){
        1,2,3,4 -> print("suspenso")
        5 -> print("aprobado")
        6 -> print("bien")
        7,8 -> print("notable")
        9,10 -> print("sobresaliente")
    }
    print("¿Cuánto dinero quieres invertir? ")
    val cantidad = readLine()!!.toDouble()
    print("¿Qué interés anual tienes en mente? ")
    val interes = readLine()!!.toDouble()
    print("¿Durante cuántos años quieres invertir? ")
    val anios = readLine()!!.toInt()

    for (i in 1..anios) {
        val interesAnual = cantidad * interes / 100
        cantidad += interesAnual
        println("Después del año i, tendrás cantidad.")
    }

    val palabra = readLine()!!.toString()
    var invertida = palabra.reversed()
    if (palabra==invertida){
        print("es capicua")
    }else{
        print("no es capicua")
    }
    print("\n")
    var frase = readLine()!!.toString()
    frase = frase.trim()
    var frase_inv = frase.reversed()
    if (frase==frase_inv){
        print("es capicua")
    }else{
        print("no es capicua")
    }"""

    //arrays -- clase del dia 16/12/2022
    """    var tamano = readln()!!.toInt()
    var miArray = DoubleArray(tamano,{0.0})
    var i=0
    for ((tamano, valor) in miArray.withIndex()){
        miArray[i] = readLine()!!.toDouble()
        i++
    }
    println("{miArray.contentToString()}")


    var arrayrandom = IntArray(5)
    for (i in arrayrandom.indices){
        arrayrandom[i] = (0..90).random()
    }
    var mayor=0
    var menor=91
    for (i in arrayrandom){
        if (i>mayor){
            mayor=i
        }
    }
    for (i in arrayrandom){
        if (i<menor){
            menor=i
        }

    }
    println("{arrayrandom.contentToString()}  mayor menor")

    //clase del dia 19/12/2022

    var vector  = IntArray(10)

    for (i in vector.indices){
        vector[i] = (0..10000).random()

        }
    var par =""
    var impar =""
    for (n in vector){
        if (n%2 ==0){
            par += n.toString()+" "
        }else{
            impar += n.toString()+" "
        }
    }
    println("los numeros pares son:  par  \nlos numeros impares son:  impar")

    var miArray= arrayOf<Char>('a','a','a','a','a')
    print("introduce los caracteres")
    for ( i in miArray.indices){

        miArray[i]= readLine()!![0]
        print(miArray)
    }
    var array6 = IntArray(10)
    var contador = 0
    var arrayposicion = IntArray(10)
    while (contador<10){
        println("dime un valor para poner en el array")
        var valor = Integer.valueOf(readLine())
        if (valor<0){
            println("dime otro valor ya que el introducido es menor de lo esperado, este no puede ser negativo")
        }
        println("dime la posicion que quieres que ocupe en el array")
        var posicion = Integer.valueOf(readLine())
        if (posicion<=0 || posicion>=11 || posicion in arrayposicion){
            println("dime la posicion que quiere que ocupe ya que la solicitada no es valida")
            var posicion = Integer.valueOf(readLine())
        }
        arrayposicion[posicion-1] = posicion
        array6[posicion-1] = valor
        contador+=1
    }
    println(array6.joinToString(";"))
    



    val lista : MutableList<Int> = mutableListOf()
    var i = 0
    while (i<5){
        var numeros = Integer.valueOf(readLine())
        lista.add(numeros)
        i++
        if (numeros in lista){
            lista[i-1] = numeros
        }
    }
    for ((index, value) in lista.withIndex()){
        print("\n value")
    }

    val lista = listOf("a", "b", "c", "d", "e")
    for ((index, value) in lista.withIndex()){
        println(value)
        }
        




    val mapa = sortedMapOf("12367845P" to "Antonio Llama", "13862138H" to "Aaaaaaaa", "27652134M" to "dfkajsdhf", "12348521G" to "potato sama", "sip soy un dni" to "no. no tengo nombre")
    for ((key, value) in mapa) {
        println(" key  value")
    }
"""

"""
    val supermercado = mutableMapOf<String, Number>()
    var i = 0
    while(i<12){
        println("A continuacion escribe el producto que quieres y el precio que cuesta.")
        supermercado.put(readLine()!!.toString(), readLine()!!.toDouble())
        i++
    }
    for ((key, value) in supermercado){
        println("el producto key, vale value€")
    }"""

    val supermercado = mutableMapOf("patatas" to 2.23, "alcachofas" to 1.23, "potatoes" to 3.23, )
    var preciototal = 0

    println("que quiere realizar con los productos del mapa --compra--? \n1.- borrar algún precio del producto que elija \n2.- insertar algun nuevo producto con su precio \n3.- actualizar el precio de algun producto \n4.- salir de la compra")
    var decision = Integer.valueOf(readLine())
    while (decision==1 || decision ==2 ||decision ==3 || decision==4){
        if (decision ==1){
            var borrar = readLine()!!.toString()
            supermercado.remove(borrar)
        }

        if (decision ==2){
            
        }
    }

}


































