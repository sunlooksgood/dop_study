package com.example.accessingdatarest.model;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * collectionResourceRel => HATEOAS 스펙의 전체리스트 조회 _embedded중 collection json path에 들어갈 명칭
 * path => 리소스 접근 url path
 * 
 * @author "Jaeboo Jung"
 *
 */
@RepositoryRestResource(collectionResourceRel = "people", path = "people")
public interface PersonRepository extends PagingAndSortingRepository<Person, Long> {


}
