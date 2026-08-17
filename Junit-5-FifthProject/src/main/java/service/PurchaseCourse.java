package service;

import course.Course;

public class PurchaseCourse {

    private Course course;

    public boolean proceedWithCourse(Course course){

        return course.coursePurchased();
    }
}
