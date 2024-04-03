package com.catnip.firebaseauthexample.presentation.register

import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.catnip.firebaseauthexample.data.repository.UserRepository
import kotlinx.coroutines.Dispatchers

/**
Written with love by Muhammad Hermas Yuda Pamungkas
Github : https://github.com/hermasyp
 **/
class RegisterViewModel(private val repository: UserRepository) : ViewModel() {

    fun doRegister(email: String, fullName: String, password: String) =
        repository
            .doRegister(email, fullName, password)
            .asLiveData(Dispatchers.IO)

}