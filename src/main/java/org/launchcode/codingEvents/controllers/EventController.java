package org.launchcode.codingEvents.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;


@Controller
@RequestMapping("/events")
public class EventController {

    private static HashMap<String, String> events = new HashMap<>();

    @GetMapping
    public String displayAllEvents(Model model) {
        events.put("St. Louis Code and Coffee", "Twice monthly coding meetup for all skill levels at TechArtista");
        events.put("Code Til Dawn", "Once a month event for all tech specialties of all skill levels");
        events.put("Women Who Code", "Group focused on inclusion in the tech industry putting on various events");
        model.addAttribute("events", events);
        return "events/index";

    }

    @GetMapping("/create")
    public String renderCreateEventForm() {
        return "events/create";
    }

//    @PostMapping("/create")
//    public String createEvent(@RequestParam String eventName) {
//        events.add(eventName);
//        return "redirect:/events";
//    }
}
