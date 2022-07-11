package ru.netology;

@FunctionalInterface
public interface OnTaskDoneListener {
    void onDone(String result);
}
