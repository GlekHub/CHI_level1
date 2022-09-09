package com.example.chi_level1

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import com.example.chi_level1.databinding.FragmentMainBinding
import java.lang.ClassCastException


class MainFragment : DialogFragment(), Interface {

    private lateinit var binding: FragmentMainBinding

    private var num = 0

    //@Deprecated("Deprecated in Java")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = FragmentMainBinding.inflate(inflater, container, false)

        binding.fragmentBtn.setOnClickListener {
            num++
            binding.fragmentTv.text = num.toString()
            try {
                (activity as Interface).fragmentMail(num)
            } catch (ignored: ClassCastException) {
            }
        }

        binding.toolbar.setNavigationIcon(R.drawable.ic_arrow_back_white_24)
        binding.toolbar.setNavigationOnClickListener {
            dismiss()
        }

        return binding.root
    }


    override fun fragmentMail(nums: Int) {}


    //@Deprecated("Deprecated in Java", ReplaceWith("R.style.DialogTheme"))
    override fun getTheme(): Int {
        return R.style.DialogTheme
    }


    companion object {
        @JvmStatic
        val TAG: String = MainFragment::class.java.simpleName
    }
}