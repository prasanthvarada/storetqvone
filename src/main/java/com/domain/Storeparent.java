package com.domain;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

/**
 * A Storeparent.
 */
@Entity(name = "storeparent")
@Table(name = "storeparent")
public class Storeparent implements Serializable {

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

    @Column(name = "postonlyind")
    private String postonlyind;

    @Column(name = "catgnumone")
    private String catgnumone;

    @Column(name = "catgnumtwo")
    private String catgnumtwo;

    @Column(name = "catgnumthree")
    private String catgnumthree;

    @Column(name = "catgnumfour")
    private String catgnumfour;

    @Column(name = "blndotsdep")
    private Long blndotsdep;

    @Column(name = "blndotsgrp")
    private Long blndotsgrp;

    @Column(name = "blndotspage")
    private Long blndotspage;

    @Column(name = "catgnumfive")
    private String catgnumfive;

    @Column(name = "plandesc")
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

    public Storeparent deptnum(Long deptnum) {
        this.deptnum = deptnum;
        return this;
    }

    public void setDeptnum(Long deptnum) {
        this.deptnum = deptnum;
    }

    public Long getDivnum() {
        return divnum;
    }

    public Storeparent divnum(Long divnum) {
        this.divnum = divnum;
        return this;
    }

    public void setDivnum(Long divnum) {
        this.divnum = divnum;
    }

    public Long getGroups() {
        return groups;
    }

    public Storeparent groups(Long groups) {
        this.groups = groups;
        return this;
    }

    public void setGroups(Long groups) {
        this.groups = groups;
    }

    public Long getPages() {
        return pages;
    }

    public Storeparent pages(Long pages) {
        this.pages = pages;
        return this;
    }

    public void setPages(Long pages) {
        this.pages = pages;
    }

    public String getTransitional() {
        return transitional;
    }

    public Storeparent transitional(String transitional) {
        this.transitional = transitional;
        return this;
    }

    public void setTransitional(String transitional) {
        this.transitional = transitional;
    }

    public String getPostonlyind() {
        return postonlyind;
    }

    public Storeparent postonlyind(String postonlyind) {
        this.postonlyind = postonlyind;
        return this;
    }

    public void setPostonlyind(String postonlyind) {
        this.postonlyind = postonlyind;
    }

    public String getCatgnumone() {
        return catgnumone;
    }

    public Storeparent catgnumone(String catgnumone) {
        this.catgnumone = catgnumone;
        return this;
    }

    public void setCatgnumone(String catgnumone) {
        this.catgnumone = catgnumone;
    }

    public String getCatgnumtwo() {
        return catgnumtwo;
    }

    public Storeparent catgnumtwo(String catgnumtwo) {
        this.catgnumtwo = catgnumtwo;
        return this;
    }

    public void setCatgnumtwo(String catgnumtwo) {
        this.catgnumtwo = catgnumtwo;
    }

    public String getCatgnumthree() {
        return catgnumthree;
    }

    public Storeparent catgnumthree(String catgnumthree) {
        this.catgnumthree = catgnumthree;
        return this;
    }

    public void setCatgnumthree(String catgnumthree) {
        this.catgnumthree = catgnumthree;
    }

    public String getCatgnumfour() {
        return catgnumfour;
    }

    public Storeparent catgnumfour(String catgnumfour) {
        this.catgnumfour = catgnumfour;
        return this;
    }

    public void setCatgnumfour(String catgnumfour) {
        this.catgnumfour = catgnumfour;
    }

    public Long getBlndotsdep() {
        return blndotsdep;
    }

    public Storeparent blndotsdep(Long blndotsdep) {
        this.blndotsdep = blndotsdep;
        return this;
    }

    public void setBlndotsdep(Long blndotsdep) {
        this.blndotsdep = blndotsdep;
    }

    public Long getBlndotsgrp() {
        return blndotsgrp;
    }

    public Storeparent blndotsgrp(Long blndotsgrp) {
        this.blndotsgrp = blndotsgrp;
        return this;
    }

    public void setBlndotsgrp(Long blndotsgrp) {
        this.blndotsgrp = blndotsgrp;
    }

    public Long getBlndotspage() {
        return blndotspage;
    }

    public Storeparent blndotspage(Long blndotspage) {
        this.blndotspage = blndotspage;
        return this;
    }

    public void setBlndotspage(Long blndotspage) {
        this.blndotspage = blndotspage;
    }

    public String getCatgnumfive() {
        return catgnumfive;
    }

    public Storeparent catgnumfive(String catgnumfive) {
        this.catgnumfive = catgnumfive;
        return this;
    }

    public void setCatgnumfive(String catgnumfive) {
        this.catgnumfive = catgnumfive;
    }

    public String getPlandesc() {
        return plandesc;
    }

    public Storeparent plandesc(String plandesc) {
        this.plandesc = plandesc;
        return this;
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
        Storeparent storeparent = (Storeparent) o;
        if (storeparent.id == null || id == null) {
            return false;
        }
        return Objects.equals(id, storeparent.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Storeparent{" +
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
