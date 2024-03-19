package com.example.authmvp.presenter


import android.text.TextUtils
import com.example.authmvp.view.listener.LoginResultListener
import com.example.authmvp.model.LoginModel


class LoginPresenterImpl(private val loginResultListener: LoginResultListener) : LoginPresenter {

    private val loginModel: LoginModel = LoginModel()

    override fun doLogin(userName: String, password: String) {
        return if (TextUtils.isEmpty(userName)) {
            loginResultListener.onFail("Please provide user name")
        } else if (TextUtils.isEmpty(password)) {
            loginResultListener.onFail("Please provide password name")
        } else {
            if (loginModel.doLogin(userName, password)) {
                loginResultListener.onSuccess("Successfully logged in")
            } else {
                loginResultListener.onFail("Please provide correct credentials")
            }
        }

    }
}