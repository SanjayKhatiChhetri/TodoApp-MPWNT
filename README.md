# Todo App Walkthrough

## Overview

The Todo app is a simple, yet powerful demonstration of the Model-View-ViewModel (MVVM) architecture in Android development. This app is capable of connecting to the internet to fetch and display a list of to-dos using Retrofit library for networking and Gson library for JSON deserialization. The application also gracefully handles potential errors and displays appropriate user-friendly messages on the UI.

## Features

- Display a simple list of to-do items from API.
- Fetch and parse a list of to-dos from a RESTful API.
- Implement MVVM architecture to maintain a robust and scalable codebase.
- Present a loading message to the user while data is being retrieved.
- Handle network and data errors and update the UI accordingly.

## REST API

The app utilizes the open API provided by [JSONPlaceholder](https://jsonplaceholder.typicode.com/todos) to retrieve a list of placeholder to-dos.

## Project Structure

The key components of the project include:

- `Api`: Interface for Retrofit to fetch data from the network.
- `ViewModel`: Acts as an intermediary between the API calls and the UI, providing data stream via LiveData or StateFlow.
- `Repository`: Abstracts the data source from the ViewModel.
- `Model`: Represents the to-dos data structure.
- `View`: UI implemented using Jetpack Compose to observe and react to ViewModel state.

## Building the App

To build the app, follow these steps:

1. Clone the repository.
2. Open the project in Android Studio.
3. Sync the project with Gradle files.
4. Run the app on an emulator or a physical device.

## Handling Errors and Loading States

The app gracefully deals with errors during network requests:

- A loading message is presented while fetching data from the API.
- In case of successful data retrieval, to-dos are displayed in a list.
- If an error occurs during the network call, an error message is shown to the user.

## Contributors

This project is a demonstration app built as part of an course: Mobile Programminng With Native technology and is open for contributions.
