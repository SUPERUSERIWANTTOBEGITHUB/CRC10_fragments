package yvg68.measurer.crc10_20211203

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button


class MainFragment : Fragment() {
    lateinit var buttonBack: Button
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_main, container, false)
        // inflater.inflate(R.layout.fragment_main, container, false)
        buttonBack = view.findViewById(R.id.button_back)

        buttonBack = view.findViewById(R.id.button_back)
        val startFragment = StartFragment()
        buttonBack.setOnClickListener {
            activity?.supportFragmentManager
                ?.beginTransaction()
                ?.replace(R.id.fragment_container, startFragment)
                ?.commit()

        }
        return view

    }
}