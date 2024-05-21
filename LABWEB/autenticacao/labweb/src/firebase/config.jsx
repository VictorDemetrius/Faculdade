// Import the functions you need from the SDKs you need
import { initializeApp } from "firebase/app";
import {getAuth} from "firebase/auth"


// TODO: Add SDKs for Firebase products that you want to use
// https://firebase.google.com/docs/web/setup#available-libraries

// Your web app's Firebase configuration
const firebaseConfig = {
  apiKey: "AIzaSyA2ihDtUaRtuLnKKfLmHVet9QiA7gnqJ98",
  authDomain: "labeldevweb.firebaseapp.com",
  projectId: "labeldevweb",
  storageBucket: "labeldevweb.appspot.com",
  messagingSenderId: "177168621506",
  appId: "1:177168621506:web:203316dccf4f7e5389c05b"
};

// Initialize Firebase
const app = initializeApp(firebaseConfig);
const authentication = getAuth(app);

export {authentication}