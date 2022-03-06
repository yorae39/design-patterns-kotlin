package adapter.api

data class Employee(
    val name: String
){
    override fun toString(): String {
        val sb = StringBuilder()
        sb.append("Billet of Banco do Brasil :\n")
            .append("\tPayer           --> ").append(this.name)

        return sb.toString()
    }
}