package org.aibles.clean_architecture.infrastructure.configuration.db.repository;

import org.aibles.clean_architecture.infrastructure.configuration.db.schema.BookSchema;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<BookSchema, Long> {

}
