package pl.pjatk.szymaj.NBP;

import javax.persistence.*;
import java.util.Date;

@Entity
public class DailyRate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    private Date startdate;
    private Date endtdate;
    private Long rate;
    @Enumerated(EnumType.STRING)
    private Gold gold;

    public DailyRate(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getStartdate() {
        return startdate;
    }

    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }

    public Date getEndtdate() {
        return endtdate;
    }

    public void setEndtdate(Date endtdate) {
        this.endtdate = endtdate;
    }

    public Long getRate() {
        return rate;
    }

    public void setRate(Long rate) {
        this.rate = rate;
    }

    public Gold getGold() {
        return gold;
    }

    public void setGold(Gold gold) {
        this.gold = gold;
    }


}
