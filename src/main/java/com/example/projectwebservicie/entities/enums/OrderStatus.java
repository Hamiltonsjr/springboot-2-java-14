package com.example.projectwebservicie.entities.enums;

public enum OrderStatus {

    WAITING_PAYMENT(1),
    PAID(2),
    SHIPPED(3),
    DELIVERED(4),
    CANCELED(5);

    private int code;

    private OrderStatus(int code){
        this.code = code;
    }

    public int getCode(){
        return code;
    }

    // Vai percorrer os os valores do tipo enumerado
    // retornar o valor do codigo
    public static OrderStatus valeOf(int code){
        for (OrderStatus value : OrderStatus.values()){
            if(value.getCode() == code){
                return value;
            }

        }
        throw new IllegalArgumentException("Invalid OrderStatus");
    }
}
