fun main(args: Array<String>) {
    var libro1 = libro()
    libro1.autor = "petete"
    libro1.titulo = "el libro gordo"
    libro1.puntuacion = 7
    libro1.num_paginas = 345

    var libro2 = libro()
    libro2.autor = "petete"
    libro2.titulo = "el libro gordo"
    libro2.puntuacion = 7
    libro2.num_paginas = 345

    var libro3 = libro()
    libro3.autor = "petete"
    libro3.titulo = "el libro gordo"
    libro3.puntuacion = 7
    libro3.num_paginas = 345


    println("este es un menu para seleccionar lo que quieres hacer:\n 1 .- si quiere mostrar la informacion del libro. \n 2.- si quiere modificar algun dato sobre el libro. \n 3.- si quiere salir del programa")

    var seleccion = readLine()!!.toInt()
    while (true){
        when (seleccion){
            1 ->libro1.imprimir_info()
            2 ->libro1.modificar_info()
            3 ->break
        }
        seleccion = readLine()!!.toInt()
    }
}
