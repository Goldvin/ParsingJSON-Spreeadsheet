package com.kelompok9.laporankasrt.model

import com.google.gson.annotations.SerializedName

data class DataItem(
    @field:SerializedName("0")
    val id: String? = null,

    @field:SerializedName("1")
    val avatar: String? = null,

    @field:SerializedName("2")
    val firstName: String? = null,

    @field:SerializedName("3")
    val lastName: String? = null,

    @field:SerializedName("4")
    val email: String? = null,

    @field:SerializedName("5")
    val alamat: String? = null,

    @field:SerializedName("6")
    val IuranBln: String? = null,

    @field:SerializedName("7")
    val IuranInd: String? = null,

    @field:SerializedName("8")
    val IuranTotal: String? = null,

    @field:SerializedName("9")
    val IuranKeluar: String? = null,

    @field:SerializedName("10")
    val IuranManfaat: String? = null



)