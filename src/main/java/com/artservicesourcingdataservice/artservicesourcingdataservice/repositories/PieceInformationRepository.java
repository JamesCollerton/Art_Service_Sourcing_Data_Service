package com.artservicesourcingdataservice.artservicesourcingdataservice.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.artservicesourcingdataservice.artservicesourcingdataservice.domain.dto.MutablePieceInformation;

/**
 * This is the repository responsible for sourcing piece information from the database.
 */
@Repository
public interface PieceInformationRepository extends CrudRepository<MutablePieceInformation, Long> {
}
