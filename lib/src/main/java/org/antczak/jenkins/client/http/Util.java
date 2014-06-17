package org.antczak.jenkins.client.http;

import com.google.gson.reflect.TypeToken;

import java.util.List;

/**
 * Created by https://github.com/pawelantczak on 2014-06-17.
 */
class Util {
    static <T> TypeToken<List<T>> listType() {
        return new TypeToken<List<T>>() {};
    }
}
