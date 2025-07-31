import pytest 

@pytest.fixture
def numlist():
    return list(range(11))

@pytest.fixture
def wallet_amount():
    amount = 0
    return amount