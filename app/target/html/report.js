$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("app/functional/imcForm.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "# language: en"
    }
  ],
  "line": 2,
  "name": "IMC Calculator form",
  "description": "",
  "id": "imc-calculator-form",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 5,
  "name": "In order to retrieve the user\u0027s IMC,",
  "description": "I want to fill the form and get my IMC with its description",
  "id": "imc-calculator-form;in-order-to-retrieve-the-user\u0027s-imc,",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@wip"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "A running platform",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "The user opens \u003chttps://www.calculersonimc.fr\u003e",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "The home page is displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "The user clicks on \"Calcul de l\u0027IMC\"",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "The IMC form is displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "The user selects \u003cFemme\u003e gender",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "The user fill the height box with \u003c170\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "The user fill the weight box with \u003c65\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "The user fill the age box with \u003c20\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "The user submits the form",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "The IMC result box is displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "The calculated IMC is \u003c22.49\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "The calculated IMC label is \u003cCorpulence Normale\u003e",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 24,
      "value": "# Post requisites"
    }
  ],
  "line": 25,
  "name": "The user closes his Web browser",
  "keyword": "And "
});
formatter.match({
  "location": "ImcFormTest.testRunningPlatform()"
});
formatter.result({
  "duration": 6728135846,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.calculersonimc.fr",
      "offset": 16
    }
  ],
  "location": "ImcFormTest.openHomePage(String)"
});
formatter.result({
  "duration": 9171983810,
  "status": "passed"
});
formatter.match({
  "location": "ImcFormTest.checkHomePageDisplayed()"
});
formatter.result({
  "duration": 787047095,
  "status": "passed"
});
formatter.match({
  "location": "ImcFormTest.clickCalculImc()"
});
formatter.result({
  "duration": 8396934930,
  "status": "passed"
});
formatter.match({
  "location": "ImcFormTest.checkImcFormDisplayed()"
});
formatter.result({
  "duration": 104832130,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Femme",
      "offset": 18
    }
  ],
  "location": "ImcFormTest.fillGender(String)"
});
formatter.result({
  "duration": 871127,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "170",
      "offset": 35
    }
  ],
  "location": "ImcFormTest.fillHeight(int)"
});
formatter.result({
  "duration": 3525566,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "65",
      "offset": 35
    }
  ],
  "location": "ImcFormTest.fillWeight(int)"
});
formatter.result({
  "duration": 884813,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "20",
      "offset": 32
    }
  ],
  "location": "ImcFormTest.fillAge(int)"
});
formatter.result({
  "duration": 614536,
  "status": "passed"
});
formatter.match({
  "location": "ImcFormTest.submit()"
});
formatter.result({
  "duration": 400283,
  "status": "passed"
});
formatter.match({
  "location": "ImcFormTest.checkResult()"
});
formatter.result({
  "duration": 8287474,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "22.49",
      "offset": 23
    }
  ],
  "location": "ImcFormTest.checkImc(float)"
});
formatter.result({
  "duration": 37390928,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Corpulence Normale",
      "offset": 29
    }
  ],
  "location": "ImcFormTest.checkLabel(String)"
});
formatter.result({
  "duration": 710759,
  "status": "passed"
});
formatter.match({
  "location": "ImcFormTest.closeBrowser()"
});
formatter.result({
  "duration": 1452194883,
  "status": "passed"
});
});