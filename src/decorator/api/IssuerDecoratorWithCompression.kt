package decorator.api

import java.io.ByteArrayOutputStream
import java.io.IOException
import java.util.zip.Deflater
import java.util.zip.DeflaterOutputStream

class IssuerDecoratorWithCompression(
    issuer: Issuer
): IssuerDecorator(issuer) {

    override fun send(message: String) {
        println("Send compression message.")
        val newMessage: String = try {
            compressionMessage(message)
        }catch (e: IOException) {
            message
        }
        this.getIssuer().send(newMessage)
    }

    private fun compressionMessage(message: String): String {
        val output = ByteArrayOutputStream()
        val dOut = DeflaterOutputStream(output, Deflater())
        dOut.write(message.toByteArray())
        dOut.close()
        return String(output.toByteArray())
    }
}