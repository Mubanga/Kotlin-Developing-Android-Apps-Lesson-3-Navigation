package com.example.android.navigation


import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
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
       // _binding.playButton.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_titleFragment_to_gameFragment))
        _binding.playButton.setOnClickListener { view ->
            view.findNavController().navigate(TitleFragmentDirections.actionTitleFragmentToGameFragment())
        }
        setHasOptionsMenu(true)

        return _binding.root
    }

    override fun onCreateOptionsMenu(menu: Menu?, inflater: MenuInflater?) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater?.inflate(R.menu.overflow_menu,menu)
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        return NavigationUI.onNavDestinationSelected(item!!,
                view!!.findNavController())
                ||super.onOptionsItemSelected(item)
    }
}
