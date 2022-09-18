package objetos

class Clase(var cod: Int, var curso: String, var ordenadores: ArrayList<Ordenador>) {
    constructor(curso: String) : this(numCod++, curso, ArrayList())

    companion object {
        var numCod = 200
    }

    override fun toString(): String {
        return "Clase(cod=$cod, curso='$curso')"
    }

}