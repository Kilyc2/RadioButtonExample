package com.kiliancerdan.radiobuttonexample.test;

import com.kiliancerdan.radiobuttonexample.interactor.QuestionInteractor;
import com.kiliancerdan.radiobuttonexample.model.Question;

import java.util.List;

class TestPresenter {

    private TestView view;
    private QuestionInteractor interactor;

    TestPresenter(QuestionInteractor interactor) {
        this.interactor = interactor;
    }

    void setView(TestView view) {
        this.view = view;
    }

    void onResume() {
        view.setQuestions(interactor.getQuestions());
    }

    interface TestView {

        void setQuestions(List<Question> questions);

    }

}
