package kampus.merdeka.simbaapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.view.View
import android.widget.Button

class LoginActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var btnIntent: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        supportActionBar?.hide()

        btnIntent = findViewById(R.id.btn_Login)

        btnIntent.setOnClickListener (this)

        }

    override fun onClick(v: View) {
        when(v.id){
            R.id.btn_Login -> run {
                val intentBiasa = Intent(this@LoginActivity, HomeActivity::class.java)
                startActivity(intentBiasa)
            }

        }
    }

}



