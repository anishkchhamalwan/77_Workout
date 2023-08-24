package comm.anna.workout_77

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import comm.anna.workout_77.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    //  The binding name just like the name of the layout with Binding attached
    private var binding:ActivityMainBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        // GLIDE CODE ---
        Glide
            .with(this)
            .load(R.drawable.staminworkout2)
            .fitCenter()
            .placeholder(R.drawable.img_main_page)
            .into(binding!!.ivMainImage)
        // Glide Code --

        binding?.flStart?.setOnClickListener {
            val intent = Intent(this,ExerciseActivity::class.java)
            startActivity(intent)
        }

        binding?.flBMI?.setOnClickListener {
            // Launching the BMI Activity
            val intent = Intent(this, BMIActivity::class.java)
            startActivity(intent)
        }


        //  Adding a click event to launch the History Screen Activity from Main Activity.)
        // START
        binding?.flHistory?.setOnClickListener {
            // Launching the History Activity
            val intent = Intent(this, HistoryActivity::class.java)
            startActivity(intent)
        }
        //END
    }


    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }
}