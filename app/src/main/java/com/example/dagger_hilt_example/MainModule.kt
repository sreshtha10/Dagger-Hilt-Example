package com.example.dagger_hilt_example

import android.content.Context
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Named


@Module
@InstallIn(ActivityComponent::class) // to scope the dependency we use inside this module. for eg, application(singleton) or activity or fragment (till when the dependencies will live).
object MainModule {

    @ActivityScoped
    @Provides
    @Named("String2")
    // using context in dagger hilt
    fun provideTestString2(@ApplicationContext context: Context) = context.resources.getString(R.string.string_to_inject)


    @ActivityScoped
    @Provides
    @Named("String3")
    //using one dependency in another.
    fun provideTestString3(
        @ApplicationContext context: Context,
        @Named("String1") testString1:String
        ) = "${context.resources.getString(R.string.string_to_inject)}-$testString1"

}

