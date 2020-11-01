package idev.springframework.msservice.web.controller;

import java.util.UUID;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import idev.springframework.msservice.web.model.BeerDto;

@RequestMapping("/api/v1/beer")
@RestController
public class BeerController {
    @GetMapping("/{beerId}")
    public ResponseEntity<BeerDto> getBeerById(@PathVariable("beerId") UUID beerId) {
        //todo implementation
        return new ResponseEntity<>(BeerDto.builder()
                                           .build(), HttpStatus.OK);
    }

    @PostMapping()
    public ResponseEntity saveNewBeer(@RequestBody BeerDto beer) {
        //todo implementation
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @PutMapping("/{beerId}")
    public ResponseEntity updateBeerById(
            @PathVariable("beerId") UUID beerId,
            @RequestBody BeerDto beer
    ) {
        //todo implementation
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }
}
