package domain.entity

import kotlinx.serialization.Serializable

@Serializable
data class Book(
    val textContents: MutableList<Sentence>,
    val path: String
)
