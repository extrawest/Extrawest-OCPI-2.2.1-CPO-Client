package com.extrawest.ocpi.service;

import com.extrawest.ocpi.model.dto.AbstractDomainObject;
import com.extrawest.ocpi.model.dto.location.Connector;
import com.extrawest.ocpi.model.dto.location.EVSE;
import com.extrawest.ocpi.model.dto.location.Location;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class CpoLocationServiceImpl implements CpoLocationService{
    @Override
    public List<Location> getLocations(LocalDateTime dateFrom, LocalDateTime dateTo, Integer offset, Integer limit) {
        return null;
    }

    @Override
    public long getTotalCount(LocalDateTime dateFrom, LocalDateTime dateTo) {
        return 0;
    }

    @Override
    public Location getLocation(String countryCode, String partyId, String locationId) {
        return null;
    }

    @Override
    public EVSE getEvse(String countryCode, String partyId, String locationId, String evseUid) {
        return null;
    }

    @Override
    public Connector getConnector(String countryCode, String partyId, String locationId, String evseUid, String connectorId) {
        return null;
    }
}
