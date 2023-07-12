package com.extrawest.ocpi.service;

import com.extrawest.ocpi.model.dto.request.SetChargingProfileRequestDTO;
import com.extrawest.ocpi.model.dto.response.ChargingProfileResponseDTO;
import org.springframework.stereotype.Service;

@Service
public class CPOChargingProfilesServiceImpl implements CPOChargingProfilesService{
    @Override
    public ChargingProfileResponseDTO getChargingProfile(String sessionId, Integer duration, String responseUrl) {
        return null;
    }

    @Override
    public ChargingProfileResponseDTO putChargingProfile(String sessionId, SetChargingProfileRequestDTO setChargingProfileRequestDTO) {
        return null;
    }

    @Override
    public ChargingProfileResponseDTO deleteChargingProfile(String sessionId, String responseUrl) {
        return null;
    }
}
