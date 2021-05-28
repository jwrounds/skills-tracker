package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class SkillsController {

    @GetMapping
    @ResponseBody
    public String skillsList() {
        return "<html>" +
                "<h1>Skills Tracker</h1>" +
                "<h2>Here are the skills we want to learn!</h2>" +
                "<ol>" +
                "<li>Java</li>" +
                "<li>JavaScript</li>" +
                "<li>Ruby</li>" +
                "</ol>" +
                "</html>";
    }

    @GetMapping("form")
    @ResponseBody
    public String skillsForm() {
        return "<html>" +
                "<form action='form' method='post'>" +
                "<Label>Name:</label>" +
                "<br>" +
                "<input type='text' name='name'>" +
                "<br>" +
                "<label>My favorite language:</label>" +
                "<br>" +
                "<select name='languageOne'>" +
                "<option value=''>--Please choose an option--</option>" +
                "<option value='Java'>Java</option>" +
                "<option value='Javascript'>JavaScript</option>" +
                "<option value='Ruby'>Ruby</option>" +
                "<option value='C#'>C#</option>" +
                "<option value='C++'>C++</option>" +
                "<option value='Python'>Python</option>" +
                "</select>" +
                "<br>" +
                "<label>My second favorite language:</label>" +
                "<br>" +
                "<select name='languageTwo'>" +
                "<option value=''>--Please choose an option--</option>" +
                "<option value='Java'>Java</option>" +
                "<option value='Javascript'>JavaScript</option>" +
                "<option value='Ruby'>Ruby</option>" +
                "<option value='C#'>C#</option>" +
                "<option value='C++'>C++</option>" +
                "<option value='Python'>Python</option>" +
                "</select>" +
                "<br>" +
                "<label>My third favorite language:</label>" +
                "<br>" +
                "<select name='languageThree'>" +
                "<option value=''>--Please choose an option--</option>" +
                "<option value='Java'>Java</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='Ruby'>Ruby</option>" +
                "<option value='C#'>C#</option>" +
                "<option value='C++'>C++</option>" +
                "<option value='Python'>Python</option>" +
                "</select>" +
                "<br>" +
                "<input type='submit' value='Submit'>" +
                "</form>" +
                "</html>";
    }

    @PostMapping("form")
    @ResponseBody
    public String favoriteLanguages(@RequestParam String name, String languageOne, String languageTwo, String languageThree) {
        return "<html>" +
                "<h1>" + name + "</h1>" +
                "<ol>" +
                "<li>" + languageOne + "</li>" +
                "<li>" + languageTwo + "</li>" +
                "<li>" + languageThree + "</li>" +
                "</ol>" +
                "</html>";
    }
}
