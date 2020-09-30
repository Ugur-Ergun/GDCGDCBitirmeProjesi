package com

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import com.adapter.CommunityAdapter
import com.data.RetrofitProvider
import com.example.gdcbitirmeprojesi.R
import kotlinx.android.synthetic.main.fragment_community.*
import kotlinx.coroutines.launch


class CommunityFragment : Fragment(R.layout.fragment_community) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        lifecycleScope.launch {
            val response = RetrofitProvider.googleCommunityApi.getTopHeadlines()
            recycleViewCommunity.adapter = CommunityAdapter(response) {
                val direction =
                    CommunityFragmentDirections.actionCommunityFragmentToDetailFragment(it)
                findNavController().navigate(direction)
            }
        }
    }
}