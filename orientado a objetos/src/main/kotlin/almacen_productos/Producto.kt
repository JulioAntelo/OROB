open class Producto(name:String,cost:Double) {
    var nombre: String = name
        get():String{
            return field
        }
        set(valor:String){
            if (valor is String){
                field=valor
            }
        }
    var precio:Double = cost
        get():Double{
            return field
        }
        set(valor:Double){
            if (valor>=0.0){
                field=valor
            }
        }
    constructor():this("producto",0.0)
    open fun calcular(cant:Int):Double{
        return cant*precio
    }

    open fun mostrarProducto(){
        println("""-----------------------------
            |Nombre del producto-->'$nombre'
            |Precio del producto-->$precio""".trimMargin())
    }
    open fun muestralista():String{
        return "${this.nombre} ------>${this.precio}"
    }

}