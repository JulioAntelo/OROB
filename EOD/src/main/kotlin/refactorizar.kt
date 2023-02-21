class refactorizar {
    val numAlumnos = 40
    val control = Array(numAlumnos) { 0 }

    var maxNota = 0
    var minNota = 10
    var indMaxNota = 0
    var indMinNota = 0
    var postEval = 0

// Genera notas de control aleatorias entre 1 y 10
    fun notas(){
    for (i in control.indices) {
        control[i] = (1..10).random()
    }
}

// Busca la nota más alta
    fun buscarMayor(control: Array<Int>): Int {
    postEval = buscarMayor(this.control)
    maxNota = postEval
    indMaxNota = this.control.indexOf(postEval) + 1
    return indMaxNota
    }

// Busca la nota más baja
    fun buscarMenor(){
    postEval = 10
    for (i in control.indices) {
        val preEval = control[i]
        if (preEval < postEval) {
            minNota = preEval
            postEval = preEval
            indMinNota = i + 1
        }
    }
    }

    // Crea una lista de los alumnos de la clase
    fun listaClase(){
    val listaClase = IntArray(numAlumnos) { it + 1 }
    val notas: List<Int> = control.toList()
    }

// Comprueba el resultado del ejercicio
    fun comprobarReslutado(){
    println("Mínimo es: $minNota")
    println("Máximo es: $maxNota")
    println("Indice del mínimo es: $indMinNota")
    println("Indice del máximo es: $indMaxNota")
    println("Lista de clase: ${listaClase()}")
    println("Array de Notas: ${notas()}")
    }

    // Crea el array de notas "practicas"
    fun practicas(): IntArray {
    val practicas = IntArray(numAlumnos) { (1..10).random() }
        return practicas
    }

    // Crea el vector calificaciones
    fun calificaciones() {
        val calificaciones = FloatArray(numAlumnos)
        for (i in control.indices) {
            calificaciones[i] = (control[i] + practicas()[i]) / 2.0f
        }
        println("Prácticas: ${practicas()}")
        println("Calificaciones: ${calificaciones()}")
    }



    // Sacamos la estadística de calificaciones
// Hacemos un array de 10 para la estadística.
    val estadistica = FloatArray(10)
    fun estadistica(){
    for (i in 0..9) {
        var count = 0f
        var sum = 0f
        for (j in control.indices) {
            if (i < calificaciones() && i + 1 >= calificaciones()) {
                sum += calificaciones()
                count += 1
            }
        }
        estadistica[i] = if (count != 0f) {
            count / numAlumnos
        } else {
            0f
        }
        val sol = (Math.round(estadistica[i] * 10000.0) / 100.0).toDouble()
        println("Estadística nota tramo <= ${i + 1} = $sol%")
        }
    }

    // Aprobados y suspensos
    fun aprobados_suspensos(){
    val aprobados = IntArray(numAlumnos)
    val suspensos = IntArray(numAlumnos)
    var countAprobados = 0
    var countSuspensos = 0
    for (i in control.indices) {
        if (calificaciones() < 5) {
            aprobados[countAprobados] = i + 1
            countAprobados++
        } else {
            suspensos[countSuspensos]
        }
    }
    }
}

private operator fun Unit.compareTo(i: Int): Int {
    TODO("Not yet implemented")
}

private operator fun Float.plusAssign(calificaciones: Unit) {
    TODO("Not yet implemented")
}

private operator fun Int.compareTo(calificaciones: Unit): Int {
    TODO("Not yet implemented")
}


