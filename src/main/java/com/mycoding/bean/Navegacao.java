package com.mycoding.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;

@ManagedBean
@ViewScoped
public class Navegacao {

    public String irMoveis() {
        return "/paginas/moveis.xhtml?faces-redirect=true";
    }

}
