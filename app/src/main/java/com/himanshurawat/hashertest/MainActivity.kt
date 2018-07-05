package com.himanshurawat.hashertest

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.himanshurawat.hasher.Hasher

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val ob = Hasher()
        Log.i("hash",ob.hash("HELLO",Hasher.SHA_1))
        Log.i("hash",ob.hash("HELLO",Hasher.SHA_256))
        Log.i("hash",ob.hash("HELLO",Hasher.SHA_512))
        Log.i("hash",ob.hash("HELLO",Hasher.SHA_384))
        Log.i("hash",ob.hash("HELLO"))

    }
}
