# 📱 Lost Device Auto-Recovery System

A smart Android-based system that helps users remotely recover their lost mobile devices by enabling critical connectivity features and tracking the real-time location — built using Firebase and Google Maps API.

---

## 🧠 Overview

The **Lost Device Auto-Recovery System** is a mobile application designed to assist users in locating and recovering their lost Android phones. When activated, the system remotely enables Wi-Fi, Bluetooth, mobile data, and GPS, even if they were previously disabled. It prevents unauthorized shutdowns and continuously updates the device's location.

---

## 🛠️ Features

- 🔐 Secure login/signup using Firebase Authentication
- 📡 Remote activation of:
  - Mobile Data
  - Wi-Fi
  - Bluetooth
- 🔔 Real-time push notifications via Firebase Cloud Messaging (FCM)
- 🔒 Prevent device shutdown (planned feature)
- 🔧 Firebase Cloud Functions for backend triggers

---

## 🏗️ Tech Stack

| Layer        | Tools & Technologies                         |
|--------------|----------------------------------------------|
| Frontend     | Android (Kotlin), Jetpack Components         |
| Backend      | Firebase Firestore, Firebase Cloud Functions |
| APIs         | Firebase Cloud Messaging    |
| IDE          | Android Studio                               |

---

## 📲 How It Works

1. User logs in and registers their device.
2. If the phone is lost, the user triggers **Lost Mode** from another device.
3. The system remotely enables connectivity services on the lost device.
4. Location updates are continuously sent to the user's dashboard.
5. Notifications alert the user about device movements.

---

## 🧪 Sample Test Cases

| Test ID | Description                                 | Expected Result                       |
|--------|---------------------------------------------|----------------------------------------|
| TC001  | Login with valid credentials                | Redirect to dashboard                  |
| TC004  | Enable Lost Mode                            | Connectivity features activated        |
| TC005  | Track device location                       | Location shown on map                  |
| TC006  | Receive FCM notification                    | Message received on lost device        |
| TC008  | Attempt device shutdown in Lost Mode        | Shutdown blocked (future feature)      |

---

## 🔮 Future Enhancements

- Camera snapshot from lost phone
- Root-level shutdown prevention
- SMS fallback for offline tracking
- iOS device support

---
