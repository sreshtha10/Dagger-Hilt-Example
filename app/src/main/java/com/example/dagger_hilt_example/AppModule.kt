package com.example.dagger_hilt_example

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Named
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class) // to scope the dependency we use inside this module. for eg, application(singleton) or activity or fragment (till when the dependencies will live).
object AppModule {

    @Singleton // make this string singleton.
    @Provides // to tell hilt that with this function we will provide the function as dependency.
    @Named("String1")
    fun provideTestString1() = "This is a string we will inject."

}