package com.example.chi_level1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.chi_level1.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity(), Interface {


    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater).also { setContentView(it.root) }

        binding.mainBtn.setOnClickListener {
            val dialogFragment = MainFragment()
            dialogFragment.show(supportFragmentManager, MainFragment.TAG)
        }
    }


    override fun fragmentMail(nums: Int) {
        binding.mainTv.text = nums.toString()
    }

}