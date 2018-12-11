package de.urr4.todos.domain;

import java.util.Set;

import de.urr4.users.domain.BaseUser;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

@NodeEntity(label = "TodoUser")
public class User extends BaseUser {

    @Relationship(value = "IS_ASSIGNED")
    private Set<Todo> todos;
}
