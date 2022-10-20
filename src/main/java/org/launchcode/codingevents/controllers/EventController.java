package org.launchcode.codingevents.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Controller
@RequestMapping("events")
public class EventController {

    @GetMapping
    public String displayAllEvents(Model model) {
        HashMap<String, String> events = new HashMap<>();
        events.put("Techstronauts Coding Club by WeCode KC!\n", "\nSat, November 5, 2022, 10:00 AM – 12:00 PM CDT");
        events.put("Happy Hour of Code!\n", "\nWed, November 9, 2022, 4:30 PM – 7:00 PM CST");
        events.put("Introduction to Python Programming by Teach The Nation to Code\n", "\nSat, 22 October 2022, 10:00 – 14:00 BST");
        model.addAttribute("events", events);
        return "events/index";

//        List<String> events = new ArrayList<>();
//        events.add("Code with Pride");
//        events.add("Strange Loop");
//        events.add("Apple WWDC");
//        events.add("SpringOne Platform");
//        model.addAttribute("events", events);
//        return "events/index";
    }

    // lives at /events/create
    @GetMapping("create")
    public String renderCreateEventForm() {
        return "events/create";
    }
}
