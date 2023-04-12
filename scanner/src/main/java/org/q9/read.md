    It prompts the user to enter an email address using Scanner. 
    It calls the validateEmail method with the input as a parameter. 
     The validateEmail method checks if the input matches the regular expression ^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$, which is a commonly used regular expression for validating email addresses.
    If the input matches the regular expression, matcher.matches() will return true, indicating that the email address is valid. 
    The validateEmail method returns true or false depending on whether the email address is valid or not.
        The program prints whether the email address is valid or not.
     ^ : Start of the line anchor
       [a-zA-Z0-9._%+-]+ : One or more of any characters in the character set, which includes letters (both uppercase and lowercase), digits, dots, underscores, percent signs, plus signs, and hyphens. This represents the local part of the email address (the part before the "@" symbol).
     @ : The "@" symbol, which separates the local part from the domain part of the email address.
       [a-zA-Z0-9.-]+ : One or more of any characters in the character set, which includes letters (both uppercase and lowercase), digits, dots, hyphens. This represents the domain name of the email address.
     \\. : A backslash followed by a dot (".") character, which matches the dot character that separates the domain name from the top-level domain name (TLD) in the email address.
        [a-zA-Z]{2,} : Two or more of any characters in the character set, which includes letters (both uppercase and lowercase). This represents the TLD in the email address.
        $ : End of the line anchor
        So, the regular expression ^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$ checks if a string starts with one or more characters from the local part set, followed by an "@" symbol, followed by one or more characters from the domain part set, followed by a dot and two or more characters from the TLD set.
        For example, the regular expression would match valid email addresses like john.doe@example.com, jane+doe@example.co.uk, john_doe@example.net, etc.
        However, it would not match invalid email addresses like john.doe@, @example.com, john.wick@example, etc.
        Note that while this regular expression is a commonly used one for email validation, it may not catch all edge cases and may not be perfect for every use case.
