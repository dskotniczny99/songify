package com.songify.infrastructure.crud.genre.dto;

import com.songify.domain.crud.dto.GenreDto;

import java.util.Set;

public record GetAllGenresResponseDto(Set<GenreDto> genres) {
}
