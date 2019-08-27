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
    private val ARG_PARAM1 = "name"
    private var param1:String?=""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
        }
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view:View = inflater.inflate(R.layout.fragment_fragment_two, container, false)
        view.rec.text = param1

        return view
    }


}
