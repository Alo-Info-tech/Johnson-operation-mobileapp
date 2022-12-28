package com.triton.johnsonapp.requestpojo;

public class ResumeJobRequest {
    private String user_id;
    private String activity_id ;
    private String job_id ;
    private String resume_time;

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getActivity_id() {
        return activity_id;
    }

    public void setActivity_id(String activity_id) {
        this.activity_id = activity_id;
    }

    public String getJob_id() {
        return job_id;
    }

    public void setJob_id(String job_id) {
        this.job_id = job_id;
    }

    public String getResume_time() {
        return resume_time;
    }

    public void setResume_time(String resume_time) {
        this.resume_time = resume_time;
    }
}
