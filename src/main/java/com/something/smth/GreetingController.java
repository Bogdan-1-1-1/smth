package com.something.smth;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.awt.*;
import java.util.Map;

@Controller
public class GreetingController {

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name,
        Map<String, Object> model) {
        model.put("name", name);
        return "greeting";
    }
    @GetMapping
    public String method(Map<String, Object> model) {
        model.put("some", "let's try not to die while coding!!!");
        return "method";
    }
    @GetMapping("/meeting")
    public String meeting(@RequestParam(name="fuck", required=false, defaultValue="user") String name,
                           Map<String, Object> model) {
        model.put("name", name);
        System.out.println(model.get("name"));
        return "meeting";
    }
}