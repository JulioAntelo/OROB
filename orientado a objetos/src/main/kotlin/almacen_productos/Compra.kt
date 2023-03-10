class Compra (lista:MutableList<Producto>){
    var listaPro:MutableList<Producto>
        get():MutableList<Producto>{
            return field
        }
    var listaCompra:MutableList<LineaCompra> = mutableListOf(LineaCompra())

    init{
        listaPro=lista

    }
    constructor():this(mutableListOf()){
        this.listaPro= mutableListOf()
    }
    fun mostrarCompra(){
        println("""----------------------
            LISTA DE LA COMPRA:
        """.trimIndent())
        for(x in this.listaPro){
            x.mostrarProducto()
        }
    }
    fun calcularPrecio(){
        var total=0.0
        for(x in this.listaCompra){
            total+=x.producto.calcular(x.cantidad)
            x.producto.mostrarProducto()
            println("""
                Unidades-->${x.cantidad.toString()}
                subtotal-->${x.producto.calcular(x.cantidad)}
            """.trimIndent())
        }
        println("""
            ----------------------------------------
            El total de su compra es de $total euros.
            ----------------------------------------
        """.trimIndent())
    }
    fun comprarProducto(producto: Producto){
        println("Dime la cantidad que quieres comprar:")
        var cant= readln().toInt()
        var lineaTemp=LineaCompra(cant,producto)
        listaPro.add(producto)
        listaCompra.add(lineaTemp)

    }
}