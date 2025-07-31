import pytest   

@pytest.mark.activity
def test_add():
    num1 = 20
    num2 = 3
    assert num1 + num2 == 23

@pytest.mark.activity
def test_substract():
    num1 = 30
    num2 = 10
    assert num1 - num2 == 20

@pytest.mark.activity
def test_multiply():
    num1 = 20
    num2 = 10
    assert num2 * num1 == 200

@pytest.mark.activity
def test_devide():
    num1 = 20
    num2 = 5
    assert num1 / num2 == 4