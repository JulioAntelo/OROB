fun main(){
    val bonoloto = mutableSetOf<Int>()
    var i=0
    while (i<5){
        var numero_nuevo = Integer.valueOf(readLine())
        if (numero_nuevo in bonoloto){
            numero_nuevo = Integer.valueOf(readLine())
        }else{
            bonoloto.add(numero_nuevo)
        }
        i++
    }
}