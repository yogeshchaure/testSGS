package com.sgs.managedBean;

import com.sgs.model.entity.SgsAccPayInvoicesImpl;

import com.sgs.model.service.SGSAppModuleImpl;

import com.sgs.utils.ADFUtils;

import javax.faces.event.ActionEvent;

import oracle.adf.model.BindingContext;

import oracle.adf.share.logging.ADFLogger;

import oracle.binding.BindingContainer;
import oracle.binding.OperationBinding;

import oracle.jbo.ApplicationModule;
import oracle.jbo.Row;
import oracle.jbo.ViewObject;

public class PayablesBean {
    public PayablesBean() {
    }
    private static final ADFLogger LOG = ADFLogger.createADFLogger(PayablesBean.class);
    private ApplicationModule sgsAppModule = ADFUtils.getApplicationModuleForDataControl("SGSAppModuleDataControl");

    public BindingContainer getBindings() {
        return BindingContext.getCurrent().getCurrentBindingsEntry();
    }

    public String deleteAPInvButton() {
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding = bindings.getOperationBinding("Delete");
        Object result = operationBinding.execute();
        OperationBinding operationBinding1 = bindings.getOperationBinding("Commit");
        operationBinding1.execute();
        if (!operationBinding.getErrors().isEmpty()) {
            return null;
        }
        return null;
    }

    public String deleteAPInvLineButton() {
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding = bindings.getOperationBinding("Delete1");
        Object result = operationBinding.execute();
        OperationBinding operationBinding1 = bindings.getOperationBinding("Commit");
        operationBinding1.execute();
        if (!operationBinding.getErrors().isEmpty()) {
            return null;
        }
        return null;
    }

    public String deleteAPInvPaymentButton() {
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding = bindings.getOperationBinding("Delete2");
        Object result = operationBinding.execute();
        OperationBinding operationBinding1 = bindings.getOperationBinding("Commit");
        operationBinding1.execute();
        if (!operationBinding.getErrors().isEmpty()) {
            return null;
        }
        return null;
    }

    public String deletePayment() {
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding = bindings.getOperationBinding("Delete3");
        Object result = operationBinding.execute();
        OperationBinding operationBinding1 = bindings.getOperationBinding("Commit");
        operationBinding1.execute();
        if (!operationBinding.getErrors().isEmpty()) {
            return null;
        }
        return null;
    }

    public String deletePaymentDtl() {
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding = bindings.getOperationBinding("Delete4");
        Object result = operationBinding.execute();
        OperationBinding operationBinding1 = bindings.getOperationBinding("Commit");
        operationBinding1.execute();
        if (!operationBinding.getErrors().isEmpty()) {
            return null;
        }
        return null;
    }

    public String approveAPInv() {
        try {
            ViewObject sgsAccPayInvoices = sgsAppModule.findViewObject("SgsAccPayInvoicesVO1");
            Row apRow = sgsAccPayInvoices.getCurrentRow();
            if (apRow != null)
                apRow.setAttribute("Status", "A");
            commitAM();
        } catch (Exception e) {
            LOG.severe(e);
        }
        return null;
    }

    public String rejectAPInv() {
        try {
            ViewObject sgsAccPayInvoices = sgsAppModule.findViewObject("SgsAccPayInvoicesVO1");
            Row apRow = sgsAccPayInvoices.getCurrentRow();
            if (apRow != null)
                apRow.setAttribute("Status", "R");
            commitAM();
        } catch (Exception e) {
            LOG.severe(e);
        }
        return null;
    }

    public String cancelAPInv() {
        try {
            ViewObject sgsAccPayInvoices = sgsAppModule.findViewObject("SgsAccPayInvoicesVO1");
            Row apRow = sgsAccPayInvoices.getCurrentRow();
            if (apRow != null)
                apRow.setAttribute("Status", "C");
            commitAM();
        } catch (Exception e) {
            LOG.severe(e);
        }
        return null;
    }
    
    public String updateAPInvStatus(String status) {
        try {
            ViewObject sgsAccPayInvoices = sgsAppModule.findViewObject("SgsAccPayInvoicesVO1");
            Row apRow = sgsAccPayInvoices.getCurrentRow();
            if (apRow != null)
                apRow.setAttribute("Status", status);
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

    public void cancelApInv(ActionEvent actionEvent) {
        System.out.println(actionEvent.getComponent());
        System.out.println(actionEvent.getPhaseId().getName());
        System.out.println(actionEvent.getSource());
    }
}
