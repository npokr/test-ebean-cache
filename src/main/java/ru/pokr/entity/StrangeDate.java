package ru.pokr.entity;

import com.avaje.ebean.Model;
import com.avaje.ebean.annotation.CacheStrategy;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.postgresql.PGStatement;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;

/**
 * Created by N on 29.04.2016.
 */
@Entity @Table(name = "strange_date")
@CacheStrategy(naturalKey = "code")
@Getter @Setter @EqualsAndHashCode(callSuper = false, of = "code")
public class StrangeDate extends Model {
    @Id
    private Integer id;
    private String code;
    private Date validTo = new Date(PGStatement.DATE_POSITIVE_INFINITY);
    public static Find<Integer, StrangeDate> finder = new Find<Integer, StrangeDate>() {};
}
