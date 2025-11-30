package com.example.advanceduinavapp

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment

class InfoTabFragment : Fragment() {

  override fun onCreateView(
    inflater: LayoutInflater, container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View {
    // Inflate the layout directly without View Binding
    return inflater.inflate(R.layout.fragment_info_tab, container, false)
  }

  @SuppressLint("SetTextI18n")
  override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    super.onViewCreated(view, savedInstanceState)

    // Access the TextView using findViewById
    val textView = view.findViewById<TextView>(R.id.text_info)
    textView.text = "User Information\n\nName: John Doe\nEmail: john@example.com"
  }
}