package com.example.dagger_hilt_example

import android.util.Log
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
import javax.inject.Named

// dagger hilt in viewModels
@HiltViewModel
class MainViewModel @Inject constructor(
    @Named("String2") testString2:String
):ViewModel() {

    init {
        Log.d("MainViewModel",testString2)
    }

}