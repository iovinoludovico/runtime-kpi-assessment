<?xml version="1.0" encoding="UTF-8"?>
<smartcity:SmartCityModel xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:DataAnalytics="http://cs.gssi.it/smartcity/dataanalytics" xmlns:smartcity="http://cs.gssi.it/smartcity" xmlns:stakeholder="http://cs.gssi.it/smartcity/stakeholder" xmi:id="_eMYZQJmqEeqb6_1e3fZsNw">
  <smartCities xmi:id="_eMYZQZmqEeqb6_1e3fZsNw" city="Bolzano">
    <stakeholders xsi:type="stakeholder:Stakeholder" xmi:id="_2sqPsnWQEeqwqr-NlLgWuQ" name="CityCouncil" organization="Municipality"/>
    <stakeholders xsi:type="DataAnalytics:OpenData" xmi:id="_2sqPs3WQEeqwqr-NlLgWuQ" url="https://breezometer.com/" name="BreezoMeter"/>
    <stakeholders xsi:type="DataAnalytics:OpenData" xmi:id="_2sqPtHWQEeqwqr-NlLgWuQ" url="https://www.piste-ciclabili.com/" name="PisteCiclabili.com"/>
    <stakeholders xsi:type="DataAnalytics:OpenData" xmi:id="_2sqPtXWQEeqwqr-NlLgWuQ" url="http://daten.buergernetz.bz.it/" name="Open Data Alto Adige"/>
    <stakeholders xsi:type="DataAnalytics:OpenData" xmi:id="_makWUJnkEeqb6_1e3fZsNw" url="https://play.google.com/store?hl=en" name="GooglePlayStore"/>
    <data xmi:id="_2sqPtnWQEeqwqr-NlLgWuQ" name="AirMonitoring">
      <data xsi:type="DataAnalytics:RealValue" xmi:id="_2sqPt3WQEeqwqr-NlLgWuQ" name="PM2.5" unit="ng/m3" src="_2sqPs3WQEeqwqr-NlLgWuQ" value="15.35"/>
      <data xsi:type="DataAnalytics:RealValue" xmi:id="_2sqPuHWQEeqwqr-NlLgWuQ" name="PM10" unit="ng/m3" src="_2sqPs3WQEeqwqr-NlLgWuQ" value="15.65"/>
      <data xsi:type="DataAnalytics:RealValue" xmi:id="_2sqPuXWQEeqwqr-NlLgWuQ" name="NO2" unit="ng/m3" src="_2sqPs3WQEeqwqr-NlLgWuQ" value="3.08"/>
      <data xsi:type="DataAnalytics:RealValue" xmi:id="_2sqPunWQEeqwqr-NlLgWuQ" name="O3" unit="ng/m3" src="_2sqPs3WQEeqwqr-NlLgWuQ" value="41.51"/>
      <data xsi:type="DataAnalytics:RealValue" xmi:id="_2sqPu3WQEeqwqr-NlLgWuQ" name="SO2" unit="ng/m3" src="_2sqPs3WQEeqwqr-NlLgWuQ"/>
      <data xsi:type="DataAnalytics:RealValue" xmi:id="_1k9skJqXEeqybJ0YR4BA9Q" name="CO2" unit="tonnes" src="_2sqPs3WQEeqwqr-NlLgWuQ"/>
    </data>
    <data xmi:id="_2sqPwHWQEeqwqr-NlLgWuQ" name="CityStatistics">
      <data xsi:type="DataAnalytics:RealValue" xmi:id="_2sqPwXWQEeqwqr-NlLgWuQ" name="CityExt" unit="km2" src="_2sqPsnWQEeqwqr-NlLgWuQ" value="52.3"/>
      <data xsi:type="DataAnalytics:RealValue" xmi:id="_2sqPwnWQEeqwqr-NlLgWuQ" name="CityPop" unit="inhabitants" src="_2sqPsnWQEeqwqr-NlLgWuQ" value="107436.0"/>
    </data>
    <data xmi:id="_2sqPyXWQEeqwqr-NlLgWuQ" name="BikePaths">
      <data xsi:type="DataAnalytics:RealValue" xmi:id="_2sqPynWQEeqwqr-NlLgWuQ" name="BykePathLength" unit="km" src="_2sqPtHWQEeqwqr-NlLgWuQ" value="330.0"/>
    </data>
    <data xmi:id="_2sqPy3WQEeqwqr-NlLgWuQ" name="Green Areas">
      <data xsi:type="DataAnalytics:RealValue" xmi:id="_2sqPzHWQEeqwqr-NlLgWuQ" name="TotalGreenArea" unit="hectares" src="_2sqPtXWQEeqwqr-NlLgWuQ" value="189.3689"/>
    </data>
    <data xmi:id="_ySmUQJnkEeqb6_1e3fZsNw" name="MobileApplications">
      <data xsi:type="DataAnalytics:IntegerValue" xmi:id="_0IoBwJnkEeqb6_1e3fZsNw" name="MobileApplicationsPS" unit="units" src="_makWUJnkEeqb6_1e3fZsNw" value="34"/>
    </data>
    <data xmi:id="_I2FPYJqBEeqybJ0YR4BA9Q" name="TransportMonitoring">
      <data xsi:type="DataAnalytics:BoolValue" xmi:id="_Le5rwJqBEeqybJ0YR4BA9Q" name="RealtimeTransportMonitoring" unit="yes/no" src="_2sqPtXWQEeqwqr-NlLgWuQ" value="true"/>
    </data>
  </smartCities>
</smartcity:SmartCityModel>
