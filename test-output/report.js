$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("launch.feature");
formatter.feature({
  "line": 1,
  "name": "Google search test",
  "description": "",
  "id": "google-search-test",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "User can search",
  "description": "",
  "id": "google-search-test;user-can-search",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "Browser is launched",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I enter search query",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I check title is correct",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});