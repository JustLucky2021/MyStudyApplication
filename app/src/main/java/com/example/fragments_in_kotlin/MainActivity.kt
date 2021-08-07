package com.example.fragments_in_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity(), MainNavigation {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        openAuthorizationFragment()

    }

    override fun openAuthorizationFragment() {
        supportFragmentManager
            .beginTransaction()
            .add(R.id.flRoot, AuthorizationFragment())
            .commit()
    }

    override fun openOrdersListFragment(phoneNumber: String) {
        supportFragmentManager
            .beginTransaction()
            .addToBackStack("null")
            .replace(R.id.flRoot, OrdersListFragment.newInstance(phoneNumber = phoneNumber))
            .commit()
    }
}