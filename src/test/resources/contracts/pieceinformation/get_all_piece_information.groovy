import org.springframework.cloud.contract.spec.Contract

Contract.make {
    description "should return a list of all piece information"

    request {
        url "/pieces"
        method GET()
    }

    response {
        status 200
        headers {
            contentType applicationJson()
        }
        body (
                """\
            [   {
                    "id": "1",
                    "title": "Title One",
                    "description": "Description One",
                    "imageUrl": "Image URL One"
                },
                {
                    "id": "2",
                    "title": "Title Two",
                    "description": "Description Two",
                    "imageUrl": "Image URL Two"
                }
            ]
        """
        )
    }
}