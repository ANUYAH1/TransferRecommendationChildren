
First the LibRec library needs to be imported to an IDE, the example used Eclipse but I used IntelliJ. The link to the process is https://mp.weixin.qq.com/s/OyYn5_4GYAbF0L0SFgsHVQ and is written in Chinese, but it is easy to follow the steps using the pictures. 

After the library is imported into the IDE, replace the named files with ones included in this repository. To be noted, the .properties file include the file commented out lines

#data.input.path=filmtrust/rating
#data.testset.path=filmtrust/rating/dogo_test_set.txt

The data.input.path is the directory that contains both the training data and testset, while the data.testset.path is a path to the test set.

The Test Case classes are meant to replace the default ones, they will iterate through neighborhood size and print out their corresponding results. In IntelliJ one has to right click on the appropriate method and select run "methodNameHere()".
