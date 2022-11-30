package kampus.merdeka.simbaapp.Fragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import kampus.merdeka.simbaapp.ArtikelActivity
import kampus.merdeka.simbaapp.InfoImunisasiActivity
import kampus.merdeka.simbaapp.JadwalImunisasiActivity
import kampus.merdeka.simbaapp.R

class HomeFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val btnartikel : Button = view.findViewById(R.id.btn_artikel)
        btnartikel.setOnClickListener {
            val btnArtikel = Intent(this@HomeFragment.activity, ArtikelActivity::class.java)
            startActivity(btnArtikel)
        }
        val imageinfo : ImageView = view.findViewById(R.id.imageinfo)
        imageinfo.setOnClickListener {
            val imginfo = Intent(this@HomeFragment.activity, InfoImunisasiActivity::class.java)
            startActivity(imginfo)
        }
        val imagejadwal : ImageView = view.findViewById(R.id.imagejadwal)
        imagejadwal.setOnClickListener {
            val imgjadwal = Intent(this@HomeFragment.activity, JadwalImunisasiActivity::class.java)
            startActivity(imgjadwal)
        }



    }
}