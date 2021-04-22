# build stage
FROM node:lts-alpine as build-stage
WORKDIR /app
COPY package*.json ./
RUN npm install
COPY . .
RUN npm run build

## production stage
FROM node:lts-alpine as production-stage
WORKDIR /app
run npm install -g http-server
COPY --from=build-stage /app/dist /app/dist
EXPOSE 8080
CMD [ "http-server", "dist"]
