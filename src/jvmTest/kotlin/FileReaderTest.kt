import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import port.FileReader

class FileReaderTest {
    @Test
    @DisplayName("保存したYamlから値が取得できるか")
    fun test001(){
        val fileReader = FileReader()
        val test = fileReader.getBook("src/jvmTest/resources/test_in/test001.gr")
        Assertions.assertEquals(test.textContents[0].value , "1.こんばんはこんばんは")
    }
}