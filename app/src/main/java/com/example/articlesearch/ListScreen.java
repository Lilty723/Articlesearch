package com.example.articlesearch;

public class ListScreen {import React, { useState, useEffect } from 'react';
import { View, Text, FlatList, TouchableOpacity, Image } from 'react-native';
import { useNavigation } from '@react-navigation/native';

const ListScreen = () => {
  const navigation = useNavigation();
  const [articles, setArticles] = useState([]);

        useEffect(() => {
        // Fetch articles from API
        // Example: fetch('https://api.example.com/articles')
        //   .then(response => response.json())
        //   .then(data => setArticles(data));
        // Mock data for example
    const mockData = [
        { id: 1, title: 'Article 1', description: 'Description 1', imageUrl: 'https://example.com/image1.jpg' },
        { id: 2, title: 'Article 2', description: 'Description 2', imageUrl: 'https://example.com/image2.jpg' },
    ];
        setArticles(mockData);
  }, []);

  const navigateToDetails = (article) => {
            navigation.navigate('Details', { article });
        };

  const renderArticleItem = ({ item }) => (
                <TouchableOpacity onPress={() => navigateToDetails(item)}>
      <View style={{ padding: 16 }}>
        <Text style={{ fontSize: 18, fontWeight: 'bold' }}>{item.title}</Text>
        <Text style={{ fontSize: 16 }}>{item.description}</Text>
        <Image source={{ uri: item.imageUrl }} style={{ width: 100, height: 100, marginTop: 8 }} />
      </View>
    </TouchableOpacity>
  );

        return (
                <FlatList
        data={articles}
        renderItem={renderArticleItem}
        keyExtractor={(item) => item.id.toString()}
    />
  );
    };

    export default ListScreen;

}
