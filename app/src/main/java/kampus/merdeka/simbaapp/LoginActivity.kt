package kampus.merdeka.simbaapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.view.View
import android.widget.Button
import android.widget.TextView

class LoginActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var btnIntent: Button
    private lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        supportActionBar?.hide()

        btnIntent = findViewById(R.id.btn_Login)
        val btnIntentRegister = findViewById<TextView>(R.id.btn_register)
        val btnIntentLupa = findViewById<TextView>(R.id.btn_lupapass)

        btnIntent.setOnClickListener (this)
        btnIntentRegister.setOnClickListener (this)
        btnIntentLupa.setOnClickListener(this)

        }

    override fun onClick(v: View) {
        when(v.id){
            R.id.btn_Login -> run {
                val intentBiasa = Intent(this, HomeActivity::class.java)
                startActivity(intentBiasa)
            }

        }
        when (v.id){
            R.id.btn_register -> run {
                val intentRegister = Intent(this, RegisterActivity::class.java)
                startActivity(intentRegister)
            }
        }
        when (v.id){
            R.id.btn_lupapass -> run {
                val intentLupa = Intent(this, LupaPasswordActivity::class.java)
                startActivity(intentLupa)
            }
        }
    }

}



