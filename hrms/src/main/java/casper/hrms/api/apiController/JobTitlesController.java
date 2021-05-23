package casper.hrms.api.apiController;

import java.util.List;

import casper.hrms.entities.concretes.JobTitle;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import casper.hrms.business.abstracts.JobTitleService;

@RestController
@RequestMapping(path = "api/job-titles")

public class JobTitlesController {
	private final JobTitleService jobTitleService;

	public JobTitlesController(JobTitleService jobTitleService) {
		super();
		this.jobTitleService = jobTitleService;
	} 
	
	@GetMapping(path = "getall")
    public List<JobTitle> getAll(){
        return jobTitleService.getAll();
}
}