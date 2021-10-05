# springSecurityBasics


## Basic Authentication example

    Value = username:password
    Encoded Value =  base64(Value)
    Authorization Value = Basic <Encoded Value>
    //Example: Authorization: Basic VGVzdFVzZXI6dGVzdDEyMw==
    //Decode it'll give back the original username:password TestUser:test123
