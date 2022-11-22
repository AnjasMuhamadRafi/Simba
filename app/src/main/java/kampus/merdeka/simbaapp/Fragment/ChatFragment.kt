package kampus.merdeka.simbaapp.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kampus.merdeka.simbaapp.Adapter.PosyanduAdapter
import kampus.merdeka.simbaapp.R
import kampus.merdeka.simbaapp.databinding.FragmentChatBinding
import kampus.merdeka.simbaapp.model.ModelPosyandu


class ChatFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var binding : FragmentChatBinding? = null
    lateinit var rvPosyandu : RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_chat, container, false)

        // <--  RecycleView Chat-->>

        val lm = LinearLayoutManager(activity)
        lm.orientation = LinearLayoutManager.VERTICAL
        rvPosyandu = view.findViewById(R.id.rv_posyandu)

        val adapterPosyandu = PosyanduAdapter(ArrayPosyandu,activity)
        rvPosyandu.setHasFixedSize(true)
        rvPosyandu.layoutManager = lm
        rvPosyandu.adapter = adapterPosyandu

        return view
    }
    val ArrayPosyandu : ArrayList<ModelPosyandu>get(){

        val arrayposyandu= ArrayList<ModelPosyandu>()

        //1
        val posyandu1 = ModelPosyandu()
        posyandu1.namePosyandu = "Posyandu Ria Kencana"
        posyandu1.descPosyandu = "Jam operasional : 08.00 - 16.00"
        posyandu1.imgPosyandu = R.drawable.posyandu1

        //2
        val posyandu2 = ModelPosyandu()
        posyandu2.namePosyandu = "Posyandu Anggrek"
        posyandu2.descPosyandu = "Jam operasional : 10.00 - 17.00"
        posyandu2.imgPosyandu = R.drawable.posyandu2

        //3
        val posyandu3 = ModelPosyandu()
        posyandu3.namePosyandu = "Posyandu Cempaka 8"
        posyandu3.descPosyandu = "Jam operasional : 7.30-15.30"
        posyandu3.imgPosyandu = R.drawable.posyandu3

        arrayposyandu.add(posyandu1)
        arrayposyandu.add(posyandu2)
        arrayposyandu.add(posyandu3)

        return arrayposyandu
    }


    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }

}