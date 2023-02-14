package org.example.spring.web.upload;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.Map;

@RestController
public class UploadController {

    @RequestMapping("upload")
    public Map<String, Object> upload(HttpServletRequest httpServletRequest) throws ServletException, IOException {
        var result = httpServletRequest.getParts();
        for (var part : result){
            System.out.println(part);
        }
        return Map.of("result", true);
    }
}
