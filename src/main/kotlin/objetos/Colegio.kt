package objetos

class Colegio(var cod: Int, var nombre: String,var clases: ArrayList<Clase>) {
    constructor(nombre: String) : this(numCod++, nombre, ArrayList())

    companion object {
        var numCod = 300
    }

    override fun toString(): String {
        return "Colegio(cod=$cod, nombre='$nombre')"
    }


}