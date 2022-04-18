// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.toolresults_v1beta3.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;

@CustomType
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

    @CustomType.Constructor
    private FailureDetailResponse(
        @CustomType.Parameter("crashed") Boolean crashed,
        @CustomType.Parameter("deviceOutOfMemory") Boolean deviceOutOfMemory,
        @CustomType.Parameter("failedRoboscript") Boolean failedRoboscript,
        @CustomType.Parameter("notInstalled") Boolean notInstalled,
        @CustomType.Parameter("otherNativeCrash") Boolean otherNativeCrash,
        @CustomType.Parameter("timedOut") Boolean timedOut,
        @CustomType.Parameter("unableToCrawl") Boolean unableToCrawl) {
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
    public Boolean crashed() {
        return this.crashed;
    }
    /**
     * If the device ran out of memory during a test, causing the test to crash.
     * 
    */
    public Boolean deviceOutOfMemory() {
        return this.deviceOutOfMemory;
    }
    /**
     * If the Roboscript failed to complete successfully, e.g., because a Roboscript action or assertion failed or a Roboscript action could not be matched during the entire crawl.
     * 
    */
    public Boolean failedRoboscript() {
        return this.failedRoboscript;
    }
    /**
     * If an app is not installed and thus no test can be run with the app. This might be caused by trying to run a test on an unsupported platform.
     * 
    */
    public Boolean notInstalled() {
        return this.notInstalled;
    }
    /**
     * If a native process (including any other than the app) crashed.
     * 
    */
    public Boolean otherNativeCrash() {
        return this.otherNativeCrash;
    }
    /**
     * If the test overran some time limit, and that is why it failed.
     * 
    */
    public Boolean timedOut() {
        return this.timedOut;
    }
    /**
     * If the robo was unable to crawl the app; perhaps because the app did not start.
     * 
    */
    public Boolean unableToCrawl() {
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

        public Builder crashed(Boolean crashed) {
            this.crashed = Objects.requireNonNull(crashed);
            return this;
        }
        public Builder deviceOutOfMemory(Boolean deviceOutOfMemory) {
            this.deviceOutOfMemory = Objects.requireNonNull(deviceOutOfMemory);
            return this;
        }
        public Builder failedRoboscript(Boolean failedRoboscript) {
            this.failedRoboscript = Objects.requireNonNull(failedRoboscript);
            return this;
        }
        public Builder notInstalled(Boolean notInstalled) {
            this.notInstalled = Objects.requireNonNull(notInstalled);
            return this;
        }
        public Builder otherNativeCrash(Boolean otherNativeCrash) {
            this.otherNativeCrash = Objects.requireNonNull(otherNativeCrash);
            return this;
        }
        public Builder timedOut(Boolean timedOut) {
            this.timedOut = Objects.requireNonNull(timedOut);
            return this;
        }
        public Builder unableToCrawl(Boolean unableToCrawl) {
            this.unableToCrawl = Objects.requireNonNull(unableToCrawl);
            return this;
        }        public FailureDetailResponse build() {
            return new FailureDetailResponse(crashed, deviceOutOfMemory, failedRoboscript, notInstalled, otherNativeCrash, timedOut, unableToCrawl);
        }
    }
}
