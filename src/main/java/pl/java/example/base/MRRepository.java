package pl.java.example.base;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.NoRepositoryBean;

/**
 * 
 * @author ngraczykowski
 *
 */
@NoRepositoryBean
public interface MRRepository<ENTITY> extends JpaRepository<ENTITY, Long>, JpaSpecificationExecutor<ENTITY>{

}
