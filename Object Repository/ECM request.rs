<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>ECM request</name>
   <tag></tag>
   <elementGuidId>155fe695-e241-447f-bb9b-e5d2e7f4d2d3</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <connectionTimeout>-1</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n    \&quot;notifyurl\&quot;: \&quot;\u003cNotification URL\u003e\&quot;,\n    \&quot;events\&quot;: [\n        {\n            \&quot;evtid\&quot;: \&quot;8304\&quot;,\n            \&quot;correlationid\&quot;: \&quot;\u003cUnique transaction ID from the client end\u003e\&quot;,\n            \&quot;parameters\&quot;: {\n                \&quot;EntityID\&quot;: \&quot;EntityID\&quot;,\n                \&quot;PreferredTitle\&quot;: \&quot;Mr\&quot;,\n                \&quot;Initials\&quot;: \&quot;AY\&quot;,\n                \&quot;FirstName\&quot;: \&quot;Aravind\&quot;,\n                \&quot;LastName\&quot;: \&quot;Yerraguntla\&quot;,\n                \&quot;NumberBody\&quot;: \&quot;447508350738\&quot;,\n                \&quot;GCS_ID\&quot;: \&quot;GCS_ID\&quot;,\n                \&quot;DIGITAL_ID\&quot;: \&quot;DIGITAL_ID\&quot;,\n                \&quot;Language\&quot;: \&quot;${language}\&quot;,\n                \&quot;Description\&quot;: \&quot;${description}\&quot;,\n                \&quot;DateOfBirth\&quot;: \&quot;07-Jun-1997\&quot;\n            }\n        }\n    ]\n}&quot;,
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
      <defaultValue>findTestData('ECM_TestData').getValue(1, i)</defaultValue>
      <description></description>
      <id>95819fdc-55a7-443f-b531-6304229bcd2f</id>
      <masked>false</masked>
      <name>description</name>
   </variables>
   <variables>
      <defaultValue>findTestData('ECM_TestData').getValue(2, i)</defaultValue>
      <description></description>
      <id>bda78826-2b60-4351-a057-5704ec55a34b</id>
      <masked>false</masked>
      <name>language</name>
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
