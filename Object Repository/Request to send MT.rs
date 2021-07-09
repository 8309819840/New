<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Request to send MT</name>
   <tag></tag>
   <elementGuidId>4e674514-0f68-4600-832e-996e04ddbef8</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <connectionTimeout>-1</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n\n  \&quot;Phonenumber\&quot;: \&quot;447508350738\&quot;,\n\n  \&quot;BusinessUnit\&quot;: \&quot;Energy\&quot;,\n\n  \&quot;ChatTeam\&quot;: \&quot;BGS_GENERAL_ENQUIRIES\&quot;,\n\n  \&quot;SMSContent\&quot;: \&quot;BGS_GENERAL_ENQUIRIES-Welcome message\&quot;,\n\n  \&quot;Skill\&quot;: \&quot;BGS_GENERAL_ENQUIRIES\&quot;,\n\n  \&quot;Identified\&quot;: \&quot;TRUE|FALSE\&quot;,\n\n  \&quot;DoBMatched\&quot;: \&quot;TRUE|FALSE\&quot;,\n\n  \&quot;Name\&quot;:\&quot;Mr T Murray\&quot;,\n\n  \&quot;BP\&quot;:\&quot;30019392942\&quot;,\n\n  \&quot;GCRN\&quot;:\&quot;850010001002\&quot;,\n\n  \&quot;ECRN\&quot;:\&quot;850010001001\&quot;,\n\n  \&quot;Homecare\&quot;:\&quot;91000304955\&quot;\n\n}&quot;,
  &quot;contentType&quot;: &quot;application/json&quot;,
  &quot;charset&quot;: &quot;UTF-8&quot;
}</httpBodyContent>
   <httpBodyType>text</httpBodyType>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content-Type</name>
      <type>Main</type>
      <value>application/json</value>
   </httpHeaderProperties>
   <maxResponseSize>-1</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>POST</restRequestMethod>
   <restUrl>https://hooks.imiconnect.io/events/AELJP6A9GGKH</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceEndpoint></soapServiceEndpoint>
   <soapServiceFunction></soapServiceFunction>
   <socketTimeout>-1</socketTimeout>
   <useServiceInfoFromWsdl>true</useServiceInfoFromWsdl>
   <verificationScript>import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager

import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable

RequestObject request = WSResponseManager.getInstance().getCurrentRequest()

ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
