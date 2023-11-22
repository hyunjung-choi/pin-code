package com.hyunjung.pincode

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.hyunjung.pincode.databinding.ActivityPinCodeBinding
import com.hyunjung.pincode.widget.ShuffleNumberKeyboard

class PinCodeActivity : AppCompatActivity(), ShuffleNumberKeyboard.KeypadListener {

    private lateinit var binding: ActivityPinCodeBinding
    private val viewModel: PinCodeViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPinCodeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.vm = viewModel
        binding.lifecycleOwner = this
        binding.shuffleNumberKeyboard.setKeyPadListener(this)
    }

    override fun onClickNum(num: String) {
        viewModel.input(num)
    }

    override fun onClickDelete() {
        viewModel.delete()
    }

    override fun onClickDone() {
        viewModel.done()
    }
}