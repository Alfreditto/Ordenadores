package objetos

class Ordenador(var cod: Int, var grafica: String, var procesador: String) {
    constructor(grafica: String, procesador: String) : this(numCod++, grafica, procesador)

    companion object {
        var numCod = 100
    }

    override fun toString(): String {
        return "Ordenador(cod=$cod, grafica='$grafica', procesador='$procesador')"
    }


}