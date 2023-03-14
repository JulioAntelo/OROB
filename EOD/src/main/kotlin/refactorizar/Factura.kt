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
            var c1 = Compra("si",2,34,12.2)
            listaC.add(c1)
            val f = Factura(listaC)
            println(f.facturar())
        }
    }
}
