package com.jake.CarMaintenance.accessingdatarest;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "people", path = "people")
public interface VehicleRepository extends PagingAndSortingRepository<Vehicle, Long> {

    List<Vehicle> findByModel(@Param("model") String model);

}
