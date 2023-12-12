def filter(data, minLength):
    result = []
    seen = set()
    for string in data:
        if len(string) >= minLength and string not in seen:
            result.append(string)
            seen.add(string)
    return result