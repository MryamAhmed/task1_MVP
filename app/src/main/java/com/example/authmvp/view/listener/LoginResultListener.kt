package com.example.authmvp.view.listener


interface LoginResultListener {

    fun onSuccess(result: String)

    fun onFail(errorMessage: String)
}