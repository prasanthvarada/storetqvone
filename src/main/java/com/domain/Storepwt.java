package com.domain;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

/**
 * A Storepwt.
 */
@Entity(name = "storepwt")
@Table(name = "storepwt")
public class Storepwt implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "deptnum")
    private Long deptnum;

    @Column(name = "divnum")
    private Long divnum;

    @Column(name = "groups")
    private Long groups;

    @Column(name = "pages")
    private Long pages;

    @Column(name = "transitional")
    private String transitional;

    @Column(name = "workuid")
    private String workuid;

    @Column(name = "ordinalkey")
    private Long ordinalkey;

    @Column(name = "strnum")
    private Long strnum;

    @Column(name = "dcnum")
    private Long dcnum;

    @Column(name = "zonenum")
    private Long zonenum;

    @Column(name = "ssratturn")
    private Double ssratturn;

    @Column(name = "currentots")
    private Long currentots;

    @Column(name = "totactualsales")
    private Long totactualsales;

    @Column(name = "totplndsales")
    private Long totplndsales;

    @Column(name = "twinvt")
    private Long twinvt;

    @Column(name = "invtplndend")
    private Long invtplndend;

    @Column(name = "twsales")
    private Long twsales;

    @Column(name = "wtddist")
    private Long wtddist;

    @Column(name = "origots")
    private Long origots;

    @Column(name = "otsadj")
    private Long otsadj;

    @Column(name = "salesago")
    private Long salesago;

    @Column(name = "lwsales")
    private Long lwsales;

    @Column(name = "salesplnd")
    private Long salesplnd;

    @Column(name = "salesplndwktwo")
    private Long salesplndwktwo;

    @Column(name = "salesplndbal")
    private Long salesplndbal;

    @Column(name = "otsweeks")
    private Long otsweeks;

    @Column(name = "lwdistreg")
    private Long lwdistreg;

    @Column(name = "invtplnd")
    private Long invtplnd;

    @Column(name = "lwinvt")
    private Long lwinvt;

    @Column(name = "origpct")
    private Long origpct;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getDeptnum() {
        return deptnum;
    }

    public Storepwt deptnum(Long deptnum) {
        this.deptnum = deptnum;
        return this;
    }

    public void setDeptnum(Long deptnum) {
        this.deptnum = deptnum;
    }

    public Long getDivnum() {
        return divnum;
    }

    public Storepwt divnum(Long divnum) {
        this.divnum = divnum;
        return this;
    }

    public void setDivnum(Long divnum) {
        this.divnum = divnum;
    }

    public Long getGroups() {
        return groups;
    }

    public Storepwt groups(Long groups) {
        this.groups = groups;
        return this;
    }

    public void setGroups(Long groups) {
        this.groups = groups;
    }

    public Long getPages() {
        return pages;
    }

    public Storepwt pages(Long pages) {
        this.pages = pages;
        return this;
    }

    public void setPages(Long pages) {
        this.pages = pages;
    }

    public String getTransitional() {
        return transitional;
    }

    public Storepwt transitional(String transitional) {
        this.transitional = transitional;
        return this;
    }

    public void setTransitional(String transitional) {
        this.transitional = transitional;
    }

    public String getWorkuid() {
        return workuid;
    }

    public Storepwt workuid(String workuid) {
        this.workuid = workuid;
        return this;
    }

    public void setWorkuid(String workuid) {
        this.workuid = workuid;
    }

    public Long getOrdinalkey() {
        return ordinalkey;
    }

    public Storepwt ordinalkey(Long ordinalkey) {
        this.ordinalkey = ordinalkey;
        return this;
    }

    public void setOrdinalkey(Long ordinalkey) {
        this.ordinalkey = ordinalkey;
    }

    public Long getStrnum() {
        return strnum;
    }

    public Storepwt strnum(Long strnum) {
        this.strnum = strnum;
        return this;
    }

    public void setStrnum(Long strnum) {
        this.strnum = strnum;
    }

    public Long getDcnum() {
        return dcnum;
    }

    public Storepwt dcnum(Long dcnum) {
        this.dcnum = dcnum;
        return this;
    }

    public void setDcnum(Long dcnum) {
        this.dcnum = dcnum;
    }

    public Long getZonenum() {
        return zonenum;
    }

    public Storepwt zonenum(Long zonenum) {
        this.zonenum = zonenum;
        return this;
    }

    public void setZonenum(Long zonenum) {
        this.zonenum = zonenum;
    }

    public Double getSsratturn() {
        return ssratturn;
    }

    public Storepwt ssratturn(Double ssratturn) {
        this.ssratturn = ssratturn;
        return this;
    }

    public void setSsratturn(Double ssratturn) {
        this.ssratturn = ssratturn;
    }

    public Long getCurrentots() {
        return currentots;
    }

    public Storepwt currentots(Long currentots) {
        this.currentots = currentots;
        return this;
    }

    public void setCurrentots(Long currentots) {
        this.currentots = currentots;
    }

    public Long getTotactualsales() {
        return totactualsales;
    }

    public Storepwt totactualsales(Long totactualsales) {
        this.totactualsales = totactualsales;
        return this;
    }

    public void setTotactualsales(Long totactualsales) {
        this.totactualsales = totactualsales;
    }

    public Long getTotplndsales() {
        return totplndsales;
    }

    public Storepwt totplndsales(Long totplndsales) {
        this.totplndsales = totplndsales;
        return this;
    }

    public void setTotplndsales(Long totplndsales) {
        this.totplndsales = totplndsales;
    }

    public Long getTwinvt() {
        return twinvt;
    }

    public Storepwt twinvt(Long twinvt) {
        this.twinvt = twinvt;
        return this;
    }

    public void setTwinvt(Long twinvt) {
        this.twinvt = twinvt;
    }

    public Long getInvtplndend() {
        return invtplndend;
    }

    public Storepwt invtplndend(Long invtplndend) {
        this.invtplndend = invtplndend;
        return this;
    }

    public void setInvtplndend(Long invtplndend) {
        this.invtplndend = invtplndend;
    }

    public Long getTwsales() {
        return twsales;
    }

    public Storepwt twsales(Long twsales) {
        this.twsales = twsales;
        return this;
    }

    public void setTwsales(Long twsales) {
        this.twsales = twsales;
    }

    public Long getWtddist() {
        return wtddist;
    }

    public Storepwt wtddist(Long wtddist) {
        this.wtddist = wtddist;
        return this;
    }

    public void setWtddist(Long wtddist) {
        this.wtddist = wtddist;
    }

    public Long getOrigots() {
        return origots;
    }

    public Storepwt origots(Long origots) {
        this.origots = origots;
        return this;
    }

    public void setOrigots(Long origots) {
        this.origots = origots;
    }

    public Long getOtsadj() {
        return otsadj;
    }

    public Storepwt otsadj(Long otsadj) {
        this.otsadj = otsadj;
        return this;
    }

    public void setOtsadj(Long otsadj) {
        this.otsadj = otsadj;
    }

    public Long getSalesago() {
        return salesago;
    }

    public Storepwt salesago(Long salesago) {
        this.salesago = salesago;
        return this;
    }

    public void setSalesago(Long salesago) {
        this.salesago = salesago;
    }

    public Long getLwsales() {
        return lwsales;
    }

    public Storepwt lwsales(Long lwsales) {
        this.lwsales = lwsales;
        return this;
    }

    public void setLwsales(Long lwsales) {
        this.lwsales = lwsales;
    }

    public Long getSalesplnd() {
        return salesplnd;
    }

    public Storepwt salesplnd(Long salesplnd) {
        this.salesplnd = salesplnd;
        return this;
    }

    public void setSalesplnd(Long salesplnd) {
        this.salesplnd = salesplnd;
    }

    public Long getSalesplndwktwo() {
        return salesplndwktwo;
    }

    public Storepwt salesplndwktwo(Long salesplndwktwo) {
        this.salesplndwktwo = salesplndwktwo;
        return this;
    }

    public void setSalesplndwktwo(Long salesplndwktwo) {
        this.salesplndwktwo = salesplndwktwo;
    }

    public Long getSalesplndbal() {
        return salesplndbal;
    }

    public Storepwt salesplndbal(Long salesplndbal) {
        this.salesplndbal = salesplndbal;
        return this;
    }

    public void setSalesplndbal(Long salesplndbal) {
        this.salesplndbal = salesplndbal;
    }

    public Long getOtsweeks() {
        return otsweeks;
    }

    public Storepwt otsweeks(Long otsweeks) {
        this.otsweeks = otsweeks;
        return this;
    }

    public void setOtsweeks(Long otsweeks) {
        this.otsweeks = otsweeks;
    }

    public Long getLwdistreg() {
        return lwdistreg;
    }

    public Storepwt lwdistreg(Long lwdistreg) {
        this.lwdistreg = lwdistreg;
        return this;
    }

    public void setLwdistreg(Long lwdistreg) {
        this.lwdistreg = lwdistreg;
    }

    public Long getInvtplnd() {
        return invtplnd;
    }

    public Storepwt invtplnd(Long invtplnd) {
        this.invtplnd = invtplnd;
        return this;
    }

    public void setInvtplnd(Long invtplnd) {
        this.invtplnd = invtplnd;
    }

    public Long getLwinvt() {
        return lwinvt;
    }

    public Storepwt lwinvt(Long lwinvt) {
        this.lwinvt = lwinvt;
        return this;
    }

    public void setLwinvt(Long lwinvt) {
        this.lwinvt = lwinvt;
    }

    public Long getOrigpct() {
        return origpct;
    }

    public Storepwt origpct(Long origpct) {
        this.origpct = origpct;
        return this;
    }

    public void setOrigpct(Long origpct) {
        this.origpct = origpct;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Storepwt storepwt = (Storepwt) o;
        if (storepwt.id == null || id == null) {
            return false;
        }
        return Objects.equals(id, storepwt.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Storepwt{" +
            "id=" + id +
            ", deptnum='" + deptnum + "'" +
            ", divnum='" + divnum + "'" +
            ", groups='" + groups + "'" +
            ", pages='" + pages + "'" +
            ", transitional='" + transitional + "'" +
            ", workuid='" + workuid + "'" +
            ", ordinalkey='" + ordinalkey + "'" +
            ", strnum='" + strnum + "'" +
            ", dcnum='" + dcnum + "'" +
            ", zonenum='" + zonenum + "'" +
            ", ssratturn='" + ssratturn + "'" +
            ", currentots='" + currentots + "'" +
            ", totactualsales='" + totactualsales + "'" +
            ", totplndsales='" + totplndsales + "'" +
            ", twinvt='" + twinvt + "'" +
            ", invtplndend='" + invtplndend + "'" +
            ", twsales='" + twsales + "'" +
            ", wtddist='" + wtddist + "'" +
            ", origots='" + origots + "'" +
            ", otsadj='" + otsadj + "'" +
            ", salesago='" + salesago + "'" +
            ", lwsales='" + lwsales + "'" +
            ", salesplnd='" + salesplnd + "'" +
            ", salesplndwktwo='" + salesplndwktwo + "'" +
            ", salesplndbal='" + salesplndbal + "'" +
            ", otsweeks='" + otsweeks + "'" +
            ", lwdistreg='" + lwdistreg + "'" +
            ", invtplnd='" + invtplnd + "'" +
            ", lwinvt='" + lwinvt + "'" +
            ", origpct='" + origpct + "'" +
            '}';
    }
}
