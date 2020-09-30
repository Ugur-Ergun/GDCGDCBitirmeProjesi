package com

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import coil.load
import com.example.gdcbitirmeprojesi.R
import kotlinx.android.synthetic.main.fragment_detail.*
import kotlinx.android.synthetic.main.fragment_detail.view.*


class DetailFragment : Fragment(R.layout.fragment_detail) {
    private val args by navArgs<DetailFragmentArgs>()
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.iv_banner.load(args.detail.banner)
        view.iv_leaderPhoto.load(args.detail.leader.photo)
        tv_description.text = args.detail.description
        tv_leaderName.text = args.detail.leader.name
        view.iv_instagram.setImageDrawable(resources.getDrawable(R.drawable.instagram, null))
        view.iv_twitter.setImageDrawable(resources.getDrawable(R.drawable.twitter, null))
        view.iv_youtube.setImageDrawable(resources.getDrawable(R.drawable.youtube, null))


        iv_instagram.setOnClickListener {
            val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse(args.detail.links.instagram))
            startActivity(browserIntent)
        }
        iv_twitter.setOnClickListener {
            val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse(args.detail.links.twitter))
            startActivity(browserIntent)
        }
        iv_youtube.setOnClickListener {
            val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse(args.detail.links.youtube))
            startActivity(browserIntent)
        }
    }
}