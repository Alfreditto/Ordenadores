import objetos.Colegio
import kotlin.random.Random

fun main() {
    println(
        """Bienvenidos al programa de gestión de colegios TortuEducation.
        |Seleccione la cantidad de colegios a gestionar, sus aulas y los ordenadores a usar.
    """.trimMargin()
    )
    val numColegios = preguntarCantidad("Colegio")
    val numClases = preguntarCantidad("Clase")
    val numOrdenadores = preguntarCantidad("Ordenador")
    println("El sistema generara todo automáticamente")
    val centros: ArrayList<Colegio> = crearColegios(numColegios)
    crearAulas(centros, numClases)
    crearOrdenadores(centros, numOrdenadores)
    impimirListadoCentros(centros)
}

fun impimirListadoCentros(centros: ArrayList<Colegio>) {
    centros.forEach { colegio ->
        println("-----------------------------")
        println(colegio)
        colegio.clases.forEach { clase ->
            println("\t$clase")
            clase.ordenadores.forEach {
                println("\t\t$it")
            }
        }
    }

}

private fun crearOrdenadores(centros: ArrayList<Colegio>, numOrdenadores: Int) {
    centros.forEach { colegio ->
        colegio.clases.forEach {
            for (i in 0..numOrdenadores) {
                it.ordenadores.add(
                    if (Random.nextInt(
                            0,
                            2
                        ) == 1
                    ) Factorias.ordenadorAMD() else Factorias.ordenadorIntel()
                )
            }
        }
    }
}

private fun crearAulas(centros: ArrayList<Colegio>, numClases: Int) {
    centros.forEach {
        for (i in 0..numClases) {
            it.clases.add(if (Random.nextInt(0, 2) == 1) Factorias.claseFinanzas() else Factorias.claseInformatica())
        }
    }
}

private fun crearColegios(numColegios: Int): ArrayList<Colegio> {
    val centros: ArrayList<Colegio> = ArrayList()
    for (i in 0..numColegios) {
        centros.add(if (Random.nextInt(0, 2) == 1) Factorias.colegioDeCalidad() else Factorias.colegioNormal())
    }
    return centros
}

fun preguntarCantidad(nombreObjeto: String): Int {
    var objeto: Int
    do {
        try {
            println("---------------------------")
            print("Numero de ${nombreObjeto}s: ")
            objeto = readln().toInt()
            if (objeto < 1) println("Mínimo un $nombreObjeto")
        } catch (e: NumberFormatException) {
            println("Numero de colegios no valido")
            objeto = -1
        }
    } while (objeto < 1)
    return objeto
}