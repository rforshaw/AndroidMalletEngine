echo "Moving MalletEngine to Android Mallet Engine"
cp /home/ross/Development/Games/MalletEngine/MalletEngine/build/jar/MalletEngine.jar /home/ross/Development/Games/MalletEngine/AndroidMalletEngine/libs/

echo "Compiling Android Mallet Engine"
ant clean
ant debug