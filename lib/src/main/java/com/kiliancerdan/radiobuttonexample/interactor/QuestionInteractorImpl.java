package com.kiliancerdan.radiobuttonexample.interactor;

import com.kiliancerdan.radiobuttonexample.model.Question;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuestionInteractorImpl implements QuestionInteractor {

    @Override
    public List<Question> getQuestions() {
        List<Question> questions = new ArrayList<>();
        questions.add(new Question("question 1", Arrays.asList("opt 1", "opt 2", "opt 3", "opt 4")));
        questions.add(new Question("question 2", Arrays.asList("opt 1", "opt 2", "opt 3", "opt 4")));
        questions.add(new Question("question 3", Arrays.asList("opt 1", "opt 2", "opt 3", "opt 4")));
        questions.add(new Question("question 4", Arrays.asList("opt 1", "opt 2", "opt 3", "opt 4")));
        return questions;
    }
}
