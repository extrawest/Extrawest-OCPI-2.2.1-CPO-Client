package com.extrawest.ocpi.service;

import com.extrawest.ocpi.model.dto.cdr.CDRDto;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class CpoCdrServiceImpl implements CpoCdrService {
    @Override
    public List<CDRDto> getCdr(LocalDateTime dateFrom, LocalDateTime dateTo, Integer offset, Integer limit) {
        return null;
    }

    @Override
    public long getTotalCount(LocalDateTime dateFrom, LocalDateTime dateTo) {
        return 0;
    }
}
