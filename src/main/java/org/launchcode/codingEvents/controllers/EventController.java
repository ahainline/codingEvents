package org.launchcode.codingEvents.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/events")
public class EventController {

    @GetMapping
    public String displayAllEvents(Model model) {
        List<String> events = new ArrayList<>();
        events.add("Gifted Writers Fall Classes");
        events.add("Novel Neighbor Book Club - October 2023");
        events.add("Rev. Dr. Amy Butler | Beautiful and Terrible Things");
        events.add("Ethel Morgan Smith | Path to Grace");
        model.addAttribute("events", events);

        return "events/index";

    }

    @GetMapping("/create")
    public String renderCreateEventForm() {
        return "events/create";
    }
}
