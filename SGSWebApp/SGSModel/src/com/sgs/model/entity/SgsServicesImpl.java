package com.sgs.model.entity;

import com.sgs.model.service.SGSAppModuleImpl;

import java.sql.Date;

import oracle.adf.share.logging.ADFLogger;

import oracle.jbo.AttributeList;
import oracle.jbo.Key;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Mon Apr 12 19:36:08 IST 2021
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class SgsServicesImpl extends EntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    protected enum AttributesEnum {
        ServicesId,
        BuId,
        ServiceName,
        ServiceType,
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
    public static final int SERVICESID = AttributesEnum.ServicesId.index();
    public static final int BUID = AttributesEnum.BuId.index();
    public static final int SERVICENAME = AttributesEnum.ServiceName.index();
    public static final int SERVICETYPE = AttributesEnum.ServiceType.index();
    public static final int CREATEDDATE = AttributesEnum.CreatedDate.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int UPDATEDDATE = AttributesEnum.UpdatedDate.index();
    public static final int UPDATEDBY = AttributesEnum.UpdatedBy.index();
    private static final ADFLogger LOG = ADFLogger.createADFLogger(SgsServicesImpl.class);

    /**
     * This is the default constructor (do not remove).
     */
    public SgsServicesImpl() {
    }

    /**
     * Gets the attribute value for ServicesId, using the alias name ServicesId.
     * @return the value of ServicesId
     */
    public Integer getServicesId() {
        return (Integer) getAttributeInternal(SERVICESID);
    }

    /**
     * Sets <code>value</code> as the attribute value for ServicesId.
     * @param value value to set the ServicesId
     */
    public void setServicesId(Integer value) {
        setAttributeInternal(SERVICESID, value);
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
     * Gets the attribute value for ServiceName, using the alias name ServiceName.
     * @return the value of ServiceName
     */
    public String getServiceName() {
        return (String) getAttributeInternal(SERVICENAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for ServiceName.
     * @param value value to set the ServiceName
     */
    public void setServiceName(String value) {
        setAttributeInternal(SERVICENAME, value);
    }

    /**
     * Gets the attribute value for ServiceType, using the alias name ServiceType.
     * @return the value of ServiceType
     */
    public String getServiceType() {
        return (String) getAttributeInternal(SERVICETYPE);
    }

    /**
     * Sets <code>value</code> as the attribute value for ServiceType.
     * @param value value to set the ServiceType
     */
    public void setServiceType(String value) {
        setAttributeInternal(SERVICETYPE, value);
    }

    /**
     * Gets the attribute value for CreatedDate, using the alias name CreatedDate.
     * @return the value of CreatedDate
     */
    public Date getCreatedDate() {
        return (Date) getAttributeInternal(CREATEDDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for CreatedDate.
     * @param value value to set the CreatedDate
     */
    public void setCreatedDate(Date value) {
        setAttributeInternal(CREATEDDATE, value);
    }

    /**
     * Gets the attribute value for CreatedBy, using the alias name CreatedBy.
     * @return the value of CreatedBy
     */
    public String getCreatedBy() {
        return (String) getAttributeInternal(CREATEDBY);
    }

    /**
     * Sets <code>value</code> as the attribute value for CreatedBy.
     * @param value value to set the CreatedBy
     */
    public void setCreatedBy(String value) {
        setAttributeInternal(CREATEDBY, value);
    }

    /**
     * Gets the attribute value for UpdatedDate, using the alias name UpdatedDate.
     * @return the value of UpdatedDate
     */
    public Date getUpdatedDate() {
        return (Date) getAttributeInternal(UPDATEDDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for UpdatedDate.
     * @param value value to set the UpdatedDate
     */
    public void setUpdatedDate(Date value) {
        setAttributeInternal(UPDATEDDATE, value);
    }

    /**
     * Gets the attribute value for UpdatedBy, using the alias name UpdatedBy.
     * @return the value of UpdatedBy
     */
    public String getUpdatedBy() {
        return (String) getAttributeInternal(UPDATEDBY);
    }

    /**
     * Sets <code>value</code> as the attribute value for UpdatedBy.
     * @param value value to set the UpdatedBy
     */
    public void setUpdatedBy(String value) {
        setAttributeInternal(UPDATEDBY, value);
    }

    /**
     * @param servicesId key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(Integer servicesId) {
        return new Key(new Object[] { servicesId });
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("com.sgs.model.entity.SgsServices");
    }

    /**
     * Add attribute defaulting logic in this method.
     * @param attributeList list of attribute names/values to initialize the row
     */
    protected void create(AttributeList attributeList) {
        super.create(attributeList);
        try {
            SGSAppModuleImpl am = new SGSAppModuleImpl();
            setServicesId(am.getDBSequence("SGS_SERVICES_SEQ"));
        } catch (Exception e) {
            LOG.severe(e);
        }
    }
}

