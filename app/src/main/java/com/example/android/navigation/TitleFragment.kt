package com.example.android.navigation


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.example.android.navigation.databinding.FragmentTitleBinding


/**
 * A simple [Fragment] subclass.
 *
 */
class TitleFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val _binding: FragmentTitleBinding = DataBindingUtil.inflate(inflater,
                R.layout.fragment_title, container, false)
        // Use The Navigation Class To Create The OnClickListner Specified By The Action In " navigation.xml "
        _binding.playButton.setOnClickListener { Navigation.createNavigateOnClickListener(R.id.action_titleFragment_to_gameFragment) }
        return _binding.root
    }


}
