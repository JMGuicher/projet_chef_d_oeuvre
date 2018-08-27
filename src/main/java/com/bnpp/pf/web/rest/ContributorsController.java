package com.bnpp.pf.web.rest;

import com.bnpp.pf.domain.Contributors;
import com.bnpp.pf.domain.Job;
import com.bnpp.pf.repository.ContributorsRepository;
import com.bnpp.pf.service.dto.UserDTO;
import com.bnpp.pf.web.rest.util.PaginationUtil;
import com.codahale.metrics.annotation.Timed;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Controller to authenticate users.
 */
@RestController
@RequestMapping("/api/contrib/contributors")
@CrossOrigin(origins = "http://localhost:9000")
public class ContributorsController {

    @Autowired
    private ContributorsRepository contributorsRepository;

    @GetMapping
    @ResponseBody
    public ResponseEntity<List<Contributors>> getAll() {
        final List<Contributors> page = contributorsRepository.findAll();
        return new ResponseEntity<>(page, null, HttpStatus.OK);
    }


}
