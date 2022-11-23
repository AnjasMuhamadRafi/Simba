package kampus.merdeka.simbaapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.annotation.DrawableRes
import androidx.appcompat.app.AlertDialog

class InputDataAnak2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_input_data_anak2)

        val btnAlerts = findViewById<Button>(R.id.bt_submit22)

        btnAlerts.setOnClickListener {
            val builder = AlertDialog.Builder(this@InputDataAnak2Activity)
                .create()
            val view = View.inflate(this@InputDataAnak2Activity,R.layout.customview_layout,null)
            val  imageView = view.findViewById<ImageView>(R.id.img_succes)
            builder.setView(view)

            imageView.setOnClickListener {
                builder.dismiss()
            }
            builder.setCanceledOnTouchOutside(false)
            builder.show()
            view.findViewById<ImageView>(R.id.img_succes).setOnClickListener {
                startActivity(Intent(this@InputDataAnak2Activity,HomeActivity::class.java))
            }
        }
    }
}