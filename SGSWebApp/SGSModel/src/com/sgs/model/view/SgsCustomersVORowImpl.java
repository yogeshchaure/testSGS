package com.sgs.model.view;

import com.sgs.model.entity.SgsCustomersImpl;

import java.sql.Date;

import oracle.jbo.RowSet;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Thu May 13 10:42:04 IST 2021
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class SgsCustomersVORowImpl extends ViewRowImpl {


    public static final int ENTITY_SGSCUSTOMERS = 0;

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    protected enum AttributesEnum {
        CustomersId,
        BuId,
        CustCode,
        CustName,
        CustConN0,
        CustAddress,
        CreatedDate,
        CreatedBy,
        UpdatedDate,
        UpdatedBy,
        SgsBusinessUnitsVO1;
        private static AttributesEnum[] vals = null;
        ;
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


    public static final int CUSTOMERSID = AttributesEnum.CustomersId.index();
    public static final int BUID = AttributesEnum.BuId.index();
    public static final int CUSTCODE = AttributesEnum.CustCode.index();
    public static final int CUSTNAME = AttributesEnum.CustName.index();
    public static final int CUSTCONN0 = AttributesEnum.CustConN0.index();
    public static final int CUSTADDRESS = AttributesEnum.CustAddress.index();
    public static final int CREATEDDATE = AttributesEnum.CreatedDate.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int UPDATEDDATE = AttributesEnum.UpdatedDate.index();
    public static final int UPDATEDBY = AttributesEnum.UpdatedBy.index();
    public static final int SGSBUSINESSUNITSVO1 = AttributesEnum.SgsBusinessUnitsVO1.index();

    /**
     * This is the default constructor (do not remove).
     */
    public SgsCustomersVORowImpl() {
    }

    /**
     * Gets SgsCustomers entity object.
     * @return the SgsCustomers
     */
    public SgsCustomersImpl getSgsCustomers() {
        return (SgsCustomersImpl) getEntity(ENTITY_SGSCUSTOMERS);
    }

    /**
     * Gets the attribute value for CUSTOMERS_ID using the alias name CustomersId.
     * @return the CUSTOMERS_ID
     */
    public Integer getCustomersId() {
        return (Integer) getAttributeInternal(CUSTOMERSID);
    }

    /**
     * Sets <code>value</code> as attribute value for CUSTOMERS_ID using the alias name CustomersId.
     * @param value value to set the CUSTOMERS_ID
     */
    public void setCustomersId(Integer value) {
        setAttributeInternal(CUSTOMERSID, value);
    }

    /**
     * Gets the attribute value for BU_ID using the alias name BuId.
     * @return the BU_ID
     */
    public Integer getBuId() {
        return (Integer) getAttributeInternal(BUID);
    }

    /**
     * Sets <code>value</code> as attribute value for BU_ID using the alias name BuId.
     * @param value value to set the BU_ID
     */
    public void setBuId(Integer value) {
        setAttributeInternal(BUID, value);
    }

    /**
     * Gets the attribute value for CUST_CODE using the alias name CustCode.
     * @return the CUST_CODE
     */
    public String getCustCode() {
        return (String) getAttributeInternal(CUSTCODE);
    }

    /**
     * Sets <code>value</code> as attribute value for CUST_CODE using the alias name CustCode.
     * @param value value to set the CUST_CODE
     */
    public void setCustCode(String value) {
        setAttributeInternal(CUSTCODE, value);
    }

    /**
     * Gets the attribute value for CUST_NAME using the alias name CustName.
     * @return the CUST_NAME
     */
    public String getCustName() {
        return (String) getAttributeInternal(CUSTNAME);
    }

    /**
     * Sets <code>value</code> as attribute value for CUST_NAME using the alias name CustName.
     * @param value value to set the CUST_NAME
     */
    public void setCustName(String value) {
        setAttributeInternal(CUSTNAME, value);
    }

    /**
     * Gets the attribute value for CUST_CON_N0 using the alias name CustConN0.
     * @return the CUST_CON_N0
     */
    public String getCustConN0() {
        return (String) getAttributeInternal(CUSTCONN0);
    }

    /**
     * Sets <code>value</code> as attribute value for CUST_CON_N0 using the alias name CustConN0.
     * @param value value to set the CUST_CON_N0
     */
    public void setCustConN0(String value) {
        setAttributeInternal(CUSTCONN0, value);
    }

    /**
     * Gets the attribute value for CUST_ADDRESS using the alias name CustAddress.
     * @return the CUST_ADDRESS
     */
    public String getCustAddress() {
        return (String) getAttributeInternal(CUSTADDRESS);
    }

    /**
     * Sets <code>value</code> as attribute value for CUST_ADDRESS using the alias name CustAddress.
     * @param value value to set the CUST_ADDRESS
     */
    public void setCustAddress(String value) {
        setAttributeInternal(CUSTADDRESS, value);
    }

    /**
     * Gets the attribute value for CREATED_DATE using the alias name CreatedDate.
     * @return the CREATED_DATE
     */
    public Date getCreatedDate() {
        return (Date) getAttributeInternal(CREATEDDATE);
    }

    /**
     * Gets the attribute value for CREATED_BY using the alias name CreatedBy.
     * @return the CREATED_BY
     */
    public String getCreatedBy() {
        return (String) getAttributeInternal(CREATEDBY);
    }

    /**
     * Gets the attribute value for UPDATED_DATE using the alias name UpdatedDate.
     * @return the UPDATED_DATE
     */
    public Date getUpdatedDate() {
        return (Date) getAttributeInternal(UPDATEDDATE);
    }

    /**
     * Gets the attribute value for UPDATED_BY using the alias name UpdatedBy.
     * @return the UPDATED_BY
     */
    public String getUpdatedBy() {
        return (String) getAttributeInternal(UPDATEDBY);
    }


    /**
     * Gets the view accessor <code>RowSet</code> SgsBusinessUnitsVO1.
     */
    public RowSet getSgsBusinessUnitsVO1() {
        return (RowSet) getAttributeInternal(SGSBUSINESSUNITSVO1);
    }
}

