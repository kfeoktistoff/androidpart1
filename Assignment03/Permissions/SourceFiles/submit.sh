rm -rf permissionsLabSubmit
mkdir permissionsLabSubmit
mkdir permissionsLabSubmit/Dangerous
cp Skeletons/DangerousApp/AndroidManifest.xml permissionsLabSubmit/Dangerous
mkdir permissionsLabSubmit/Permissions
cp Skeletons/PermissionsLab/src/course/labs/permissionslab/*.java permissionsLabSubmit/Permissions
cp Skeletons/PermissionsLab/AndroidManifest.xml permissionsLabSubmit/Permissions
zip -r0 permissionsLabSubmit.zip permissionsLabSubmit/*
rm -rf permissionsLabSubmit