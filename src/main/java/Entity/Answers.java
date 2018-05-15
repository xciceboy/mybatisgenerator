package Entity;

import java.util.Date;

public class Answers {
    private Integer id;

    private Integer question;

    private String answeroption;

    private Short optiontype;

    private String lan;

    private Integer uid;

    private String departno;

    private Date creatime;

    private Integer alterid;

    private Date altime;

    private Short isdel;

    private String optionlabel;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getQuestion() {
        return question;
    }

    public void setQuestion(Integer question) {
        this.question = question;
    }

    public String getAnsweroption() {
        return answeroption;
    }

    public void setAnsweroption(String answeroption) {
        this.answeroption = answeroption == null ? null : answeroption.trim();
    }

    public Short getOptiontype() {
        return optiontype;
    }

    public void setOptiontype(Short optiontype) {
        this.optiontype = optiontype;
    }

    public String getLan() {
        return lan;
    }

    public void setLan(String lan) {
        this.lan = lan == null ? null : lan.trim();
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getDepartno() {
        return departno;
    }

    public void setDepartno(String departno) {
        this.departno = departno == null ? null : departno.trim();
    }

    public Date getCreatime() {
        return creatime;
    }

    public void setCreatime(Date creatime) {
        this.creatime = creatime;
    }

    public Integer getAlterid() {
        return alterid;
    }

    public void setAlterid(Integer alterid) {
        this.alterid = alterid;
    }

    public Date getAltime() {
        return altime;
    }

    public void setAltime(Date altime) {
        this.altime = altime;
    }

    public Short getIsdel() {
        return isdel;
    }

    public void setIsdel(Short isdel) {
        this.isdel = isdel;
    }

    public String getOptionlabel() {
        return optionlabel;
    }

    public void setOptionlabel(String optionlabel) {
        this.optionlabel = optionlabel == null ? null : optionlabel.trim();
    }
}