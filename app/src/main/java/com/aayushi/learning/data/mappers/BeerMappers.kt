package com.aayushi.learning.data.mappers

import com.aayushi.learning.data.local.BeerEntity
import com.aayushi.learning.data.remote.BeerDto
import com.aayushi.learning.domain.Beer

fun BeerDto.toBeerEntity() = BeerEntity(
    id = id,
    name = name,
    tagline = tagline,
    description = description,
    imageUrl = image_url,
    firstBrewed = first_brewed
)

fun BeerEntity.toBeer() = Beer(
    id = id,
    name = name,
    tagline = tagline,
    description = description,
    imageUrl = imageUrl,
    firstBrewed = firstBrewed
)