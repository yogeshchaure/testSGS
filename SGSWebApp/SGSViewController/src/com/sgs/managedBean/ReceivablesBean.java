package com.sgs.managedBean;

import com.sgs.utils.ADFUtils;

import oracle.adf.model.BindingContext;

import oracle.adf.share.logging.ADFLogger;

import oracle.binding.BindingContainer;
import oracle.binding.OperationBinding;

import oracle.jbo.ApplicationModule;
import oracle.jbo.Row;
import oracle.jbo.ViewObject;

public class ReceivablesBean {
    public ReceivablesBean() {
    }
    private static final ADFLogger LOG = ADFLogger.createADFLogger(ReceivablesBean.class);
    private ApplicationModule sgsAppModule = ADFUtils.getApplicationModuleForDataControl("SGSAppModuleDataControl");

    public BindingContainer getBindings() {
        return BindingContext.getCurrent().getCurrentBindingsEntry();
    }

    public String deleteARInvbutton() {
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding = bindings.getOperationBinding("Delete");
        Object result = operationBinding.execute();
        if (!operationBinding.getErrors().isEmpty()) {
            return null;
        }
        return null;
    }

    public String deleteARInvLineButton() {
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding = bindings.getOperationBinding("Delete1");
        Object result = operationBinding.execute();
        if (!operationBinding.getErrors().isEmpty()) {
            return null;
        }
        return null;
    }

    public String deleteARReceiptButton() {
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding = bindings.getOperationBinding("Delete2");
        Object result = operationBinding.execute();
        if (!operationBinding.getErrors().isEmpty()) {
            return null;
        }
        return null;
    }

    public String approveARInv() {
        try {
            ViewObject sgsAccPayInvoices = sgsAppModule.findViewObject("SgsAccRecInvoicesVO1");
            Row apRow = sgsAccPayInvoices.getCurrentRow();
            if (apRow != null)
                apRow.setAttribute("Status", "A");
            commitAM();
        } catch (Exception e) {
            LOG.severe(e);
        }
        return null;
    }
    
    public void commitAM() {
        try {
            BindingContainer bindings = getBindings();
            OperationBinding operationBinding1 = bindings.getOperationBinding("Commit");
            operationBinding1.execute();
        } catch (Exception e) {
            LOG.severe(e);
        }
    }

    public String rejectARinv() {
        try {
            ViewObject sgsAccPayInvoices = sgsAppModule.findViewObject("SgsAccRecInvoicesVO1");
            Row apRow = sgsAccPayInvoices.getCurrentRow();
            if (apRow != null)
                apRow.setAttribute("Status", "R");
            commitAM();
        } catch (Exception e) {
            LOG.severe(e);
        }
        return null;
    }

    public String cancelARInv() {
        try {
            ViewObject sgsAccPayInvoices = sgsAppModule.findViewObject("SgsAccRecInvoicesVO1");
            Row apRow = sgsAccPayInvoices.getCurrentRow();
            if (apRow != null)
                apRow.setAttribute("Status", "C");
            commitAM();
        } catch (Exception e) {
            LOG.severe(e);
        }
        return null;
    }
}
