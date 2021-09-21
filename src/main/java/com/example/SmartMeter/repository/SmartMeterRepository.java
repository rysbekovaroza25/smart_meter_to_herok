package com.example.SmartMeter.repository;

import com.example.SmartMeter.entity.SmartMeter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SmartMeterRepository extends JpaRepository<SmartMeter, Long> {
}
