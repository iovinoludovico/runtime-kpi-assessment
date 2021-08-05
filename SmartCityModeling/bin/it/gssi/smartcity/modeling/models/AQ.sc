<?xml version="1.0" encoding="UTF-8"?>
<smartcity:SmartCityModel xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:DataAnalytics="http://cs.gssi.it/smartcity/dataanalytics" xmlns:smartcity="http://cs.gssi.it/smartcity" xmlns:stakeholder="http://cs.gssi.it/smartcity/stakeholder" xmi:id="_lAZUYHWzEeqwqr-NlLgWuQ">
  <smartCities xmi:id="_lAZUYXWzEeqwqr-NlLgWuQ" city="L'Aquila">
    <stakeholders xsi:type="stakeholder:Stakeholder" xmi:id="_lAZUY3WzEeqwqr-NlLgWuQ" name="CityCouncil" organization="Municipality"/>
    <stakeholders xsi:type="DataAnalytics:OpenData" xmi:id="_lAZUZHWzEeqwqr-NlLgWuQ" url="https://breezometer.com/" name="BreezoMeter"/>
    <stakeholders xsi:type="DataAnalytics:OpenData" xmi:id="_lAZUZXWzEeqwqr-NlLgWuQ" url="https://www.piste-ciclabili.com/" name="PisteCiclabili.com"/>
    <stakeholders xsi:type="DataAnalytics:OpenData" xmi:id="_lAZUZnWzEeqwqr-NlLgWuQ" url="http://asc.istat.it/asc_BL/" name="Atlante Statistico dei Comuni"/>
    <stakeholders xsi:type="stakeholder:Stakeholder" xmi:id="_xPYrIJnhEeqb6_1e3fZsNw" name="GSSI" organization="Gran Sasso Science Institute"/>
    <stakeholders xsi:type="DataAnalytics:OpenData" xmi:id="_3DnTkJnhEeqb6_1e3fZsNw" url="https://play.google.com/store?hl=en" name="GooglePlayStore"/>
    <data xmi:id="_lAZUZ3WzEeqwqr-NlLgWuQ" name="AirMonitoring">
      <data xsi:type="DataAnalytics:RealValue" xmi:id="_lAZUaHWzEeqwqr-NlLgWuQ" name="PM2.5" unit="ng/m3" src="_lAZUZHWzEeqwqr-NlLgWuQ" value="11.19"/>
      <data xsi:type="DataAnalytics:RealValue" xmi:id="_lAZUaXWzEeqwqr-NlLgWuQ" name="PM10" unit="ng/m3" src="_lAZUZHWzEeqwqr-NlLgWuQ" value="11.38"/>
      <data xsi:type="DataAnalytics:RealValue" xmi:id="_lAZUanWzEeqwqr-NlLgWuQ" name="NO2" unit="ng/m3" src="_lAZUZHWzEeqwqr-NlLgWuQ" value="5.57"/>
      <data xsi:type="DataAnalytics:RealValue" xmi:id="_lAZUa3WzEeqwqr-NlLgWuQ" name="O3" unit="ng/m3" src="_lAZUZHWzEeqwqr-NlLgWuQ" value="18.28"/>
      <data xsi:type="DataAnalytics:RealValue" xmi:id="_lAZUbHWzEeqwqr-NlLgWuQ" name="SO2" unit="ng/m3" src="_lAZUZHWzEeqwqr-NlLgWuQ" value="0.17"/>
      <data xsi:type="DataAnalytics:RealValue" xmi:id="_pPfT4JaVEeq0XaWaWNepEA" name="CO2" unit="tonnes" src="_lAZUZHWzEeqwqr-NlLgWuQ"/>
    </data>
    <data xmi:id="_lAZUcXWzEeqwqr-NlLgWuQ" name="CityStatistics">
      <data xsi:type="DataAnalytics:RealValue" xmi:id="_lAZUcnWzEeqwqr-NlLgWuQ" name="CityExt" unit="km2" src="_lAZUY3WzEeqwqr-NlLgWuQ" value="480.0"/>
      <data xsi:type="DataAnalytics:RealValue" xmi:id="_lAZUc3WzEeqwqr-NlLgWuQ" name="CityPop" unit="inhabitants" src="_lAZUY3WzEeqwqr-NlLgWuQ" value="69605.0"/>
    </data>
    <data xmi:id="_lAZUenWzEeqwqr-NlLgWuQ" name="BikePaths">
      <data xsi:type="DataAnalytics:RealValue" xmi:id="_lAZUe3WzEeqwqr-NlLgWuQ" name="BykePathLength" unit="km" src="_lAZUZXWzEeqwqr-NlLgWuQ" value="86.0"/>
    </data>
    <data xmi:id="_lAZUfHWzEeqwqr-NlLgWuQ" name="Green Areas">
      <data xsi:type="DataAnalytics:RealValue" xmi:id="_lAZUfXWzEeqwqr-NlLgWuQ" name="TotalGreenArea" unit="hectares" src="_lAZUZnWzEeqwqr-NlLgWuQ" value="48.7235"/>
    </data>
    <data xmi:id="_Rtgt4JnjEeqb6_1e3fZsNw" name="TransportMonitoring">
      <data xsi:type="DataAnalytics:BoolValue" xmi:id="_VDX2cJnjEeqb6_1e3fZsNw" name="RealtimeTransportMonitoring" unit="yes/no" src="_xPYrIJnhEeqb6_1e3fZsNw" value="true"/>
    </data>
    <data xmi:id="_8EwAQJnjEeqb6_1e3fZsNw" name="MobileApplications">
      <data xsi:type="DataAnalytics:IntegerValue" xmi:id="___XbsJnjEeqb6_1e3fZsNw" name="MobileApplicationsPS" unit="units" src="_3DnTkJnhEeqb6_1e3fZsNw" value="13"/>
    </data>
  </smartCities>
</smartcity:SmartCityModel>
