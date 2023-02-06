package Herencia_Persona

class Trabajador: Persona {
    protected var fechaContrato: String ="00/00/0000"
        get():String{
            return field
        }
        set(valor:String){
            if (valor.length<=10){
                field=valor
            }
        }
    protected var sueldoBase: Double = 0.0
        get():Double{
            return field
        }
        set(valor:Double){
            if (valor >0){
                field=valor
            }
        }
    protected var baseExtras: Double = 0.0
        get():Double{
            return field
        }
        set(valor:Double){
            if (valor >0){
                field=valor
            }
        }
    protected var numHorasExtra: Int = 0
        get():Int{
            return field
        }
        set(valor:Int){
            if (valor >0){
                field=valor
            }
        }
    constructor(numdni: String, nomb: String, apell: String,fecha: String, sueldo: Double, baseext: Double, totalExtra: Int): super(numdni,nomb ,apell){
        fechaContrato=fecha
        sueldoBase=sueldo
        baseExtras=baseext
        numHorasExtra=totalExtra
    }
    fun calcularSueldo():Double{
        return sueldoBase+(baseExtras*numHorasExtra)
    }
}