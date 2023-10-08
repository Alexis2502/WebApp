package com.example.WebApp;

import java.util.List;
public interface NoteService {
    List<Note> listOfNotes();
    void addNote(Note n);
}