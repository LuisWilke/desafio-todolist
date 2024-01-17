package br.com.luiseduardo.desafiotodolist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.luiseduardo.desafiotodolist.entity.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long>
 {
    
}
