package ru.netology.planer;

public class Meeting extends Task {
    protected String topic; //тема обсуждения
    protected String project; //название проекта, который будут обсуждать
    protected String start; //дата и время старта текстом

    public Meeting(int id, String topic, String project, String start) {
        super(id);
        this.topic = topic;
        this.project = project;
        this.start = start;
    }

    @Override
    public boolean matches(String query) {
        if (topic.contains(query)) {
            return true;
        }
        if (project.contains(query)) {
            return true;
        }
        return false;
    }
}

