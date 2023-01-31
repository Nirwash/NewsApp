package com.example.newsapp.models

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Source(
    val id: String?,
    val name: String?
) : Parcelable {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false
        other as Source
        if (id != other.id) return false
        if (name != other.name) return false
        return true
    }

    override fun hashCode(): Int {
        var result = 1
        if (!id.isNullOrEmpty()) {
            result = 31 * result + id.hashCode()
        }
        if (!name.isNullOrEmpty()) {
            result = 31 * result + name.hashCode()
        }
        return result
    }
}