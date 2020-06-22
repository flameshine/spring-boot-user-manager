package app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import app.models.User;

public interface UserRepository extends JpaRepository<User, Long> {}