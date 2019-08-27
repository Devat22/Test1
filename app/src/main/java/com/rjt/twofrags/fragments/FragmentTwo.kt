package com.rjt.twofrags.fragments


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.rjt.twofrags.R
import kotlinx.android.synthetic.main.fragment_fragment_two.view.*

/**
 * A simple [Fragment] subclass.
 */
class FragmentTwo : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view:View = inflater.inflate(R.layout.fragment_fragment_two, container, false)
        view.rec.text = this.arguments?.get("name").toString()
        return view
    }


}
