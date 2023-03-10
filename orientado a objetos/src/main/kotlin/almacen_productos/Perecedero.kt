class Perecedero : Producto {
    var diasParaCaducar:Int=1
        get():Int{
            return field
        }
        set(valor:Int){
            if(valor>0){
                field=valor
            }
        }
    constructor(name:String,cost:Double,days:Int):super(name,cost){
        this.nombre=name
        this.precio=cost
        this.diasParaCaducar=days

    }
    constructor():super(){
        this.diasParaCaducar=1
    }

    override fun mostrarProducto() {
        super.mostrarProducto()
        println("""
            Caduca en: ${this.diasParaCaducar} días
        """.trimIndent())
    }

    override fun muestralista(): String {
        return super.muestralista()+"----- Caduca en ${this.diasParaCaducar} días"

    }

    override fun calcular(cant: Int): Double {
        when(this.diasParaCaducar){
            1->return cant*(precio*0.25)
            2->return cant*(precio*0.33)
            3->return cant*(precio*0.5)
            else->return super.calcular(cant)
        }
    }
}