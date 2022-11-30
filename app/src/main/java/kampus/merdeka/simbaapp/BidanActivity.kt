package kampus.merdeka.simbaapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.ImageView
import androidx.cardview.widget.CardView

class BidanActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var cardView: CardView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bidan)
        val namePosyandu = intent.getStringExtra("namePosyandu")
        Log.e("namePosyandu",namePosyandu.toString())
        val descPosyandu = intent.getStringExtra("descPosyandu")

        val intenCV = findViewById<CardView>(R.id.cv_bidan1)

        intenCV.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.cv_bidan1 -> run {
                val intentimg = Intent(this, ChatBidanActivity::class.java)
                startActivity(intentimg)
            }
        }
    }
}