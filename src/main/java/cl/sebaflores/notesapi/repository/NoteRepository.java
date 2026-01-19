package cl.sebaflores.notesapi.repository;

import cl.sebaflores.notesapi.domain.Note;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NoteRepository extends JpaRepository<Note, Long> {
}