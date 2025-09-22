// app/_layout.tsx
import { PaperProvider } from "react-native-paper"
import { AuthProvider } from "../context/auth"
import React from "react";
import { Slot } from "expo-router";

export default function Layout() {
  return (
    <PaperProvider>
      <AuthProvider>
        <Slot />
      </AuthProvider>
    </PaperProvider>
  )
}