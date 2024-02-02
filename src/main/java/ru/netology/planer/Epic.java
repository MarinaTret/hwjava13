package ru.netology.planer;

import ru.netology.planer.Todos;

public class Epic extends Task { //задача, состоящая из подзадач
    protected String[] subtasks; //массив из подзадач

    public Epic(int id, String[] subtasks) {
        super(id);
        this.subtasks = subtasks;
    }

    @Override
    public boolean matches(String query) {
        for (String subtasks : subtasks) {
            if (subtasks.contains(query)) {
                return true;
            }
        }
        return false;
    }
}
