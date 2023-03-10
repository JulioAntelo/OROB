class Noperecedero:Producto {
    var tipo: String = "aleatorio"
        get():String{
            return field
        }
        set(valor:String){
            if (valor is String){
                field=valor
            }
        }
    constructor(name:String,cost:Double,type:String):super(name,cost){
        this.nombre=name
        this.precio=cost
        this.tipo=type

    }
    constructor():super(){
        this.tipo="aleatorio"
    }
    override fun mostrarProducto() {
        super.mostrarProducto()
        println("""
            Tipo de producto--> ${this.tipo} 
        """.trimIndent())
    }

    override fun muestralista(): String {
        return super.muestralista()+"------- tipo de producto-->${this.tipo}"
    }

}
