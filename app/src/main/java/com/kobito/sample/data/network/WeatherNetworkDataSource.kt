package com.kobito.sample.data.network

import androidx.lifecycle.LiveData
import com.kobito.sample.data.network.response.CurrentWeatherResponse

interface WeatherNetworkDataSource {
    val downloadedCurrentWeather: LiveData<CurrentWeatherResponse>

    suspend fun fetchCurrentWeather(location: String, languageCode: String)
}