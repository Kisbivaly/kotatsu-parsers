package org.koitharu.kotatsu.parsers.site.madara.pt

import org.koitharu.kotatsu.parsers.Broken
import org.koitharu.kotatsu.parsers.MangaLoaderContext
import org.koitharu.kotatsu.parsers.MangaSourceParser
import org.koitharu.kotatsu.parsers.model.MangaParserSource
import org.koitharu.kotatsu.parsers.site.madara.MadaraParser

@Broken
@MangaSourceParser("RAINBOWFAIRYSCAN", "RainbowFairyScan", "pt")
internal class RainbowFairyScan(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.RAINBOWFAIRYSCAN, "rainbowfairyscan.com", 10) {
	override val datePattern: String = "dd/MM/yyyy"
}
