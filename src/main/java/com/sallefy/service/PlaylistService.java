package com.sallefy.service;

import com.sallefy.service.dto.PlaylistDTO;

import java.util.List;
import java.util.Optional;

/**
 * Service Interface for managing {@link com.sallefy.domain.Playlist}.
 */
public interface PlaylistService {

    /**
     * Save a playlist.
     *
     * @param playlistDTO the entity to save.
     * @return the persisted entity.
     */
    PlaylistDTO save(PlaylistDTO playlistDTO);

    /**
     * Get all the playlists.
     *
     * @return the list of entities.
     */
    List<PlaylistDTO> findAll();


    /**
     * Get the "id" playlist.
     *
     * @param id the id of the entity.
     * @return the entity.
     */
    Optional<PlaylistDTO> findOne(Long id);

    /**
     * Delete the "id" playlist.
     *
     * @param id the id of the entity.
     */
    void delete(Long id);
}
