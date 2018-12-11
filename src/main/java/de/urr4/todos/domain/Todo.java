package de.urr4.todos.domain;

import java.time.Duration;
import java.time.Instant;
import java.util.Objects;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Property;
import org.neo4j.ogm.annotation.Relationship;

@NodeEntity(label = "Todo")
public class Todo {

    @Id
    @GeneratedValue
    private Long id;

    @Property(value = "title")
    private String title;

    @Property(value = "description")
    private String description;

    @Relationship(value = "CREATED_BY")
    private User creator;

    @Property(value = "creationDaten")
    private Instant creationDateInstant;

    @Property(value = "dueDate")
    private Instant dueDateInstant;

    @Property(value = "reoccuringAfter")
    private Duration reoccuringAfterDuration;

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public User getCreator() {
        return creator;
    }

    public void setCreator(User creator) {
        this.creator = creator;
    }

    public Instant getCreationDateInstant() {
        return creationDateInstant;
    }

    public void setCreationDateInstant(Instant creationDateInstant) {
        this.creationDateInstant = creationDateInstant;
    }

    public Instant getDueDateInstant() {
        return dueDateInstant;
    }

    public void setDueDateInstant(Instant dueDateInstant) {
        this.dueDateInstant = dueDateInstant;
    }

    public Duration getReoccuringAfterDuration() {
        return reoccuringAfterDuration;
    }

    public void setReoccuringAfterDuration(Duration reoccuringAfterDuration) {
        this.reoccuringAfterDuration = reoccuringAfterDuration;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Todo todo = (Todo) o;
        return Objects.equals(title, todo.title) &&
                Objects.equals(description, todo.description) &&
                Objects.equals(creator, todo.creator) &&
                Objects.equals(creationDateInstant, todo.creationDateInstant) &&
                Objects.equals(dueDateInstant, todo.dueDateInstant) &&
                Objects.equals(reoccuringAfterDuration, todo.reoccuringAfterDuration);
    }

    @Override
    public int hashCode() {

        return Objects.hash(title, description, creator, creationDateInstant, dueDateInstant, reoccuringAfterDuration);
    }
}
