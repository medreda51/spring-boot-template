package es.nextdigital.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import es.nextdigital.demo.entity.Card;

public interface CardRepository extends JpaRepository<Card, Long> {
}
