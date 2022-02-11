// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.policy_v1beta1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class AllowedFlexVolumeArgs extends io.pulumi.resources.ResourceArgs {

    public static final AllowedFlexVolumeArgs Empty = new AllowedFlexVolumeArgs();

    @InputImport(name="driver", required=true)
    private final Input<String> driver;

    public Input<String> getDriver() {
        return this.driver;
    }

    public AllowedFlexVolumeArgs(Input<String> driver) {
        this.driver = Objects.requireNonNull(driver, "expected parameter 'driver' to be non-null");
    }

    private AllowedFlexVolumeArgs() {
        this.driver = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AllowedFlexVolumeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> driver;

        public Builder() {
    	      // Empty
        }

        public Builder(AllowedFlexVolumeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.driver = defaults.driver;
        }

        public Builder setDriver(Input<String> driver) {
            this.driver = Objects.requireNonNull(driver);
            return this;
        }

        public Builder setDriver(String driver) {
            this.driver = Input.of(Objects.requireNonNull(driver));
            return this;
        }

        public AllowedFlexVolumeArgs build() {
            return new AllowedFlexVolumeArgs(driver);
        }
    }
}
