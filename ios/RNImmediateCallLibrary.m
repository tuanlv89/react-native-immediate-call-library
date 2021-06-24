#import "RNImmediateCallLibrary.h"

@implementation RNImmediateCallLibrary

RCT_EXPORT_MODULE()

RCT_EXPORT_METHOD(immediatePhoneCall:(NSString *)number)
{
    dispatch_async(dispatch_get_main_queue(), ^{
      UIApplication *application = [UIApplication sharedApplication];
      [application openURL:[NSURL URLWithString:[NSString stringWithFormat:@"tel:%@", number]] options:@{} completionHandler:nil];
    });
};
@end
  
