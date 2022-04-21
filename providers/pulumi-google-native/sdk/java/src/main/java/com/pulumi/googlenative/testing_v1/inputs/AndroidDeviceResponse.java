// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.testing_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * A single Android device.
 * 
 */
public final class AndroidDeviceResponse extends com.pulumi.resources.InvokeArgs {

    public static final AndroidDeviceResponse Empty = new AndroidDeviceResponse();

    /**
     * The id of the Android device to be used. Use the TestEnvironmentDiscoveryService to get supported options.
     * 
     */
    @Import(name="androidModelId", required=true)
    private String androidModelId;

    public String androidModelId() {
        return this.androidModelId;
    }

    /**
     * The id of the Android OS version to be used. Use the TestEnvironmentDiscoveryService to get supported options.
     * 
     */
    @Import(name="androidVersionId", required=true)
    private String androidVersionId;

    public String androidVersionId() {
        return this.androidVersionId;
    }

    /**
     * The locale the test device used for testing. Use the TestEnvironmentDiscoveryService to get supported options.
     * 
     */
    @Import(name="locale", required=true)
    private String locale;

    public String locale() {
        return this.locale;
    }

    /**
     * How the device is oriented during the test. Use the TestEnvironmentDiscoveryService to get supported options.
     * 
     */
    @Import(name="orientation", required=true)
    private String orientation;

    public String orientation() {
        return this.orientation;
    }

    private AndroidDeviceResponse() {}

    private AndroidDeviceResponse(AndroidDeviceResponse $) {
        this.androidModelId = $.androidModelId;
        this.androidVersionId = $.androidVersionId;
        this.locale = $.locale;
        this.orientation = $.orientation;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AndroidDeviceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AndroidDeviceResponse $;

        public Builder() {
            $ = new AndroidDeviceResponse();
        }

        public Builder(AndroidDeviceResponse defaults) {
            $ = new AndroidDeviceResponse(Objects.requireNonNull(defaults));
        }

        public Builder androidModelId(String androidModelId) {
            $.androidModelId = androidModelId;
            return this;
        }

        public Builder androidVersionId(String androidVersionId) {
            $.androidVersionId = androidVersionId;
            return this;
        }

        public Builder locale(String locale) {
            $.locale = locale;
            return this;
        }

        public Builder orientation(String orientation) {
            $.orientation = orientation;
            return this;
        }

        public AndroidDeviceResponse build() {
            $.androidModelId = Objects.requireNonNull($.androidModelId, "expected parameter 'androidModelId' to be non-null");
            $.androidVersionId = Objects.requireNonNull($.androidVersionId, "expected parameter 'androidVersionId' to be non-null");
            $.locale = Objects.requireNonNull($.locale, "expected parameter 'locale' to be non-null");
            $.orientation = Objects.requireNonNull($.orientation, "expected parameter 'orientation' to be non-null");
            return $;
        }
    }

}
