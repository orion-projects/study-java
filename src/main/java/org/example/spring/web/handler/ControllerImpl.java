package org.example.spring.web.handler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

/**
 * @RequestMapping
 * 1、path: 指定URL路径
 * 2、method: 指定HTTP的方法。
 * 3、headers: 指定HTTP请求报文头
 * 4、params: 指定HTTP请求参数。
 */
@Controller
public class ControllerImpl {

    /**
     * @PathVariable 指定URL中的参数
     * @param userId
     * @return
     */
    @RequestMapping("PathVariable/{userId}")
    public ModelAndView PathVariable(@PathVariable("userId")String userId){
        var modelAndView = new ModelAndView();
        modelAndView.setViewName("PathVariable");
        modelAndView.getModelMap().addAttribute("userId", userId);
        return modelAndView;
    }

    /**
     * @RequestParam 指定URL中的参数
     * @param userId
     * @return
     */
    @RequestMapping("RequestParam")
    public ModelAndView RequestParam(@RequestParam("userId")String userId){
        var modelAndView = new ModelAndView();
        modelAndView.setViewName("RequestParam");
        modelAndView.getModelMap().addAttribute("userId", userId);
        return modelAndView;
    }

    @RequestMapping("RequestHeader")
    public ModelAndView RequestHeader(@RequestHeader("accept")String userId){
        var modelAndView = new ModelAndView();
        modelAndView.setViewName("RequestHeader");
        modelAndView.getModelMap().addAttribute("userId", userId);
        return modelAndView;
    }

    @RequestMapping("CookieValue")
    public ModelAndView cookieValue(@CookieValue(value = "userId", required = false)String userId){
        var modelAndView = new ModelAndView();
        modelAndView.setViewName("CookieValue");
        modelAndView.getModelMap().addAttribute("userId", userId);
        return modelAndView;
    }

    @RequestMapping("RequestBody")
    public ModelAndView requestBody(@RequestBody(required = false) String body){
        var modelAndView = new ModelAndView();
        modelAndView.setViewName("CookieValue");
        modelAndView.getModelMap().addAttribute("userId", body);
        return modelAndView;
    }

    @RequestMapping("ResponseBody")
    @ResponseBody
    public Map<String, String> responseBody(){
        var map = new HashMap<String, String>();
        map.put("key", "value");
        return map;
    }

    @ModelAttribute
    public Object modelAttribute(){
        return "abc";
    }

    @RequestMapping("ModelAttribute")
    public ModelAndView modelAttribute(@ModelAttribute String userId){
        return null;
    }

    @RequestMapping("SessionAttributes")
    public ModelAndView sessionAttributes(@SessionAttribute String userId){
        return null;
    }
}
