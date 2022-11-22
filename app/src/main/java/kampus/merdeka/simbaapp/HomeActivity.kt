package kampus.merdeka.simbaapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kampus.merdeka.simbaapp.Fragment.ChatFragment
import kampus.merdeka.simbaapp.Fragment.HomeFragment
import kampus.merdeka.simbaapp.Fragment.LocationFragment
import kampus.merdeka.simbaapp.Fragment.ProfileFragment
import kampus.merdeka.simbaapp.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {
    private lateinit var binding : ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        replaceFragment(HomeFragment())

        binding.bottomNavigationView.setOnItemSelectedListener {

            when(it.itemId){

                R.id.ic_home -> replaceFragment(HomeFragment())
                R.id.ic_location -> replaceFragment(LocationFragment())
                R.id.ic_chat -> replaceFragment(ChatFragment())
                R.id.ic_profile -> replaceFragment(ProfileFragment())

                else ->{


                }
            }
            true
        }
    }

    private fun replaceFragment(fragment: Fragment){

        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frame_layout,fragment)
        fragmentTransaction.commit()
    }
}

