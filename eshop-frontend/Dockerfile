# build stage
FROM node:lts-alpine as build-stage
WORKDIR /app
COPY package*.json ./
RUN npm install
COPY . .
RUN npm run build

# production stage
<<<<<<< HEAD
FROM nginx:stable-alpine as production-stage
COPY --from=build-stage /app/dist /usr/share/nginx/html
EXPOSE 80
CMD ["nginx", "-g", "daemon off;"]
=======
FROM node:lts-alpine as production-stage
WORKDIR /app
RUN npm install -g http-server
COPY --from=build-stage /app/dist /app/dist
EXPOSE 8080
CMD ["http-server", "dist"]
>>>>>>> make-adservice
