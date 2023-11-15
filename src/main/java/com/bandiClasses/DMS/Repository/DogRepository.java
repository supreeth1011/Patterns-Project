/**
 * 
 */
package com.bandiClasses.DMS.Repository;

/**
 * Author Sai Supreeth Papishetty
 */
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.bandiClasses.DMS.Models.Dog;

public interface DogRepository extends CrudRepository<Dog, Integer>{
	List<Dog> findByName(String name);
	

}