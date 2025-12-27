import pandas as pd

def getDataframeSize(players: pd.DataFrame) -> List[int]:
    rows, columns = players.shape
    size = list()
    size.append(rows)
    size.append(columns)
    return size
    