
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var insRecyclerView : RecyclerView
    private lateinit var insArrayList: ArrayList<Biodata>
    lateinit var idFoto : Array<Int>
    lateinit var idNama : Array<String>
    lateinit var idNim : Array<String>
    lateinit var idKelas : Array<String>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        idFoto = arrayOf(
            R.drawable.elang2,
            R.drawable.rayden,
            R.drawable.fano2


        )
        idNama = arrayOf(
            "Elang Sotya Putra Dumipta",
            "Raya Aldyen Dessario",
            "Yonathan Fanuel Mulyadi"
        )
        idNim = arrayOf(
            "205150200111032",
            "205150201111023",
            "205150207111022"
        )
        idKelas = arrayOf(
            "Pemrograman Sistem Interaktif TIF E",
            "Pemrograman Sistem Interaktif TIF E",
            "Pemrograman Sistem Interaktif TIF E"
        )
        insRecyclerView = findViewById(R.id.rv_mhs)
        insRecyclerView.layoutManager = LinearLayoutManager(this)
        insRecyclerView.setHasFixedSize(true)
        insArrayList = arrayListOf<Biodata>()
        getMhsData()

    }
    private fun getMhsData(){
        for(i in idFoto.indices){
            val bio = Biodata(idFoto[i], idNama[i], idNim[i], idKelas[i])
            insArrayList.add(bio)
        }
        insRecyclerView.adapter = BioAdapter(insArrayList)
    }
}
