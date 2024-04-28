package lk.sliit.mad.tictactoe

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.WindowInsetsControllerCompat
import lk.sliit.mad.tictactoe.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        hideSystemBars()
        btnStartGameOnClick()
        btnHistoryOnClick() // Add this
    }

    private fun hideSystemBars() {
        val windowInsetsController =
            ViewCompat.getWindowInsetsController(window.decorView) ?: return
        windowInsetsController.systemBarsBehavior =
            WindowInsetsControllerCompat.BEHAVIOR_SHOW_TRANSIENT_BARS_BY_SWIPE
        windowInsetsController.hide(WindowInsetsCompat.Type.systemBars())
    }

    private fun btnStartGameOnClick() {
        binding.btnStartGame.setOnClickListener {
            startActivity(Intent(this, TicTacToeGameActivity::class.java))
        }
    }

    private fun btnHistoryOnClick() {
        binding.btnHistoryButton.setOnClickListener {
            startActivity(Intent(this, ScoreboardActivity::class.java))
        }
    }
}
