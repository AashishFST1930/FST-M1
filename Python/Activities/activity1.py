# Take username and age as input
name =input("Enter your name : ")
age = int(input("Enter your age :"))


# calculate the age when user as 100 year

year_age_100 = 2025+(100-age)

# print the result
print (name+ "will be 100 year old"+str(year_age_100))
print (name+ "will be 100 year old {}".format(year_age_100))