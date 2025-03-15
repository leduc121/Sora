/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.sql.Date;

/**
 *
 * @author ADMIN
 */
public class Orders {
    private int order_id;
    private int user_id;
    private Date order_date;
    private double total_price;
    private String status;
}
