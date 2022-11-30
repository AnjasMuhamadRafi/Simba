package kampus.merdeka.simbaapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView

class DataAnakActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var imageView: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_data_anak)
        supportActionBar?.hide()

        val btnIntentImg = findViewById<ImageView>(R.id.img_tambahadata)

        btnIntentImg.setOnClickListener(this)


    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.img_tambahadata -> run {
                val intentimg = Intent(this, InputDataAnakActivity::class.java)
                startActivity(intentimg)
            }
        }

    }
}