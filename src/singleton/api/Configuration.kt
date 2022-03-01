package singleton.api

data class Configuration(
    private val properties: Map<String, String>
) {

    // AO USAR A PALAVRA RESERVADA (object) O COMPLIADOR CRIA UM CONSTRUTOR PRIVADO GARANTINDO O PADRÃO
    object Config {
        fun getInstance(properties: Map<String, String>): Configuration {
            return Configuration(properties)
        }
    }

    fun getProperties(propertiesName: String): String? {
        val configuration = Config.getInstance(this.properties)
        return configuration.properties[propertiesName]
    }

    override fun equals(other: Any?): Boolean {
        val otherObject = other as? Configuration ?: return false
        return otherObject.properties == properties
    }

    override fun hashCode(): Int = properties.hashCode() * 31

}