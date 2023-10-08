package com.example.WebApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/notes")
public class WebAppController {
    @Autowired
    private NoteService noteService;

    @GetMapping
    public String WebAppGet(Model model){
        model.addAttribute("note",new Note());
        model.addAttribute("existingNotes",noteService.listOfNotes());
        return "WebAppHTML";
    }

    @PostMapping
    public String WebAppPost(@ModelAttribute Note note){
        noteService.addNote(note);
        return "redirect:/notes";
    }
}