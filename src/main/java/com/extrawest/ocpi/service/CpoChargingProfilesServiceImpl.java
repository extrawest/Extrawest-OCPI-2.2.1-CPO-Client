package com.extrawest.ocpi.service;

import com.extrawest.ocpi.model.dto.ResponseFormat;
import com.extrawest.ocpi.model.dto.charging_profile.ChargingProfile;
import com.extrawest.ocpi.model.dto.charging_profile.ChargingProfileResponse;
import com.extrawest.ocpi.model.dto.charging_profile.SetChargingProfile;
import org.springframework.stereotype.Service;

@Service
public class CpoChargingProfilesServiceImpl implements CpoChargingProfilesService{

    @Override
    public ChargingProfileResponse getChargingProfile(String sessionId, Integer duration, String responseUrl) {
        return null;
    }

    @Override
    public ResponseFormat putChargingProfile(String sessionId, SetChargingProfile setChargingProfileRequestDTO) {
        return null;
    }

    @Override
    public ChargingProfileResponse deleteChargingProfile(String sessionId, String responseUrl) {
        return null;
    }
}
