package seminar3;

public class Controller {

    private final StudyGroupService groupService;
    private final StudyFlowService flowService;

    Controller(StudyFlow currentFlow, StudyGroup currentGroup) {
        flowService = new StudyFlowService(currentFlow);
        groupService = new StudyGroupService(currentGroup);
    }

    public void remove(String lastName, String firstName, String middleName) {
        if (lastName.equals("")) {
            System.out.println("Не введена фамилия!");
        } else if (firstName.equals("")) {
            System.out.println("Не введено имя!");
        } else {
            groupService.removeToFIO(lastName, firstName, middleName);
        }
    }

    public void sortToId() {
        groupService.sortToId();
    }

    public void sortToFio() {
        groupService.sortToFIO();
    }

    public void sortToStudentSize() {
        flowService.sortToStudentsSize();
    }
}
