from openai import OpenAI

client = OpenAI(api_key="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")



messages = [ {"role": "system", 
              "content": "You are a CS professor."} ] 

while True: 
    message = input("User : ") 
    if message: 
        messages.append("Provide a hint in the form of the next Python line that should be typed out to solve the question.")
        messages.append( 
            {"role": "user", "content": message}, 
        ) 
        chat = client.chat.completions.create(model="gpt-3.5-turbo", messages=messages) 
    reply = chat.choices[0].message.content 
    print(f"ChatGPT: {reply}") 
    messages.append({"role": "assistant", "content": reply}) 