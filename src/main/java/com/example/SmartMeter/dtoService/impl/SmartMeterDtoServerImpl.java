package com.example.SmartMeter.dtoService.impl;

import com.example.SmartMeter.dto.CreateSmartMeterDto;
import com.example.SmartMeter.dto.SmartMeterDto;
import com.example.SmartMeter.dtoService.SmartMeterDtoServer;
import com.example.SmartMeter.entity.SmartMeter;
import com.example.SmartMeter.mapper.SmartMeterMapper;
import com.example.SmartMeter.service.SmartMeterService;
import org.springframework.stereotype.Service;

@Service
public class SmartMeterDtoServerImpl implements SmartMeterDtoServer {
    private final SmartMeterService smartMeterService;
    private final SmartMeterMapper smartMeterMapper;

    public SmartMeterDtoServerImpl(SmartMeterService smartMeterService, SmartMeterMapper smartMeterMapper) {
        this.smartMeterService = smartMeterService;
        this.smartMeterMapper = smartMeterMapper;
    }

    @Override
    public SmartMeterDto create(CreateSmartMeterDto createSmartMeterDto) {
        SmartMeter smartMeter = new SmartMeter();

        smartMeter.setFirstName(createSmartMeterDto.getFirstName());
        smartMeter.setLastName(createSmartMeterDto.getLastName());
        smartMeter.setSmartMeterBarcode(createSmartMeterDto.getSmartMeterBarcode());
        return smartMeterMapper.toSmartMeterDto(smartMeterService.save(smartMeter));
    }
}
