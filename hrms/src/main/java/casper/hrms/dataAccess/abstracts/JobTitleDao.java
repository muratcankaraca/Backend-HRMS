package casper.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import casper.hrms.entities.concretes.JobTitle;

import org.springframework.data.repository.query.Param;

import java.util.Optional;


public interface JobTitleDao extends JpaRepository<JobTitle, Integer>{
	Optional<JobTitle> findOneByTitle(@Param("") String title);
	
}
