package com.artservicesourcingdataservice.artservicesourcingdataservice.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.artservicesourcingdataservice.artservicesourcingdataservice.Domain.DTO.MutablePieceInformation;

@Repository
public interface PieceInformationRepository extends CrudRepository<MutablePieceInformation, Long> {
}
