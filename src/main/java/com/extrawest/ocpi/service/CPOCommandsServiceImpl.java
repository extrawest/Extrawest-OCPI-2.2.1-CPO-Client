package com.extrawest.ocpi.service;

import com.extrawest.ocpi.model.AbstractCommand;
import com.extrawest.ocpi.model.dto.response.CommandResponseDTO;
import com.extrawest.ocpi.model.enums.CommandType;
import org.springframework.stereotype.Service;

@Service
public class CPOCommandsServiceImpl implements CPOCommandsService{
    @Override
    public CommandResponseDTO postCommand(CommandType command, AbstractCommand requestedCommand) {
        return null;
    }
}
