fun main(args: Array<String>) {
    val numero = Integer.valueOf(readLine())

    val result = if(numero>=5){
       "aprobado"
    }else{
        "suspenso"
    }
    println(result)


    val NOMINA = Integer.valueOf(readLine())
    val GASTOS = Integer.valueOf(readLine())
    val SALDO = NOMINA  - GASTOS
    val resultado = if(SALDO>=0){

       println("ENHORABUENA tienes "+SALDO)
    }else{
        "NUMEROS ROJOS"
    }
    println(resultado)
}