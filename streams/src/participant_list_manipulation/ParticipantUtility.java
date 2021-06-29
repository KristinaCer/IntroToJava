package participant_list_manipulation;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class ParticipantUtility {
    List<Participant> participantList = new ArrayList<Participant>();

    public List<Participant> getParticipantList() {
        return participantList;
    }

    public void setParticipantList(List<Participant> participantList) {
        this.participantList = participantList;
    }

    public void addParticipant(Participant pObj) {
        // Fill your code here
        participantList.add(pObj);
    }

    public Stream<Participant> viewAllParticipants(String departmentName,String collegeName) {
        // Fill your code here
        return this.participantList.stream()
                .filter(participant -> participant.collegeName.equalsIgnoreCase(collegeName))
                .filter(participant -> participant.departmentName.equalsIgnoreCase(departmentName))
                .sorted(Comparator.comparing(Participant::getParticipantName));
    }
}
