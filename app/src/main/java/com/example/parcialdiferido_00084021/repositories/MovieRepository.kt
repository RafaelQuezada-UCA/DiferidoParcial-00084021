package com.example.parcialdiferido_00084021.repositories

import com.example.parcialdiferido_00084021.data.model.HotelModel

class MovieRepository (private val hotels: MutableList<HotelModel>) {
    fun getHotels() = hotels

    fun addHotels(hotel: HotelModel) = hotels.add(hotel)
}