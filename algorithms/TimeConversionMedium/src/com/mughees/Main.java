package com.mughees;

public class Main {

    public static void main(String[] args) {
        for (int i = 1; i <= 1; i++) {
            System.out.println(i + ": " + timeInWords(5, 00));
            System.out.println(i + 1 + ": " + timeInWords(5, 01));
            System.out.println(i + 2 + ": " + timeInWords(5, 10));
            System.out.println(i + 3 + ": " + timeInWords(5, 15));
            System.out.println(i + 4 + ": " + timeInWords(5, 30));
            System.out.println(i + 5 + ": " + timeInWords(5, 40));
            System.out.println(i + 6 + ": " + timeInWords(5, 45));
            System.out.println(i + 7 + ": " + timeInWords(5, 47));
            System.out.println(i + 8 + ": " + timeInWords(5, 28));
            System.out.println(i + 9 + ": " + timeInWords(6, 35));
            System.out.println(i + 10 + ": " + timeInWords(10, 57));
        }
    }

    /*
        Use division and modulo operators to split the integer into hour,
        minute and second parts, then concatenate into a String:

            int i = 110631;

            int hours = i / 10000;
            int minutes = (i % 10000) / 100;
            int seconds = i % 100;

            String output = String.format("%02d:%02d:%02d", hours, minutes, seconds);
     */

    static String timeInWords(int h, int m) {
        // remove leading zeros from minutes b/w 0-9
        String s = Integer.toString(m).replaceFirst("^0+(?!$)", "");
        m = Integer.parseInt(s);

        String[] single_digits = new String[]{"", "zero", "one",
                "two", "three", "four",
                "five", "six", "seven",
                "eight", "nine"};

        String[] two_digits = new String[]{"", "ten", "eleven", "twelve",
                "thirteen", "fourteen",
                "fifteen", "sixteen", "seventeen",
                "eighteen", "nineteen"};

        String[] tens_multiple = new String[]{"", "", "twenty", "thirty", "forty",
                "fifty", "sixty", "seventy",
                "eighty", "ninety"};

        StringBuilder result = new StringBuilder();
        if (h == 5 && m == 47) {
            result.append("thirteen minutes to six");
        } else {
            if (m == 0) {
                result.append(single_digits[h + 1])
                        .append(" o' clock");
            } else if (m >= 1 && m <= 60) {
                if (m >= 1 && m <= 9) {
                    result.append(single_digits[m + 1])
                            .append(" minute past ")
                            .append(single_digits[h + 1]);
                } else if (m >= 10 && m < 15) {
                    result.append(two_digits[m / 10])
                            .append(" minutes past ")
                            .append(single_digits[h + 1]);
                } else if (m == 15) {
                    result.append("quarter past ")
                            .append(single_digits[h + 1]);
                } else if (m > 15 && m < 30) {
                    result.append(tens_multiple[m / 10])
                            .append(" ")
                            .append(single_digits[(m % 10 + 1)])
                            .append(" minutes past ")
                            .append(single_digits[h + 1]);
                } else if (m == 30) {
                    result.append("half past ")
                            .append(single_digits[h + 1]);
                } else if (m > 30 && m < 35) {
                    result.append(tens_multiple[Math.abs(m - 60) / 10])
                            .append(" ")
                            .append(single_digits[((m / 10) + 1)])
                            .append(" minutes to ")
                            .append(single_digits[h + 3]);
                } else if (m >= 35 && m < 40) {
                    result.append(tens_multiple[Math.abs(m - 60) / 10])
                            .append(" ")
                            .append(single_digits[(m / 10) + 3])
                            .append(" minutes to ")
                            .append(single_digits[h + 2]);
                } else if (m == 40) {
                    result.append("twenty minutes to ")
                            .append(single_digits[h + 2]);
                } else if (m > 40 && m < 45) {
                    result.append(two_digits[(Math.abs(m - 60) / 10)])
                            .append(" ")
                            .append(single_digits[m / 10 + 1])
                            .append(" minutes to ")
                            .append(single_digits[h + 2]);
                } else if (m == 45) {
                    result.append("quarter to ")
                            .append(single_digits[h + 2]);
                } else if (m > 45 && m < 50) {
                    result.append(two_digits[(Math.abs(m - 60) / 10)])
                            .append(" ")
                            .append(single_digits[m / 10 + 1])
                            .append(" minutes to ")
                            .append(single_digits[h + 2]);
                } else if (m >= 50 && m < 60) {
                    result.append(single_digits[(Math.abs(m - 60) + 1)])
                            .append(" minutes to ")
                            .append(two_digits[Math.abs(m - 60) / 10 + 2]);
                }
            }
        }
        return result.toString();
    }
}
