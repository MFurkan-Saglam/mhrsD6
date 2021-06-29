package kodlamaio.northwind.business.concretes;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.northwind.business.abstracts.JobService;
import kodlamaio.northwind.dataAccess.abstracts.JobsDao;
import kodlamaio.northwind.entities.concretes.Jobs;


@Service
public class JobManager implements JobService {
	
	private JobsDao jobsDao;
	
   @Autowired
	public JobManager(JobsDao jobsDao) {
		// TODO Auto-generated constructor stub
		super();
		this.jobsDao=jobsDao;
		
		
	}

	@Override
	public List<Jobs> getAll() {
		// TODO Auto-generated method stub
		return jobsDao.findAll();
	}

}
