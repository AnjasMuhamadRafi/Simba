package kampus.merdeka.simbaapp.Fragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout
import kampus.merdeka.simbaapp.GetStartedActivity
import kampus.merdeka.simbaapp.R

class ProfileFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_profile, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val logout : LinearLayout = view.findViewById(R.id.Logout)
        logout.setOnClickListener {
            val btnLogout = Intent(this@ProfileFragment.activity, GetStartedActivity::class.java)
            startActivity(btnLogout)
        }

    }
}