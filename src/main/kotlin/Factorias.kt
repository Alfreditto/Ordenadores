import objetos.Clase
import objetos.Colegio
import objetos.Ordenador

object Factorias {
    //objetos.Ordenador
    fun ordenadorAMD() = Ordenador("Radeon", "Ryzen")
    fun ordenadorIntel() = Ordenador("Nvidia", "Intel")

    //Clases
    fun claseInformatica() = Clase("Programación")
    fun claseFinanzas() = Clase("Contabilidad")

    //Colegios
    fun colegioDeCalidad() = Colegio("Virgen de Gracia")
    fun colegioNormal() = Colegio("Colegio cutre")
}