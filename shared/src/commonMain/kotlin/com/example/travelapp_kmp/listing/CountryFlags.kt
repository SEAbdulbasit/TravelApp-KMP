package com.example.travelapp_kmp.listing

object CountryFlags {
    private val countryFlags by lazy {
        mapOf(
            'A' to 0x1F1E6, 'B' to 0x1F1E7, 'C' to 0x1F1E8, 'D' to 0x1F1E9, 'E' to 0x1F1EA,
            'F' to 0x1F1EB, 'G' to 0x1F1EC, 'H' to 0x1F1ED, 'I' to 0x1F1EE, 'J' to 0x1F1EF,
            'K' to 0x1F1F0, 'L' to 0x1F1F1, 'M' to 0x1F1F2, 'N' to 0x1F1F3, 'O' to 0x1F1F4,
            'P' to 0x1F1F5, 'Q' to 0x1F1F6, 'R' to 0x1F1F7, 'S' to 0x1F1F8, 'T' to 0x1F1F9,
            'U' to 0x1F1FA, 'V' to 0x1F1FB, 'W' to 0x1F1FC, 'X' to 0x1F1FD, 'Y' to 0x1F1FE,
            'Z' to 0x1F1FF
        )
    }

    private fun getByUnicode(unicode: Int): String {
        return Char(unicode).toString()
    }

    fun getCountryFlag(countryCode: String): String = countryCode
        .uppercase()
        .take(2)
        .map { countryFlags[it] ?: 0 }
        .joinToString("") { getByUnicode(it) }

}
