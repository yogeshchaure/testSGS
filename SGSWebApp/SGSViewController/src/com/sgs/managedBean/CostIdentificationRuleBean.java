package com.sgs.managedBean;

import oracle.adf.model.BindingContext;

import oracle.adf.model.binding.DCBindingContainer;
import oracle.adf.model.binding.DCIteratorBinding;

import oracle.binding.BindingContainer;
import oracle.binding.OperationBinding;

import oracle.jbo.ViewObject;

public class CostIdentificationRuleBean {
    public CostIdentificationRuleBean() {
    }


    public BindingContainer getBindings() {
        return BindingContext.getCurrent().getCurrentBindingsEntry();
    }
    
    
    public String submitCostIdentificationRule() {
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding = bindings.getOperationBinding("Commit");
        Object result = operationBinding.execute();
        DCBindingContainer dcBindings =(DCBindingContainer)BindingContext.getCurrent().getCurrentBindingsEntry();
               
        DCIteratorBinding sgsCIRIter = dcBindings.findIteratorBinding("SgsCostIdentificationRuleView1Iterator");

        ViewObject sgsCIRVO = sgsCIRIter.getViewObject();
        sgsCIRVO.executeQuery();
        if (!operationBinding.getErrors().isEmpty()) {
            return null;
        }
        return "save";
    }
    
        
    public String deleteCostIdentificationRule() {
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
