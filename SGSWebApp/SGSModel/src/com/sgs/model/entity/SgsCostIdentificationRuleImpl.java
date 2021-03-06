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
// ---    Fri Jul 01 13:09:43 IST 2022
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------

public class SgsCostIdentificationRuleImpl extends EntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    protected enum AttributesEnum {
        CirId,
        RuleId,
        GlId,
        GlCode,
        JobCode,
        AccountTratment,
        ServiceCategory,
        EffectiveFrom,
        EffectiveTo,
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
    private static final ADFLogger LOG = ADFLogger.createADFLogger(SgsCostIdentificationRuleImpl.class);


    public static final int CIRID = AttributesEnum.CirId.index();
    public static final int RULEID = AttributesEnum.RuleId.index();
    public static final int GLID = AttributesEnum.GlId.index();
    public static final int GLCODE = AttributesEnum.GlCode.index();
    public static final int JOBCODE = AttributesEnum.JobCode.index();
    public static final int ACCOUNTTRATMENT = AttributesEnum.AccountTratment.index();
    public static final int SERVICECATEGORY = AttributesEnum.ServiceCategory.index();
    public static final int EFFECTIVEFROM = AttributesEnum.EffectiveFrom.index();
    public static final int EFFECTIVETO = AttributesEnum.EffectiveTo.index();
    public static final int CREATEDDATE = AttributesEnum.CreatedDate.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int UPDATEDDATE = AttributesEnum.UpdatedDate.index();
    public static final int UPDATEDBY = AttributesEnum.UpdatedBy.index();

    /**
     * This is the default constructor (do not remove).
     */
    public SgsCostIdentificationRuleImpl() {
    }

    /**
     * Gets the attribute value for CirId, using the alias name CirId.
     * @return the value of CirId
     */
    public Integer getCirId() {
        return (Integer) getAttributeInternal(CIRID);
    }

    /**
     * Sets <code>value</code> as the attribute value for CirId.
     * @param value value to set the CirId
     */
    public void setCirId(Integer value) {
        setAttributeInternal(CIRID, value);
    }

    /**
     * Gets the attribute value for RuleId, using the alias name RuleId.
     * @return the value of RuleId
     */
    public String getRuleId() {
        return (String) getAttributeInternal(RULEID);
    }

    /**
     * Sets <code>value</code> as the attribute value for RuleId.
     * @param value value to set the RuleId
     */
    public void setRuleId(String value) {
        setAttributeInternal(RULEID, value);
    }

    /**
     * Gets the attribute value for GlId, using the alias name GlId.
     * @return the value of GlId
     */
    public String getGlId() {
        return (String) getAttributeInternal(GLID);
    }

    /**
     * Sets <code>value</code> as the attribute value for GlId.
     * @param value value to set the GlId
     */
    public void setGlId(String value) {
        setAttributeInternal(GLID, value);
    }

    /**
     * Gets the attribute value for GlCode, using the alias name GlCode.
     * @return the value of GlCode
     */
    public String getGlCode() {
        return (String) getAttributeInternal(GLCODE);
    }

    /**
     * Sets <code>value</code> as the attribute value for GlCode.
     * @param value value to set the GlCode
     */
    public void setGlCode(String value) {
        setAttributeInternal(GLCODE, value);
    }

    /**
     * Gets the attribute value for JobCode, using the alias name JobCode.
     * @return the value of JobCode
     */
    public String getJobCode() {
        return (String) getAttributeInternal(JOBCODE);
    }

    /**
     * Sets <code>value</code> as the attribute value for JobCode.
     * @param value value to set the JobCode
     */
    public void setJobCode(String value) {
        setAttributeInternal(JOBCODE, value);
    }

    /**
     * Gets the attribute value for AccountTratment, using the alias name AccountTratment.
     * @return the value of AccountTratment
     */
    public String getAccountTratment() {
        return (String) getAttributeInternal(ACCOUNTTRATMENT);
    }

    /**
     * Sets <code>value</code> as the attribute value for AccountTratment.
     * @param value value to set the AccountTratment
     */
    public void setAccountTratment(String value) {
        setAttributeInternal(ACCOUNTTRATMENT, value);
    }

    /**
     * Gets the attribute value for ServiceCategory, using the alias name ServiceCategory.
     * @return the value of ServiceCategory
     */
    public String getServiceCategory() {
        return (String) getAttributeInternal(SERVICECATEGORY);
    }

    /**
     * Sets <code>value</code> as the attribute value for ServiceCategory.
     * @param value value to set the ServiceCategory
     */
    public void setServiceCategory(String value) {
        setAttributeInternal(SERVICECATEGORY, value);
    }

    /**
     * Gets the attribute value for EffectiveFrom, using the alias name EffectiveFrom.
     * @return the value of EffectiveFrom
     */
    public Date getEffectiveFrom() {
        return (Date) getAttributeInternal(EFFECTIVEFROM);
    }

    /**
     * Sets <code>value</code> as the attribute value for EffectiveFrom.
     * @param value value to set the EffectiveFrom
     */
    public void setEffectiveFrom(Date value) {
        setAttributeInternal(EFFECTIVEFROM, value);
    }

    /**
     * Gets the attribute value for EffectiveTo, using the alias name EffectiveTo.
     * @return the value of EffectiveTo
     */
    public Date getEffectiveTo() {
        return (Date) getAttributeInternal(EFFECTIVETO);
    }

    /**
     * Sets <code>value</code> as the attribute value for EffectiveTo.
     * @param value value to set the EffectiveTo
     */
    public void setEffectiveTo(Date value) {
        setAttributeInternal(EFFECTIVETO, value);
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
     * @param cirId key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(Integer cirId) {
        return new Key(new Object[] { cirId });
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("com.sgs.model.entity.SgsCostIdentificationRule");
    }


    /**
     * Add attribute defaulting logic in this method.
     * @param attributeList list of attribute names/values to initialize the row
     */
    protected void create(AttributeList attributeList) {
        super.create(attributeList);
        try {
            SGSAppModuleImpl am = new SGSAppModuleImpl();
            setCirId(am.getDBSequence("SGS_COST_IDENTIFICATION_RULE_SEQ"));
        } catch (Exception e) {
            LOG.severe(e);
        }
    }
}

