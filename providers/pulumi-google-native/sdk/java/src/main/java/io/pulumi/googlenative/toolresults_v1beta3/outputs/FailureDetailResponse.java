// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.toolresults_v1beta3.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.util.Objects;

@OutputCustomType
public final class FailureDetailResponse {
    /**
     * If the failure was severe because the system (app) under test crashed.
     * 
     */
    private final Boolean crashed;
    /**
     * If the device ran out of memory during a test, causing the test to crash.
     * 
     */
    private final Boolean deviceOutOfMemory;
    /**
     * If the Roboscript failed to complete successfully, e.g., because a Roboscript action or assertion failed or a Roboscript action could not be matched during the entire crawl.
     * 
     */
    private final Boolean failedRoboscript;
    /**
     * If an app is not installed and thus no test can be run with the app. This might be caused by trying to run a test on an unsupported platform.
     * 
     */
    private final Boolean notInstalled;
    /**
     * If a native process (including any other than the app) crashed.
     * 
     */
    private final Boolean otherNativeCrash;
    /**
     * If the test overran some time limit, and that is why it failed.
     * 
     */
    private final Boolean timedOut;
    /**
     * If the robo was unable to crawl the app; perhaps because the app did not start.
     * 
     */
    private final Boolean unableToCrawl;

    @OutputCustomType.Constructor
    private FailureDetailResponse(
        @OutputCustomType.Parameter("crashed") Boolean crashed,
        @OutputCustomType.Parameter("deviceOutOfMemory") Boolean deviceOutOfMemory,
        @OutputCustomType.Parameter("failedRoboscript") Boolean failedRoboscript,
        @OutputCustomType.Parameter("notInstalled") Boolean notInstalled,
        @OutputCustomType.Parameter("otherNativeCrash") Boolean otherNativeCrash,
        @OutputCustomType.Parameter("timedOut") Boolean timedOut,
        @OutputCustomType.Parameter("unableToCrawl") Boolean unableToCrawl) {
        this.crashed = crashed;
        this.deviceOutOfMemory = deviceOutOfMemory;
        this.failedRoboscript = failedRoboscript;
        this.notInstalled = notInstalled;
        this.otherNativeCrash = otherNativeCrash;
        this.timedOut = timedOut;
        this.unableToCrawl = unableToCrawl;
    }

    /**
     * If the failure was severe because the system (app) under test crashed.
     * 
    */
    public Boolean getCrashed() {
        return this.crashed;
    }
    /**
     * If the device ran out of memory during a test, causing the test to crash.
     * 
    */
    public Boolean getDeviceOutOfMemory() {
        return this.deviceOutOfMemory;
    }
    /**
     * If the Roboscript failed to complete successfully, e.g., because a Roboscript action or assertion failed or a Roboscript action could not be matched during the entire crawl.
     * 
    */
    public Boolean getFailedRoboscript() {
        return this.failedRoboscript;
    }
    /**
     * If an app is not installed and thus no test can be run with the app. This might be caused by trying to run a test on an unsupported platform.
     * 
    */
    public Boolean getNotInstalled() {
        return this.notInstalled;
    }
    /**
     * If a native process (including any other than the app) crashed.
     * 
    */
    public Boolean getOtherNativeCrash() {
        return this.otherNativeCrash;
    }
    /**
     * If the test overran some time limit, and that is why it failed.
     * 
    */
    public Boolean getTimedOut() {
        return this.timedOut;
    }
    /**
     * If the robo was unable to crawl the app; perhaps because the app did not start.
     * 
    */
    public Boolean getUnableToCrawl() {
        return this.unableToCrawl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FailureDetailResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean crashed;
        private Boolean deviceOutOfMemory;
        private Boolean failedRoboscript;
        private Boolean notInstalled;
        private Boolean otherNativeCrash;
        private Boolean timedOut;
        private Boolean unableToCrawl;

        public Builder() {
    	      // Empty
        }

        public Builder(FailureDetailResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.crashed = defaults.crashed;
    	      this.deviceOutOfMemory = defaults.deviceOutOfMemory;
    	      this.failedRoboscript = defaults.failedRoboscript;
    	      this.notInstalled = defaults.notInstalled;
    	      this.otherNativeCrash = defaults.otherNativeCrash;
    	      this.timedOut = defaults.timedOut;
    	      this.unableToCrawl = defaults.unableToCrawl;
        }

        public Builder setCrashed(Boolean crashed) {
            this.crashed = Objects.requireNonNull(crashed);
            return this;
        }

        public Builder setDeviceOutOfMemory(Boolean deviceOutOfMemory) {
            this.deviceOutOfMemory = Objects.requireNonNull(deviceOutOfMemory);
            return this;
        }

        public Builder setFailedRoboscript(Boolean failedRoboscript) {
            this.failedRoboscript = Objects.requireNonNull(failedRoboscript);
            return this;
        }

        public Builder setNotInstalled(Boolean notInstalled) {
            this.notInstalled = Objects.requireNonNull(notInstalled);
            return this;
        }

        public Builder setOtherNativeCrash(Boolean otherNativeCrash) {
            this.otherNativeCrash = Objects.requireNonNull(otherNativeCrash);
            return this;
        }

        public Builder setTimedOut(Boolean timedOut) {
            this.timedOut = Objects.requireNonNull(timedOut);
            return this;
        }

        public Builder setUnableToCrawl(Boolean unableToCrawl) {
            this.unableToCrawl = Objects.requireNonNull(unableToCrawl);
            return this;
        }
        public FailureDetailResponse build() {
            return new FailureDetailResponse(crashed, deviceOutOfMemory, failedRoboscript, notInstalled, otherNativeCrash, timedOut, unableToCrawl);
        }
    }
}
