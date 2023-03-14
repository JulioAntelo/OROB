package refactorizar

class Factura(private val listaCompra: List<Compra>) {
    fun facturar(): String {
        var tot = 0.0
        var puntaje = 0
        var ticket = ""
        var valorCompra = 0.0
        val it: Iterator<Compra> = listaCompra.iterator()
        while (it.hasNext()) {
            val compra = it.next()
            when (compra.tipoProd) {
                Compra.HARDWARE -> valorCompra = compra.precioProd * 10.5
                Compra.SOFTWARE -> valorCompra = compra.precioProd * 21
                Compra.OTRO -> valorCompra = compra.precioProd * 5.5
            }
            puntaje++
            if (compra.tipoProd == Compra.HARDWARE && compra.cant > 1) puntaje++

            tot += valorCompra
            ticket += "${compra.nomProd} ${compra.cant} $valorCompra\n"
        }

        ticket += "El total de su compra es $tot\n"
        ticket += "Su puntaje acumulado es $puntaje"
        return ticket
    }

    companion object {
        fun main(args: Array<String>) {
            val listaC: MutableList<Compra> = ArrayList()
            val c1 = CompraBuilder().setNombre("PC").setTipo(Compra.HARDWARE).setCantidad(2).setPrecio(1000).createCompra()
            val c2 = CompraBuilder().setNombre("Antivirus").setTipo(Compra.SOFTWARE).setCantidad(1).setPrecio(150).createCompra()
            val c3 = CompraBuilder().setNombre("Papel").setTipo(Compra.OTRO).setCantidad(5).setPrecio(3).createCompra()

            listaC.add(c1)
            listaC.add(c2)
            listaC.add(c3)

            val f = Factura(listaC)
            println(f.facturar())
        }
    }
}
