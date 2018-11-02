package util;

import model.UserMeal;
import model.UserMealWithExceed;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * GKislin
 * 31.05.2015.
 */
public class UserMealsUtil {


    public static List<UserMealWithExceed>  getFilteredWithExceeded(List<UserMeal> mealList, LocalTime startTime, LocalTime endTime, int caloriesPerDay) {
        // TODO return filtered list with correctly exceeded field

        Map<LocalDate, Integer> totalCalPerDateMap = new HashMap<>();

        for (UserMeal um : mealList) {
            totalCalPerDateMap.merge(um.getDateTime().toLocalDate(), um.getCalories(), (oldTotalCal, currentTotalCal) -> oldTotalCal + currentTotalCal);
        }
        return mealList.stream().
               filter(s -> TimeUtil.isBetween(s.getDateTime().toLocalTime(), startTime, endTime))
               .map(umwe-> new UserMealWithExceed(umwe, caloriesPerDay<totalCalPerDateMap.get(umwe.getDateTime().toLocalDate())))
                .collect(Collectors.toList());

    }

    /*List <UserMealWithExceed> userMealList = new ArrayList<>();
        for(UserMeal um : mealList){
            if (TimeUtil.isBetween(um.getDateTime().toLocalTime(), startTime, endTime)) {
                userMealList.add(new UserMealWithExceed(um, caloriesPerDay<totalCalPerDateMap.get(um.getDateTime().toLocalDate())));
            }
        }
        return userMealList;*/

}