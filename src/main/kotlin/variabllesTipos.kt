fun main(){
    //Variables y tipos de datos kotoin
    // val para constantes
    // Var para variables

    val  name = "Juan Manuel "
    var age = 39
    print(" Hola me llamo" + name + "y rengo ")
    print("" + age + "años" )

    // name ="Juan mauel " las variables val no se cambian (inmutables)
    age =19
    age = age + 19

    // age "Diez" Variables var cambian de valor pero no

    // Especificar Tipo de dato en declaraciones
    //Declaraciones
    val city:String
    //inicializar
    city =" Huamantla"
    //Declaraciones  e inicializacion
    val isMarried: Boolean = false

    val children:Int =0
    val height:  Double = 1.68

    print(isMarried)
    println(hello)


    //String Tempkates
    //$ para imprimir valor de variables
    //$() para imprimir antes de imprimir

    println("Hola  soy $name Y tengo $age años")
    print("Vivo en $city, tengo $children hijos")
    print("En 2030 tendre ${ children + 3} titulos ")


}