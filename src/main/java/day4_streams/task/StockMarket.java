package day4_streams.task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StockMarket {
    public static void main(String[] args) {

        Trader[] traders = {
                new Trader("David", "Virginia"),
                new Trader("Jika", "Chicago"),
                new Trader("Mark", "New York"),
                new Trader("Maria", "New York"),
                new Trader("Emre", "Chicago"),
                new Trader("Olesea", "New York"),
                new Trader("Alma", "Virginia"),
        };

        List<Transaction> transactions = new ArrayList<>(Arrays.asList(
                new Transaction(traders[0], "Apple", 2019, 1000),
                new Transaction(traders[3], "Tesla", 2020, 2500),
                new Transaction(traders[2], "Meta", 2022, 1200),
                new Transaction(traders[1], "Uber", 2018, 400),
                new Transaction(traders[4], "Ford", 2019, 1400),
                new Transaction(traders[2], "Amazon", 2023, 3400),
                new Transaction(traders[6], "Apple", 2020, 1300),
                new Transaction(traders[5], "Meta", 2018, 700),
                new Transaction(traders[4], "Meta", 2019, 600),
                new Transaction(traders[6], "Ford", 2019, 340),
                new Transaction(traders[2], "Uber", 2020, 890),
                new Transaction(traders[3], "Apple", 2020, 1290),
                new Transaction(traders[1], "Uber", 2023, 820),
                new Transaction(traders[0], "Amazon", 2017, 1230),
                new Transaction(traders[5], "Uber", 2016, 980),
                new Transaction(traders[3], "Ford", 2018, 650),
                new Transaction(traders[6], "Meta", 2023, 1320),
                new Transaction(traders[0], "Tesla", 2023, 2300)
        ));









    }
}
