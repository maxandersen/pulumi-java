// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InstanceNetworkInterfaceArgs extends com.pulumi.resources.ResourceArgs {

    public static final InstanceNetworkInterfaceArgs Empty = new InstanceNetworkInterfaceArgs();

    /**
     * Whether or not to delete the network interface on instance termination. Defaults to `false`. Currently, the only valid value is `false`, as this is only supported when creating new network interfaces when launching an instance.
     * 
     */
    @Import(name="deleteOnTermination")
      private final @Nullable Output<Boolean> deleteOnTermination;

    public Output<Boolean> deleteOnTermination() {
        return this.deleteOnTermination == null ? Codegen.empty() : this.deleteOnTermination;
    }

    /**
     * Integer index of the network interface attachment. Limited by instance type.
     * 
     */
    @Import(name="deviceIndex", required=true)
      private final Output<Integer> deviceIndex;

    public Output<Integer> deviceIndex() {
        return this.deviceIndex;
    }

    /**
     * ID of the network interface to attach.
     * 
     */
    @Import(name="networkInterfaceId", required=true)
      private final Output<String> networkInterfaceId;

    public Output<String> networkInterfaceId() {
        return this.networkInterfaceId;
    }

    public InstanceNetworkInterfaceArgs(
        @Nullable Output<Boolean> deleteOnTermination,
        Output<Integer> deviceIndex,
        Output<String> networkInterfaceId) {
        this.deleteOnTermination = deleteOnTermination;
        this.deviceIndex = Objects.requireNonNull(deviceIndex, "expected parameter 'deviceIndex' to be non-null");
        this.networkInterfaceId = Objects.requireNonNull(networkInterfaceId, "expected parameter 'networkInterfaceId' to be non-null");
    }

    private InstanceNetworkInterfaceArgs() {
        this.deleteOnTermination = Codegen.empty();
        this.deviceIndex = Codegen.empty();
        this.networkInterfaceId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceNetworkInterfaceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> deleteOnTermination;
        private Output<Integer> deviceIndex;
        private Output<String> networkInterfaceId;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceNetworkInterfaceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deleteOnTermination = defaults.deleteOnTermination;
    	      this.deviceIndex = defaults.deviceIndex;
    	      this.networkInterfaceId = defaults.networkInterfaceId;
        }

        public Builder deleteOnTermination(@Nullable Output<Boolean> deleteOnTermination) {
            this.deleteOnTermination = deleteOnTermination;
            return this;
        }
        public Builder deleteOnTermination(@Nullable Boolean deleteOnTermination) {
            this.deleteOnTermination = Codegen.ofNullable(deleteOnTermination);
            return this;
        }
        public Builder deviceIndex(Output<Integer> deviceIndex) {
            this.deviceIndex = Objects.requireNonNull(deviceIndex);
            return this;
        }
        public Builder deviceIndex(Integer deviceIndex) {
            this.deviceIndex = Output.of(Objects.requireNonNull(deviceIndex));
            return this;
        }
        public Builder networkInterfaceId(Output<String> networkInterfaceId) {
            this.networkInterfaceId = Objects.requireNonNull(networkInterfaceId);
            return this;
        }
        public Builder networkInterfaceId(String networkInterfaceId) {
            this.networkInterfaceId = Output.of(Objects.requireNonNull(networkInterfaceId));
            return this;
        }        public InstanceNetworkInterfaceArgs build() {
            return new InstanceNetworkInterfaceArgs(deleteOnTermination, deviceIndex, networkInterfaceId);
        }
    }
}
