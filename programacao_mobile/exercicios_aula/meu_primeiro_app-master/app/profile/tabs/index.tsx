import React from 'react';
import { View } from 'react-native';
import { Avatar, Card, Title, Paragraph } from 'react-native-paper';
import { useAuth } from '../../../context/auth';
import { styles } from '../../../styles/base';

export default function Tab() {
  const { user } = useAuth();

  return (
    <View style={styles.container}>
      <Title style={styles.title}>Página Inicial</Title>
      <Card style={styles.card}>
        <Card.Title
          title={user.email}
          subtitle="Usuário"
          left={(props) => <Avatar.Icon {...props} icon="account" />}
        />
        <Card.Content>
          <Paragraph>Bem-vindo ao seu perfil!</Paragraph>
        </Card.Content>
      </Card>
    </View>
  );
}
