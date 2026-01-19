package cl.sebaflores.notesapi.service;

import cl.sebaflores.notesapi.domain.Note;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class NoteService {

    private final List<Note> notes = new ArrayList<>();
    private final AtomicLong nextId = new AtomicLong(1);

    public List<Note> getAllNotes() {
        return notes;
    }

    public Note createNote(Note note) {
        note.setId(nextId.getAndIncrement());
        notes.add(note);
        return note;
    }

}
