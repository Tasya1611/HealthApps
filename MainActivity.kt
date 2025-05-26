package ac.id.healthapp

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.card.MaterialCardView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val cardLogin = findViewById<MaterialCardView>(R.id.cardLogin)
        val cardRegister = findViewById<MaterialCardView>(R.id.cardRegister)

        cardLogin.setOnClickListener {
            startActivity(Intent(this, LoginActivity::class.java))
        }

        cardRegister.setOnClickListener {
            startActivity(Intent(this, RegisterActivity::class.java))
        }
    }
}
