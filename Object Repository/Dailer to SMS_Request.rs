<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Dailer to SMS_Request</name>
   <tag></tag>
   <elementGuidId>13d7e8f8-4439-4c79-9724-9bc5ad4a66ac</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <connectionTimeout>-1</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\&quot;@version\&quot;:\&quot;1.0\&quot;,\&quot;@encoding\&quot;:\&quot;UTF-8\&quot;,\n \&quot;events\&quot;:\n  [{\&quot;evtid\&quot;:\&quot;7986\&quot;,\n   \&quot;correlationId\&quot;:\&quot;3366134453389158481\&quot;,\n   \&quot;parameters\&quot;:\n    {\&quot;PriContactPhone1\&quot;:\&quot;447508350738\&quot;,\n     \&quot;TreatmentCode\&quot;:\&quot;${treatmentCode}\&quot;,\n     \&quot;LeadKey\&quot;:\&quot;90123456796\&quot;\n\n\t}\n  }\n]}&quot;,
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
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>key</name>
      <type>Main</type>
      <value>a561baad-5b3a-11eb-842a-06c5deadccda</value>
   </httpHeaderProperties>
   <katalonVersion>8.0.1</katalonVersion>
   <maxResponseSize>-1</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>POST</restRequestMethod>
   <restUrl>https://api.imiconnect.io/resources/v1/events/externalevent/</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceEndpoint></soapServiceEndpoint>
   <soapServiceFunction></soapServiceFunction>
   <socketTimeout>-1</socketTimeout>
   <useServiceInfoFromWsdl>true</useServiceInfoFromWsdl>
   <variables>
      <defaultValue>findTestData('Dailer to SMS_TestData').getValue(1, i)</defaultValue>
      <description></description>
      <id>5c03f95e-59c8-4398-93b9-206c8c243d94</id>
      <masked>false</masked>
      <name>treatmentCode</name>
   </variables>
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
