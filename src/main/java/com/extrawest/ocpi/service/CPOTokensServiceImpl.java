package com.extrawest.ocpi.service;

import com.extrawest.ocpi.model.dto.TokenDTO;
import com.extrawest.ocpi.model.enums.TokenType;
import org.springframework.stereotype.Service;

@Service
public class CPOTokensServiceImpl implements CPOTokensService{
    @Override
    public TokenDTO getToken(String countryCode, String partyId, String tokenUid, TokenType type) {
        return null;
    }

    @Override
    public void putToken(TokenDTO tokenDTO, String countryCode, String partyId, String tokenUid, TokenType type) {

    }

    @Override
    public void patchToken(TokenDTO tokenDTO, String countryCode, String partyId, String tokenUid, TokenType type) {

    }
}
