package com.example.chtigatpcempatnavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_login.*

class FragmentLogin : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_login, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btn_login.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_fragmentLogin_to_fragmentHome)
        }

        tv_lupa_pass.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_fragmentLogin_to_fragmentLupaPassword)
        }

        tv_register.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_fragmentLogin_to_fragmentRegister)
        }

        tv_chat.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_fragmentLogin_to_fragmentChatcs)
        }

        tv_help.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_fragmentLogin_to_fragmentHelp)
        }
    }
}