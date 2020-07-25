package intellect.dev.systemintent

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private val data1: ArrayList<RecyclerData> = arrayListOf(
        RecyclerData("jdnkj", "td", 4),
        RecyclerData("mdkm", "tdvt", 4),
        RecyclerData("d", "dvdv", 4),
        RecyclerData("wwwe", "vh", 4),
        RecyclerData("fef", "hvud", 4),
        RecyclerData("fewfwfk", "ee", 4),
        RecyclerData("ewe", "wwewewee", 4),
        RecyclerData("fewmfk", "hdvhv", 4),
        RecyclerData("dgvdiv", "vhd", 4),
        RecyclerData("vhdhv", "uhvdu", 4),
        RecyclerData("dvh", "vdhv", 4),
        RecyclerData("", "gydg", 4)
    )
    private val data2: ArrayList<RecyclerData> = arrayListOf(
        RecyclerData("", "", 4),
        RecyclerData("", "", 4),
        RecyclerData("", "", 4),
        RecyclerData("", "", 4)
    )
    private val data: ArrayList<PagerData> = arrayListOf(
        PagerData("sss", data1),
        PagerData("mckm", data2),
        PagerData("sss", data1)
    )

    private val adapter = RecyclerAdapter(data1)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recycle.layoutManager = LinearLayoutManager(this)
        recycle.adapter = adapter
//        TabLayoutMediator(tabLayout, pager) { _, _ -> }.attach()
    }
}