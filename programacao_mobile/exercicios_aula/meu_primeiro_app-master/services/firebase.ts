// Import the functions you need from the SDKs you need
import { initializeApp } from "firebase/app";
import { getAnalytics } from "firebase/analytics";
// TODO: Add SDKs for Firebase products that you want to use
// https://firebase.google.com/docs/web/setup#available-libraries

// Your web app's Firebase configuration
// For Firebase JS SDK v7.20.0 and later, measurementId is optional
const firebaseConfig = {
  apiKey: "AIzaSyCJ0PdQYF0RK8v3gDk7SivpaPjmWLtWGEE",
  authDomain: "exemplo-app-rcnative-fatec.firebaseapp.com",
  projectId: "exemplo-app-rcnative-fatec",
  storageBucket: "exemplo-app-rcnative-fatec.firebasestorage.app",
  messagingSenderId: "1057891580810",
  appId: "1:1057891580810:web:8d428fae539ecbb89f6673",
  measurementId: "G-RW4ZJQTSM2"
};

// Initialize Firebase
export const app = initializeApp(firebaseConfig);
const analytics = getAnalytics(app);