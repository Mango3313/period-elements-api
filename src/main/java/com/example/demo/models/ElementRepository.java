package com.example.demo.models;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ElementRepository extends JpaRepository<Element, Integer> {
	public List<Element> findByGroup(String groupValue);
}
