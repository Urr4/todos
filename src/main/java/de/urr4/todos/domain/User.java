package de.urr4.todos.domain;

import org.neo4j.ogm.annotation.NodeEntity;

import de.urr4.users.domain.BaseUser;


@NodeEntity(label = "TodoUser")
public class User extends BaseUser {

}
