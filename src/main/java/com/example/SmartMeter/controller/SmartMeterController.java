package com.example.SmartMeter.controller;

import com.example.SmartMeter.dto.CreateSmartMeterDto;
import com.example.SmartMeter.dto.SmartMeterDto;
import com.example.SmartMeter.dtoService.SmartMeterDtoServer;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/smart_meter")
public class SmartMeterController {

    private final SmartMeterDtoServer smartMeterDtoServer;

    public SmartMeterController(SmartMeterDtoServer smartMeterDtoServer) {
        this.smartMeterDtoServer = smartMeterDtoServer;
    }

    @PostMapping
    public SmartMeterDto create(@RequestBody CreateSmartMeterDto createSmartMeterDto){
        return smartMeterDtoServer.create(createSmartMeterDto);
    }
}
