package com.extrawest.ocpi.service;

import com.extrawest.ocpi.mapper.TariffMapper;
import com.extrawest.ocpi.model.TariffModel;
import com.extrawest.ocpi.model.dto.tariff.TariffDto;
import com.extrawest.ocpi.repository.TariffRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CpoTariffServiceImpl implements CpoTariffService {
    private final TariffRepository tariffRepository;
    private final TariffMapper tariffMapper;

    @Override
    public List<TariffDto> getAll(LocalDateTime dateFrom, LocalDateTime dateTo, Integer offset, Integer limit) {
        List<TariffModel> all = tariffRepository.findAll();
        return all.stream().map(m -> tariffMapper.toDto(m)).collect(Collectors.toList());
    }

    @Override
    public long getTotalCount(LocalDateTime dateFrom, LocalDateTime dateTo) {
        return 0;
    }
}
