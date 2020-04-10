package com.example.accessingdatarest.model;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * collectionResourceRel => HATEOAS ������ ��ü����Ʈ ��ȸ _embedded�� collection json path�� �� ��Ī
 * path => ���ҽ� ���� url path
 * 
 * @author "Jaeboo Jung"
 *
 */
@RepositoryRestResource(collectionResourceRel = "people", path = "people")
public interface PersonRepository extends CrudRepository<Person, Long> {
    
    public List<Person> findAllByAddressIdIsNotNull();

}
