class alumno( dni:String, edad:Int) {
    var nota_trimestre1 = -1
        get() :Int{
            return field
        }
        set (valor:Int){
            if (valor>=0 && valor<=10){
                field = valor
            }
        }
    var nota_trimestre2 = -1
        get() :Int{
            return field
        }
        set (valor:Int){
            if (valor>=0 && valor<=10){
                field = valor
            }
        }
    var nota_trimestre3 = -1
        get() :Int{
            return field
        }
        set (valor:Int){
            if (valor>=0 && valor<=10){
                field = valor

            }
        }
    var edad = edad
        get() :Int{
            return field
        }
        set (valor:Int){
            if (valor>=0){
                field = valor
            }
        }
    var dni = dni
        get() :String{
            return field
        }
        set (valor:String){
            if (valor.length  == 9){
                field = valor
            }
        }
    fun nota_final():Int{
        if(nota_trimestre1==-1 ||nota_trimestre2==-1 ||nota_trimestre3==-1 ){
            return -1
        }else
            return((nota_trimestre1+nota_trimestre2+nota_trimestre3)/3)
    }

    override fun toString(): String {
        return  "alumno(dni: $dni , edad: $edad, notatrimestre1: $nota_trimestre1, notatrimestre2: $nota_trimestre2, notatrimestre3: $nota_trimestre3)"
    }
    fun informe_alumno(){
        print("${toString()} la media es: ${nota_final()}")
    }
}