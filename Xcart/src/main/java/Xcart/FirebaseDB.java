package Xcart;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import com.google.api.core.ApiFuture;
import com.google.auth.oauth2.GoogleCredentials;
import com.google.cloud.firestore.CollectionReference;
import com.google.cloud.firestore.DocumentReference;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.WriteResult;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthException;
import com.google.firebase.auth.UserRecord;
import com.google.firebase.cloud.FirestoreClient;
public class FirebaseDB {
	protected Firestore db;
	public FirebaseDB() throws IOException {
		InputStream serviceAccount = new FileInputStream("./serviceAccountKey.json");
		GoogleCredentials credentials = GoogleCredentials.fromStream(serviceAccount);
		FirebaseOptions options = new FirebaseOptions.Builder().setCredentials(credentials).build();
		FirebaseApp.initializeApp(options);
		Firestore db = FirestoreClient.getFirestore();
		this.db = db;
	}
	public void addData() throws Exception {
		// Add document data  with id "alovelace" using a hashmap
		Map<String, Object> data = new HashMap<>();
		data.put("first", "Ada");
		data.put("last", "Lovelace");
		data.put("born", 1815);
		//asynchronously write data
		ApiFuture<DocumentReference> addedDocRef = db.collection("users").add(data);
		// ...
		// result.get() blocks on response
		System.out.println("Update time : " + addedDocRef.get().getId());
	}
	
	public void fetchUserData() throws FirebaseAuthException {
		UserRecord userRecord = FirebaseAuth.getInstance().getUser("117514499863367374545");
		// See the UserRecord reference doc for the contents of userRecord.
		System.out.println("Successfully fetched user data: " + userRecord.getUid());
	}
}
