/**
An ISBN (International Standard Book Number) is a ten digit code which uniquely identiﬁes a book.
The ﬁrst nine digits represent the Group, Publisher and Title of the book and the last digit is used to check whether ISBN 
is correct or not.
Each of the ﬁrst nine digits of the code can take a value between 0 and 9. Sometimes it is necessary to make the last digit
equal to ten; this is done by writing the last digit of the code as X.
To verify an ISBN, calculate 10 times the ﬁrst digit, plus 9 times the second digit, plus 8 times the third and so on until
we add 1 time the last digit. If the ﬁnal number leaves no remainder when divided by 11, the code is a valid ISBN.
*/



