package com.bda.rentaFilms.Applicacion.Controller;

import com.bda.rentaFilms.Applicacion.Request.CreateStaff;
import com.bda.rentaFilms.Applicacion.ResponseHandler;
import com.bda.rentaFilms.Model.Dto.StaffDto;
import com.bda.rentaFilms.Model.Dto.StoreDto;
import com.bda.rentaFilms.Service.Contract.StoreService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/stores")
public class StoreController {

    private final StoreService storeService;

    public StoreController(StoreService storeService) {
        this.storeService = storeService;
    }

    @GetMapping
    public ResponseEntity<Object> getAll(){
        List<StoreDto> storeDtos = this.storeService.getAll();
        return ResponseHandler.generateResponse("correcto",HttpStatus.OK, storeDtos);
    }


}
