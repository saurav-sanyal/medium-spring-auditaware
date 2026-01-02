package com.example.auditaware.controller;

import com.example.auditaware.model.Note;
import com.example.auditaware.repository.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/notes")
public class NoteController {
    @Autowired
    private NoteRepository noteRepository;

    @GetMapping
    public List<Note> getAllNotes() {
        return noteRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Note> getNoteById(@PathVariable String id) {
        return noteRepository.findById(id);
    }

    @PostMapping
    public Note createNote(@RequestBody Note note) {
        return noteRepository.save(note);
    }

    @PutMapping("/{id}")
    public Optional<Note> updateNote(@PathVariable String id, @RequestBody Note noteRequest) {
        return noteRepository.findById(id).map(note -> {
            note.setContent(noteRequest.getContent());
            return noteRepository.save(note);
        });
    }

    @DeleteMapping("/{id}")
    public void deleteNote(@PathVariable String id) {
        noteRepository.deleteById(id);
    }
}
