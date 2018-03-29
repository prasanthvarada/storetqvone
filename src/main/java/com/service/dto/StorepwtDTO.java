package com.service.dto;


import java.io.Serializable;
import java.util.Objects;

/**
 * A DTO for the Storepwt entity.
 */
public class StorepwtDTO implements Serializable {

    private Long id;

    private Long deptnum;

    private Long divnum;

    private Long groups;

    private Long pages;

    private String transitional;

    private String workuid;

    private Long ordinalkey;

    private Long strnum;

    private Long dcnum;

    private Long zonenum;

    private Double ssratturn;

    private Long currentots;

    private Long totactualsales;

    private Long totplndsales;

    private Long twinvt;

    private Long invtplndend;

    private Long twsales;

    private Long wtddist;

    private Long origots;

    private Long otsadj;

    private Long salesago;

    private Long lwsales;

    private Long salesplnd;

    private Long salesplndwktwo;

    private Long salesplndbal;

    private Long otsweeks;

    private Long lwdistreg;

    private Long invtplnd;

    private Long lwinvt;

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

    public void setDeptnum(Long deptnum) {
        this.deptnum = deptnum;
    }
    public Long getDivnum() {
        return divnum;
    }

    public void setDivnum(Long divnum) {
        this.divnum = divnum;
    }
    public Long getGroups() {
        return groups;
    }

    public void setGroups(Long groups) {
        this.groups = groups;
    }
    public Long getPages() {
        return pages;
    }

    public void setPages(Long pages) {
        this.pages = pages;
    }
    public String getTransitional() {
        return transitional;
    }

    public void setTransitional(String transitional) {
        this.transitional = transitional;
    }
    public String getWorkuid() {
        return workuid;
    }

    public void setWorkuid(String workuid) {
        this.workuid = workuid;
    }
    public Long getOrdinalkey() {
        return ordinalkey;
    }

    public void setOrdinalkey(Long ordinalkey) {
        this.ordinalkey = ordinalkey;
    }
    public Long getStrnum() {
        return strnum;
    }

    public void setStrnum(Long strnum) {
        this.strnum = strnum;
    }
    public Long getDcnum() {
        return dcnum;
    }

    public void setDcnum(Long dcnum) {
        this.dcnum = dcnum;
    }
    public Long getZonenum() {
        return zonenum;
    }

    public void setZonenum(Long zonenum) {
        this.zonenum = zonenum;
    }
    public Double getSsratturn() {
        return ssratturn;
    }

    public void setSsratturn(Double ssratturn) {
        this.ssratturn = ssratturn;
    }
    public Long getCurrentots() {
        return currentots;
    }

    public void setCurrentots(Long currentots) {
        this.currentots = currentots;
    }
    public Long getTotactualsales() {
        return totactualsales;
    }

    public void setTotactualsales(Long totactualsales) {
        this.totactualsales = totactualsales;
    }
    public Long getTotplndsales() {
        return totplndsales;
    }

    public void setTotplndsales(Long totplndsales) {
        this.totplndsales = totplndsales;
    }
    public Long getTwinvt() {
        return twinvt;
    }

    public void setTwinvt(Long twinvt) {
        this.twinvt = twinvt;
    }
    public Long getInvtplndend() {
        return invtplndend;
    }

    public void setInvtplndend(Long invtplndend) {
        this.invtplndend = invtplndend;
    }
    public Long getTwsales() {
        return twsales;
    }

    public void setTwsales(Long twsales) {
        this.twsales = twsales;
    }
    public Long getWtddist() {
        return wtddist;
    }

    public void setWtddist(Long wtddist) {
        this.wtddist = wtddist;
    }
    public Long getOrigots() {
        return origots;
    }

    public void setOrigots(Long origots) {
        this.origots = origots;
    }
    public Long getOtsadj() {
        return otsadj;
    }

    public void setOtsadj(Long otsadj) {
        this.otsadj = otsadj;
    }
    public Long getSalesago() {
        return salesago;
    }

    public void setSalesago(Long salesago) {
        this.salesago = salesago;
    }
    public Long getLwsales() {
        return lwsales;
    }

    public void setLwsales(Long lwsales) {
        this.lwsales = lwsales;
    }
    public Long getSalesplnd() {
        return salesplnd;
    }

    public void setSalesplnd(Long salesplnd) {
        this.salesplnd = salesplnd;
    }
    public Long getSalesplndwktwo() {
        return salesplndwktwo;
    }

    public void setSalesplndwktwo(Long salesplndwktwo) {
        this.salesplndwktwo = salesplndwktwo;
    }
    public Long getSalesplndbal() {
        return salesplndbal;
    }

    public void setSalesplndbal(Long salesplndbal) {
        this.salesplndbal = salesplndbal;
    }
    public Long getOtsweeks() {
        return otsweeks;
    }

    public void setOtsweeks(Long otsweeks) {
        this.otsweeks = otsweeks;
    }
    public Long getLwdistreg() {
        return lwdistreg;
    }

    public void setLwdistreg(Long lwdistreg) {
        this.lwdistreg = lwdistreg;
    }
    public Long getInvtplnd() {
        return invtplnd;
    }

    public void setInvtplnd(Long invtplnd) {
        this.invtplnd = invtplnd;
    }
    public Long getLwinvt() {
        return lwinvt;
    }

    public void setLwinvt(Long lwinvt) {
        this.lwinvt = lwinvt;
    }
    public Long getOrigpct() {
        return origpct;
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

        StorepwtDTO storepwtDTO = (StorepwtDTO) o;

        if ( ! Objects.equals(id, storepwtDTO.id)) { return false; }

        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "StorepwtDTO{" +
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
