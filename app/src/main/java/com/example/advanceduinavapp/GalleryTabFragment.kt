package com.example.advanceduinavapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class GalleryTabFragment : Fragment() {

  override fun onCreateView(
    inflater: LayoutInflater, container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View {
    // Inflate the layout directly without View Binding
    return inflater.inflate(R.layout.fragment_gallery_tab, container, false)
  }

  override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    super.onViewCreated(view, savedInstanceState)

    // You can access views using findViewById if needed
    // val textView = view.findViewById<TextView>(R.id.text_gallery)
    // textView.text = "Photo Gallery\n\nYour photos will appear here"
  }
}