package port

import com.charleskorn.kaml.Yaml
import domain.entity.Book
import java.io.File

class FileReader: IFireReader {
    override fun getBook(path: String): Book {
        val file = File(path)
        val inputText = file.readText()
        return Yaml.default.decodeFromString(Book.serializer(), inputText)
    }

    override fun saveBook(path: String, book: Book) {
        val file = File(path)
        val outputText = Yaml.default.encodeToString(Book.serializer(), book)
        file.writeText(outputText)
    }
}