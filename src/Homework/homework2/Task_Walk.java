package Homework.homework2;

public class Task_Walk{

/*
 Создайте две переменные isWeekend и isRain.
 Создайте переменную canWalk, значение которой должно быть истинным,
 если это выходной день (isWeekend=true) и не идет дождь (isRain=false).
  */
    private boolean isWeekend;
    private boolean isRain;

    public void setWeekend(boolean weekend) {
        isWeekend = weekend;
    }

    public void setRein (boolean rain) {
        isRain = rain;
    }

    public boolean isCanWalk() {
        return (isWeekend && !isRain);
    }

}





