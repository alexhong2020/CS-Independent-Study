import google_bard

# Replace "YOUR_API_KEY" with the actual API Key obtained earlier
API_KEY = "AIzaSyCQZvtAk1ILtLk34uIwkIaYP-gjbGwFnq0"

def main():
	query = "What is the meaning of life?"
	response = google_bard.generate_text(query, api_key=API_KEY)
	print("Google Bard Response (Using google_bard Module):")
	print(response)

if __name__ == "__main__":
	main()