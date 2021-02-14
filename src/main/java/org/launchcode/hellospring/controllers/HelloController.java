package org.launchcode.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping()
public class HelloController {

    @GetMapping("goodbye")
    public String goodbye() {
        return "Goodbye, Spring";
    }

    @RequestMapping(method={RequestMethod.GET, RequestMethod.POST})
    public String helloWithQueryParam (@RequestParam String name) {
        return "Hello, " + name +"!";
    }

    @GetMapping("{name}")
    public String helloWithPathParam(@PathVariable String name) {
        return "Hello, " + name +"!";
    }

    @GetMapping("form")
    public String helloForm() {
//        String html = "<html>" +
//                "<body>" +
//                "<form action='hello' method='post'>" +
//                "<input type='text' name='name' placeholder='enter name'>" +
//                "<label for='language'>Language:</label>" +
//                "<select id='language' name='language'>" +
//                "<option value='english'>English</option>" +
//                "<option value='french'>French</option>" +
//                "<option value='spanish'>Spanish</option>" +
//                "<option value='german'>German</option>" +
//                "<option value='cherokee'>Cherokee</option>" +
//                "<input type='submit' value='Greet Me!'>" +
//                "</form>" +
//                "</body>" +
//                "</html>";
        return "form";
    }

@PostMapping("hello")
    public static String createMessage(@RequestParam String name, @RequestParam String language) {
        if(language.equals("cherokee")) {
            return "<html>" +
                    "<body style='font-family: verdana; text-align: center; color: green;'>" +
                    "Osiyo, " + name;
        } else if (language.equals("french")) {
            return "<html>" +
                    "<body style='font-family: verdana; text-align: center; color: green;'>" +
                    "Bonjour, " + name + "!";
        } else if (language.equals("german")) {
            return "<html>" +
                    "<body style='font-family: verdana; text-align: center; color: green;'>" +
                    "Hallo, " + name + "!";
        } else if (language.equals("spanish")) {
            return "<html>" +
                    "<body style='font-family: verdana; text-align: center; color: green;'>" +
                    "&iexcl;Hola, " + name + "!";
        } else {
            return "<html>" +
                    "<body style='font-family: verdana; text-align: center; color: green;'>" +
                    "Hello, " + name + "!";
        }
    }
}
