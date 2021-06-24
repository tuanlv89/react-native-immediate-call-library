
import { NativeModules } from 'react-native';

const { RNImmediateCallLibrary } = NativeModules;

let RNImmediateCall = {
    immediateCall: (phoneNumber) => {
        RNImmediateCallLibrary.immediateCall(phoneNumber);
    }
}

export default RNImmediateCall;
