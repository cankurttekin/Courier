package com.cankurttekin.Courier.presentation.rest;

import com.cankurttekin.Courier.application.constant.Path;
import com.cankurttekin.Courier.application.dto.CourierDTO;
import com.cankurttekin.Courier.application.mapper.CourierMapper;
import com.cankurttekin.Courier.application.mapper.CourierMapperImpl;
import com.cankurttekin.Courier.domain.entity.Courier;
import com.cankurttekin.Courier.domain.entity.DeliveryStatus;
import com.cankurttekin.Courier.domain.service.CourierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(Path.BASE_PATH_COURIER)
public class CourierController {

    @Autowired private CourierService courierService;
    @Autowired private CourierMapper courierMapper;

    @GetMapping("/{id}")
    public ResponseEntity<CourierDTO> getCourierById(@PathVariable Long id) {
        Courier courier = courierService.getCourierById(id);
        return  ResponseEntity.ok(courierMapper.toDTO(courier));
    }
    @PostMapping
    public ResponseEntity<CourierDTO> createCourier(@RequestBody CourierDTO courierDTO) {
        Courier courier = courierMapper.toEntity(courierDTO);
        Courier theCourier = courierService.createCourier(courier);
        return ResponseEntity.status(HttpStatus.CREATED).body(courierMapper.toDTO(theCourier));
    }

    @PutMapping("/{id}/status")
    public ResponseEntity<Void> updateCourierStatus(@PathVariable Long id, @RequestBody DeliveryStatus status) {
        courierService.updateCourier(id, status);
        return ResponseEntity.noContent().build();
    }
}
