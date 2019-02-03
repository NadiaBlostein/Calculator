
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.Label;


import java.io.IOException;

public class Controller {
    public Button zero;
    public Button one;
    public Button two;
    public Button three;
    public Button four;
    public Button five;
    public Button six;
    public Button seven;
    public Button eight;
    public Button nine;
    public Button decimal;
    public Button equals;
    public Button ten;
    public Button eleven;
    public Button twelve;
    public Button thirteen;
    public Button fourteen;
    public Button fifteen;
    public Button clear;
    public Boolean decimalPicked = false;
    public Label screen;
    public ChoiceBox input;
    public ChoiceBox output;
    public Button targetNumber;
    public String number = "0";
    public Boolean first = true;
    public Label inputLabel;
    public Label outputLabel;
    public Button targetOperator;
    public int inputBase;
    public int outputBase;
    public String firstNumber;
    public int firstBase;
    public String operator = "0";
    public Label tracker;
    public Boolean negative = false;
    public Boolean firstSign;
    public Button sign;
    public Button plus;
    public Button minus;
    public Button times;
    public Button division;
    public Label operatorLabel;
    public Label secondTracker;
    public Boolean operatorSelected = false;
    public Label answerLabel;






    public void clickNumber(ActionEvent e){
        targetNumber= (Button) e.getTarget();
        if(first == true){
            first = false;
            number = "";
        }

        if(targetNumber.equals(one)){
            number = number + 1 + "";
            screen.setText(number);
        } else if (targetNumber.equals(two)) {
            number = number + 2 + "";
            screen.setText(number);
        } else if (targetNumber.equals(three)) {
            number = number + 3 + "";
            screen.setText(number);
        } else if (targetNumber.equals(four)) {
            number = number + 4 + "";
            screen.setText(number);
        } else if (targetNumber.equals(five)) {
            number = number + 5 + "";
            screen.setText(number);
        } else if (targetNumber.equals(six)) {
            number = number + 6 + "";
            screen.setText(number);
        } else if (targetNumber.equals(seven)) {
            number = number + 7 + "";
            screen.setText(number);
        } else if (targetNumber.equals(eight)) {
            number = number + 8 + "";
            screen.setText(number);
        } else if (targetNumber.equals(nine)) {
            number = number + 9 + "";
            screen.setText(number);
        } else if (targetNumber.equals(zero)) {
            if(number.length() == 0){
                first = true;
                number = number + 0 + "";
                screen.setText(number);
            } else {
                number = number + 0 + "";
                screen.setText(number);
            }
        } else if (targetNumber.equals(ten)) {
            number = number + "A";
            screen.setText(number);
        } else if (targetNumber.equals(eleven)) {
            number = number + "B";
            screen.setText(number);
        } else if (targetNumber.equals(twelve)) {
            number = number + "C";
            screen.setText(number);
        } else if (targetNumber.equals(thirteen)) {
            number = number + "D";
            screen.setText(number);
        } else if (targetNumber.equals(fourteen)) {
            number = number + "E";
            screen.setText(number);
        } else if (targetNumber.equals(fifteen)) {
            number = number + "F";
            screen.setText(number);
        } else if (targetNumber.equals(decimal)) {
            if(!decimalPicked){
                number = number + ".";
                screen.setText(number);
                decimalPicked = true;
            }

        }


    }

    public void disable(){
        screen.setText("0");
        first = true;
        decimalPicked = false;
        negative = false;
        number = "0";
        one.setDisable(false);
        zero.setDisable(false);
        decimal.setDisable(false);
        if(!operatorSelected){
            plus.setDisable(false);
            times.setDisable(false);
            minus.setDisable(false);
            division.setDisable(false);
        }
        sign.setDisable(false);
        firstBase = inputBase;
        clear.setDisable(false);

        if(input.getValue().equals("Base 2")) {

            two.setDisable(true);
            three.setDisable(true);
            four.setDisable(true);
            five.setDisable(true);
            six.setDisable(true);
            seven.setDisable(true);
            eight.setDisable(true);
            nine.setDisable(true);
            ten.setDisable(true);
            eleven.setDisable(true);
            twelve.setDisable(true);
            thirteen.setDisable(true);
            fourteen.setDisable(true);
            fifteen.setDisable(true);
            inputBase = 2;
        } else if(input.getValue().equals("Base 3")) {
            two.setDisable(false);
            three.setDisable(true);
            four.setDisable(true);
            five.setDisable(true);
            six.setDisable(true);
            seven.setDisable(true);
            eight.setDisable(true);
            nine.setDisable(true);
            ten.setDisable(true);
            eleven.setDisable(true);
            twelve.setDisable(true);
            thirteen.setDisable(true);
            fourteen.setDisable(true);
            fifteen.setDisable(true);
            inputBase = 3;
        } else if(input.getValue().equals("Base 4")) {
            two.setDisable(false);
            three.setDisable(false);
            four.setDisable(true);
            five.setDisable(true);
            six.setDisable(true);
            seven.setDisable(true);
            eight.setDisable(true);
            nine.setDisable(true);
            ten.setDisable(true);
            eleven.setDisable(true);
            twelve.setDisable(true);
            thirteen.setDisable(true);
            fourteen.setDisable(true);
            fifteen.setDisable(true);
            inputBase = 4;
        } else if(input.getValue().equals("Base 5")) {
            two.setDisable(false);
            three.setDisable(false);
            four.setDisable(false);
            five.setDisable(true);
            six.setDisable(true);
            seven.setDisable(true);
            eight.setDisable(true);
            nine.setDisable(true);
            ten.setDisable(true);
            eleven.setDisable(true);
            twelve.setDisable(true);
            thirteen.setDisable(true);
            fourteen.setDisable(true);
            fifteen.setDisable(true);
            inputBase = 5;
        } else if(input.getValue().equals("Base 6")) {
            two.setDisable(false);
            three.setDisable(false);
            four.setDisable(false);
            five.setDisable(false);
            six.setDisable(true);
            seven.setDisable(true);
            eight.setDisable(true);
            nine.setDisable(true);
            ten.setDisable(true);
            eleven.setDisable(true);
            twelve.setDisable(true);
            thirteen.setDisable(true);
            fourteen.setDisable(true);
            fifteen.setDisable(true);
            inputBase = 6;
        } else if(input.getValue().equals("Base 7")) {
            two.setDisable(false);
            three.setDisable(false);
            four.setDisable(false);
            five.setDisable(false);
            six.setDisable(false);
            seven.setDisable(true);
            eight.setDisable(true);
            nine.setDisable(true);
            ten.setDisable(true);
            eleven.setDisable(true);
            twelve.setDisable(true);
            thirteen.setDisable(true);
            fourteen.setDisable(true);
            fifteen.setDisable(true);
            inputBase = 7;
        } else if(input.getValue().equals("Base 8")) {
            two.setDisable(false);
            three.setDisable(false);
            four.setDisable(false);
            five.setDisable(false);
            six.setDisable(false);
            seven.setDisable(false);
            eight.setDisable(true);
            nine.setDisable(true);
            ten.setDisable(true);
            eleven.setDisable(true);
            twelve.setDisable(true);
            thirteen.setDisable(true);
            fourteen.setDisable(true);
            fifteen.setDisable(true);
            inputBase = 8;
        } else if(input.getValue().equals("Base 9")) {
            two.setDisable(false);
            three.setDisable(false);
            four.setDisable(false);
            five.setDisable(false);
            six.setDisable(false);
            seven.setDisable(false);
            eight.setDisable(false);
            nine.setDisable(true);
            ten.setDisable(true);
            eleven.setDisable(true);
            twelve.setDisable(true);
            thirteen.setDisable(true);
            fourteen.setDisable(true);
            fifteen.setDisable(true);
            inputBase = 9;
        } else if(input.getValue().equals("Base 10")) {
            two.setDisable(false);
            three.setDisable(false);
            four.setDisable(false);
            five.setDisable(false);
            six.setDisable(false);
            seven.setDisable(false);
            eight.setDisable(false);
            nine.setDisable(false);
            ten.setDisable(true);
            eleven.setDisable(true);
            twelve.setDisable(true);
            thirteen.setDisable(true);
            fourteen.setDisable(true);
            fifteen.setDisable(true);
            inputBase = 10;
        } else if(input.getValue().equals("Base 11")) {
            two.setDisable(false);
            three.setDisable(false);
            four.setDisable(false);
            five.setDisable(false);
            six.setDisable(false);
            seven.setDisable(false);
            eight.setDisable(false);
            nine.setDisable(false);
            ten.setDisable(false);
            eleven.setDisable(true);
            twelve.setDisable(true);
            thirteen.setDisable(true);
            fourteen.setDisable(true);
            fifteen.setDisable(true);
            inputBase = 11;
        } else if(input.getValue().equals("Base 12")) {
            two.setDisable(false);
            three.setDisable(false);
            four.setDisable(false);
            five.setDisable(false);
            six.setDisable(false);
            seven.setDisable(false);
            eight.setDisable(false);
            nine.setDisable(false);
            ten.setDisable(false);
            eleven.setDisable(false);
            twelve.setDisable(true);
            thirteen.setDisable(true);
            fourteen.setDisable(true);
            fifteen.setDisable(true);
            inputBase = 12;
        } else if(input.getValue().equals("Base 13")) {
            two.setDisable(false);
            three.setDisable(false);
            four.setDisable(false);
            five.setDisable(false);
            six.setDisable(false);
            seven.setDisable(false);
            eight.setDisable(false);
            nine.setDisable(false);
            ten.setDisable(false);
            eleven.setDisable(false);
            twelve.setDisable(false);
            thirteen.setDisable(true);
            fourteen.setDisable(true);
            fifteen.setDisable(true);
            inputBase = 13;
        } else if(input.getValue().equals("Base 14")) {
            two.setDisable(false);
            three.setDisable(false);
            four.setDisable(false);
            five.setDisable(false);
            six.setDisable(false);
            seven.setDisable(false);
            eight.setDisable(false);
            nine.setDisable(false);
            ten.setDisable(false);
            eleven.setDisable(false);
            twelve.setDisable(false);
            thirteen.setDisable(false);
            fourteen.setDisable(true);
            fifteen.setDisable(true);
            inputBase = 14;
        } else if(input.getValue().equals("Base 15")) {
            two.setDisable(false);
            three.setDisable(false);
            four.setDisable(false);
            five.setDisable(false);
            six.setDisable(false);
            seven.setDisable(false);
            eight.setDisable(false);
            nine.setDisable(false);
            ten.setDisable(false);
            eleven.setDisable(false);
            twelve.setDisable(false);
            thirteen.setDisable(false);
            fourteen.setDisable(false);
            fifteen.setDisable(true);
            inputBase = 15;
        } else if(input.getValue().equals("Base 16")) {
            two.setDisable(false);
            three.setDisable(false);
            four.setDisable(false);
            five.setDisable(false);
            six.setDisable(false);
            seven.setDisable(false);
            eight.setDisable(false);
            nine.setDisable(false);
            ten.setDisable(false);
            eleven.setDisable(false);
            twelve.setDisable(false);
            thirteen.setDisable(false);
            fourteen.setDisable(false);
            fifteen.setDisable(false);
            inputBase = 16;
        }



    }

    public void initOutput(ActionEvent e){
        equals.setDisable(false);
        if(output.getValue().equals("Base 2")) {
            outputBase = 2;
        } else if(output.getValue().equals("Base 3")) {
            outputBase = 3;
        } else if(output.getValue().equals("Base 4")) {
            outputBase = 4;
        } else if(output.getValue().equals("Base 5")) {
            outputBase = 5;
        } else if(output.getValue().equals("Base 6")) {
            outputBase = 6;
        } else if(output.getValue().equals("Base 7")) {
            outputBase = 7;
        } else if(output.getValue().equals("Base 8")) {
            outputBase = 8;
        } else if(output.getValue().equals("Base 9")) {
            outputBase = 9;
        } else if(output.getValue().equals("Base 10")) {
            outputBase = 10;
        } else if(input.getValue().equals("Base 11")) {
            outputBase = 11;
        } else if(output.getValue().equals("Base 12")) {
            outputBase = 12;
        } else if(output.getValue().equals("Base 13")) {
            outputBase = 13;
        } else if(output.getValue().equals("Base 14")) {
            outputBase = 14;
        } else if(output.getValue().equals("Base 15")) {
            outputBase = 15;
        } else if(output.getValue().equals("Base 16")) {
            outputBase = 16;
        }





    }


    public void operate(ActionEvent e){
        plus.setDisable(true);
        minus.setDisable(true);
        times.setDisable(true);
        division.setDisable(true);
        targetOperator= (Button) e.getTarget();
        operator = targetOperator.getText();
        firstNumber = number;
        String curNumber = "(" + number + ")BASE" + inputBase;
        operatorLabel.setText(operator);
        tracker.setText(curNumber);
        screen.setText("0");
        first = true;
        decimalPicked = false;
        number = "0";
        firstSign = negative;
        negative = false;
        operatorSelected = true;
    }

    public void equals(){
        String curNumber = "(" + number + ")BASE" + inputBase;
        secondTracker.setText(curNumber);
        one.setDisable(true);
        two.setDisable(true);
        three.setDisable(true);
        four.setDisable(true);
        five.setDisable(true);
        six.setDisable(true);
        seven.setDisable(true);
        eight.setDisable(true);
        nine.setDisable(true);
        ten.setDisable(true);
        eleven.setDisable(true);
        twelve.setDisable(true);
        thirteen.setDisable(true);
        fourteen.setDisable(true);
        fifteen.setDisable(true);
        zero.setDisable(true);
        decimal.setDisable(true);
        sign.setDisable(true);
        plus.setDisable(true);
        minus.setDisable(true);
        times.setDisable(true);
        division.setDisable(true);

        answerLabel.setText("= Answer pending");


    }


    public void clear(){
        screen.setText("0");
        first = true;
        decimalPicked = false;
        number = "0";
        tracker.setText(" ");
        operatorLabel.setText(" ");
        secondTracker.setText(" ");
        answerLabel.setText(" ");
        negative = false;
        firstSign = false;
        operatorSelected = false;
        firstNumber = " ";
        disable();


    }

    public void makeNegative(ActionEvent e){
        if(negative){
            number = number.substring(1);
            screen.setText(number);
            negative = false;
        }
        else{
            number = "-" + number;
            screen.setText(number);
            negative = true;
        }
    }



}
