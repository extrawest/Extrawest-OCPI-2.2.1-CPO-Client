package com.extrawest.ocpi.service;

import com.extrawest.ocpi.model.dto.ChargingPreferences;
import com.extrawest.ocpi.model.dto.SessionDto;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class CpoSessionsServiceImpl implements CpoSessionsService{
    @Override
    public List<SessionDto> getSessions(LocalDateTime dateFrom, LocalDateTime dateTo, Integer offset, Integer limit) {
        return null;
    }

    @Override
    public long getTotalCount(LocalDateTime dateFrom, LocalDateTime dateTo) {
        return 0;
    }

    @Override
    public ChargingPreferences putChargingPreferences(String sessionId, ChargingPreferences chargingPreferencesDTO) {
        return null;
    }
}
