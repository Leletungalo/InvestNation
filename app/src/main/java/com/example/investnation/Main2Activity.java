package com.example.investnation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.amazonaws.amplify.generated.graphql.CreateTodoMutation;
import com.amazonaws.mobile.config.AWSConfiguration;
import com.amazonaws.mobileconnectors.appsync.AWSAppSyncClient;
import com.apollographql.apollo.GraphQLCall;
import com.apollographql.apollo.api.Response;
import com.apollographql.apollo.exception.ApolloException;

import javax.annotation.Nonnull;

import type.CreateTodoInput;

public class Main2Activity extends AppCompatActivity {
    //AWS instances
    private AWSAppSyncClient awsAppSyncClient;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        awsAppSyncClient = AWSAppSyncClient.builder()
                .context(getApplicationContext())
                .awsConfiguration(new AWSConfiguration(getApplicationContext()))
                .build();
    }

    public void runMutation(){
        CreateTodoInput createTodoInput = CreateTodoInput.builder()
                    .name("Use AppSync")
                    .description("RealTime and offline")
                    .build();

        awsAppSyncClient.mutate(CreateTodoMutation.builder().input(createTodoInput).build())
                    .enqueue(mutationCallBuck);
    }

    private GraphQLCall.Callback<CreateTodoMutation.Data> mutationCallBuck = new GraphQLCall.Callback<CreateTodoMutation.Data>(){

        @Override
        public void onResponse(@Nonnull Response<CreateTodoMutation.Data> response) {
            Log.i("Results","Added Todo");
        }

        @Override
        public void onFailure(@Nonnull ApolloException e) {
            Log.i("Error",e.toString());
        }
    };

    public void AddToDataBase(View view){
        runMutation();
    }

}
