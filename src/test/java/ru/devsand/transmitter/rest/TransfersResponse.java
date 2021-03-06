package ru.devsand.transmitter.rest;

import ru.devsand.transmitter.model.entity.Transfer;

import java.util.List;

public class TransfersResponse {

    private String status;
    private String message;
    private List<Transfer> data;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<Transfer> getData() {
        return data;
    }

    public void setData(List<Transfer> data) {
        this.data = data;
    }

}
