Details:
I.   Project: numberword
II.  Type: Standard maven
III. Package: com.exercise
IV.  Classes:
	 A. Main:
		1. NumberWords: Interface. The method is "String getWords(int number)"
		2. NumberWordsImpl: 
			a. Implements NumberWords
			b. Has a constructor taking dependencies NumberHelper and WordStore
			c. Has a method which is called recursively
		3. NumberHelper: This has helper functions related to computations
		4. WordStore: This contains words used in the logic
		5. NumberWordsFactory: Factory. Also has main method to run the code in command prompt.
		Please note: Code has additional comments. These are there for explaining the logic.
	 B. JUnit Test:
		NumberWordsTest
V. Code coverage:
	CodeCoverage.jpg: This is image of code coverage report produced by EclEmma plug-in for Eclipse 
VI. Command prompt execution:
	 CommandPrompt.jpg: This is image of command prompt execution 