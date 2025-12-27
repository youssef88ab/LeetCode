import pandas as pd

def findHeavyAnimals(animals: pd.DataFrame) -> pd.DataFrame:
    greater = animals[animals['weight'] > 100] 
    greater_sorted = greater.sort_values(by='weight', ascending=False)
    return greater_sorted[['name']]