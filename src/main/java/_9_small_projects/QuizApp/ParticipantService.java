package _9_small_projects.QuizApp;

import java.util.Optional;

public class ParticipantService extends Participant {

    public Optional<Participant> fetchParticipant(String name, String lastName, Integer age) {
        if ("Dorota".equals((name))) {
            return Optional.of(new Participant("Dorota"));
        } else return Optional.empty();
    }
}