package org.example.spring.web.binder;

import org.example.spring.web.binder.converter.PropertyEditorSupportImpl;
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
        webDataBinder.registerCustomEditor(ConverterBean.class, new PropertyEditorSupportImpl());
    }

    @RequestMapping("initBinder")
    public Map<String, Object> initBinder(@RequestParam("converterBean")ConverterBean converterBean){
        var map = new HashMap<String, Object>();
        map.put("converterBean", converterBean);
        return map;
    }
}
