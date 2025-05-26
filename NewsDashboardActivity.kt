package ac.id.healthapp

import android.content.Intent
import android.os.Bundle
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class NewsDashboardActivity : AppCompatActivity() {

    private val newsList = listOf(
        News("Tips Sehat di Musim Hujan", "Jaga daya tahan tubuh dan konsumsi vitamin C."),
        News("Manfaat Olahraga Pagi", "Meningkatkan metabolisme dan energi sepanjang hari."),
        News("Makanan untuk Imunitas Tubuh", "Konsumsi buah-buahan seperti jeruk dan kiwi.")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        val listView = findViewById<ListView>(R.id.lvNews)
        val adapter = NewsAdapter(this, newsList)
        listView.adapter = adapter

        listView.setOnItemClickListener { _, _, position, _ ->
            val selectedNews = newsList[position]
            Toast.makeText(this, "Detail: ${selectedNews.title}", Toast.LENGTH_SHORT).show()
        }
    }
}

