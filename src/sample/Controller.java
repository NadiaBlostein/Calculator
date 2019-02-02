package sample;

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
    public int inputBase;
    public int outputBase;





    public void clickNumber(ActionEvent e) throws IOException{
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

    public void disable(ActionEvent e){
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


    public void clear(ActionEvent e){
        screen.setText("0");
        first = true;
        number = "0";
    }




//    public void play(ActionEvent e) throws IOException {
//        if(targetCheck == null){
//            return;
//        }
//        else if(targetCheck.isSelected() && targetCheck.equals(check1)){
//            stage = (Stage) check1.getScene().getWindow();
//            GridPane root = FXMLLoader.load(getClass().getResource("OnePlayer.fxml"));
//            Scene scene = new Scene(root, 300, 275);
//            stage.setScene(scene);
//        }else if(targetCheck.isSelected() && targetCheck.equals(check2)){
//            stage = (Stage) check1.getScene().getWindow();
//            GridPane root = FXMLLoader.load(getClass().getResource("sample.fxml"));
//            Scene scene = new Scene(root, 300, 275);
//            stage.setScene(scene);
//        }
//        else{
//            return;
//        }
//
//    }


}
