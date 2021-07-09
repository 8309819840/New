<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>ATC request</name>
   <tag></tag>
   <elementGuidId>11edc770-3682-498b-942e-88e3cbbe859d</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <connectionTimeout>-1</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n    \&quot;notifyurl\&quot;: \&quot;\&quot;,\n  \&quot;events\&quot;: [\n    {\n      \&quot;evtid\&quot;: \&quot;8494\&quot;,\n      \&quot;correlationid\&quot;: \&quot;ABC123\&quot;,\n      \&quot;parameters\&quot;: {\n        \&quot;RequestId\&quot;: \&quot;101\&quot;,\n        \&quot;Country\&quot;: \&quot;ZA\&quot;,\n        \&quot;Segment\&quot;: \&quot;${segment}\&quot;,\n        \&quot;Category\&quot;: \&quot;Servicing\&quot;,\n        \&quot;Definition\&quot;: \&quot;Annual Tax Certificate notification\&quot;,\n        \&quot;EngagementType\&quot;: \&quot;Operational\&quot;,\n        \&quot;CustomerId\&quot;: \&quot;12345\&quot;,\n        \&quot;UserId\&quot;: \&quot;${userId}\&quot;,\n        \&quot;EmailAddress\&quot;: \&quot;${emailAddress}\&quot;,\n        \&quot;CellNumber\&quot;: \&quot;${cellNumber}\&quot;,\n        \&quot;Language\&quot;: \&quot;${language}\&quot;,\n        \&quot;ChannelPreference\&quot;: \&quot;sms\&quot;,\n        \&quot;Title\&quot;: \&quot;Mr\&quot;,\n        \&quot;FirstName\&quot;: \&quot;${firstName}\&quot;,\n        \&quot;LastName\&quot;: \&quot;Yerraguntla\&quot;,\n        \&quot;DocumentName\&quot;: \&quot;TestDocument\&quot;,\n        \&quot;Date\&quot;: \&quot;2021-05-10 10:00:00\&quot;\n      }\n    }\n  ]\n}&quot;,
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
      <name>Key</name>
      <type>Main</type>
      <value>8da2f5a5-4923-11eb-842a-06c5deadccda</value>
   </httpHeaderProperties>
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
      <defaultValue>findTestData('ATC_TestData').getValue(1, i)</defaultValue>
      <description></description>
      <id>2a0660b3-0c1d-4065-b70c-6d0f43126895</id>
      <masked>false</masked>
      <name>segment</name>
   </variables>
   <variables>
      <defaultValue>findTestData('ATC_TestData').getValue(2, i)</defaultValue>
      <description></description>
      <id>c7f5aa0e-73bf-4a11-93da-48ae076f0da3</id>
      <masked>false</masked>
      <name>language</name>
   </variables>
   <variables>
      <defaultValue>findTestData('ATC_TestData').getValue(3, i)</defaultValue>
      <description></description>
      <id>b821ea78-6b33-43ef-913c-7452d0b230cf</id>
      <masked>false</masked>
      <name>userId</name>
   </variables>
   <variables>
      <defaultValue>findTestData('ATC_TestData').getValue(4, i)</defaultValue>
      <description></description>
      <id>1fabe7e4-b785-4cb4-b790-c5155f8c551c</id>
      <masked>false</masked>
      <name>emailAddress</name>
   </variables>
   <variables>
      <defaultValue>findTestData('ATC_TestData').getValue(5, i)</defaultValue>
      <description></description>
      <id>65f51561-bc90-42af-95da-76e7166d38dd</id>
      <masked>false</masked>
      <name>cellNumber</name>
   </variables>
   <variables>
      <defaultValue>findTestData('ATC_TestData').getValue(6, i)</defaultValue>
      <description></description>
      <id>58a40969-9839-4ee7-b0f7-8a3449371618</id>
      <masked>false</masked>
      <name>firstName</name>
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
