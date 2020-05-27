package com.ayushman.musicplayer
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Splash : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash2)

        val button = findViewById<Button>(R.id.button);
        button.setOnClickListener{
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
    }
}


}
