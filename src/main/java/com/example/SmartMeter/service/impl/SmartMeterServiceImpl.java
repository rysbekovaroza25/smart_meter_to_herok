package com.example.SmartMeter.service.impl;

import com.example.SmartMeter.entity.SmartMeter;
import com.example.SmartMeter.repository.SmartMeterRepository;
import com.example.SmartMeter.service.SmartMeterService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SmartMeterServiceImpl implements SmartMeterService {
    private final SmartMeterRepository smartMeterRepository;

    public SmartMeterServiceImpl(SmartMeterRepository smartMeterRepository) {
        this.smartMeterRepository = smartMeterRepository;
    }

    @Override
    public SmartMeter save(SmartMeter smartMeter) {
        return smartMeterRepository.save(smartMeter);
    }

    @Override
    public SmartMeter getById(Long id) {
        return null;
    }

    @Override
    public List<SmartMeter> getAll() {
        return null;
    }
}
