package cl.sebaflores.notesapi.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "notes")
public class Note {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    @Column(columnDefinition = "TEXT")
    private String content;

    protected Note() {
        // constructor vacío requerido por JPA
    }

    public Note(String title, String content) {
        this.title = title;
        this.content = content;
    }

    // getters y setters
    public Long getId() { return id; }
    public String getTitle() { return title; }
    public String getContent() { return content; }

    public void setTitle(String title) { this.title = title; }
    public void setContent(String content) { this.content = content; }
}
