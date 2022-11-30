package kampus.merdeka.simbaapp

import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.annotation.DrawableRes
import androidx.appcompat.app.AlertDialog
import androidx.core.view.setPadding

class InputDataAnakActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_input_data_anak)

        val btnAlerts = findViewById<Button>(R.id.bt_submit)

        btnAlerts.setOnClickListener {
            val builder = AlertDialog.Builder(this@InputDataAnakActivity)
                .create()
            val view = View.inflate(this@InputDataAnakActivity,R.layout.customview_layout,null)
            val  btnok = view.findViewById<Button>(R.id.btn_ok)
            builder.setView(view)

            btnok.setOnClickListener {
                builder.dismiss()
            }
            builder.setCanceledOnTouchOutside(false)
            builder.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
            builder.show()
            view.findViewById<Button>(R.id.btn_ok).setOnClickListener {
                startActivity(Intent(this@InputDataAnakActivity,InputDataSelesaiActivity::class.java))
            }
        }
    }
}