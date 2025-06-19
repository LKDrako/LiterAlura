package com.example.literalura.Literalura.service;

public interface IConvierteDatos {
    <T> T obtenerDatos(String Json, Class<T> clase);
}
