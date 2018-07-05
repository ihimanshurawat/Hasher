package com.himanshurawat.hasher

import java.security.NoSuchAlgorithmException

class Hasher {

    companion object {
        const val MD5 = "MD5"
        const val SHA_256 = "SHA-256"
        const val SHA_1 = "SHA-1"
        const val SHA_512 = "SHA-512"
        const val SHA_384 = "SHA-384"
    }



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