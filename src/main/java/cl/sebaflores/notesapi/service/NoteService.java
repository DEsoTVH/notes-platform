package cl.sebaflores.notesapi.service;

import cl.sebaflores.notesapi.domain.Note;
import cl.sebaflores.notesapi.repository.NoteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoteService {

    private final NoteRepository noteRepository;

    public NoteService(NoteRepository noteRepository) {
        this.noteRepository = noteRepository;
    }

    public List<Note> getAllNotes() {
        return noteRepository.findAll();
    }

    public Note createNote(String title, String content) {
        Note note = new Note(title, content);
        return noteRepository.save(note);
    }
}
