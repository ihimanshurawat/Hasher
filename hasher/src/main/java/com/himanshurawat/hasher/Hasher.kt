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
                    .getInstance(getHashType(hashType))
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

    private fun getHashType(hashType: String): String? {

        //Switch Case for Returning Appropriate HashType
        when(hashType){

            MD5 -> {
                return MD5
            }
            SHA_1 ->{
                return SHA_1
            }
            SHA_256 ->{
                return SHA_256
            }

            SHA_384 -> {
                return SHA_384
            }

            SHA_512 -> {
                return SHA_512
            }

        }

        return MD5

    }

}