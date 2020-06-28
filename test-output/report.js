$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Job_Title.feature");
formatter.feature({
  "name": "OrangeHRM Job title feature",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Verify Delete functionality for required multiple Job Titles",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on Job Title Page for delete multiple Job Title test",
  "keyword": "Given "
});
formatter.match({
  "location": "com.OrangeHRM.stepDefinitions.Job_Titles_withData_in_All_Fields.user_is_on_Job_Title_Page_for_delete_multiple_Job_Title_test()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on checkboxes corresponding to Job Titles to be deleted",
  "keyword": "Then "
});
formatter.match({
  "location": "com.OrangeHRM.stepDefinitions.Job_Titles_withData_in_All_Fields.click_on_checkboxes_corresponding_to_Job_Titles_to_be_deleted()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//a[contains(text(),\u0027Quality\u0027)]//parent::td//preceding-sibling::td//input\"}\n  (Session info: chrome\u003d83.0.4103.116)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-1VCP591\u0027, ip: \u0027192.168.56.1\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_161\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 83.0.4103.116, chrome: {chromedriverVersion: 83.0.4103.39 (ccbf011cb2d2b..., userDataDir: C:\\Users\\gunas\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:50440}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: f921763302d94f43ab5c21d1fa43c74b\n*** Element info: {Using\u003dxpath, value\u003d//a[contains(text(),\u0027Quality\u0027)]//parent::td//preceding-sibling::td//input}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat com.OrangeHRM.pages.JobTitlePage.multipleDelete(JobTitlePage.java:84)\r\n\tat com.OrangeHRM.stepDefinitions.Job_Titles_withData_in_All_Fields.click_on_checkboxes_corresponding_to_Job_Titles_to_be_deleted(Job_Titles_withData_in_All_Fields.java:189)\r\n\tat ✽.Click on checkboxes corresponding to Job Titles to be deleted(file:///C:/Sarala-testing/OrangeHRM_BDD/src/test/resources/features/Job_Title.feature:38)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "Click on Delete button and Click on OK button in Confirmation popup",
  "keyword": "Then "
});
formatter.match({
  "location": "com.OrangeHRM.stepDefinitions.Job_Titles_withData_in_All_Fields.click_on_Delete_button_and_Click_on_OK_button_in_Confirmation_popup()"
});
formatter.result({
  "status": "skipped"
});
});