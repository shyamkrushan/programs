a=input("Enter the string")
vowel="aeiouAEIOU"
ans=" "
for i in a:
    if(i not in vowel):
        ans=ans+i
print(ans)    
    
