package ac.id.healthapp

import android.os.Bundle
import android.widget.TextView
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class NewsDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_news_detail)

        // Ambil data dari intent
        val title = intent.getStringExtra("title")
        val content = intent.getStringExtra("content")

        // Bind view dari layout
        val tvTitle = findViewById<TextView>(R.id.tvDetailTitle)
        val tvContent = findViewById<TextView>(R.id.tvDetailContent)
        val btnBack = findViewById<ImageButton>(R.id.btnBack)

        // Tampilkan data
        tvTitle.text = title
        tvContent.text = content

    }
}
