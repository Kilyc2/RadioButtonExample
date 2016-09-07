package com.kiliancerdan.radiobuttonexample.test;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.kiliancerdan.radiobuttonexample.R;
import com.kiliancerdan.radiobuttonexample.model.Question;

import java.util.List;


class TestAdapter extends RecyclerView.Adapter<TestAdapter.ViewHolder> {

    private List<Question> questions;
    private Context context;

    TestAdapter(List<Question> questions) {
        this.questions = questions;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        context = parent.getContext();
        View view = LayoutInflater.from(context).inflate(R.layout.list_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Question question = questions.get(position);
        holder.questionText.setText(question.getQuestion());
        for (String answer : question.getAnswers()) {
            RadioButton button = new RadioButton(context);
            button.setText(answer);
            holder.radioGroupAnswers.addView(button);
        }
    }

    @Override
    public int getItemCount() {
        return questions.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        TextView questionText;
        RadioGroup radioGroupAnswers;

        ViewHolder(View itemView) {
            super(itemView);
            questionText = (TextView) itemView.findViewById(R.id.question_text);
            radioGroupAnswers = (RadioGroup) itemView.findViewById(R.id.radio_group);
        }
    }
}
