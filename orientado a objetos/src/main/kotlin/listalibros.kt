class Listalibros (nummaxlibros : Int ){
    var listalibros = mutableListOf<libro>()
    var maxLibros = 3
        get() {
            return field
        }
        set(value) {
            if (value<1){
                println("no hay suficientes libros")
            }
            else{
                field = value
            }
        }
    init {
        maxLibros = nummaxlibros

    }
    constructor(nummaxlibros: Int, listainicial:MutableList<libro>):this(nummaxlibros){
        //listalibros = listainicial
        for (libroactual in listainicial){
            val nuevolibro = libro(libroactual)
            listainicial.add(nuevolibro)
        }
    }

    fun aniadir(libroactual){
        listalibros.add(libroactual)
    }
    override fun toString(): String {
        val cadenalibros ="\n"
        for(libroactual in listalibros){
            cadenalibros += libroactual.toString()+"\n"
        }
        return "Listalibros(listalibros=$listalibros, maxlibros=$maxLibros)"
    }


}