package com.extrawest.ocpi.service;

import com.extrawest.ocpi.model.dto.ClientInfoDTO;
import com.extrawest.ocpi.service.HubClientInfoService;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class HubClientInfoServiceImpl implements HubClientInfoService {
    @Override
    public List<ClientInfoDTO> getClientInfoList(LocalDateTime dateFrom, LocalDateTime dateTo, Integer offset, Integer limit) {
        return null;
    }
}
