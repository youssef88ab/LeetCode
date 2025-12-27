import pandas as pd

def pivot_weather(weather):
    return weather.pivot(
        index="month",
        columns="city",
        values="temperature"
    )

def pivotTable(weather: pd.DataFrame) -> pd.DataFrame:
    return pivot_weather(weather)