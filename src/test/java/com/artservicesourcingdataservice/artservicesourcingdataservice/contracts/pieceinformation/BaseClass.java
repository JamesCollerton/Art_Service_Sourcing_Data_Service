package com.artservicesourcingdataservice.artservicesourcingdataservice.contracts.pieceinformation;

import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import com.artservicesourcingdataservice.artservicesourcingdataservice.ArtServiceSourcingDataServiceApplication;
import com.artservicesourcingdataservice.artservicesourcingdataservice.controllers.PieceInformationController;
import com.artservicesourcingdataservice.artservicesourcingdataservice.domain.dto.MutablePieceInformation;
import com.artservicesourcingdataservice.artservicesourcingdataservice.repositories.PieceInformationRepository;
import io.restassured.module.mockmvc.RestAssuredMockMvc;

/**
 * This is the BaseClass for the CDC testing. It autowires a PieceInformationController
 * and also a mock repository to return test piece information.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = ArtServiceSourcingDataServiceApplication.class)
public class BaseClass {

    /**
     * Autowired controller for piece information
     */
    @Autowired
    private PieceInformationController pieceInformationController;

    /**
     * Mock piece information repository we can use to return test data
     */
    @MockBean
    private PieceInformationRepository pieceInformationRepository;

    /**
     * Used to set up the mock piece repository to return test data.
     */
    @Before
    public void setup() {
        RestAssuredMockMvc.standaloneSetup(pieceInformationController);

        MutablePieceInformation pieceInformationOne = new MutablePieceInformation(1l, "Title One", "Description One", "Image URL One");
        MutablePieceInformation pieceInformationTwo = new MutablePieceInformation(2l, "Title Two", "Description Two", "Image URL Two");

        Iterable<MutablePieceInformation> pieceInformations = Stream.of(pieceInformationOne, pieceInformationTwo).collect(Collectors.toList());

        Mockito.when(pieceInformationRepository.findAll()).thenReturn(pieceInformations);
    }

}
