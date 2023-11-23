package com.extrawest.ocpi.service;

import com.extrawest.ocpi.model.dto.command.AbstractCommand;
import com.extrawest.ocpi.model.dto.command.CommandResponse;
import com.extrawest.ocpi.model.enums.CommandType;
import org.springframework.stereotype.Service;

@Service
public class CpoCommandsServiceImpl implements CpoCommandsService{
    @Override
    public CommandResponse postCommand(CommandType command, AbstractCommand requestedCommand) {
        return null;
    }
}
