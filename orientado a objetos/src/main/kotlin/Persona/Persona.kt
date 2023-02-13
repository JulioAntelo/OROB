package Persona

abstract class Persona(DNI:String, nombre:String, apellidos:String) {

    open var DNI: String ="12345678X"
        get():String{
            return field
        }
        set(valor:String){
            if (valor.length<=9){
                field=valor
            }
        }
    open var nombre: String =" "
        get():String{
            return field
        }
        set(valor:String){
            if (valor.length <=20)
                field=valor
        }
    open var apellidos: String = " "
        get():String{
            return field
        }
        set(valor:String){
            if (valor.length <=50)
                field=valor
        }
    fun mostrar_info(){
        println("""
            DNI: ${this.DNI}
            Nombre: ${this.nombre}, ${this.apellidos}
        """.trimIndent())

    }
}
