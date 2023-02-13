package org.example.spring.web.handler;

import org.example.spring.web.User;
import org.example.spring.web.binder.PropertyEditorSupportImpl;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class BinderController {
    @InitBinder
    public void initBinder(WebDataBinder webDataBinder){
        webDataBinder.registerCustomEditor(User.class, new PropertyEditorSupportImpl());
    }

    @RequestMapping("initBinder")
    public Map<String, Object> initBinder(@RequestParam("user")User user){
        var map = new HashMap<String, Object>();
        map.put("user", user);
        return map;
    }
}
