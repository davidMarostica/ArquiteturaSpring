package io.github.davidMarostica.arquiteturaspring.todos;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends JpaRepository<TodoEntity, Integer> {
    boolean existsByDescricao(String descricao);

    boolean existsByDescricaoIgnoreCase(String descricao);
}

