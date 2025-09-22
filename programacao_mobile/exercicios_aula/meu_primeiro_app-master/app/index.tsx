import { View, Image } from 'react-native';
import { Button, TextInput, Card, Title } from 'react-native-paper';
import { useAuth } from '../context/auth';
import { styles } from '../styles/base';
import React = require('react');

export default function Login() {
  const { user, handleLogin, setUser } = useAuth();

  return (
    <View style={styles.container}>
      <Image source={require('../assets/icon.png')} style={styles.logo} />
      <Title style={styles.title}>Login</Title>
      <Card style={styles.card}>
        <Card.Content>
          <TextInput
            label="Email"
            style={styles.input}
            onChangeText={(text) => setUser({ ...user, email: text })}
          />
          <TextInput
            label="Senha"
            secureTextEntry={true}
            style={styles.input}
            onChangeText={(text) => setUser({ ...user, password: text })}
          />
          <Button mode="contained" style={styles.button} onPress={handleLogin}>
            Entrar
          </Button>
        </Card.Content>
      </Card>
    </View>
  );
}