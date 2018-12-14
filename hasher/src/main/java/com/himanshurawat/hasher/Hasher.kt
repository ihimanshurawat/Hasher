package com.himanshurawat.hasher

import java.lang.IllegalArgumentException
import java.security.NoSuchAlgorithmException


enum class HashType(s: String){
    MD5("MD5"),SHA_256("SHA-256"),
    SHA_1("SHA-1"),SHA_512("SHA-512"),
    SHA_384("SHA-384");

    val value: String = s
}

class Hasher {

    //Hashing
    fun hash(value:String?,hashType: HashType): String {

        if(value == null){
            throw IllegalArgumentException("value in hash method cannot be Null")
        }

        try {
            // Create Hash Type
            val digest = java.security.MessageDigest
                    .getInstance(hashType.value)
            digest.update(value.toByteArray())
            val messageDigest = digest.digest()

            // Create Hex String
            val hexString = StringBuilder()
            for (aMessageDigest in messageDigest) {
                var h = Integer.toHexString(0xFF and aMessageDigest.toInt())
                while (h.length < 2)
                    h = "0$h"
                hexString.append(h)
            }
            return hexString.toString()

        } catch (e: NoSuchAlgorithmException) {
            e.printStackTrace()
        }

        return ""
    }
}

