package com.songify.infrastructure.crud.genre;

import com.songify.domain.crud.SongifyCrudFacade;
import com.songify.domain.crud.dto.GenreDto;
import com.songify.domain.crud.dto.GenreRequestDto;
import com.songify.infrastructure.crud.genre.dto.GetAllGenresResponseDto;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
@RequestMapping("/genres")
@AllArgsConstructor
class GenreController {

    private final SongifyCrudFacade songifyCrudFacade;

    @PostMapping
    public ResponseEntity<GenreDto> postGenre(@RequestBody GenreRequestDto genreRequestDto) {
        final GenreDto genreDto = songifyCrudFacade.addGenre(genreRequestDto);
        return ResponseEntity.ok(genreDto);
    }

    @GetMapping
    ResponseEntity<GetAllGenresResponseDto> getAllGenres() {
        Set<GenreDto> allGenres = songifyCrudFacade.retrieveGenres();
        return ResponseEntity.ok(new GetAllGenresResponseDto(allGenres));
    }

}
