package mytest;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

/**
 * Created by lq on 2018/3/6.
 */

public interface UserRepository extends JpaRepository<User, Long>, QuerydslPredicateExecutor {
}
