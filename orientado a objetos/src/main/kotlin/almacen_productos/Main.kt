fun Main() {
    val producto1=Producto("Azúcar",1.0)
    val producto2=Perecedero("Yogourt",2.0,5)
    val producto3=Noperecedero("Sal",1.5,"condimento")
    val producto4=Perecedero("leche", 1.3,7)
    val producto5=Noperecedero("Servilletas", 0.50,"Higiene")

    fun menuCliente(){
        println("""
            ------------------------------------------------------------------
            BIENVENIDO A LA TIENDA ESTE ES EL LISTADO DE PRODUCTOS DISPONIBLES
            ${producto1.muestralista()}
            ${producto2.muestralista()}
            ${producto3.muestralista()}
            ${producto4.muestralista()}
            ${producto5.muestralista()}
            
            POR FAVOR ELIJA QUE DESEA HACER:
            1-->AÑADIR UN PRODUCTO A SU CESTA
            2-->QUITAR UN PRODUCTO DE SU CESTA
            3-->CALCULAR EL TOTAL DE SU COMPRA
        """.trimIndent())


    }
    var miCompra=Compra()
    miCompra.comprarProducto(producto1)
    miCompra.comprarProducto(producto2)
    miCompra.comprarProducto(producto3)
    //miCompra.mostrarCompra()
    miCompra.calcularPrecio()
}