package com.vaadin.tutorial.crm.ui;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.data.value.ValueChangeMode;
import com.vaadin.flow.router.Route;
import com.vaadin.tutorial.crm.backend.entity.User;
import com.vaadin.tutorial.crm.backend.service.Test;

@Route("")
@CssImport("./styles/shared-styles.css")
public class MainView extends VerticalLayout {

    TextField filterText = new TextField();

    private Test test;
    Grid<User> grid = new Grid<>(User.class);

    public MainView(Test test) {
        // this.contactService = contactService;
        this.test=test;
        addClassName("list-view");
        setSizeFull();
        configureGrid();
        configureFilter();

        TextField filterTexta = new TextField(test.findall());

        Div content = new Div(grid);
        content.addClassName("content");
        content.setSizeFull();

        add(filterText, filterTexta,content);
        grid.setItems(test.findDat());
        // updateList();
    }

    private void configureGrid() {
        
    }

    private void configureFilter() {
        filterText.setPlaceholder("Filter by name...");
        filterText.setClearButtonVisible(true);
        filterText.setValueChangeMode(ValueChangeMode.LAZY);
        // filterText.addValueChangeListener(e -> updateList());
    }

    // private void updateList() {
        
    // }

}