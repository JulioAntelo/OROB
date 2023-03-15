package examen_refactorizar

fun main() {
    /**
     * He quitado la variable de tipo ya que por cada tipo de embarcación
     * puede ser un objeto con diferentes cualidades, haciendo que alguna
     * de estas sean iguales y otras no, por lo tanto todas heredan de la
     * clase embarcación en la cual he creado el método CalcularCosteTotal
     * para ver el coste de la embarcación en funcion de las horas seleccionadas
     * para concluir he añadido un toString a cada uno para ver sus datos ya que
     * la funcion anterior presentaba problemas de codigo duplicado principalmente
     */
    var kayak1=kayak(5)
    kayak1.toString()
    kayak1.CalcularCosteTotal(7)
    var hidropedales1 = hidropedales(4)
    hidropedales1.toString()
    hidropedales1.CalcularCosteTotal(7)
}
