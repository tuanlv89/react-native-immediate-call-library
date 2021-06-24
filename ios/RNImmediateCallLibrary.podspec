Pod::Spec.new do |s|
    s.name         = "RNImmediateCallLibrary"
    s.version      = "1.0.0"
    s.summary      = "RNImmediateCallLibrary"
    s.description  = <<-DESC
                    RNImmediateCallLibrary
                     DESC
    s.homepage     = "https://github.com/tuanlv89/react-native-immediate-call-library"
    s.license      = "MIT"
    # s.license      = { :type => "MIT", :file => "FILE_LICENSE" }
    s.author             = { "author" => "author@domain.cn" }
    s.platform     = :ios, "7.0"
    s.source       = { :git => "https://github.com/tuanlv89/react-native-immediate-call-library", :tag => "master" }
    s.source_files  = "RNImmediateCallLibrary/**/*.{h,m}"
    s.requires_arc = true
  
  
    s.dependency "React"
    #s.dependency "others"
  
end