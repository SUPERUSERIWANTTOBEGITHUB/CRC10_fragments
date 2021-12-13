package yvg68.measurer.crc10_20211203

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val startFragment = StartFragment()
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragment_container, startFragment)
            .commit()
    }

}