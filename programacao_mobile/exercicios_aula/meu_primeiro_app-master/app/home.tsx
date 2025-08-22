
import { useAuth } from "../context/auth"
import { View, Text, StyleSheet } from "react-native"
import { Link} from 'expo-router'

export default function Home(){
    const {user} = useAuth()
    return(
        <View style={styles.container}>
            <Text>Bem vindo, {user.email}</Text>
            <Link href="/camera">WebCam</Link>
        </View>
    )
}

const styles = StyleSheet.create({
    container:{
        flex:1,
        justifyContent: 'center',
        padding: 20
    }
})