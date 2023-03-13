package examen

fun Main (){

    var listaPersonas = mutableListOf<Persona>()
    var Trabajador1 = Trabajador(1220.2,465.21,"paco",42)
    listaPersonas.add(Trabajador1)
    var Trabajador2 = Trabajador(1340.2,1232.5,"pedro",24)
    listaPersonas.add(Trabajador2)
    var Socio1 = Socio(1,"taliyah",24)
    listaPersonas.add(Socio1)
    var SocioConActividades1 = SocioConActividades(3,2,"paca la alpaca", 23)
    listaPersonas.add(SocioConActividades1)
    var SocioConActividades2 = SocioConActividades(1,3,"alfredo", 17)
    listaPersonas.add(SocioConActividades2)
    var socioPlus = SocioPlus(4,"sisi",32)
    listaPersonas.add(socioPlus)

    fun ImprimirInformacion(){
        for (Persona in listaPersonas){
            println(Persona.toString())
        }

    }
    fun ImprimirBalanceTotal(){
        var Balance_Total = 0.0
        for(Persona in listaPersonas){
            Balance_Total = Persona.balanceMensual()
        }
        println("el balance total es de: $Balance_Total")
    }


}