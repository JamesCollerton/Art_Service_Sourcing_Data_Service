package com.artservicesourcingdataservice.artservicesourcingdataservice.Controllers;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.artservicesourcingdataservice.artservicesourcingdataservice.Domain.DTO.PieceInformation;
import com.artservicesourcingdataservice.artservicesourcingdataservice.Repositories.PieceInformationRepository;

@Controller
@RequestMapping("/pieces")
public class PieceInformationController {

    @Autowired
    private PieceInformationRepository pieceInformationRepository;

    @GetMapping
    public ResponseEntity<List<PieceInformation>> getAllPieceInformation() {

        List<PieceInformation> pieceInformationList = new ArrayList<>();
        pieceInformationRepository.findAll().forEach(pieceInformationList::add);

        return new ResponseEntity<>(pieceInformationList, HttpStatus.OK);

    }

}
