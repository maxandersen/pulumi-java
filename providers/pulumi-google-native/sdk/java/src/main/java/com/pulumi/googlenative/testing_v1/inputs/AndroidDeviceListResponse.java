// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.testing_v1.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.testing_v1.inputs.AndroidDeviceResponse;
import java.util.List;
import java.util.Objects;


/**
 * A list of Android device configurations in which the test is to be executed.
 * 
 */
public final class AndroidDeviceListResponse extends com.pulumi.resources.InvokeArgs {

    public static final AndroidDeviceListResponse Empty = new AndroidDeviceListResponse();

    /**
     * A list of Android devices.
     * 
     */
    @Import(name="androidDevices", required=true)
      private final List<AndroidDeviceResponse> androidDevices;

    public List<AndroidDeviceResponse> androidDevices() {
        return this.androidDevices;
    }

    public AndroidDeviceListResponse(List<AndroidDeviceResponse> androidDevices) {
        this.androidDevices = Objects.requireNonNull(androidDevices, "expected parameter 'androidDevices' to be non-null");
    }

    private AndroidDeviceListResponse() {
        this.androidDevices = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AndroidDeviceListResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<AndroidDeviceResponse> androidDevices;

        public Builder() {
    	      // Empty
        }

        public Builder(AndroidDeviceListResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.androidDevices = defaults.androidDevices;
        }

        public Builder androidDevices(List<AndroidDeviceResponse> androidDevices) {
            this.androidDevices = Objects.requireNonNull(androidDevices);
            return this;
        }
        public Builder androidDevices(AndroidDeviceResponse... androidDevices) {
            return androidDevices(List.of(androidDevices));
        }        public AndroidDeviceListResponse build() {
            return new AndroidDeviceListResponse(androidDevices);
        }
    }
}
