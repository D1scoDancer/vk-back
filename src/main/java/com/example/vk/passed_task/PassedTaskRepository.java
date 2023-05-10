package com.example.vk.passed_task;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PassedTaskRepository extends JpaRepository<PassedTask, Long> {
    List<PassedTask> findAllByUserId(Long userId);

    @Query("SELECT pt FROM PassedTask pt JOIN pt.task t WHERE t.type = :type AND pt.user.id = :userId")
    List<PassedTask> findAllByTaskType(@Param("type") String type, @Param("userId") Long userId);

    boolean existsPassedTaskByUserIdAndTaskId(Long user_id, Long taskId);


    @Query("SELECT p.user.id, t.type, COUNT(*) AS c FROM PassedTask p JOIN p.task t WHERE t.type = :type GROUP BY p.user.id, t.type ORDER BY c")
    List<Object[]> findCountByUserIdAndType(@Param("type") String type);


}

