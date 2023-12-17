package com.example.kontak.ui

import android.text.Spannable.Factory
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.*
import androidx.lifecycle.viewmodel.CreationExtras
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.kontak.KontakApplication
import com.example.kontak.ui.home.viewmodel.HomeViewModel

object PenyediaViewModel{
    val Factory = viewModelFactory {
        initializer {
            HomeViewModel(aplikasiKontak().container.kontakRepositori)
        }
    }
}
fun CreationExtras.aplikasiKontak(): KontakApplication =
    (this[ViewModelProvider
        .AndroidViewModelFactory.APPLICATION_KEY] as KontakApplication)