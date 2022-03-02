package object_pool.api

data class Employee(
    val name: String
){
    override fun toString(): String {
        val sb = StringBuilder()
        sb.append("Employee :\n")
            .append("\tName            --> ").append(this.name).append("\n")
        return sb.toString()
    }
}