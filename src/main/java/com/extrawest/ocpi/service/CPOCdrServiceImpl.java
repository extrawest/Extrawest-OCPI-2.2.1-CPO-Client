package com.extrawest.ocpi.service;

import com.extrawest.ocpi.model.dto.CdrDTO;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class CPOCdrServiceImpl implements CPOCdrService{
    @Override
    public List<CdrDTO> getCdr(LocalDateTime dateFrom, LocalDateTime dateTo, Integer offset, Integer limit) {
        return null;
    }
}
