package kampus.merdeka.simbaapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class GetStartedActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_get_started)

        val firstActButton = findViewById<Button>(R.id.btnlogin)
        firstActButton.setOnClickListener {
            val Intent = Intent(this,LoginActivity::class.java)
            startActivity(Intent)

            // Farizal burik
        }
    }
}