package com.bnpp.pf.service;

import com.bnpp.pf.domain.Contributors;
import com.bnpp.pf.repository.ContributorsRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Service
public class ContributorsService {

    private final ContributorsRepository contributorsRepository;

    public ContributorsService(ContributorsRepository contributorsRepository){
        this.contributorsRepository = contributorsRepository;
    }

    public List<Contributors> getContributors() {
        List<Contributors> contributorsList= contributorsRepository.findAll();
        return contributorsList;
    }

    public  Contributors postContributor(Contributors contributor){
        contributor= contributorsRepository.save(contributor);
        return contributor;
    }
    public Contributors deleteContributor(Contributors deletedContributor){
        this.contributorsRepository.delete(deletedContributor);
        return deletedContributor;
    }
}
