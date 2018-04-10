package com.waylau.spring.websocket.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 聊天控制器.
 * 
 * @since 1.0.0 2018年4月2日
 * @author <a href="https://waylau.com">Way Lau</a> 
 */
@Controller
public class ChatController {
    
    @GetMapping("/")
    public String index() {
        return "index";
    }

}
