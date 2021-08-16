package com.vog.recyclerdemo

import android.content.ContentValues.TAG
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.vog.recyclerdemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.apply {

            flowers = listOf(
                Flower(
                    name = "Rose",
                    description = "Rose comes from the Latin word Rosa. There are over 100 species of the rose."),
                Flower(
                    name = "Freesia",
                    description = "Freesias bloom during spring and are native to Africa."),
                Flower(
                    name = "Lily",
                    description = "Lilies have the longest in vase lifespan of any cut bloom."),
                Flower(
                    name = "Sunflower",
                    description = "Mature Sunflowers face east and are native too the United States."),
                Flower(
                    name = "Peony",
                    description = "Peony plants can live to be 100 years old."),
                Flower(
                    name = "Daisy",
                    description = "Daisies are cousins with Sunflowers."),
                Flower(
                    name = "Lilac",
                    description = "Lilacs belong to the olive family."),
                Flower(
                    name = "Marigold",
                    description = "Marigolds come in orange, reed, maroon and yellow."),
                Flower(
                    name = "Poppy",
                    description = "Poppies can be over 3 feet tall."),
                Flower(
                    name = "Daffodil",
                    description = "Daffodils are referred to as Lent Lilies in Englnd"),
                Flower(
                    name = "Dahlia",
                    description = "Dahlia is named after the Swedish botanist Anders Dahl"),
                Flower(
                    name = "Tulip",
                    description = "There are over 150 species of tulips.")
            )
            flowerRecyclerView.apply {
                Log.d(TAG, "onCreate: gets here")
                layoutManager = LinearLayoutManager(this@MainActivity, RecyclerView.VERTICAL,false)
                adapter = FlowerListAdapter(FlowerClickListener { flowers ->
                    Log.d(TAG, "onCreate: toast clicking")
                    Toast.makeText(this@MainActivity, flowers.description, Toast.LENGTH_LONG).show()
                })
            }

        }
    }
}
