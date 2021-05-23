package casper.hrms.business.abstracts;

import java.util.List;

import casper.hrms.entities.concretes.JobTitle;

public interface JobTitleService {

	List<JobTitle> getAll();
}
