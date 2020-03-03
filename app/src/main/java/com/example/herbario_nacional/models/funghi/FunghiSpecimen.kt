package com.example.herbario_nacional.models.funghi

import androidx.annotation.Keep
import com.example.herbario_nacional.models.*
import com.example.herbario_nacional.models.countries.Country
import com.example.herbario_nacional.models.location.City
import com.example.herbario_nacional.models.location.State

@Keep
data class FunghiSpecimen(
    val id: Int,
    val user: Register,
    val photo: String?,
    val date_received: String,
    val number_of_samples: Int,
    val description: String,
    val capType: CapType,
    val shapes: ShapeType,
    val crust: Boolean,
    val color: String,
    val changeOfColor: String,
    val family: PlantFamily,
    val genus: Genus,
    val species: PlantSpecies,
    val smell: String,
    val status: Status,
    val country: Country,
    val state: State,
    val city: City,
    val ecosystem: Ecosystem,
    val recolection_area_status: RecolectionAreaStatus,
    val latitude: Double?,
    val longitude: Double?,
    val additionalInfo: String,
    val location: String
)

// this class is MushroomSpecimen

//cap
//forms = shapes
//crust
//color
//change_of_color
//smell
//aditional_info
