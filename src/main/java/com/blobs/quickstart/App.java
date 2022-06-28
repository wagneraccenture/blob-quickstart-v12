package com.blobs.quickstart;

import com.azure.storage.blob.*;
import com.azure.storage.blob.models.*;
import java.io.*;

public class App
{
    public static void main(String[] args) {

        final String connectStr = "";

        // Create a BlobServiceClient object which will be used to create a container client
        BlobServiceClient blobServiceClient = new BlobServiceClientBuilder().connectionString(connectStr).buildClient();

        // Create the container and return a container client object
        BlobContainerClient containerClient = blobServiceClient.getBlobContainerClient("");

        final BlobClient blob = containerClient.getBlobClient("");

        if (blob.exists()) {
            System.out.println("File exists: " + blob.getBlobName());
        }

        System.out.println("\nListing blobs...");
        // List the blob(s) in the container.
        for (BlobItem blobItem : containerClient.listBlobs()) {
            System.out.println("\t" + blobItem.getName());
        }
    }
}
