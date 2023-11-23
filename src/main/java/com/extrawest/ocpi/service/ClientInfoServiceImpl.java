package com.extrawest.ocpi.service;

import com.extrawest.ocpi.model.dto.ClientInfoDto;
import org.springframework.stereotype.Service;

@Service
public class ClientInfoServiceImpl implements ClientInfoService {
    @Override
    public ClientInfoDto getHubClientInfo(String countryCode, String partyId) {
        return null;
    }

    @Override
    public void putHubClientInfo(String countryCode, String partyId) {

    }
}
