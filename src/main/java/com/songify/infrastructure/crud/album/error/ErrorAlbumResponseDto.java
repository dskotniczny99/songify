package com.songify.infrastructure.crud.album.error;

import org.springframework.http.HttpStatus;

public record ErrorAlbumResponseDto(String message, HttpStatus status) {
}
