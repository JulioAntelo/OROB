package examen

open class Persona(Nombre: String, Edad:Int) {

    var Name = Nombre
    var Age = Edad
        set(value) {
            if (value<16){
                println("no puedes entrar, ya que no pasas la edad minima")
            }else{
                field=value
            }
        }
    open fun balanceMensual(): Double{
        return TODO("Provide the return value")
    }

    override fun toString(): String {
        return "Persona(Name='$Name', Age=$Age)"
    }

}