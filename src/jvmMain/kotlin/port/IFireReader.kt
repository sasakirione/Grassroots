package port

import domain.entity.Book

interface IFireReader {
    fun getBook(path: String): Book
}