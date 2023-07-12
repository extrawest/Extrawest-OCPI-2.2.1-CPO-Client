package com.extrawest.ocpi.service;

import com.extrawest.ocpi.model.AbstractDomainObject;
import com.extrawest.ocpi.model.dto.LocationDTO;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class CPOLocationServiceImpl implements CPOLocationService{
    @Override
    public List<LocationDTO> getLocations(LocalDateTime dateFrom, LocalDateTime dateTo, Integer offset, Integer limit) {
        return null;
    }

    @Override
    public AbstractDomainObject getLocationEvseController(String locationId, String evseUid, String connectorId) {
        return null;
    }
}
