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
@SessionAttributes("userId")
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

    /**
     * 用于获取multiparty/form-data（文件上传请求）请求的请求体数据。
     * @param str
     * @return
     */
    @RequestMapping("requestPart")
    public ModelAndView requestPart(@RequestPart String str){
        return null;
    }

    /**
     * 获取request中指定属性的值。相当于调用request.getAttribute()。
     * @param str
     * @return
     */
    @RequestMapping("requestAttribute")
    public ModelAndView requestAttribute(@RequestAttribute("string") String str){
        return null;
    }

    /**
     * 修饰方法，将该方法的返回值绑定到model。可以相控制器一样使用注解获取参数。
     */
    @ModelAttribute
    public Object modelAttribute(){
        return "abc";
    }

    /**
     * 修饰参数，将该参数绑定到model。
     * @param userId
     * @return
     */
    @RequestMapping("ModelAttribute")
    public ModelAndView modelAttribute(@ModelAttribute String userId){
        return null;
    }

    /**
     * 获取session中指定的值。
     * @param userId
     * @return
     */
    @RequestMapping
    public ModelAndView sessionAttribute(@SessionAttribute("userId") String userId){
        return null;
    }

    /**
     * 将指定的参数存储到session。
     * @param userId
     * @return
     */
    @RequestMapping("SessionAttributes")
    public ModelAndView sessionAttributes(@SessionAttribute String userId){
        return null;
    }

    @RequestMapping("crossOrigin")
    @CrossOrigin
    public ModelAndView crossOrigin(){
        return null;
    }
}
