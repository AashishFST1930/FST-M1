import pytest

def test_sum(numlist):

    sum = 0

    for num in numlist:
        sum=sum +num
        #Assertion
    assert sum == 55
     
    
    
    