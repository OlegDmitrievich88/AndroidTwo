package com.geekbrains.video.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.geekbrains.video.R

class MainFragment : Fragment() {

    companion object {
        fun newInstance() = MainFragment()
    }

    private lateinit var viewModel: MainViewModel

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View {


        return inflater.inflate(R.layout.main_fragment, container, false)

        val toolbar = view!!.findViewById(R.id.toolbar) as Toolbar
        val activity = activity as AppCompatActivity?
        activity!!.setSupportActionBar(toolbar)
        val actionBar = activity!!.supportActionBar
        if (actionBar != null) {
            actionBar.title = "ok"
        }
        return view!!

    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)
//        val toolbar: Toolbar = view!!.findViewById<View>(R.id.toolbar) as Toolbar
//        val toolbarDownButton: Toolbar = view!!.findViewById<View>(R.id.toolbar_down) as Toolbar

        // TODO: Use the ViewModel
    }

}