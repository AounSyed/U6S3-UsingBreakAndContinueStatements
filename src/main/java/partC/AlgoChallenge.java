package partC;

public class AlgoChallenge {
     /* Problem 16
    We are looking to write down a list of all possible numbers that can be a
    multiple of 3 or 5.
    You will be given any number, but to be put on the list the number has to be a non-negative number.

    Return true if the given number can be added to the list.

    Tip: Think about using the % "mod" operator

    Example:
    multipleOf(3) --> true
    multipleOf(10) --> true
    multipleOf(8) --> false
     */

    public static Boolean multipleOf(int number){
        boolean response = false;

        for (int i = 0; i <= 10; i++) {
            if (number < 0)
                break;

            if (number % 5 == 0 || number % 3 == 0)
                response = true;
        }
        return response;
    }


    /* Problem 17
       You are given two random temperatures from different states.
       Between these two temperatures, we need to check if one state is freezing while the other is having an extreme hot day.
       Both of these statements need to be true to prove that some states have extreme cases of temperatures.

       Return true, if one temp is less than 0 and the other is greater than 100.

       Example:
       checkTemp(120, -1) --> true
       checkTemp(-1, 120) --> true
       checkTemp(2, 120) --> false
     */

    public static Boolean checkTemp(int temp1, int temp2) {
        boolean response = false;

        for (int i = 0; i <= 1; i++){
            if (temp2 > 0 && temp2 < 100 || temp1 > 0 && temp1 < 100)
                break;

            if (temp1 < 0 && temp2 > 100 || temp2 < 0 && temp1 > 100)
                response = true;
        }


        return response;
    }

}
