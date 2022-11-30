package kampus.merdeka.simbaapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kampus.merdeka.simbaapp.databinding.ActivityInfoImunisasiBinding

class InfoImunisasiActivity : AppCompatActivity() {
    private lateinit var binding : ActivityInfoImunisasiBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityInfoImunisasiBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()

        val description1 = resources.getStringArray(R.array.description)
        val adapter = ArrayAdapter(this, R.layout.list_item, description1)

        with(binding.dropdownField1) {
            setAdapter(adapter)
        }
    }
}