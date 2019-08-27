package com.rjt.twofrags.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.rjt.twofrags.R
import com.rjt.twofrags.fragments.FragmentOne
import com.rjt.twofrags.fragments.FragmentTwo
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(),FragmentOne.OnFragmentInteractionListener {
    private val fr2:FragmentTwo? = null
    override fun onFragmentInteraction(uri: String) {
        var fr2 = FragmentTwo()
        var tr = supportFragmentManager.beginTransaction()
        var bundle = Bundle()
        bundle.putString("name",uri)
        fr2.arguments = bundle
        tr.replace(R.id.fr2,fr2)
        tr.commit()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
    }
    fun init(){
        var fr = FragmentOne()
        var tr = supportFragmentManager.beginTransaction()
        tr.replace(R.id.fr1,fr)
        tr.commit()

    }
}
