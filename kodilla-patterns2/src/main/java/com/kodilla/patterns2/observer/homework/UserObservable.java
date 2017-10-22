package com.kodilla.patterns2.observer.homework;

public interface UserObservable {
    //one mentor per pupil
    //no removal of mentors - can't be mentorless, so re-register
    void registerObserver(MentorObserver mentorObserver);
    void notifyObserver();
}
