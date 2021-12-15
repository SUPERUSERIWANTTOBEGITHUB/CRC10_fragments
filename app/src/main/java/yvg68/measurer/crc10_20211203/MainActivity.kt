package yvg68.measurer.crc10_20211203

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val startFragment = StartFragment()                        //определяет какой фрагмент
        supportFragmentManager                                  //будет стартовым - startFragment и
            .beginTransaction()                             //откуда его грузить-fragment_container
            .replace(R.id.fragment_container, startFragment)
            .commit()
    }

}