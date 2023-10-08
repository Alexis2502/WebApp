package com.example.WebApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class NoteServiceImp implements NoteService {
    @Autowired
    private NoteRepo noteRepo;

    @Override
    public List<Note> listOfNotes() {
        return noteRepo.findByOrderByTimestampDesc();
    }

    @Override
    public void addNote(Note n) {
        n.setId(null);
        n.setTimestamp(new Date());
        noteRepo.save(n);
    }
}