import React, { createContext, useContext, useState } from 'react'
import { router } from 'expo-router'
import {app} from '../services/firebase'
import {initializeAuth, signInWithEmailAndPassword} from 'firebase/auth'


interface IUser{
    email: string
    password: string
}

interface IAuthContext {
    user: IUser
    setUser: (user: IUser) => void
    handleLogin: () => void
}

interface IAuthProviderProps{
    children: React.ReactNode
}

const AuthContext = createContext<IAuthContext>({} as IAuthContext)

export const AuthProvider: React.FC<IAuthProviderProps> = ({ children }: IAuthProviderProps) => {
    const [user, setUser] = useState<IUser>({email: "", password: ""})

    function handleLogin(){
        if(!user.email || !user.password){
            alert("Digite o email e a senha")
            return

        }

        const auth = initializeAuth(app)
        signInWithEmailAndPassword(auth, user.email, user.password)
        .then(() => {
            router.push('home')
        }
        ).catch((error) => {
           console.log('falha ao autenticar')
           alert("Falha ao autenticar, verifique suas credenciais")
            })
    }
    return(
        <AuthContext.Provider value={{user, handleLogin, setUser}}>
        {children}
        </AuthContext.Provider>
    )
}

export function useAuth(){
    return useContext(AuthContext)
}


