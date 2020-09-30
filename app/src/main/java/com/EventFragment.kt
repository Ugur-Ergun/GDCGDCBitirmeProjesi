package com

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import com.adapter.EventAdapter
import com.data.RetrofitProvider
import com.example.gdcbitirmeprojesi.R
import kotlinx.android.synthetic.main.fragment_event.*
import kotlinx.coroutines.launch


class EventFragment : Fragment(R.layout.fragment_event) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        lifecycleScope.launch {
            val response = RetrofitProvider.googleEventApi.getTopHeadlines()
            recycleViewEvent.adapter = EventAdapter(response) {
                val direction = EventFragmentDirections.actionEventFragmentToDetailFragment(it)
                findNavController().navigate(direction)
            }
        }
    }
}