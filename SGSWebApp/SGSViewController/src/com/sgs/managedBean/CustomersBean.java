package com.sgs.managedBean;

import com.sgs.model.service.SGSAppModuleImpl;
import com.sgs.model.view.SgsCustomersVOImpl;
import com.sgs.model.view.SgsCustomersVORowImpl;
import com.sgs.utils.ADFUtils;

import oracle.adf.model.BindingContext;

import oracle.binding.BindingContainer;
import oracle.binding.OperationBinding;

import oracle.jbo.ApplicationModule;
import oracle.jbo.Row;
import oracle.jbo.RowSet;
import oracle.jbo.ViewObject;

public class CustomersBean {
    private ApplicationModule sgsAppModule = ADFUtils.getApplicationModuleForDataControl("SGSAppModuleDataControl");

    public CustomersBean() {
    }

    public BindingContainer getBindings() {
        return BindingContext.getCurrent().getCurrentBindingsEntry();
    }

    public String deleteButton() {
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding = bindings.getOperationBinding("Delete");
        Object result = operationBinding.execute();
        if (!operationBinding.getErrors().isEmpty()) {
            return null;
        }
        return null;
    }

//    public void filterByUsersBU() {
       // ADFUtils.filterByUsersBU("SgsCustomersVO1");
//        ViewObject sgsVO = sgsAppModule.findViewObject("SgsCustomersVO1");
//        sgsVO.setWhereClause("BU_ID = COALESCE(" + ADFUtils.getSessionAttribute("usersBuId") + ",BU_ID)");
//        sgsVO.executeQuery();
//        
//        System.out.println(sgsVO.getEstimatedRowCount());
//        //ViewObject sgsCustomersVOImpl = sgsAppModule.findViewObject("sgsAppModule");
//        
//        SgsCustomersVORowImpl ss = (SgsCustomersVORowImpl)sgsVO.getCurrentRow();
//        
//        RowSet lovRw = ss.getSgsBusinessUnitsVO1();
//        lovRw.setNamedWhereClauseParam("pBuId", ADFUtils.getSessionAttribute("usersBuId"));
//        lovRw.executeQuery();
//    }
}
