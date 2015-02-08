rm -rf UserInterface
mkdir UserInterface
cp SourceFiles/Skeletons/UILabs/src/course/labs/todomanager/AddToDoActivity.java UserInterface
cp SourceFiles/Skeletons/UILabs/src/course/labs/todomanager/ToDoListAdapter.java UserInterface
cp SourceFiles/Skeletons/UILabs/src/course/labs/todomanager/ToDoManagerActivity.java UserInterface
zip -r0 UserInterface.zip UserInterface/*
rm -rf UserInterface