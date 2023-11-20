package com.hyunjung.pincode

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hyunjung.pincode.databinding.ActivityPinCodeBinding

class PinCodeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityPinCodeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPinCodeBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}