package onboarding;

import java.util.*;

public class Problem7 {
    public static boolean isContainUser(String user, List<String> friend) {
        if(friend.contains(user)) {
            return true;
        }
        return false;
    }
    public static String getFriendName(String user, List<String> friend) {
        if(user.equals(friend.get(0))) {
            return friend.get(1);
        }
        else {
            return friend.get(0);
        }
    }
    public static Set<String> getFriendSet(String user, List<List<String>> friends){
        Set<String> friendSet = new HashSet<>();

        for(List<String> friend: friends) {
            if(isContainUser(user, friend)) {  // user가 있는 친구 목록일 경우
                String friendName = getFriendName(user, friend);
                friendSet.add(friendName);
            }
        }

        return friendSet;
    }

    public static Map<String, Integer> getFriendsScore(Set<String> friendSet, List<List<String>> friends) {
        Map<String, Integer> scoreMap = new HashMap<>();

        for(List<String> friend : friends) {
            for(String user : friendSet) {
                if(isUser(user, friend)) {
                    String friendName = getFriendName(user, friend);

                    if(!scoreMap.containsKey(friendName)) {
                        scoreMap.put(friendName, 0);
                    }
                    scoreMap.put(friendName, scoreMap.get(friendName) + 10);
                }
            }
        }

        return scoreMap;
    }

    public static List<String> solution(String user, List<List<String>> friends, List<String> visitors) {
        List<String> answer = Collections.emptyList();
        Set<String> friendSet;
        Map<String, Integer> friendsScore;

        friendSet = getFriendSet(user, friends);
        friendsScore = getFriendsScore(friendSet, friends);

        return answer;
    }
}
