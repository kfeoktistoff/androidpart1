rm -rf IntentsLabSubmit
mkdir IntentsLabSubmit
mkdir IntentsLabSubmit/MyBrowser
cp Skeletons/MyBrowser/AndroidManifest.xml IntentsLabSubmit/MyBrowser
mkdir IntentsLabSubmit/IntentsLab
cp Skeletons/IntentsLab/src/course/labs/intentslab/*.java IntentsLabSubmit/IntentsLab
zip -r0 IntentsLabSubmit.zip IntentsLabSubmit/*
rm -rf IntentsLabSubmit