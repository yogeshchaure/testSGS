<%@ taglib uri="http://xmlns.oracle.com/adf/faces/rich" prefix="af"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<f:view>
    <af:document title="Login" id="d1">
        <% response.addHeader("X-FRAME-OPTIONS", "SAMEORIGIN"); %>
        <af:panelBox id="pb2" showHeader="never" showDisclosure="false"
                     inlineStyle="background-color:white;min-height: 700px;">
            <f:facet name="toolbar"/>
            <af:panelGridLayout id="pgl1">
                <af:gridRow marginTop="5px" height="auto" id="gr1">
                    <af:gridCell marginStart="5px" width="34%" id="gc1">
                        <af:panelGroupLayout id="pgl2" layout="horizontal" inlineStyle="background-color:white;">
                            <af:image source="/resources/images/SGSLogo.jpg" id="i1" styleClass="width:40%"
                                      inlineStyle="height:87px; width:255px;" shortDesc="logo"/>
                        </af:panelGroupLayout>
                    </af:gridCell>
                    <af:gridCell marginStart="5px" width="33%" id="gc2"/>
                    <af:gridCell marginStart="5px" width="33%" marginEnd="5px" id="gc3"/>
                </af:gridRow>
                <af:gridRow marginTop="5px" height="50%" id="gr2">
                    <af:gridCell marginStart="5px" width="34%" id="gc4"/>
                    <af:gridCell marginStart="5px" width="60%" id="gc5" halign="center" valign="middle">
                        <af:panelBox text="Login" id="pb1" showDisclosure="false"
                                     inlineStyle="margin:10px; border-radius:3px 3px 3px 3px / 3px 3px 3px 3px ; outline-color:ButtonShadow; outline-offset:2px; outline-style:solid; outline-width:medium; "
                                     titleHalign="center" icon="/resources/icons/login.png">
                            <f:facet name="toolbar"/>
                            <form method="POST" action="j_security_check" autocomplete="off">
                                <af:panelGroupLayout id="pgl3" layout="vertical" halign="center">
                                    <af:panelLabelAndMessage id="plam1" label="Username" inlineStyle="margin:20px">
                                        <input type="text" name="j_username" autocomplete="off"/>
                                    </af:panelLabelAndMessage>
                                    <af:panelLabelAndMessage id="plam2" label="Password" inlineStyle="margin:20px">
                                        <input type="password" name="j_password" autocomplete="off"/>
                                    </af:panelLabelAndMessage>
                                    <input type="submit" name="submit" value="Submit" style="position:center;"
                                           size="60px"/>
                                </af:panelGroupLayout>
                            </form>
                        </af:panelBox>
                    </af:gridCell>
                    <af:gridCell marginStart="5px" width="33%" marginEnd="5px" id="gc6"/>
                </af:gridRow>
                <af:gridRow marginTop="5px" height="auto" marginBottom="5px" id="gr3">
                    <af:gridCell marginStart="5px" width="34%" id="gc7"/>
                    <af:gridCell marginStart="5px" width="33%" id="gc8"/>
                    <af:gridCell marginStart="5px" width="33%" marginEnd="5px" id="gc9"/>
                </af:gridRow>
            </af:panelGridLayout>
        </af:panelBox>
    </af:document>
</f:view>