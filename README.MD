<center>Chatbot Application : </center>
<center><i>This is a simple chatbot application developed using Swings and URLConnection class. It will provide automated results to any query through an interface made with Java Swings. The chatbot uses a custom Bard API endpoint to fetch query requests from.</i></center>

### <u>Features</u>
+ The interface is built with Java Swings library.
+ Messages are displayed in a conversation-like format, with a sender label for each message.
+ The chatbot can answer questions in a comprehensive and informative way, even if they are open ended, challenging, or strange.
+ The chatbot can generate different creative text formats of text content, like poems, code, scripts, musical pieces, email, letters, etc.
+ The chatbot can be customized to meet the specific needs of your organization.
+ Automatic scrolling to the bottom of the chat window when new messages are rendered


### <u>Getting Started</u>

+ To get started, you will need to:

  + Clone the repository to your local machine.
  + Open the project in your preferred Java IDE.
  + Install the ```org.json``` library.
  + Install the rest of the dependencies.
  + Run the Main class.
  + The chatbot interface will open up and you can enter whatever you want to and you will get automated results.

### <u>Usage</u>
+ Once the application is running, you can start chatting with the chatbot by typing in your questions or requests. The chatbot will respond to your input in a timely manner.
+ You can even ask the chatbot what it can do so that you can ask specific questions.

### <u>API</u>
The chatbot uses a custom made Gooogle Bard API endpoint that is deployed on Vercel. The chatbot sends the entered text to this API and it also handles the response coming from this API. The API integration is handled in the PostRequest class.

### <u>Project Structure</u>
+The project contains the following files : 
  + Main Class : Code execution starts from here. We create the objects of the rest of the classes and call the initial functions of the other classes from this. 
  + PostRequest Class : This handles the requests made to the custom API and handles the responses.
  + GUI Class : The GUI class renders the conversation between the bot and the user in an interactive interface. 



