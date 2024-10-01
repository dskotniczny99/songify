package com.songify.domain.crud;

import com.songify.domain.crud.dto.AlbumDto;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor(access = AccessLevel.PACKAGE)
class SongAssigner {
    private final SongRetriever songRetriever;
    private final AlbumRetriever albumRetriever;

    AlbumDto addSongToAlbum(final Long albumId, final Long songId) {
        Album album = albumRetriever.findById(albumId);
        Song song = songRetriever.findSongById(songId);
        album.addSongToAlbum(song);
        return new AlbumDto(
                album.getId(),
                album.getTitle(),
                album.getSongsIds());

    }
}
