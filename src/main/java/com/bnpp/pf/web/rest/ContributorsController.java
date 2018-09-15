package com.bnpp.pf.web.rest;

import com.bnpp.pf.domain.Contributors;
import com.bnpp.pf.service.ContributorsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;



/**
 * Controller Contributors.
 */
@RestController
@RequestMapping("/api/contrib/contributors")
@CrossOrigin("*")
public class ContributorsController {

    @Autowired
    private ContributorsService contributorsService;

    @GetMapping
    public Iterable<Contributors> getContributors() {
        Iterable<Contributors> listContributors = contributorsService.getContributors();
        return listContributors;
    }

    @PostMapping
    public Contributors createContributors(@RequestBody Contributors contributor) {
        System.out.println(contributor);
        contributor= contributorsService.postContributor(contributor);
        return contributor;
    }

    @DeleteMapping("/{id}")
    public void deleteContributors(@PathVariable Long id) {
        contributorsService.deleteContributor(id);
    }


}
