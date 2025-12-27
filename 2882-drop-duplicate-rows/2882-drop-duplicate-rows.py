import pandas as pd

def dropDuplicateEmails(customers: pd.DataFrame) -> pd.DataFrame:
    uniqueCustomers = customers.drop_duplicates(subset=['email'])
    return uniqueCustomers
    