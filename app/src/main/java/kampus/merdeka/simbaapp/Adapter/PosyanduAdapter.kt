package kampus.merdeka.simbaapp.Adapter

import android.app.Activity
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.RecyclerListener
import com.bumptech.glide.Glide
import kampus.merdeka.simbaapp.BidanActivity
import kampus.merdeka.simbaapp.R
import kampus.merdeka.simbaapp.databinding.ItemChatBinding
import kampus.merdeka.simbaapp.model.ModelPosyandu

class PosyanduAdapter (var data : ArrayList<ModelPosyandu>, var context: Activity?) : RecyclerView.Adapter<PosyanduAdapter.MyViewHolder>() {

    val listener: RecyclerListener? = null

    class MyViewHolder (view: View) : RecyclerView.ViewHolder(view) {
        val namePosyandu = view.findViewById<TextView>(R.id.tv_item_name)
        val descPosyandu = view.findViewById<TextView>(R.id.tv_item_description)
        val imgPosyandu = view.findViewById<ImageView>(R.id.img_item_photo)



    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view : View = LayoutInflater.from(parent.context).inflate(R.layout.item_chat, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.namePosyandu.text = data[position].namePosyandu
        holder.descPosyandu.text = data[position].descPosyandu
        //holder.imgPosyandu.setImageResource()

        Glide
            .with(context!!)
            .load(data[position].imgPosyandu)
            .circleCrop()
           // .placeholder()
            .into(holder.imgPosyandu);

        holder.itemView.setOnClickListener {
            val intent = Intent(holder.itemView.context, BidanActivity::class.java)
            intent.putExtra("namePosyandu",data[position].namePosyandu)
            intent.putExtra("descPosyandu",data[position].descPosyandu)
            it.context.startActivity(intent)
        }


}

    override fun getItemCount(): Int {
        return data.size
    }

}
