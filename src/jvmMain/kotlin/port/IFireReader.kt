package port

import domain.entity.Book

interface IFireReader {
    fun getBook(path: String): Book

    fun saveBook(path: String, book: Book)
}