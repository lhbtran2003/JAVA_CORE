package bai7;

public class GraduateStudent extends Student {
    private String researchTopic; //đề tài nghiên cứu
    private String supervisorName; // tên giảng viên hướng dẫn

    public GraduateStudent(String name, String id, double gpa, String researchTopic, String supervisorName) {
        super(name, id, gpa);
        this.researchTopic = researchTopic;
        this.supervisorName = supervisorName;
    }

    public String getResearchTopic() {
        return researchTopic;
    }

    public void setResearchTopic(String researchTopic) {
        if (researchTopic.isBlank()) {
            System.out.println("Research topic is blank");
            return;
        }
        this.researchTopic = researchTopic;
    }

    public String getSupervisorName() {
        return supervisorName;
    }

    public void setSupervisorName(String supervisorName) {
        this.supervisorName = supervisorName;
    }

    @Override
    public void getDetails() {
        super.getDetails();
        System.out.println("Research Topic: " + researchTopic);
        System.out.println("Supervisor Name: " + supervisorName);
    }

}
