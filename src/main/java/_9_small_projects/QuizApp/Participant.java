package _9_small_projects.QuizApp;

import java.util.Set;
import java.util.TreeSet;

public class Participant {
    private String name;
    private String lastName;
    private Integer age;

    addParticipants(Participant... participants) {
        Set<Participant> participantsSet = new TreeSet<>();
        for (Participant participant : participantsSet) {
            participantsSet.add(participant);
        }
    }

    showParticipantsSet(Set<Participant> participantsSet) {
        for (Participant participant : participantsSet) {
            System.out.println(participant.getName() + " " + participant.getLastName());
        }
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}