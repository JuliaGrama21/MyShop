package main;

import db.GoodsDB;
import entities.Product;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        GoodsDB goodsDB = new GoodsDB();
        List<Product> products = goodsDB.getAllGoods();
        for (Product product : products) {
            System.out.println(product);
        }
    }
}
