FROM node:24-alpine
COPY . /app/
WORKDIR /app   
RUN npm install && npm run build
RUN apk update && apk add apache2
RUN rm -rf /var/www/localhost/htdocs/*
RUN cp -rf dist/* /var/www/localhost/htdocs
EXPOSE 80
ENTRYPOINT ["httpd","-D","FOREGROUND"]