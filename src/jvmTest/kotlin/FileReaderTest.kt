import domain.entity.Book
import domain.entity.Sentence
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import port.FileReader
import java.nio.file.Files
import java.nio.file.Paths

class FileReaderTest {
    @Test
    @DisplayName("保存したYamlから値が取得できるか")
    fun test001() {
        val fileReader = FileReader()
        val test = fileReader.getBook("src/jvmTest/resources/test_in/test001.gr")
        Assertions.assertEquals(test.textContents[0].value , "1.こんばんはこんばんは")
    }

    @Test
    @DisplayName("Yamlに値の保存ができるか")
    fun test002() {
        val path = "src/jvmTest/resources/test_in/test002.gr"
        removeFile(path)
        val fileReader = FileReader()
        val sentence = Sentence("こんばんは！", mutableMapOf("position_x" to 2, "position_y" to 3))
        val book = Book(mutableListOf(sentence), path)
        fileReader.saveBook(path, book)
        val book2 = fileReader.getBook(path)
        Assertions.assertEquals(book2, book)
    }

    private fun removeFile(path: String){
        val path2 = Paths.get(path)
        Files.deleteIfExists(path2)
    }
}