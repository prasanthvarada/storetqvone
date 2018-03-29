package com.service.dto;


import java.io.Serializable;
import java.util.Objects;

/**
 * A DTO for the Storeparent entity.
 */
public class StoreparentDTO implements Serializable {

    private Long id;

    private Long deptnum;

    private Long divnum;

    private Long groups;

    private Long pages;

    private String transitional;

    private String postonlyind;

    private String catgnumone;

    private String catgnumtwo;

    private String catgnumthree;

    private String catgnumfour;

    private Long blndotsdep;

    private Long blndotsgrp;

    private Long blndotspage;

    private String catgnumfive;

    private String plandesc;

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
    public String getPostonlyind() {
        return postonlyind;
    }

    public void setPostonlyind(String postonlyind) {
        this.postonlyind = postonlyind;
    }
    public String getCatgnumone() {
        return catgnumone;
    }

    public void setCatgnumone(String catgnumone) {
        this.catgnumone = catgnumone;
    }
    public String getCatgnumtwo() {
        return catgnumtwo;
    }

    public void setCatgnumtwo(String catgnumtwo) {
        this.catgnumtwo = catgnumtwo;
    }
    public String getCatgnumthree() {
        return catgnumthree;
    }

    public void setCatgnumthree(String catgnumthree) {
        this.catgnumthree = catgnumthree;
    }
    public String getCatgnumfour() {
        return catgnumfour;
    }

    public void setCatgnumfour(String catgnumfour) {
        this.catgnumfour = catgnumfour;
    }
    public Long getBlndotsdep() {
        return blndotsdep;
    }

    public void setBlndotsdep(Long blndotsdep) {
        this.blndotsdep = blndotsdep;
    }
    public Long getBlndotsgrp() {
        return blndotsgrp;
    }

    public void setBlndotsgrp(Long blndotsgrp) {
        this.blndotsgrp = blndotsgrp;
    }
    public Long getBlndotspage() {
        return blndotspage;
    }

    public void setBlndotspage(Long blndotspage) {
        this.blndotspage = blndotspage;
    }
    public String getCatgnumfive() {
        return catgnumfive;
    }

    public void setCatgnumfive(String catgnumfive) {
        this.catgnumfive = catgnumfive;
    }
    public String getPlandesc() {
        return plandesc;
    }

    public void setPlandesc(String plandesc) {
        this.plandesc = plandesc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        StoreparentDTO storeparentDTO = (StoreparentDTO) o;

        if ( ! Objects.equals(id, storeparentDTO.id)) { return false; }

        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "StoreparentDTO{" +
            "id=" + id +
            ", deptnum='" + deptnum + "'" +
            ", divnum='" + divnum + "'" +
            ", groups='" + groups + "'" +
            ", pages='" + pages + "'" +
            ", transitional='" + transitional + "'" +
            ", postonlyind='" + postonlyind + "'" +
            ", catgnumone='" + catgnumone + "'" +
            ", catgnumtwo='" + catgnumtwo + "'" +
            ", catgnumthree='" + catgnumthree + "'" +
            ", catgnumfour='" + catgnumfour + "'" +
            ", blndotsdep='" + blndotsdep + "'" +
            ", blndotsgrp='" + blndotsgrp + "'" +
            ", blndotspage='" + blndotspage + "'" +
            ", catgnumfive='" + catgnumfive + "'" +
            ", plandesc='" + plandesc + "'" +
            '}';
    }
}
