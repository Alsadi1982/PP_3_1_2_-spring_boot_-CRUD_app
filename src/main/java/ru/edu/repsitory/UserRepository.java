package ru.edu.repsitory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.edu.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User findUserById(Long id);
}
