package com.example.application4.Fragment

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.application4.R

class NotificationFragment : Fragment(R.layout.fragment_notification) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        lateinit var textView: TextView
        textView = view.findViewById(R.id.textView)
        textView.text = NotificationFragmentArgs.fromBundle(requireArguments()).amount.toString()

    }
}