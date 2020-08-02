package andrei;

public class NumberOfDaysInMonth {
    public static boolean isLeapYear (int year){
        if(year >= 1 && year < 10000){
            if((year % 4) == 0){
                if((year % 100) == 0){
                    if((year % 400)==0){
                        return true;
                    }
                    return false;
                }else
                    return true;
            }else{
                return false;
            }
        }
        return false;
    }
    public static int getDaysInMonth (int month, int year){
        if(month < 1 || month > 12 || year < 1 || year > 9999){
            return -1;
        }else if (isLeapYear(year)){
            switch (month){
                case 2:
                    month = 29;
                    break;
                case 4: case 6: case 9: case 11:
                    month = 30;
                    break;
                default:
                    month = 31;
                    break;
            }
        } else {
            switch (month){
                case 2:
                    month = 28;
                    break;
                case 4: case 6: case 9: case 11:
                    month = 30;
                    break;
                default:
                    month = 31;
                    break;
            }
        }
        return month;
    }
}
