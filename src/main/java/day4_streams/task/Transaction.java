package day4_streams.task;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Transaction {
    private Trader trader;
    private String company;
    private int year;
    private double value;
}
