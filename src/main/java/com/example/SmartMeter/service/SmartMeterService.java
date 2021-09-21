package com.example.SmartMeter.service;

import com.example.SmartMeter.entity.SmartMeter;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SmartMeterService {
    SmartMeter save(SmartMeter smartMeter);
    SmartMeter getById(Long id);
    List<SmartMeter> getAll();
}
