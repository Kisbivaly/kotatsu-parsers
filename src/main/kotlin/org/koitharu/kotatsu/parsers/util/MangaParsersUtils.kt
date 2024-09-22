@file:JvmName("MangaParsersUtils")

package org.koitharu.kotatsu.parsers.util

import org.koitharu.kotatsu.parsers.model.MangaListFilter
import kotlin.contracts.contract

public fun MangaListFilter?.isNullOrEmpty(): Boolean {
	contract {
		returns(false) implies (this@isNullOrEmpty != null)
	}
	return this == null || this.isEmpty()
}
