// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.toolresults_v1beta3.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.toolresults_v1beta3.outputs.AndroidAppInfoResponse;
import com.pulumi.googlenative.toolresults_v1beta3.outputs.AndroidInstrumentationTestResponse;
import com.pulumi.googlenative.toolresults_v1beta3.outputs.AndroidRoboTestResponse;
import com.pulumi.googlenative.toolresults_v1beta3.outputs.AndroidTestLoopResponse;
import com.pulumi.googlenative.toolresults_v1beta3.outputs.DurationResponse;
import java.util.Objects;

@CustomType
public final class AndroidTestResponse {
    /**
     * Information about the application under test.
     * 
     */
    private final AndroidAppInfoResponse androidAppInfo;
    /**
     * An Android instrumentation test.
     * 
     */
    private final AndroidInstrumentationTestResponse androidInstrumentationTest;
    /**
     * An Android robo test.
     * 
     */
    private final AndroidRoboTestResponse androidRoboTest;
    /**
     * An Android test loop.
     * 
     */
    private final AndroidTestLoopResponse androidTestLoop;
    /**
     * Max time a test is allowed to run before it is automatically cancelled.
     * 
     */
    private final DurationResponse testTimeout;

    @CustomType.Constructor
    private AndroidTestResponse(
        @CustomType.Parameter("androidAppInfo") AndroidAppInfoResponse androidAppInfo,
        @CustomType.Parameter("androidInstrumentationTest") AndroidInstrumentationTestResponse androidInstrumentationTest,
        @CustomType.Parameter("androidRoboTest") AndroidRoboTestResponse androidRoboTest,
        @CustomType.Parameter("androidTestLoop") AndroidTestLoopResponse androidTestLoop,
        @CustomType.Parameter("testTimeout") DurationResponse testTimeout) {
        this.androidAppInfo = androidAppInfo;
        this.androidInstrumentationTest = androidInstrumentationTest;
        this.androidRoboTest = androidRoboTest;
        this.androidTestLoop = androidTestLoop;
        this.testTimeout = testTimeout;
    }

    /**
     * Information about the application under test.
     * 
    */
    public AndroidAppInfoResponse androidAppInfo() {
        return this.androidAppInfo;
    }
    /**
     * An Android instrumentation test.
     * 
    */
    public AndroidInstrumentationTestResponse androidInstrumentationTest() {
        return this.androidInstrumentationTest;
    }
    /**
     * An Android robo test.
     * 
    */
    public AndroidRoboTestResponse androidRoboTest() {
        return this.androidRoboTest;
    }
    /**
     * An Android test loop.
     * 
    */
    public AndroidTestLoopResponse androidTestLoop() {
        return this.androidTestLoop;
    }
    /**
     * Max time a test is allowed to run before it is automatically cancelled.
     * 
    */
    public DurationResponse testTimeout() {
        return this.testTimeout;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AndroidTestResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AndroidAppInfoResponse androidAppInfo;
        private AndroidInstrumentationTestResponse androidInstrumentationTest;
        private AndroidRoboTestResponse androidRoboTest;
        private AndroidTestLoopResponse androidTestLoop;
        private DurationResponse testTimeout;

        public Builder() {
    	      // Empty
        }

        public Builder(AndroidTestResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.androidAppInfo = defaults.androidAppInfo;
    	      this.androidInstrumentationTest = defaults.androidInstrumentationTest;
    	      this.androidRoboTest = defaults.androidRoboTest;
    	      this.androidTestLoop = defaults.androidTestLoop;
    	      this.testTimeout = defaults.testTimeout;
        }

        public Builder androidAppInfo(AndroidAppInfoResponse androidAppInfo) {
            this.androidAppInfo = Objects.requireNonNull(androidAppInfo);
            return this;
        }
        public Builder androidInstrumentationTest(AndroidInstrumentationTestResponse androidInstrumentationTest) {
            this.androidInstrumentationTest = Objects.requireNonNull(androidInstrumentationTest);
            return this;
        }
        public Builder androidRoboTest(AndroidRoboTestResponse androidRoboTest) {
            this.androidRoboTest = Objects.requireNonNull(androidRoboTest);
            return this;
        }
        public Builder androidTestLoop(AndroidTestLoopResponse androidTestLoop) {
            this.androidTestLoop = Objects.requireNonNull(androidTestLoop);
            return this;
        }
        public Builder testTimeout(DurationResponse testTimeout) {
            this.testTimeout = Objects.requireNonNull(testTimeout);
            return this;
        }        public AndroidTestResponse build() {
            return new AndroidTestResponse(androidAppInfo, androidInstrumentationTest, androidRoboTest, androidTestLoop, testTimeout);
        }
    }
}
