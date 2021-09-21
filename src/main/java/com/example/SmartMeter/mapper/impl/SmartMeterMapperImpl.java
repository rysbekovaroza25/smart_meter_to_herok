package com.example.SmartMeter.mapper.impl;

import com.example.SmartMeter.dto.SmartMeterDto;
import com.example.SmartMeter.entity.SmartMeter;
import com.example.SmartMeter.mapper.SmartMeterMapper;
import org.springframework.stereotype.Service;

@Service
public class SmartMeterMapperImpl implements SmartMeterMapper {
    @Override
    public SmartMeterDto toSmartMeterDto(SmartMeter smartMeter) {
        if (smartMeter == null){
            return null;
        }

        SmartMeterDto smartMeterDto = new SmartMeterDto();
        smartMeterDto.setId(smartMeter.getId());
        smartMeterDto.setSmartMeterBarcode(smartMeter.getSmartMeterBarcode());
        smartMeterDto.setFirstName(smartMeter.getFirstName());
        smartMeterDto.setLastName(smartMeter.getLastName());

        return smartMeterDto;
    }
}
