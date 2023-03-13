package examen

class Trabajador(sueldo:Double,seguroSocial:Double,Nombre: String, Edad:Int):Persona(Nombre,Edad){

    var sueldo = sueldo
        set(value) {
            if (value<=500){sueldo = 1000.0}
            else{field=value}
        }
    var seguroSocial = seguroSocial
    val Nombre = Nombre
    val Edad= Edad

    override fun balanceMensual(): Double {
        return -(sueldo+seguroSocial)
    }

    override fun toString(): String {
        return "Trabajador(sueldo=$sueldo, seguroSocial=$seguroSocial, Nombre='$Nombre', Edad=$Edad)"
    }


}