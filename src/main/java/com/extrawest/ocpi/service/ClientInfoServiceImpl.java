package com.extrawest.ocpi.service;

import com.extrawest.ocpi.model.dto.ClientInfoDTO;
import com.extrawest.ocpi.service.ClientInfoService;
import org.springframework.stereotype.Service;

@Service
public class ClientInfoServiceImpl implements ClientInfoService {
    @Override
    public ClientInfoDTO getHubClientInfo(String countryCode, String partyId) {
        return null;
    }

    @Override
    public void putHubClientInfo(String countryCode, String partyId) {

    }
}
