package com.sallefy.web.rest;

import com.sallefy.service.dto.SearchDTO;
import com.sallefy.web.rest.errors.NotYetImplementedException;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST controller for searching in the whole application
 */
@RestController
@RequestMapping("/api")
@ApiResponses(value = {
    @ApiResponse(code = 401, message = "Credentials needed")
})
public class SearchResource {

    private final Logger log = LoggerFactory.getLogger(SearchResource.class);

    @Value("${jhipster.clientApp.name}")
    private String applicationName;

    /**
     * {@code GET  /search} : Search in the application.
     *
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and the list of the data found.
     */
    @ApiOperation(
        value = "Search globally",
        notes = "Search in the whole application. Users, Albums, Tracks and Playlists"
    )
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "Successful operation")
    })
    @GetMapping("/search")
    public ResponseEntity<List<SearchDTO>> search() {
        log.debug("REST request to search in the whole application");
        throw new NotYetImplementedException();
    }

}
