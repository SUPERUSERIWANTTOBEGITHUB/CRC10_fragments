package yvg68.measurer.crc10_20211203
//
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView

class StartFragment : Fragment() {
        lateinit var buttonOk :Button
        override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_start, container, false)
        var editText: TextView = view.findViewById(R.id.edit_text_fragment)
        var textView: TextView = view.findViewById(R.id. text_view_fragment)
            buttonOk = view.findViewById(R.id.button_ok)

            buttonOk = view.findViewById(R.id.button_ok)
            val mainFragment = MainFragment()
               buttonOk.setOnClickListener {
                   activity?.supportFragmentManager
                ?.beginTransaction()
                ?.replace(R.id.fragment_container, mainFragment)
                ?.commit()
        }
       return view
    }


}