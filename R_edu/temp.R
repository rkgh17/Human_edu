write('PATH="${RTOOLS40_HOME}\\usr\\bin;${PATH}"', file = "~/.Renviron", append = TRUE)
Sys.which("make")

install.packages("jsonlite", type = "source")

install.packages('tidymodels')

library(tidybodels)