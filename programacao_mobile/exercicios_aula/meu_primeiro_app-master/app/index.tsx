// app/index.tsx
import React = require('react')
import { View, StyleSheet } from 'react-native'
import { Button, TextInput } from 'react-native-paper'
import { useAuth } from '../context/auth'

export default function Login() {
  const { user, handleLogin, setUser} = useAuth()


  return (
    // Aqui está vinculando o styles criado para o conjunto de estilos. 
    <View style={styles.container}>
      <TextInput label="Email" style={styles.mt20} onChangeText={text => setUser({...user,email: text})} />
      <TextInput label="Senha" secureTextEntry={true} style={styles.mt20} onChangeText={text => setUser({...user, password: text})} />
      <Button mode="contained" style={styles.mt20} onPress={handleLogin}>Entrar</Button>
    </View>
  )
}

// Aqui da para criar os estilos, criando uma variável semelhante ao que seria utilizar uma classe em css
// StyleSheet.create - Criar um conjunto de estilos
const styles = StyleSheet.create({
  container: {
    flex: 1,
    justifyContent: 'center',
    backgroundColor: '#fff',
    padding: 20,
  },
  mt20: {
    marginTop: 20,
  },
})

function userAUth(): { user: any; handleLogin: any; setUser: any } {
  throw new Error('Function not implemented.')
}
