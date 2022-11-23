package kampus.merdeka.simbaapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class RegisterActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var btnIntent: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        supportActionBar?.hide()

        btnIntent = findViewById(R.id.btn_register11)

        btnIntent.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.btn_register11 -> run {
                val intentBiasa = Intent(this, InputDataAnak2Activity::class.java)
                startActivity(intentBiasa)
            }
        }
    }
}