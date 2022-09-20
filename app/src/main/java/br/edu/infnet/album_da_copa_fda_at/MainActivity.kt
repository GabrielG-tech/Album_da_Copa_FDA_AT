package br.edu.infnet.album_da_copa_fda_at

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.edu.infnet.album_da_copa_fda_at.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}