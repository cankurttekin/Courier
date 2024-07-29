package com.cankurttekin.Courier.presentation.rest;

import com.cankurttekin.Courier.application.constant.Path;
import com.cankurttekin.Courier.application.dto.CourierLocatorDTO;
import com.cankurttekin.Courier.application.mapper.CourierLocatorMapper;
import com.cankurttekin.Courier.domain.entity.CourierLocator;
import com.cankurttekin.Courier.domain.service.CourierLocatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(Path.BASE_PATH_COURIER_LOCATOR)
public class CourierLocatorController {

    @Autowired private CourierLocatorService courierLocatorService;
    @Autowired private CourierLocatorMapper courierLocatorMapper;

    @GetMapping("/{id}")
    public ResponseEntity<CourierLocatorDTO> getCourierLocationById(@PathVariable Long id) {
        CourierLocator courierLocator = courierLocatorService.getCourierLocationById(id);
        return ResponseEntity.ok(courierLocatorMapper.toDTO(courierLocator));

    }

    @PostMapping
    public ResponseEntity<CourierLocatorDTO> createCourierLocator(@RequestBody CourierLocatorDTO courierLocatorDTO) {
        CourierLocator courierLocator = courierLocatorMapper.toEntity(courierLocatorDTO);
        return null; //imp
    }

}
