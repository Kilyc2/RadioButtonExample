package com.kiliancerdan.radiobuttonexample.test;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import com.kiliancerdan.radiobuttonexample.R;
import com.kiliancerdan.radiobuttonexample.interactor.QuestionInteractorImpl;
import com.kiliancerdan.radiobuttonexample.model.Question;

import java.util.List;

public class TestActivity extends AppCompatActivity implements TestPresenter.TestView {

    private RecyclerView listQuestions;
    private TestPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        listQuestions = (RecyclerView) findViewById(R.id.list_question);
        listQuestions.setLayoutManager(new LinearLayoutManager(this));
        listQuestions.setHasFixedSize(true);

        presenter = new TestPresenter(new QuestionInteractorImpl());
        presenter.setView(this);
    }

    @Override
    protected void onResume() {
        super.onResume();
        presenter.onResume();
    }

    @Override
    public void setQuestions(List<Question> questions) {
        listQuestions.setAdapter(new TestAdapter(questions));
    }
}
