rm -rf fragmentsLabSubmit
mkdir fragmentsLabSubmit
mkdir fragmentsLabSubmit/FragmentsLab
cp Skeletons/FragmentsLab/src/course/labs/fragmentslab/MainActivity.java fragmentsLabSubmit/FragmentsLab
zip -r0 fragmentsLabSubmit.zip fragmentsLabSubmit/*
rm -rf fragmentsLabSubmit