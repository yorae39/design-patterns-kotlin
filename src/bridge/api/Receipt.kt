package bridge.api

data class Receipt(
    val issuer: String,
    val favoured: String,
    val value: Double,
    val fileGenerator: FileGenerator
): Document {

    override fun fileGenerator() {
        this.fileGenerator.generate(toString())
    }

    override fun toString(): String {
        val sb = StringBuilder()
        sb.append("File receipt :\n")
            .append("\tIssuer             --> ").append(this.issuer)
            .append("\tFavoured           --> ").append(this.favoured)
            .append("\tValue              --> ").append(this.value)

        return sb.toString()
    }

}