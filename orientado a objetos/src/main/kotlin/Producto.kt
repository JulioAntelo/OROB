import kotlin.random.Random

class Producto (nombre:String, serie:Int, Precio:Double) {

    var name = nombre
    var serie = serie
    var precio = Precio
        set(value) {
            if (value<0){
                println("el precio introducido no puede ser menor de 0.")
            }else{
                field = value
            }
        }

    var random = Random(1)
    override fun toString(): String {
        return "Producto(name='$name', serie=$serie, precio=$precio, random=$random)"
    }


}