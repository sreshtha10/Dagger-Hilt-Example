package com.example.dagger_hilt_example

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject
import javax.inject.Named


@AndroidEntryPoint
/* to tell dagger that we want to inject dependency. When using fragment, we need to annotate the fragment as well as parent activity.*/
class MainActivity : AppCompatActivity() {

    @Inject // automatically inject a dependency of type String (if only one dependency of type String is there).
    @Named("String1")
    lateinit var testString1:String

    @Inject
    @Named("String2")
    lateinit var testString2:String

    // injecting viewModel to activity. (lazy)
    private val mViewModel:MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("MainActivity",testString1)
    }
}