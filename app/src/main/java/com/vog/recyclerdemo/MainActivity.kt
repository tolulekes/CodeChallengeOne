package com.vog.recyclerdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val items = listOf(
            Flower(
                name = resources.getString(R.string.flower1_name),
                description = resources.getString(R.string.flower1_description)
            ),
            Flower(
                name = resources.getString(R.string.flower2_name),
                description = resources.getString(R.string.flower2_description)
            ),
            Flower(
                name = resources.getString(R.string.flower3_name),
                description = resources.getString(R.string.flower3_description)
            ),
            Flower(
                name = resources.getString(R.string.flower4_name),
                description = resources.getString(R.string.flower4_description)
            ),
            Flower(
                name = resources.getString(R.string.flower5_name),
                description = resources.getString(R.string.flower5_description)
            ),
            Flower(
                name = resources.getString(R.string.flower6_name),
                description = resources.getString(R.string.flower6_description)
            ),
            Flower(
                name = resources.getString(R.string.flower7_name),
                description = resources.getString(R.string.flower7_description)
            ),
            Flower(
                name = resources.getString(R.string.flower8_name),
                description = resources.getString(R.string.flower8_description)
            ),
            Flower(
                name = resources.getString(R.string.flower9_name),
                description = resources.getString(R.string.flower9_description)
            ),
            Flower(
                name = resources.getString(R.string.flower10_name),
                description = resources.getString(R.string.flower10_description)
            ),
            Flower(
                name = resources.getString(R.string.flower11_name),
                description = resources.getString(R.string.flower11_description)
            )
        )
    }
}