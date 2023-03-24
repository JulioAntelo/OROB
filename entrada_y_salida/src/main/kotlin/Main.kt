package ficheros

import java.io.File
import java.lang.Math.abs
import java.util.*
fun main(){

    var menu = 0

    println("que desea hacer? Pulse: \n 1 si quiere borrar un fichero \n 2 si quiere crear un fichero \n 3 si quiere mover un fichero \n 4 si quiere cerrar el programa \n los ficheros son los siguientes:")
    val file = ("5_archivos/")
    val fileList = listOf("Ejercicios.pdf","hola.odt","Alumno.zip","sumadigitos.py","traslados.pdf")
    val filePathList = mutableListOf<File>()
    for(item in fileList){
        val fullpath = File("$file$item")
        filePathList.add(fullpath)
    }
    filePathList.sortBy { it.length() }

    for(items in filePathList){
        //val Date = Date(items.lastModified())

        println("Nombre : ${items.name} Ultima modificacion : ${items.length()}")
    }
    println(" ")
    println("------------")
    println("------------")
    println("------------")
    println(" ")
    filePathList.sortBy { it.lastModified() }

    for(items in filePathList){

        val ultimaModificacionFecha = Date(items.lastModified())

        println("Nombre : ${items.name} Ultima modificacion : ${ultimaModificacionFecha}    ${items.lastModified()} ")
    }

    var diferenciaMinima=abs(filePathList[0].lastModified()-filePathList[1].lastModified())
    var diferenciaActual=diferenciaMinima
    var posicionDiferenciaMinima=0
    for (i in (1..filePathList.size-2)){
        diferenciaActual= abs(filePathList[i].lastModified()-filePathList[i+1].lastModified())
        if (diferenciaActual<diferenciaMinima){
            diferenciaMinima= diferenciaActual
            posicionDiferenciaMinima=i

        }
    }
    println("cercanos")
    println(diferenciaActual)

    println(filePathList[posicionDiferenciaMinima].name)
    println(filePathList[posicionDiferenciaMinima+1].name)
    /*
    fun diference(first:Date,second:Date){
        var differnce = first.rangeTo(second)
        var smallest = 1000
        if (differnce < smallest){
            smallest = differnce
        }


    }

     */


}