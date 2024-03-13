package org;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@ToString

public class Note {
    protected LocalDateTime date;
    protected Integer id;
    protected String note;

    public Note(Integer id,String note) {
        this.id = id;
        this.note = note;
        this.date = LocalDateTime.now().withNano(0);
    }
}
