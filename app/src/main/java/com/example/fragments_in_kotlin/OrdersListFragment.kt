package com.example.fragments_in_kotlin

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.TextView
import androidx.core.os.bundleOf
import com.example.fragments_in_kotlin.databinding.FragmentAuthorizationBinding
import com.example.fragments_in_kotlin.databinding.FragmentOrdersListBinding

class OrdersListFragment : Fragment() {

    private lateinit var ordersListBinding: FragmentOrdersListBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        ordersListBinding = FragmentOrdersListBinding.inflate(inflater, container, false)
        return ordersListBinding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        ordersListBinding.tvRecycle.append(" ${arguments?.getString(PHONE_NUMBER)}")
    }
    companion object {
    private const val PHONE_NUMBER = "phone_number"

        fun newInstance(phoneNumber: String) : OrdersListFragment {
            return OrdersListFragment().apply {
                arguments = bundleOf(
                    PHONE_NUMBER to phoneNumber
                )
                }
            }
        }
    }
