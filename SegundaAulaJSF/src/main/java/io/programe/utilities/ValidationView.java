package io.programe.utilities;
        
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;
import java.time.LocalDate;
import java.util.Date;


@Named
@RequestScoped
public class ValidationView {

    private String text;
    private String color;
    private String description;
    private Integer integer;
    private Double doubleNumber;
    private Double money;
    private String regexText;
    private Date date;
    private Date date2;
    private Date date3;
    private LocalDate localDate;
    private LocalDate localDate2;
    private LocalDate localDate3;
    private String uiLibrary;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getInteger() {
        return integer;
    }

    public void setInteger(Integer integer) {
        this.integer = integer;
    }

    public Double getDoubleNumber() {
        return doubleNumber;
    }

    public void setDoubleNumber(Double doubleNumber) {
        this.doubleNumber = doubleNumber;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public String getRegexText() {
        return regexText;
    }

    public void setRegexText(String regexText) {
        this.regexText = regexText;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getDate2() {
        return date2;
    }

    public void setDate2(Date date) {
        this.date2 = date;
    }

    public Date getDate3() {
        return date3;
    }

    public void setDate3(Date date) {
        this.date3 = date;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    public LocalDate getLocalDate2() {
        return localDate2;
    }

    public void setLocalDate2(LocalDate localDate) {
        this.localDate2 = localDate;
    }

    public LocalDate getLocalDate3() {
        return localDate3;
    }

    public void setLocalDate3(LocalDate localDate) {
        this.localDate3 = localDate;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getUiLibrary() {
        return uiLibrary;
    }

    public void setUiLibrary(String uiLibrary) {
        this.uiLibrary = uiLibrary;
    }

    public void modifyValues() {
        setText("Mike");
        setInteger(123);
    }

    public void modifyInteger() {
        setInteger(456);
    }

    public void clearValues() {
        setText(null);
        setInteger(null);
        setDoubleNumber(null);
    }
}
