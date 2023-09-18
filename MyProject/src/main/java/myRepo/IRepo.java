package myRepo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import myEntity.IEntity;

@Repository
public interface IRepo  extends JpaRepository<IEntity, Integer>{
	
}

	
