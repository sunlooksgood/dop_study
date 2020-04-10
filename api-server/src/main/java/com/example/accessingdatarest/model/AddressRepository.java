package com.example.accessingdatarest.model;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "addresses", path="address")
public interface AddressRepository extends PagingAndSortingRepository<Address, Long> {


}
