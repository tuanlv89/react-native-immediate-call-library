using ReactNative.Bridge;
using System;
using System.Collections.Generic;
using Windows.ApplicationModel.Core;
using Windows.UI.Core;

namespace Immediate.Call.Library.RNImmediateCallLibrary
{
    /// <summary>
    /// A module that allows JS to share data.
    /// </summary>
    class RNImmediateCallLibraryModule : NativeModuleBase
    {
        /// <summary>
        /// Instantiates the <see cref="RNImmediateCallLibraryModule"/>.
        /// </summary>
        internal RNImmediateCallLibraryModule()
        {

        }

        /// <summary>
        /// The name of the native module.
        /// </summary>
        public override string Name
        {
            get
            {
                return "RNImmediateCallLibrary";
            }
        }
    }
}
