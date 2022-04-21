// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.serialconsole;

import com.pulumi.azurenative.serialconsole.enums.SerialPortState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SerialPortArgs extends com.pulumi.resources.ResourceArgs {

    public static final SerialPortArgs Empty = new SerialPortArgs();

    /**
     * The resource name, or subordinate path, for the parent of the serial port. For example: the name of the virtual machine.
     * 
     */
    @Import(name="parentResource", required=true)
    private Output<String> parentResource;

    public Output<String> parentResource() {
        return this.parentResource;
    }

    /**
     * The resource type of the parent resource.  For example: &#39;virtualMachines&#39; or &#39;virtualMachineScaleSets&#39;
     * 
     */
    @Import(name="parentResourceType", required=true)
    private Output<String> parentResourceType;

    public Output<String> parentResourceType() {
        return this.parentResourceType;
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The namespace of the resource provider.
     * 
     */
    @Import(name="resourceProviderNamespace", required=true)
    private Output<String> resourceProviderNamespace;

    public Output<String> resourceProviderNamespace() {
        return this.resourceProviderNamespace;
    }

    /**
     * The name of the serial port to create.
     * 
     */
    @Import(name="serialPort")
    private @Nullable Output<String> serialPort;

    public Optional<Output<String>> serialPort() {
        return Optional.ofNullable(this.serialPort);
    }

    /**
     * Specifies whether the port is enabled for a serial console connection.
     * 
     */
    @Import(name="state")
    private @Nullable Output<SerialPortState> state;

    public Optional<Output<SerialPortState>> state() {
        return Optional.ofNullable(this.state);
    }

    private SerialPortArgs() {}

    private SerialPortArgs(SerialPortArgs $) {
        this.parentResource = $.parentResource;
        this.parentResourceType = $.parentResourceType;
        this.resourceGroupName = $.resourceGroupName;
        this.resourceProviderNamespace = $.resourceProviderNamespace;
        this.serialPort = $.serialPort;
        this.state = $.state;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SerialPortArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SerialPortArgs $;

        public Builder() {
            $ = new SerialPortArgs();
        }

        public Builder(SerialPortArgs defaults) {
            $ = new SerialPortArgs(Objects.requireNonNull(defaults));
        }

        public Builder parentResource(Output<String> parentResource) {
            $.parentResource = parentResource;
            return this;
        }

        public Builder parentResource(String parentResource) {
            return parentResource(Output.of(parentResource));
        }

        public Builder parentResourceType(Output<String> parentResourceType) {
            $.parentResourceType = parentResourceType;
            return this;
        }

        public Builder parentResourceType(String parentResourceType) {
            return parentResourceType(Output.of(parentResourceType));
        }

        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public Builder resourceProviderNamespace(Output<String> resourceProviderNamespace) {
            $.resourceProviderNamespace = resourceProviderNamespace;
            return this;
        }

        public Builder resourceProviderNamespace(String resourceProviderNamespace) {
            return resourceProviderNamespace(Output.of(resourceProviderNamespace));
        }

        public Builder serialPort(@Nullable Output<String> serialPort) {
            $.serialPort = serialPort;
            return this;
        }

        public Builder serialPort(String serialPort) {
            return serialPort(Output.of(serialPort));
        }

        public Builder state(@Nullable Output<SerialPortState> state) {
            $.state = state;
            return this;
        }

        public Builder state(SerialPortState state) {
            return state(Output.of(state));
        }

        public SerialPortArgs build() {
            $.parentResource = Objects.requireNonNull($.parentResource, "expected parameter 'parentResource' to be non-null");
            $.parentResourceType = Objects.requireNonNull($.parentResourceType, "expected parameter 'parentResourceType' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.resourceProviderNamespace = Objects.requireNonNull($.resourceProviderNamespace, "expected parameter 'resourceProviderNamespace' to be non-null");
            return $;
        }
    }

}
