package kampus.merdeka.simbaapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class GetStartedActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var btnIntent: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_get_started)
        supportActionBar?.hide()

        btnIntent = findViewById(R.id.btnlogin)
        val btnIntentHome = findViewById<Button>(R.id.btnguest)

        btnIntent.setOnClickListener (this)
        btnIntentHome.setOnClickListener (this)

    }

    override fun onClick(v: View) {
        when (v.id){
            R.id.btnlogin -> run {
                val intentBiasa = Intent(this, LoginActivity::class.java)
                startActivity(intentBiasa)
            }

        }
        when (v.id){
            R.id.btnguest -> run {
                val intentHome = Intent (this, HomeActivity::class.java)
                startActivity(intentHome)
            }
        }
}
}