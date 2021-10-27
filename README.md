# Log-Analyser
1. Clone the git repo

```shell
git clone https://github.com/shilpabanchhor/log-analyser.git
```

2. Open the project in an IDE of your choice.
3. Run the main application - `com.github.shilpabanchhor.loganalyser.LogAnalyser`.
    1. Create/Update the Run Configuration for the class to provide the program argument.<br />
       ![Edit Run Config window on Intellij](https://github.com/shilpabanchhor/log-analyser/blob/master/assets/run-config-loganalyser.png)

       <br />
       A sample log file is available in `resources/samples/logfile.txt`
    2. You can generate a sample log file using the
       utility `com.github.shilpabanchhor.loganalyser.utilities.LogFileGenerator`. You can specify the number of events to
       be generated for the sample file.


	@@ -61,4 +61,4 @@ The longest event is `scsmbstgrc` (`1491377495218 - 1491377495210 = 8ms`).
    * Event id
    * Event duration
    * Type and Host if applicable
    * Alert (true if the event took longer than 4ms, otherwise false)
