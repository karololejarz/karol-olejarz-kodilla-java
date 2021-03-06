package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.forum.Forum;
import com.kodilla.stream.forum.ForumUser;
import com.kodilla.stream.lambda.ExecuteSaySomething;
import com.kodilla.stream.lambda.Executor;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.lambda.Processor;
import com.kodilla.stream.reference.FunctionalCalculator;

import java.time.LocalDate;
import java.time.Period;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        /*7.1. start*/
        PoemBeautifier beautifier = new PoemBeautifier();
        beautifier.beautify("Example", text -> "ABC"+text+"ABC");
        beautifier.beautify("Example", text -> text.toUpperCase());
        beautifier.beautify("Example", text -> text+text.hashCode());
        beautifier.beautify("Example", text -> text+ " Length: " + text.length());
        /*7.1. end*/

        /*7.3. start*/
        Forum forum = new Forum();
        /*Make sure there is toString in ForumUser!!!*/

        LocalDate currentDate = LocalDate.of(2017,07,19);

        Map<Integer,ForumUser> forumMapFiltered = forum.getUserList().stream()
                .filter(forumUser -> forumUser.getUserGender() == 'M')
                .filter(forumUser -> Period.between(forumUser.getUserDateOfBirth(), currentDate).getYears() >= 20)
                .filter(forumUser -> forumUser.getUserPostCount() > 0)
                .collect(Collectors.toMap(ForumUser::getUserId, forumUser -> forumUser));

        System.out.println("Men aged at least 20 who are active on forum: ");
        forumMapFiltered.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);
        /*7.3. end*/
    }
}