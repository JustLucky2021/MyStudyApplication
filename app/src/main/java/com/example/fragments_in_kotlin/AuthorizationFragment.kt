package com.example.fragments_in_kotlin

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.widget.doOnTextChanged
import androidx.fragment.app.Fragment
import com.example.fragments_in_kotlin.databinding.FragmentAuthorizationBinding


class AuthorizationFragment : Fragment() {
    companion object {
        private lateinit var authBinding: FragmentAuthorizationBinding
        const val PHONE_NUMBER_LENGHT_RU = 11
        private const val TAG = "Fragments"
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        authBinding = FragmentAuthorizationBinding.inflate(inflater, container, false)
        return authBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //configureMaskedEditText()
        configureBtnStart()
    }

    /*private fun configureMaskedEditText() {
        authBinding.etPhoneNumber.doOnTextChanged { text, _, _, _ ->
            authBinding.btnStart.isEnabled = text?.length!! == PHONE_NUMBER_LENGHT_RU
        }
    }*/

    private fun configureBtnStart() {
        authBinding.btnStart.setOnClickListener {
            (activity as? MainNavigation)?.openOrdersListFragment(authBinding.etPhoneNumber.text.toString())
        }
    }
}