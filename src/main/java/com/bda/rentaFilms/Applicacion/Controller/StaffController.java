package com.bda.rentaFilms.Applicacion.Controller;

import com.bda.rentaFilms.Applicacion.Request.CreateStaff;
import com.bda.rentaFilms.Applicacion.ResponseHandler;
import com.bda.rentaFilms.Model.Dto.StaffDto;
import com.bda.rentaFilms.Service.Contract.StaffService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/staffs")
public class StaffController {

    private final StaffService staffService;

    public StaffController(StaffService staffService) {
        this.staffService = staffService;
    }

    @GetMapping
    public ResponseEntity<Object> getAll(){
        List<StaffDto> staffDtos = this.staffService.getAll();
        return ResponseHandler.generateResponse( "correcto",HttpStatus.OK, staffDtos);
    }
    @PostMapping
    public ResponseEntity<Object> save(@RequestBody CreateStaff createStaff){
        StaffDto staffDto = StaffDto.from(createStaff);
        System.out.println(staffDto);
        StaffDto result = null;
        try {

            result = this.staffService.save(staffDto);
        }
        catch ( Exception ex){
            ex.printStackTrace();
            return ResponseHandler.generateResponse( "error",HttpStatus.BAD_REQUEST, ex.getMessage());
        }
        return ResponseHandler.generateResponse( "correcto",HttpStatus.CREATED, staffDto);
    }
}
