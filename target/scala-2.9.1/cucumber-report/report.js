$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri('Todolist.feature');
formatter.feature({
  "id": "todolist",
  "description": "In order to manage my tasks easily.\nAs a result, I don\u0027t forget any task and get higher salary.",
  "name": "Todolist",
  "keyword": "Feature",
  "line": 1
});
formatter.scenario({
  "id": "todolist;puts-a-task-and-delete-a-task",
  "description": "",
  "name": "Puts a task and delete a task",
  "keyword": "Scenario",
  "line": 5,
  "type": "scenario"
});
formatter.step({
  "name": "Set a database",
  "keyword": "Given ",
  "line": 6
});
formatter.step({
  "name": "I go to the home page",
  "keyword": "When ",
  "line": 7
});
formatter.step({
  "name": "I should see \"0 task\"",
  "keyword": "Then ",
  "line": 8
});
formatter.step({
  "name": "I fill in \"label\" with \"Sleep after lunch\"",
  "keyword": "When ",
  "line": 9
});
formatter.step({
  "name": "I push \"create\"",
  "keyword": "And ",
  "line": 10
});
formatter.step({
  "name": "I should see \"1 task\"",
  "keyword": "Then ",
  "line": 11
});
formatter.step({
  "name": "I am in the home page",
  "keyword": "And ",
  "line": 12
});
formatter.step({
  "name": "I should see \"Sleep after lunch\"",
  "keyword": "And ",
  "line": 13
});
formatter.step({
  "name": "I push \"delete\"",
  "keyword": "When ",
  "line": 14
});
formatter.step({
  "name": "I should see \"0 task\"",
  "keyword": "Then ",
  "line": 15
});
formatter.step({
  "name": "I should not see \"Sleep after lunch\"",
  "keyword": "And ",
  "line": 16
});
formatter.match({
  "location": "todolist_step.scala:32"
});
formatter.result({
  "duration": 1543802000,
  "status": "passed"
});
formatter.match({
  "location": "todolist_step.scala:36"
});
formatter.result({
  "duration": 124224000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "0 task",
      "offset": 14
    }
  ],
  "location": "todolist_step.scala:42"
});
formatter.result({
  "duration": 12653000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "label",
      "offset": 11
    },
    {
      "val": "Sleep after lunch",
      "offset": 24
    }
  ],
  "location": "todolist_step.scala:45"
});
formatter.result({
  "duration": 16273000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "create",
      "offset": 8
    }
  ],
  "location": "todolist_step.scala:48"
});
formatter.result({
  "duration": 158731000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1 task",
      "offset": 14
    }
  ],
  "location": "todolist_step.scala:42"
});
formatter.result({
  "duration": 2454000,
  "status": "passed"
});
formatter.match({
  "location": "todolist_step.scala:39"
});
formatter.result({
  "duration": 166000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Sleep after lunch",
      "offset": 14
    }
  ],
  "location": "todolist_step.scala:42"
});
formatter.result({
  "duration": 1411000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "delete",
      "offset": 8
    }
  ],
  "location": "todolist_step.scala:48"
});
formatter.result({
  "duration": 108712000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "0 task",
      "offset": 14
    }
  ],
  "location": "todolist_step.scala:42"
});
formatter.result({
  "duration": 2114000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Sleep after lunch",
      "offset": 18
    }
  ],
  "location": "todolist_step.scala:51"
});
formatter.result({
  "duration": 1648000,
  "status": "passed"
});
});