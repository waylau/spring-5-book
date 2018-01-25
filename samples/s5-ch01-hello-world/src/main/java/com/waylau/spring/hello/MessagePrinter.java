/**
 * Welcome to https://waylau.com
 */
package com.waylau.spring.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.waylau.spring.hello.service.MessageService;

/**
 * Message Printer.
 * 
 * @since 1.0.0 2018年1月25日
 * @author <a href="https://waylau.com">Way Lau</a>
 */
@Component
public class MessagePrinter {

    final private MessageService service;

    @Autowired
    public MessagePrinter(MessageService service) {
        this.service = service;
    }

    public void printMessage() {
        System.out.println(this.service.getMessage());
    }
}