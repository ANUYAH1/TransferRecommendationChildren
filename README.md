This archive contains the scripts to replicate the experiment for our paper ["Can we leverage rating patterns from traditional users to enhance recommendations for children?" published in ACM RecSys by - Ion Madrazo Azpiazu, Michael Green, Oghenemaro Anuyah, and Maria Soledad Pera.](https://scholarworks.boisestate.edu/cs_scripts/6/)

### Requirements
- Java
- An R, Jupyter, Python, and Tidyverse installation.
- The [MovieLens 1M](https://grouplens.org/datasets/movielens/) data set, extracted into data/input (should have directory data/ml-1m)
- The Dogo dataset (or any data set containing ratings provided by children) extracted into data/input

### Instructions
- Steps to run:
  - Install required software and data files enlisted in <b>requirements</b>. These directories and files should be present upon doing so:
    -data/input/ml-1m (e.g. data/ml-1m/ratings.dat)
    -data/input/Dogo (e.g., any children ratings file)
    
- Run Jupyter notebook:
  - Build_datasets_for_experiments/Datasets_creation_notebook.ipynb
  
- Run LibReC Experiment:
  - Evaluation/
  
- Visualize user-rating activity:
  - Rating_Distribution_Dogo_ML1M.ipynb
