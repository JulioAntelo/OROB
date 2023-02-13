package Persona

class Empleado:Persona {
    constructor(DNI:String, nombre:String, apellidos:String,fecha_contrato: String, sueldo_base:Float, base_horas_extra: Float, num_horas_extra:Int):super(DNI, nombre, apellidos)
    var fechaDeContrato = "00/00/0000"
        get():String{
            return field
        }
        set(valor:String){
            if (valor.length == 10)
                field=valor
        }
    var sueldoBase = 0.0
    var baseDeHorasExtra = 0.0
    var numeroDeHorasExtra = 5

    fun calcular_sueldo_empleado():Float{
        return (sueldoBase+(baseDeHorasExtra*numeroDeHorasExtra)).toFloat()
    }
}