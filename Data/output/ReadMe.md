
## ReadME
This folder contains train and test datasets created to run the experiments:

### Train sets:
**all_movie_lens_and_dogo_train_only.csv:** This is a train set that contains all the movieLens data, as well as the remaining 60% of the dogo data. First column is the userID, second column is the itemID, and last column is the rating the user assigned for that item. Number of instances are 1,020,655. Unique number of users are: 14,532, and unique number of items are: 5,327.

**all_movie_lens_plus_dogo_users_2_above_ratings.csv**: Contains all movie lens data and the dogo users that rated at least 2 movies. Number of instances: 1,017,249, Unique number of users: 11,126 , Unique number of items: 5,255.

**all_movie_lens_plus_dogo_users_10_above_ratings.csv**: Contains all movie lens data and the dogo users that rated at least 10 movies. Number of instances: 1,007,014, Unique number of users: 6,656, Unique number of items: 4,854.

**all_movie_lens_plus_dogo_users_20_above_ratings.csv**: Contains all movie lens data and the dogo users that rated at least 20 movies. Number of instances: 1,003,463, Unique number of users: 6,196, Unique number of items: 4,572.

**movie_lens_rated_2_kids_plus_dogo_users_2_above_ratings.csv**: Contains all movie lens users that rated at least 2 children movies, along with ratings for adult movies provides by these users as well, and the dogo users that rated at least 2 movies. Number of instances: 1,014,191, Unique number of users: 11,028, Unique number of items: 5,251.

**movie_lens_rated_2_kids_plus_dogo_users_10_above_ratings.csv**: Contains all movie lens users that rated at least 2 children movies, along with ratings for adult movies provides by these users as well, and the dogo users that rated at least 10 movies. Number of instances: 1,003,956, Unique number of users: 6,558, Unique number of items: 4,850.

**movie_lens_rated_2_kids_plus_dogo_users_20_above_ratings.csv**: Contains all movie lens users that rated at least 2 children movies, along with ratings for adult movies provides by these users as well, and the dogo users that rated at least 20 movies. Number of instances: 1,000,405, Unique number of users: 6,098, Unique number of items: 4,568.

### Test sets:

**dogo_test_set.csv:** This is the test set containing 40% out of the dogo movie data. First column is the userID, second column is the itemID, and last column is the rating the user assigned for that item. Number of instances are 10,057. Unique number of users are: 3,946, and unique number of items are: 1,182.

**dogo_test_set_2_above_ratings.csv**: This is the test set containing 40% out of the dogo movie data, where the users provided at least 2 ratings. First column is the userID, second column is the itemID, and last column is the rating the user assigned for that item. Number of instances are 10,057, Unique number of users are: 3,946, and unique number of items are: 1,182.

**dogo_test_set_10_above_ratings.csv**: This is the test set containing 40% out of the dogo movie data, where the users provided at least 10 ratings. First column is the userID, second column is the itemID, and last column is the rating the user assigned for that item. Number of instances are 4,302, Unique number of users are: 613, and unique number of items are: 925.

**dogo_test_set_20_above_ratings.csv**: This is the test set containing 40% out of the dogo movie data, where the users provided at least 20 ratings. First column is the userID, second column is the itemID, and last column is the rating the user assigned for that item. Number of instances are 2,032, Unique number of users are: 156, and unique number of items are: 683.