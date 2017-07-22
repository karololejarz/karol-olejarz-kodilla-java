package com.kodilla.stream;

import com.kodilla.stream.forum.Forum;
import com.kodilla.stream.forum.ForumUser;

import java.time.LocalDate;
import java.time.Period;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        /*7.3. start*/
        Forum forum = new Forum();
        /*Make sure there is toString in ForumUser!!!*/

        String forumMales = forum.getUserList().stream()
                .filter(forumUser -> forumUser.getUserGender() == 'M')
                .map(ForumUser::toString)
                .collect(Collectors.joining(",\n","<<",">>"));
        System.out.println("Males on forum are: " + forumMales);

        LocalDate currentDate = LocalDate.of(2017,07,19);

        String forumOldies = forum.getUserList().stream()
                .filter(forumUser -> Period.between(forumUser.getUserDateOfBirth(), currentDate).getYears() > 20)
                .map(ForumUser::toString)
                .collect(Collectors.joining(",\n","<<",">>"));
        System.out.println("Older than 20 years on forum: " + forumOldies);

        String forumActive = forum.getUserList().stream()
                .filter(forumUser -> forumUser.getUserPostCount() > 0)
                .map(ForumUser::toString)
                .collect(Collectors.joining(",\n","<<",">>"));
        System.out.println("Active on forum: " + forumActive);

        Map<Integer,ForumUser> forumMap = forum.getUserList().stream()
                .collect(Collectors.toMap(ForumUser::getUserId, forumUser -> forumUser));
        System.out.println("ForumMap:" + "\n" + forumMap);

        /*7.3. end*/
    }
}