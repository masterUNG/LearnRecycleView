package masterung.androidthai.in.th.learnrecycleview.utility;

import masterung.androidthai.in.th.learnrecycleview.R;

/**
 * Created by masterung on 11/2/2018 AD.
 */

public class MyData {

    private String[]foodStrings = new String[]{
            "food1", "food2","food3","food4","food5",
            "food6","food7","food8","food9","food10",
            "food11","food12","food13","food14","food15",
            "food16","food17","food18","food19","food20"};

    private int[] foodInts = new int[]{
            R.drawable.food1, R.drawable.food2, R.drawable.food3, R.drawable.food4, R.drawable.food5,
            R.drawable.food6, R.drawable.food7, R.drawable.food8, R.drawable.food9, R.drawable.food10,
            R.drawable.food11, R.drawable.food12, R.drawable.food13, R.drawable.food14, R.drawable.food15,
            R.drawable.food16, R.drawable.food17, R.drawable.food18, R.drawable.food19, R.drawable.food20,};

    public String[] getFoodStrings() {
        return foodStrings;
    }

    public int[] getFoodInts() {
        return foodInts;
    }
}
