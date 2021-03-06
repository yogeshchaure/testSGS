package com.sgs.model.entity;

import com.sgs.model.service.SGSAppModuleImpl;

import java.math.BigDecimal;

import java.sql.Date;

import oracle.adf.share.logging.ADFLogger;

import oracle.jbo.AttributeList;
import oracle.jbo.Key;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Wed May 19 10:35:07 IST 2021
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class SgsApInvPaymentsImpl extends EntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    protected enum AttributesEnum {
        PaymentsId,
        BuId,
        ApInvPaymentsId,
        AccPayInvoicesId,
        AmountPaid,
        CreatedDate,
        CreatedBy,
        UpdatedDate,
        UpdatedBy;
        private static AttributesEnum[] vals = null;
        private static final int firstIndex = 0;

        protected int index() {
            return AttributesEnum.firstIndex() + ordinal();
        }

        protected static final int firstIndex() {
            return firstIndex;
        }

        protected static int count() {
            return AttributesEnum.firstIndex() + AttributesEnum.staticValues().length;
        }

        protected static final AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = AttributesEnum.values();
            }
            return vals;
        }
    }
    public static final int PAYMENTSID = AttributesEnum.PaymentsId.index();
    public static final int BUID = AttributesEnum.BuId.index();
    public static final int APINVPAYMENTSID = AttributesEnum.ApInvPaymentsId.index();
    public static final int ACCPAYINVOICESID = AttributesEnum.AccPayInvoicesId.index();
    public static final int AMOUNTPAID = AttributesEnum.AmountPaid.index();
    public static final int CREATEDDATE = AttributesEnum.CreatedDate.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int UPDATEDDATE = AttributesEnum.UpdatedDate.index();
    public static final int UPDATEDBY = AttributesEnum.UpdatedBy.index();
    private static final ADFLogger LOG = ADFLogger.createADFLogger(SgsApInvPaymentsImpl.class);

    /**
     * This is the default constructor (do not remove).
     */
    public SgsApInvPaymentsImpl() {
    }

    /**
     * Gets the attribute value for PaymentsId, using the alias name PaymentsId.
     * @return the value of PaymentsId
     */
    public Integer getPaymentsId() {
        return (Integer) getAttributeInternal(PAYMENTSID);
    }

    /**
     * Sets <code>value</code> as the attribute value for PaymentsId.
     * @param value value to set the PaymentsId
     */
    public void setPaymentsId(Integer value) {
        setAttributeInternal(PAYMENTSID, value);
    }

    /**
     * Gets the attribute value for BuId, using the alias name BuId.
     * @return the value of BuId
     */
    public Integer getBuId() {
        return (Integer) getAttributeInternal(BUID);
    }

    /**
     * Sets <code>value</code> as the attribute value for BuId.
     * @param value value to set the BuId
     */
    public void setBuId(Integer value) {
        setAttributeInternal(BUID, value);
    }

    /**
     * Gets the attribute value for ApInvPaymentsId, using the alias name ApInvPaymentsId.
     * @return the value of ApInvPaymentsId
     */
    public Integer getApInvPaymentsId() {
        return (Integer) getAttributeInternal(APINVPAYMENTSID);
    }

    /**
     * Sets <code>value</code> as the attribute value for ApInvPaymentsId.
     * @param value value to set the ApInvPaymentsId
     */
    public void setApInvPaymentsId(Integer value) {
        setAttributeInternal(APINVPAYMENTSID, value);
    }

    /**
     * Gets the attribute value for AccPayInvoicesId, using the alias name AccPayInvoicesId.
     * @return the value of AccPayInvoicesId
     */
    public Integer getAccPayInvoicesId() {
        return (Integer) getAttributeInternal(ACCPAYINVOICESID);
    }

    /**
     * Sets <code>value</code> as the attribute value for AccPayInvoicesId.
     * @param value value to set the AccPayInvoicesId
     */
    public void setAccPayInvoicesId(Integer value) {
        setAttributeInternal(ACCPAYINVOICESID, value);
    }

    /**
     * Gets the attribute value for AmountPaid, using the alias name AmountPaid.
     * @return the value of AmountPaid
     */
    public BigDecimal getAmountPaid() {
        return (BigDecimal) getAttributeInternal(AMOUNTPAID);
    }

    /**
     * Sets <code>value</code> as the attribute value for AmountPaid.
     * @param value value to set the AmountPaid
     */
    public void setAmountPaid(BigDecimal value) {
        setAttributeInternal(AMOUNTPAID, value);
    }

    /**
     * Gets the attribute value for CreatedDate, using the alias name CreatedDate.
     * @return the value of CreatedDate
     */
    public Date getCreatedDate() {
        return (Date) getAttributeInternal(CREATEDDATE);
    }

    /**
     * Gets the attribute value for CreatedBy, using the alias name CreatedBy.
     * @return the value of CreatedBy
     */
    public String getCreatedBy() {
        return (String) getAttributeInternal(CREATEDBY);
    }

    /**
     * Gets the attribute value for UpdatedDate, using the alias name UpdatedDate.
     * @return the value of UpdatedDate
     */
    public Date getUpdatedDate() {
        return (Date) getAttributeInternal(UPDATEDDATE);
    }

    /**
     * Gets the attribute value for UpdatedBy, using the alias name UpdatedBy.
     * @return the value of UpdatedBy
     */
    public String getUpdatedBy() {
        return (String) getAttributeInternal(UPDATEDBY);
    }

    /**
     * @param paymentsId key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(Integer paymentsId) {
        return new Key(new Object[] { paymentsId });
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("com.sgs.model.entity.SgsApInvPayments");
    }

    /**
     * Add attribute defaulting logic in this method.
     * @param attributeList list of attribute names/values to initialize the row
     */
    protected void create(AttributeList attributeList) {
        super.create(attributeList);
        try {
            SGSAppModuleImpl am = new SGSAppModuleImpl();
            setPaymentsId(am.getDBSequence("SGS_AP_INV_PAYMENTS_SEQ"));
        } catch (Exception e) {
            LOG.severe(e);
        }
    }
}

