import { CameraView } from "expo-camera"
import { View, StyleSheet } from "react-native"

export default function Camera(){
    return(
        <View style={styles.container}>
            <CameraView facing="back" />
        </View>
    )
}

const styles = StyleSheet.create({
    container: {
        flex: 1,
        justifyContent: "center",
        padding: 20
    },
    camera:{
        height: 300,
        width: 300
    }
}

)