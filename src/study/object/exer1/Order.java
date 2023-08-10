package study.object.exer1;

import java.lang.Object;
import java.util.Objects;

public class Order {
    private int orderID;
    private String orderName;

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public Order(int orderID, String orderName) {
        this.orderID = orderID;
        this.orderName = orderName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o instanceof Order) {
            Order order = (Order) o;
            return this.orderID==order.orderID && this.orderName.equals(order.orderName);//orderName属于引用变量所以要使用equals()来判断
        } else {
            return false;
        }


    }

    @Override
    public int hashCode() {
        return Objects.hash(orderID, orderName);
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderID=" + orderID +
                ", orderName='" + orderName + '\'' +
                '}';
    }
}
