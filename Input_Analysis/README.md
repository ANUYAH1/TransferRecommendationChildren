Steps: 

- Import LibRec to a preferred IDE. Link to the process can be found [here](https://mp.weixin.qq.com/s/OyYn5_4GYAbF0L0SFgsHVQ). 
- Replace named files with data files in: Data/output/file_x. <b>Note:</b> The .properties file include the files below:
data.input.path=filmtrust/rating
data.testset.path=filmtrust/rating/dogo_test_set.txt

The data.input.path is the directory that contains both the training data and testset, while the data.testset.path is a path to the test set.

The Test Case classes are meant to replace the default ones, they will iterate through neighborhood size and print out their corresponding results. In IntelliJ one has to right click on the appropriate method and select run "methodNameHere()".
