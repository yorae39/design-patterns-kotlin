package builder.api

class BilletGenerator {

    fun generate(builder: BilletBuilder): Billet {
        return builder.getBillet()
    }

}