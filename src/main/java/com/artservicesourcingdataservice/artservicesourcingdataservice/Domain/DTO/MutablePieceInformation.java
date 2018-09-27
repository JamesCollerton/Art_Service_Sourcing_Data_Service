package com.artservicesourcingdataservice.artservicesourcingdataservice.Domain.DTO;

import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Data;

@Entity
@Data
public class MutablePieceInformation implements PieceInformation {

    @Id
    private Long id;
    private String title;
    private String description;
    private String imageURL;

}
