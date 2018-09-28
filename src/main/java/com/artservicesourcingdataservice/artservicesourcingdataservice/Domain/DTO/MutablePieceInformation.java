package com.artservicesourcingdataservice.artservicesourcingdataservice.Domain.DTO;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

import lombok.Data;

@Entity
@Data
public class MutablePieceInformation implements PieceInformation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotBlank(message = "Title required")
    private String title;

    @NotBlank(message = "Description required")
    private String description;

    @NotBlank(message = "Image URL required")
    private String imageUrl;

}
