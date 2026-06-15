package com.eventostec.api.repositories;

import com.eventostec.api.domain.event.Event;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;
//O JpaRepository elimina a necessidade de escrever SQL, fornece operações completas de banco de dados (CRUD) prontas para uso.
public interface EventRepository extends JpaRepository<Event, UUID> {
};