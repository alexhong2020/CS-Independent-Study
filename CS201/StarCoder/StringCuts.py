'''
Filtering data often requires determining which data elements satisfy a specific criterion. Write method filter which has two parameters: a String[] of data to be filtered and an int parameter indicating the minimum acceptable length for the string data.
Return a String[] array of the unique strings in list whose lengths are greater than or equal to minLength.

The string values in the returned array should be in the same order they appear in list. The strings in the returned array should be unique, so conceptually only the first of any duplicate elements in list that pass the length requirement is in the returned array. See the examples for details.
'''

def filter(list, minLength):
    return [x for x in list if len(x) >= minLength]
