package Classes;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import DatabaseUtils.DTO.JobHolderWrapper;
import DatabaseUtils.DTO.JobWrapper;

/**
 * Created by HPPC on 29-10-2017.
 */

public class JobHolder {
    private int jobHolderId;
    private String jobHolderTitle;
    private Date deadlineDate;
    private List<Job> listOfJobs;

    public List<Job> getListOfJobs() {
        return listOfJobs;
    }

    public void setListOfJobs(List<Job> listOfJobs) {
        this.listOfJobs = listOfJobs;
    }

    //TODO: Sonali
    public JobHolder viewAJobHolder(int JobHolderId) {
        JobHolder jobHolder = new JobHolder();
        return jobHolder;
    }

    public void insertJobHolder() {
        JobHolderWrapper jobholderDTO = new JobHolderWrapper();

        jobholderDTO.jobHolderId = jobHolderId;
        jobholderDTO.jobHolderTitle = jobHolderTitle;
        jobholderDTO.deadlineDate = deadlineDate;

    }
    public static JobHolder fetchJobHolder(int jobHolderId) {  JobHolder jobHolder= new JobHolder();
        //connect to DB fetch johholder write query select jobHolder from jobHolder
       JobHolderWrapper jobHolderDto=null;
        JobWrapper jobDto=null;
       jobHolder.jobHolderId=jobHolderDto.jobHolderId;
       jobHolder.jobHolderTitle=jobHolderDto.jobHolderTitle;
       jobHolder.deadlineDate=jobHolderDto.deadlineDate;
        List<Job> list = new ArrayList<Job>();
        //Connect db return List<Id> from job where jobholderid = jobHolderId
        List<Integer> relatedJObs = null;
        for(int Id : relatedJObs)
        {
            Job newJob = new Job();
            newJob = Job.fetchJob(Id);
            list.add(newJob);
        }
        jobHolder.listOfJobs = list;
        return jobHolder;
    }

}

