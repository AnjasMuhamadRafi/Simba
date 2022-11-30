package kampus.merdeka.simbaapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class InputDataSelesaiActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var btnIntent: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_input_data_selesai)
        btnIntent = findViewById(R.id.btn_selesai)

        btnIntent.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.btn_selesai -> run {
                val intentBiasa = Intent(this, HomeActivity::class.java)
                startActivity(intentBiasa)
            }
        }
    }
}