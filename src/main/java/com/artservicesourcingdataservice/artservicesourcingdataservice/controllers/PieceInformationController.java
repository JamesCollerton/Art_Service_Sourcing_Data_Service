package com.artservicesourcingdataservice.artservicesourcingdataservice.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.artservicesourcingdataservice.artservicesourcingdataservice.domain.dto.PieceInformation;
import com.artservicesourcingdataservice.artservicesourcingdataservice.repositories.PieceInformationRepository;
import com.artservicesourcingdataservice.artservicesourcingdataservice.utilities.iterableutilities.IterableUtilities;
import io.swagger.annotations.ApiOperation;

/**
 * This is the controller for requests regarding information around artwork pieces.
 */
@Controller
@RequestMapping("/pieces")
public class PieceInformationController {

    /**
     * Autowired repository for data.
     */
    @Autowired
    private PieceInformationRepository pieceInformationRepository;

    /**
     * Get all function, returns a full list of piece information.
     *
     * @return Returns a full list of all artworks in the collection.
     */
    @ApiOperation(
            httpMethod = "GET",
            value = "Gets all information around artwork pieces",
            notes = "Returns a list of piece information for all artwork in the collection.",
            response = List.class
    )
    @GetMapping
    public ResponseEntity<List<PieceInformation>> getAllPieceInformation() {

        List<PieceInformation> pieceInformationList =
                new IterableUtilities().convertIterableToArrayList(pieceInformationRepository.findAll());

        return new ResponseEntity<>(pieceInformationList, HttpStatus.OK);

    }

}
