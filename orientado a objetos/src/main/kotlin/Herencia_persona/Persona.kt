package Herencia_Persona

open class Persona(){
    protected var DNI: String ="123456789X"
        get():String{
            return field
        }
        set(valor:String){
            if (valor.length<=10){
                field=valor
            }
        }
    protected var nombre: String =" "
        get():String{
            return field
        }
        set(valor:String){
            if (valor.length <=20)
                field=valor
        }
    protected var apellidos: String = " "
        get():String{
            return field
        }
        set(valor:String){
            if (valor.length <=50)
                field=valor
        }
    constructor(numdni: String, nomb: String, apell: String):this(){
        this.DNI=numdni
        this.nombre=nomb
        this.apellidos=apell
    }
    fun mostrar(){
        println("""
            DNI: ${this.DNI}
            Nombre: ${this.nombre}, ${this.apellidos}
        """.trimIndent())
    }
}