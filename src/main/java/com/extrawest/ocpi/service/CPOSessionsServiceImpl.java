package com.extrawest.ocpi.service;

import com.extrawest.ocpi.model.dto.ChargingPreferencesDTO;
import com.extrawest.ocpi.model.dto.SessionDTO;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class CPOSessionsServiceImpl implements CPOSessionsService{
    @Override
    public List<SessionDTO> getSessions(LocalDateTime dateFrom, LocalDateTime dateTo, Integer offset, Integer limit) {
        return null;
    }

    @Override
    public ChargingPreferencesDTO putChargingPreferences(String sessionId, ChargingPreferencesDTO chargingPreferencesDTO) {
        return null;
    }
}
