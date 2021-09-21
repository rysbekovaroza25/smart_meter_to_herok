package com.example.SmartMeter.mapper;

import com.example.SmartMeter.dto.SmartMeterDto;
import com.example.SmartMeter.entity.SmartMeter;

public interface SmartMeterMapper {
    SmartMeterDto toSmartMeterDto(SmartMeter smartMeter);
}
