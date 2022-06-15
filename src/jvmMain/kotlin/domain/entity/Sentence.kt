package domain.entity

import kotlinx.serialization.Serializable

@Serializable
data class Sentence (
    var value: String,
    var position: Map<String, Int>
)