package hdn.dev

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.widget.AppCompatButton

class MainActivity : AppCompatActivity() {
    lateinit var btn_clickme: AppCompatButton
    lateinit var btn_url: AppCompatButton
    lateinit var btn_dial: AppCompatButton
    lateinit var ed_name: EditText
    lateinit var ed_url: EditText


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ed_name = findViewById(R.id.et_name)

        btn_clickme = findViewById(R.id.btn_clickme)
        btn_clickme.setOnClickListener {
            val intent: Intent = Intent(this@MainActivity, GreetingActivity::class.java)
            val name = ed_name.text.toString()
            intent.putExtra("message", name)
            startActivity(intent)
        }

        btn_dial = findViewById(R.id.btn_dial)
        btn_dial.setOnClickListener {
            val intent: Intent = Intent(Intent.ACTION_DIAL)
            startActivity(intent)
        }
        ed_url = findViewById(R.id.ed_url)
        btn_url = findViewById(R.id.btn_url)
        btn_url.setOnClickListener {
            val url = ed_url.text.toString()
            val intent: Intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(intent)
        }

    }
}