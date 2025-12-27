import pandas as pd

def dropMissingData(students: pd.DataFrame) -> pd.DataFrame:
    dropped = students.dropna(subset='name') 
    return dropped 