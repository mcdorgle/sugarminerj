package com.mcdorgle;

import java.time.LocalDateTime;

public class Sugars {
    private Integer sugar;
    private Integer carbs;
    private Integer insulin;
    private LocalDateTime datetime;

    public Integer getSugar() {
        return sugar;
    }

    public void setSugar(Integer sugar) {
        this.sugar = sugar;
    }

    public Integer getCarbs() {
        return carbs;
    }

    public void setCarbs(Integer carbs) {
        this.carbs = carbs;
    }

    public Integer getInsulin() {
        return insulin;
    }

    public void setInsulin(Integer insulin) {
        this.insulin = insulin;
    }

    public LocalDateTime getDatetime() {
        return datetime;
    }

    public void setDatetime(LocalDateTime datetime) {
        this.datetime = datetime;
    }
}
