package com.sgs.managedBean;

import com.sgs.utils.ADFUtils;

import oracle.adf.model.BindingContext;
import oracle.adf.model.binding.DCBindingContainer;
import oracle.adf.model.binding.DCIteratorBinding;
import oracle.adf.view.rich.component.rich.data.RichTable;
import oracle.adf.view.rich.component.rich.nav.RichButton;

import oracle.binding.BindingContainer;
import oracle.binding.OperationBinding;

import oracle.jbo.ApplicationModule;
import oracle.jbo.ViewObject;
import oracle.jbo.uicli.binding.JUCtrlHierBinding;

public class BusinessUnitBean {
    private RichButton filterButton;
    private RichTable bbuTable;
    private ApplicationModule sgsAppModule = ADFUtils.getApplicationModuleForDataControl("SGSAppModuleDataControl");

    public BusinessUnitBean() {
    }

    public void getFilterByClick() {
        System.out.println(getBbuTable().isFilterVisible() + "    " + getFilterButton().isDisabled());
        if (getBbuTable().isFilterVisible() != true && getFilterButton().isDisabled() != true)
            getBbuTable().setFilterVisible(true);
        else
            getBbuTable().setFilterVisible(false);

    }

    public void setFilterButton(RichButton filterButton) {
        this.filterButton = filterButton;
    }

    public RichButton getFilterButton() {
        return filterButton;
    }

    public void setBbuTable(RichTable bbuTable) {
        this.bbuTable = bbuTable;
    }

    public RichTable getBbuTable() {
        return bbuTable;
    }

    //    public void filterByBU() {
    //        ADFUtils.filterByUsersBU("SgsBusinessUnitsVO1");
    //    }

    public BindingContainer getBindings() {
        return BindingContext.getCurrent().getCurrentBindingsEntry();
    }

    public String submitBUAction() {
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding = bindings.getOperationBinding("Commit");
        Object result = operationBinding.execute();
        DCBindingContainer dcBindings =(DCBindingContainer)BindingContext.getCurrent().getCurrentBindingsEntry();
               
        DCIteratorBinding sgsBUIter = dcBindings.findIteratorBinding("SgsBusinessUnitsVO1Iterator");

        ViewObject sgsBuVO = sgsBUIter.getViewObject();
        sgsBuVO.executeQuery();
        if (!operationBinding.getErrors().isEmpty()) {
            return null;
        }
        return "save";
    }

    public String deleteBUAction() {
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding = bindings.getOperationBinding("Delete");
        Object result = operationBinding.execute();
        OperationBinding deleteOb = bindings.getOperationBinding("Commit");
        deleteOb.execute();
        if (!operationBinding.getErrors().isEmpty()) {
            return null;
        }
        return null;
    }
}
