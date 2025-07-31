import pandas as pd

# Create a Dictionary that will hold our data
data = {
  "Usernames": ["admin", "Charles", "Deku"],
  "Passwords": ["password", "Charl13", "AllMight"]
}

df=pd.DataFrame(data)

# write data to csv file

df.to_csv("./sample.csv", index=False)

# Reading csv file (activity 18)
input_data = pd.read_csv("./sample.csv")

#Print the values only in the Usernames column
	
print("Usernames:")
print(input_data["Usernames"])

#Print the username and password of the second row
	
print("Print the username and password of the second row:")

print(input_data["Usernames"][1],input_data["Passwords"][1])

#Sort the Usernames column data in ascending order and print data
print("Sort the Usernames column data in ascending order and print data :")

print(input_data.sort_values(by="Usernames",ascending=True))
#Sort the Passwords column in descending order and print data

print("Sort the Passwords column in descending order and print data : ")

print(input_data.sort_values(by="Passwords",ascending=False))