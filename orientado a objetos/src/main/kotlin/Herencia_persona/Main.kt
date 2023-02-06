package Herencia_Persona

fun main(){
    var manolo=Persona("30568745L", "Manuel", "García Ramirez")
    manolo.mostrar()
    var pepetrab=Trabajador("45568978L","Jose", "Lopez García","02/02/20223",1500.50,8.50,10)
    pepetrab.mostrar()
    println("Pepe ha ganado este mes ${pepetrab.calcularSueldo()}")

}