import { CameraView } from "expo-camera";
import { View } from "react-native";
import { Card, Title } from "react-native-paper";
import { styles } from "../../styles/base";

export default function Camera() {
  return (
    <View style={styles.container}>
      <Title style={styles.title}>Câmera</Title>
      <Card style={styles.card}>
        <Card.Content>
          <CameraView style={{ height: 300, width: "100%" }} facing="back" />
        </Card.Content>
      </Card>
    </View>
  );
}
