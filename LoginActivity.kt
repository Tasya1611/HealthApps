package ac.id.healthapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val etUsername = findViewById<EditText>(R.id.etUsername)
        val etPassword = findViewById<EditText>(R.id.etPassword)
        val btnLogin = findViewById<Button>(R.id.btnLogin)
        val tvToRegister = findViewById<TextView>(R.id.tvToRegister)  // <-- Di sini

        val sharedPref = getSharedPreferences("HealthAppPrefs", MODE_PRIVATE)

        btnLogin.setOnClickListener {
            val inputUsername = etUsername.text.toString().trim()
            val inputPassword = etPassword.text.toString().trim()

            val savedUsername = sharedPref.getString("username", null)
            val savedPassword = sharedPref.getString("password", null)

            if (inputUsername.isEmpty() || inputPassword.isEmpty()) {
                Toast.makeText(this, "Username dan password harus diisi", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            if (inputUsername == savedUsername && inputPassword == savedPassword) {
                Toast.makeText(this, "Login sukses", Toast.LENGTH_SHORT).show()
                startActivity(Intent(this, DashboardActivity::class.java))
                finish()
            } else {
                Toast.makeText(this, "Username atau password salah", Toast.LENGTH_SHORT).show()
            }
        }

        // Tambahkan klik listener untuk pindah ke RegisterActivity
        tvToRegister.setOnClickListener {
            startActivity(Intent(this, RegisterActivity::class.java))
            finish()
        }
    }
}
