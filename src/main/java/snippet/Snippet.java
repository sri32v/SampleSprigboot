package snippet;

public class Snippet {
	# Specify Image
	FROM node:alpine
	
	#Install some dependencies
	WORKDIR /app
	COPY ./ /app
	RUN npm install
	
	# Default Command
	CMD ["npm", "start"]
}

