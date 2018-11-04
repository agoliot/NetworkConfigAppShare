package goliot.fr.networkconfigappdata

import android.content.Context
import android.content.SharedPreferences
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val pref: SharedPreferences = applicationContext.getSharedPreferences("DefaultPref", Context.MODE_PRIVATE)
        val iptext: String? = pref.getString("ip", "empty")
        ip.text = iptext
    }
}
