package com.example.SmartMeter.dtoService;

import com.example.SmartMeter.dto.CreateSmartMeterDto;
import com.example.SmartMeter.dto.SmartMeterDto;
import org.springframework.stereotype.Service;

@Service
public interface SmartMeterDtoServer {
    SmartMeterDto create(CreateSmartMeterDto createSmartMeterDto);
}
