
# react-native-immediate-call-library

## Getting started

`$ yarn add react-native-immediate-call-library`

#### iOS installation
```
React Native 0.60 and above

Run pod install in the ios directory. Linking is not required in React Native 0.60 and above.
```
#### Android installation

In the AndroidManifest.xml file of your android studio project add:
```javascript
<uses-permission android:name="android.permission.CALL_PHONE" />
```
## Usage
```javascript
import RNImmediateCallLibrary from 'react-native-immediate-call-library';
...
RNImmediateCallLibrary.immediateCall(phoneNumber);
...
```
  