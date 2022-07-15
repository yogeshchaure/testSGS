<%@ taglib uri="http://xmlns.oracle.com/adf/faces/rich" prefix="af"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<f:view>
    <af:document title="Login" id="d1">
               <af:form id="f1" inlineStyle="background-color:white">
            <af:panelStretchLayout id="psl1" topHeight="110px" inlineStyle="background-color:white;min-height: 700px;">
                <f:facet name="start"/>
                <f:facet name="end"/>
                <f:facet name="top">
                    <af:panelGridLayout id="pgl2">
                        <af:gridRow marginTop="5px" height="auto" marginBottom="5px" id="gr1">
                            <af:gridCell marginStart="5px" width="25%" id="gc1">
                                <af:panelGroupLayout id="pgl1" layout="horizontal"
                                                     inlineStyle="background-color:white;">
                                    <af:image source="/resources/images/SGSLogo.jpg" id="i1" styleClass="width:40%"
                                              inlineStyle="height:87px; width:255px;"/>
                                </af:panelGroupLayout>
                            </af:gridCell>
                            <af:gridCell marginStart="5px" width="25%" id="gc2"/>
                            <af:gridCell marginStart="5px" width="25%" id="gc3"/>
                            <af:gridCell marginStart="5px" width="25%" marginEnd="5px" id="gc4"/>
                        </af:gridRow>
                    </af:panelGridLayout>
                </f:facet>
                <f:facet name="bottom"/>
                <f:facet name="center">
                    <af:panelGroupLayout id="pgl3" inlineStyle="background-color:white">
                        <af:outputText value="Invalid Username or Password." id="ot1"/>
                        <af:link text="login" id="l1" destination="/faces/login.jsp"
                                 inlineStyle="color:blue; font-size:11px; font-weight:bold;margin-left:20px;"/>
                    </af:panelGroupLayout>
                </f:facet>
            </af:panelStretchLayout>
        </af:form>
    </af:document>
</f:view>