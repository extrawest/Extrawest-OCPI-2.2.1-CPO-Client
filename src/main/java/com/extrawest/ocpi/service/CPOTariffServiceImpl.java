package com.extrawest.ocpi.service;

import com.extrawest.ocpi.model.dto.TariffDTO;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class CPOTariffServiceImpl implements CPOTariffService{
    @Override
    public List<TariffDTO> getAll(LocalDateTime dateFrom, LocalDateTime dateTo, Integer offset, Integer limit) {
        return null;
    }
}
