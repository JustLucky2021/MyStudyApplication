package com.example.fragments_in_kotlin

interface MainNavigation {
    fun openAuthorizationFragment()
    fun openOrdersListFragment(phoneNumber: String)
}