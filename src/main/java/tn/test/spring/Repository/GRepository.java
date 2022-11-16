package tn.test.spring.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface GRepository<T, ID> extends JpaRepository<T, ID> {
}
