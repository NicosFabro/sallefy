package com.sallefy.repository;

import com.sallefy.domain.Album;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 * Spring Data  repository for the Album entity.
 */
@Repository
public interface AlbumRepository extends JpaRepository<Album, Long> {

    @Query(value = "select distinct album from Album album left join fetch album.artists",
        countQuery = "select count(distinct album) from Album album")
    Page<Album> findAllWithEagerRelationships(Pageable pageable);

    @Query("select distinct album from Album album left join fetch album.artists")
    List<Album> findAllWithEagerRelationships();

    @Query("select album from Album album left join fetch album.artists where album.id =:id")
    Optional<Album> findOneWithEagerRelationships(@Param("id") Long id);

}
