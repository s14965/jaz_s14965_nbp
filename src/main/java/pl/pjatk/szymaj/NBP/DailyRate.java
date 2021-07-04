package pl.pjatk.szymaj.NBP;

import javax.persistence.*;

@Entity
public class DailyRate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    private String date;
    @Enumerated(EnumType.STRING)
    private Gold gold;
    private Long rate;

    public DailyRate(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Gold getGold() {
        return gold;
    }

    public void setGold(Gold gold) {
        this.gold = gold;
    }

    public Long getRate() {
        return rate;
    }

    public void setRate(Long rate) {
        this.rate = rate;
    }
}
