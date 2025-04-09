package mx.edu.itesca.practica14

data class Tarea(
    var id: String = "",
    var titulo: String = "",
    var descripcion: String = ""
) {
    fun toMap(): Map<String, String> {
        return mapOf("titulo" to titulo, "descripcion" to descripcion)
    }
}
