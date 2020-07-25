package intellect.dev.systemintent

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class PagerAdapter(private val data: List<PagerData>) :
    RecyclerView.Adapter<PagerAdapter.ViewHolder>() {
//    lateinit var adapter: RecyclerAdapter


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        ViewHolder(parent.inflate(R.layout.item_view_pager))

    override fun getItemCount() = data.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) = holder.bind()

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        fun bind() = bindItem {
//            adapter = RecyclerAdapter(data[adapterPosition].information)
//            list.adapter = adapter
        }
    }
}