package com.artservicesourcingdataservice.artservicesourcingdataservice.domain.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import lombok.Data;

/**
 * This is the concrete implementation class for information around artwork pieces.
 */
@Entity
@Table(name = "PIECE_INFORMATION")
@Data
public class MutablePieceInformation implements PieceInformation {

    /**
     * Id of the piece
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    /**
     * Title of the piece
     */
    @NotBlank(message = "Title required")
    private String title;

    /**
     * Description of the piece
     */
    @NotBlank(message = "Description required")
    private String description;

    /**
     * URL where the image of the piece is stored
     */
    @NotBlank(message = "Image URL required")
    private String imageUrl;

}
