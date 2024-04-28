package lk.sliit.mad.tictactoe

import android.content.Context
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import lk.sliit.mad.tictactoe.databinding.ActivityScoreboardBinding

class ScoreboardActivity : AppCompatActivity() {
    private lateinit var binding: ActivityScoreboardBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityScoreboardBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        loadScores()
    }

    private fun loadScores() {
        val sharedPreferences = getSharedPreferences("scores", Context.MODE_PRIVATE)
        val playerXScore = sharedPreferences.getInt("playerX", 0)
        val playerOScore = sharedPreferences.getInt("playerO", 0)
        binding.txtPlayerXScore.text = "Player X Score: $playerXScore"
        binding.txtPlayerOScore.text = "Player O Score: $playerOScore"
    }
}
