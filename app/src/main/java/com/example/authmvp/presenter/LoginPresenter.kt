package com.example.authmvp.presenter


@FunctionalInterface
interface LoginPresenter {
    fun doLogin(userName: String, password: String)
}