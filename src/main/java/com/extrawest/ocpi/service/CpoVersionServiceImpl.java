package com.extrawest.ocpi.service;

import com.extrawest.ocpi.model.dto.VersionDetailsDto;
import com.extrawest.ocpi.model.dto.VersionDto;
import com.extrawest.ocpi.model.enums.VersionNumber;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CpoVersionServiceImpl implements CpoVersionService {
    @Override
    public List<VersionDto> getVersions() {
        return null;
    }

    @Override
    public VersionDetailsDto getVersionDetails(VersionNumber version) {
        return null;
    }
}
