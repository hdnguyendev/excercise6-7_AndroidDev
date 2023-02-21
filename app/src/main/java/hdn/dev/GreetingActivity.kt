package hdn.dev

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.TextView
import android.widget.Toast

class GreetingActivity : AppCompatActivity() {
    lateinit var tv_greeting: TextView
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.optionsmenu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.message -> {
                Toast.makeText(
                    getApplicationContext(),
                    "You clicked Message menu",
                    Toast.LENGTH_SHORT
                ).show()
                return true
            }

        }
        return (super.onOptionsItemSelected(item))

    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_greeting)

        tv_greeting = findViewById(R.id.tv_greeting)
        if (intent != null) {
            tv_greeting.text = "Hello, ${intent.getStringExtra("message").toString()}"
        }


    }
}