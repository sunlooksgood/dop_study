package com.example.accessingdatarest.model;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "companies")
public interface CompanyRepository extends PagingAndSortingRepository<Company, Long> {


}
