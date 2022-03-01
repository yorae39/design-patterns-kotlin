package singleton.api

class FileProperties {

    fun returnProperties(): Map<String, String> {
        val properties = mutableMapOf<String, String>()
        properties["time-zone"] = "America / Sao_Paulo"
        properties["currency-code"] = "BRL"
        return properties
    }
}