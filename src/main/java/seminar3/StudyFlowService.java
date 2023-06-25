package seminar3;

import javax.swing.*;
import java.util.List;

public class StudyFlowService {
    private final StudyFlow flow;

    StudyFlowService(StudyFlow currentFlow) {
        flow = currentFlow;
    }

    public void sortToStudentsSize() {
        StudyFlowComparator comp = new StudyFlowComparator();
        flow.groupList.sort(comp);
    }
}
