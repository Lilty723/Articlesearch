package com.example.articlesearch;

public class Apps {import React from 'react';
import { NavigationContainer } from '@react-navigation/native';
import { createStackNavigator } from '@react-navigation/stack';
import ListScreen from './ListScreen';
import DetailsScreen from './DetailsScreen';

const Stack = createStackNavigator();

const App = () => {
        return (
                <NavigationContainer>
      <Stack.Navigator initialRouteName="List">
        <Stack.Screen name="List" component={ListScreen} options={{ title: 'Article List' }} />
        <Stack.Screen name="Details" component={DetailsScreen} options={{ title: 'Article Details' }} />
      </Stack.Navigator>
    </NavigationContainer>
  );
    };

    export default App;

}
