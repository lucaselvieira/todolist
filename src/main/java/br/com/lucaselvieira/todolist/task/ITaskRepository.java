package br.com.lucaselvieira.todolist.task;

import java.util.List;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITaskRepository extends JpaRepository<TaskModel, UUID> {
  List<TaskModel> findBfindByIdUser(UUID idUser);
}
