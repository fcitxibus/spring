package com.lion.service.impl;

import com.lion.service.IMessageService;

public class MessageServiceImpl implements IMessageService {
        public String echo(String msg) {
            return "[ECHO]" + msg ;
        }
    }


