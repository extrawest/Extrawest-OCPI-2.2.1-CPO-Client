package com.extrawest.ocpi.service;

import com.extrawest.ocpi.model.dto.response.VersionDetailsResponseDTO;
import com.extrawest.ocpi.model.dto.response.VersionResponseDTO;
import com.extrawest.ocpi.model.enums.VersionNumber;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CPOVersionServiceImpl implements CPOVersionService{
    @Override
    public List<VersionResponseDTO> getVersion() {
        return null;
    }

    @Override
    public VersionDetailsResponseDTO getVersionDetails(VersionNumber version) {
        return null;
    }
}
