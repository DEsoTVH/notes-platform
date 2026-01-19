package cl.sebaflores.notesapi.controller;

import cl.sebaflores.notesapi.service.NoteService;
import cl.sebaflores.notesapi.domain.Note;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/notes")
public class NoteController {

    private final NoteService noteService;

    public NoteController(NoteService noteService) {
        this.noteService = noteService;
    }

    @GetMapping
    public List<Note> getAllNotes() {
        return noteService.getAllNotes();
    }
    @PostMapping
    public Note createNote(@RequestBody Note note) {
        return noteService.createNote(note);
    }

}
