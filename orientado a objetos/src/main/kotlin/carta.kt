
class Carta(numero: Int, palo: Char) {
    var numero: Int = 0
        set(value) {
            if (value !in 1..13) {
                println("Numero de carta inválido.")

            } else
                field = value
        }
        get() {
            return field
        }
    var palo: Char = ' '
        set(value) {
            //'C','P', 'R', 'T'
            val l = listOf<Char>('C', 'P', 'R', 'T')

            if (value !in l) {
                println("Palo de carta inválido.")
            } else
                field = value
        }
        get() {
            return field
        }
    /*
        init {
            this.numero = numero
            this.palo = palo
        }
    */
    constructor(otraCarta: Carta) : this(otraCarta.numero, otraCarta.palo) {
    }

    fun mostrarCarta() {
        var paloMostrar = ""
        var numeroMostrar = ""
        when {
            palo == 'C' -> paloMostrar = "Corazones"
            palo == 'P' -> paloMostrar = "Picas"
            palo == 'R' -> paloMostrar = "Rombos"
            palo == 'T' -> paloMostrar = "Trebol"
        }
        when {
            numero == 1 -> numeroMostrar = "As"
            numero in (2..10) -> numeroMostrar = numero.toString()
            numero == 11 -> numeroMostrar = "Jack"
            numero == 12 -> numeroMostrar = "Reina"
            numero == 13 -> numeroMostrar = "Rey"
        }
        println("$numeroMostrar de $paloMostrar.")
    }

    fun compararCarta(otraCarta: Carta) {
        var numero2 = this.numero
        var palo2 = this.palo
        if (numero > numero2) {
            print("La carta mayor es: ")
            mostrarCarta()
        } else if (numero < numero2) {
            print("La carta mayor es: ")
            mostrarCarta()
        } else {
            if (palo > palo2) {
                print("La carta mayor es: ")
                mostrarCarta()
            } else {
                print("La carta mayor es: ")
                mostrarCarta()
            }
        }
    }
}
