package com.extrawest.ocpi.service;

import com.extrawest.ocpi.model.dto.token.TokenDto;
import com.extrawest.ocpi.model.enums.TokenType;
import org.springframework.stereotype.Service;

@Service
public class CpoTokensServiceImpl implements CpoTokensService {
    @Override
    public TokenDto getToken(String countryCode, String partyId, String tokenUid, TokenType type) {
        return null;
    }

    @Override
    public TokenDto putToken(TokenDto tokenDTO, String countryCode, String partyId, String tokenUid, TokenType type) {
        return null;
    }

    @Override
    public TokenDto patchToken(TokenDto tokenDTO, String countryCode, String partyId, String tokenUid, TokenType type) {
        return null;
    }
}
