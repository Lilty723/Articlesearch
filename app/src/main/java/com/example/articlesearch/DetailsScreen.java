package com.example.articlesearch;

public class DetailsScreen {import React from 'react';
import { View, Text, Image } from 'react-native';

const DetailsScreen = ({ route }) => {
  const { article } = route.params;

        return (
                <View style={{ padding: 16 }}>
      <Text style={{ fontSize: 20, fontWeight: 'bold' }}>{article.title}</Text>
      <Text style={{ fontSize: 18 }}>{article.description}</Text>
      <Text style={{ fontSize: 16, marginTop: 8 }}>Author: {article.author}</Text>
      <Image source={{ uri: article.imageUrl }} style={{ width: 200, height: 200, marginTop: 16 }} />
    </View>
  );
    };

    export default DetailsScreen;

}
