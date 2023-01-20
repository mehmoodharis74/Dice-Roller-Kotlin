


import android.animation.AnimatorSet
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.practiceapp.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var front_anim: AnimatorSet
    lateinit var back_anim: AnimatorSet
    val front = true
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        diceBtn.setOnClickListener {
            setImage(rollDice())
        }
    }
    private fun rollDice(): Int {
        return (1..6).random()
    }
    private fun setImage(dice: Int) {
        val imageResource = when (dice) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        diceImage.setImageResource(imageResource)
    }

}