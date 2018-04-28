package com.himanshurawat.hasher

import java.security.NoSuchAlgorithmException

class Hasher {

        val MD5 = "MD5"
        val SHA_256 = "SHA-256"
        val SHA_1 = "SHA-1"
        val SHA_512 = "SHA-512"
        val SHA_384 = "SHA-384"

    //Hashing
    fun hash(value:String,hashType:String = "MD5"): String {

        try {
            // Create Hash Type
            val digest = java.security.MessageDigest
                    .getInstance(hashType)
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